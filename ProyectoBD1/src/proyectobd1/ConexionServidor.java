/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd1;

import frames.VentanaSeleccion;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Gerald
 */
public class ConexionServidor {
    public String bd;
    public String userName;
    public String userPassword;
    public Connection con;  
    public Statement stmt;  
    public ResultSet rs;
    public DatabaseMetaData metaDatos;
    public ResultSetMetaData rsCantidadColumnas;
    //public ArrayList<String> listaTablas;
    ArrayList<Tabla> listaTablas;
    
    public ConexionServidor(){
        
    }
    
    public ConexionServidor(String pBd,String pUserName,String pUserPassword) {
        this.bd = pBd;
        this.userName = pUserName;
        this.userPassword = pUserPassword;
        this.con = null;
        this.stmt = null;
        this.rs = null;
        this.rsCantidadColumnas = null;
        this.metaDatos = null;
        this.listaTablas = new ArrayList<>();
    }

    public void agregarNombreTabla(Tabla nuevaTabla){
        this.listaTablas.add(nuevaTabla);
    }
    
    public void mostrarNombreTablas(){
        for(int i = 0; i < this.listaTablas.size(); i++){
            System.out.println(listaTablas.get(i));
        }
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
        
    public void hacerConexion(){
        try {  
            // Establece la conexion con la base de datos.  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            this.con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName="+bd+";",userName,userPassword);  
            this.stmt = this.con.createStatement();
            this.metaDatos = con.getMetaData();
            agregarListaTablas();
            System.out.println(existeTablaP("clientes"));
            System.out.println("Conexion establecida...");
        }  

      // Muestra los errores ocurridos.  
        catch (Exception e) {  
           System.out.println("Error usuario,contraseña o base de datos incorrecto");
           //e.printStackTrace();  
        }
    }
    
    public void realizarInstruccionSql(int tipo, String consulta) throws SQLException{
        this.rs = null;
        if(tipo == 0){
            this.rs = stmt.executeQuery(consulta);
            this.rsCantidadColumnas = rs.getMetaData();
            // Recorre las tuplas de la tabla , hay que arreglar las consultas con las columnas
//            while (rs.next()) {
//                for(int i = 0; i < rsCantidadColumnas.getColumnCount(); i++){
//                    System.out.print(rs.getString(i+1) + " ");  
//                }
//                System.out.println("");
//            }
            System.out.println("Consulta realizada...");
        }else{
            stmt.executeUpdate(consulta);
            System.out.println("Instruccion sql realizada...");
        }  
    }
    
    /**
     * Recibe el nombre de una tabla
     * @param nombre
     * @return Retorna nombrecolumna, tipo+tamaño, not null, pk, fk
     * @throws SQLException 
     */
    public ArrayList<ArrayList<String>> definicionTabla(String nombre) throws SQLException{
        metaDatos = con.getMetaData();
        
        ResultSet defTabla = metaDatos.getColumns(null, "dbo", nombre, null);
 
        ResultSet defPk = metaDatos.getPrimaryKeys(null, null, nombre);
        //System.out.println(defPk);
        ResultSet defFk = metaDatos.getImportedKeys(null, null, nombre);
        //System.out.println(defFk);
        ArrayList<ArrayList<String>> defTablaV = new ArrayList<>();
        ArrayList<String> defPkV = new ArrayList<>();
        ArrayList<String> defFkV = new ArrayList<>();
        
        //encargado de leer nombre atributo, tipo + tamaño y si es not null
        while(defTabla.next()){
            //System.out.println(".-.");
            ArrayList<String> res = new ArrayList<>();
            res.add(defTabla.getString(4));
            res.add(defTabla.getString(6)+defTabla.getString(7));
            if("YES".equals(defTabla.getString(18))){
                res.add("true");
            }else{
                res.add("false");
            }
            defTablaV.add(res);
        }
        //System.out.println("Aqui1");
        //encargado de leer los atributos de la tabal que son pk
        while(defPk.next()){
            ArrayList<String> res = new ArrayList<>();
            defPkV.add(defPk.getString(4));
        }
        //System.out.println("Aqui2");
        //encargado de leer los atributos de la tabal que son fk
        while(defFk.next()){
            ArrayList<String> res = new ArrayList<>();
            defFkV.add(defFk.getString(4));
        }
        for(int i=0;i<defTablaV.size();i++){
            if(!defPkV.isEmpty()){
                if(defPkV.contains(defTablaV.get(i).get(0))){
                    defTablaV.get(i).add("true");
                }else{
                    defTablaV.get(i).add("false");
                }
            }else{
                defTablaV.get(i).add("false");
            }
            
           //System.out.println("------------");
            if(!defFkV.isEmpty()){
                if(defFkV.contains(defTablaV.get(i).get(0))){
                    defTablaV.get(i).add("true");
                }else{
                    defTablaV.get(i).add("false");
                }
            }else{
                defTablaV.get(i).add("false");
            }
            
            //System.out.println("     --     ");
        }
        //System.out.println(defTablaV.toString());
        return defTablaV;
    }
    
    /**
     * Recibe el nombre de una tabla
     * @param consulta
     * @return Retorna nombrecolumna, tipo+tamaño, not null, pk, fk
     * @throws SQLException 
     */
    public ArrayList<ArrayList<String>> definicionTablaTemporal(String consulta) throws SQLException{
        ArrayList<ArrayList<String>> defTablaV = new ArrayList<>();
        this.rs = null;
        this.rs = stmt.executeQuery(consulta);
        this.rsCantidadColumnas = rs.getMetaData();
        // Recorre las tuplas de la tabla , hay que arreglar las consultas con las columnas
//        while (rs.next()) {
//            for(int i = 0; i < rsCantidadColumnas.getColumnCount(); i++){
//                System.out.print(rs.getString(i+1) + " ");  
//            }
//            System.out.println("");
//        }
        System.out.println("Consulta realizada...");
        
        return defTablaV;
    }
    
    public void agregarListaTablas() throws SQLException{
        if(con != null){
            ResultSet result = null;
            String[] types = {"TABLE"};
            result = metaDatos.getTables(null, "dbo", "%", types);
            while (result.next()) {
                this.rs = null;
                String consulta = "SELECT * FROM "+result.getString(3);
                realizarInstruccionSql(0, consulta);
                Tabla nuevaTabla = new Tabla(result.getString(3),false,convertirVector2ArrayList(atributosCosulta()));
                agregarNombreTabla(nuevaTabla);
            }
            
            System.out.println("Se agregaron existosamente los nombres de las tablas...");
        }
    }
    
    public boolean existeTablaP(String nombreTabla){
        for(int i = 0; i < this.listaTablas.size(); i++){
            if(this.listaTablas.get(i).getNombre().equals(nombreTabla)){
                return true;
            }
        }
        return false;
    
    }
    /**
     * Si es true el tipo, devuelve las permanentes, si no devuelve las permanentes
     * Metodo que retorna una lista con los nombres de las tablas
     * @return 
     */
    public ArrayList<String> nombreTablas(boolean tipo){
        ArrayList<String> result = new ArrayList<>();
        if(tipo){
            for(int i=0;i<this.listaTablas.size();i++){
                if(!this.listaTablas.get(i).getTemporal()){
                    result.add(this.listaTablas.get(i).getNombre());
                }
            }
        }else{
            for(int i=0;i<this.listaTablas.size();i++){
                if(this.listaTablas.get(i).getTemporal()){
                    result.add(this.listaTablas.get(i).getNombre());
                }
            }
        }
        
        return result;
    }
    
    /**
     * Esta funcion devuelve los atributos de una tabla
     * @param nombre
     * @return resultado
     */
    public ArrayList<String> obtenerAtributos(String nombre){
        ArrayList<String> resultado = new ArrayList<>();
        for(int i = 0; i < this.listaTablas.size(); i++){
            if(this.listaTablas.get(i).getNombre().equals(nombre)){
                resultado = this.listaTablas.get(i).getListaAtributos();
                return resultado;
            }
        } 
        return resultado;
    }
    
    
    /**
     * Esta funcion compara todos los elementos de dos tablas
     * @param atributos1
     * @param atributos2
     * @return boolean
     */
    public boolean atributosIgualesP(ArrayList<String> atributos1, ArrayList<String> atributos2){
        if(atributos1.size() == atributos2.size()){
            for(int i = 0; i < atributos1.size(); i++){
                if(!atributos1.get(i).equals(atributos2.get(i))){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * Esta funcion revisa si una tabla es temporal o no
     * 
     */
    public boolean esTablaTemporalP(String nombreTabla){
        for(int i = 0; i < this.listaTablas.size(); i++){
            if(this.listaTablas.get(i).getNombre().equals(nombreTabla) && this.listaTablas.get(i).getTemporal()){
                return true;
            }
        }
        return false;
    
    }
    
    /**
     * Metodo sirve para convertir de un vector de string a un arraylist de string
     * 
     */
    public ArrayList<String> convertirVector2ArrayList(String[] vector) throws SQLException{
        ArrayList<String> lista = new ArrayList<>();
        for(int i=0;i<vector.length;i++){
            lista.add(vector[i]);
        }
        return lista;
    }
    
    /**
     * Metodo encargado de extraer los nombres de los atributos de una consulta
     * @return
     * @throws SQLException 
     */
    public String[] atributosCosulta() throws SQLException{
        ResultSetMetaData consulta = rs.getMetaData();
        int columnas = consulta.getColumnCount();
        String[] atributos = new String[columnas];
        for(int i=0;i<columnas;i++){
            //System.out.println(consulta.getColumnName(i+1));        
            atributos[i]= consulta.getColumnName(i+1);
        }
        return atributos;
    }
    /**
     * Metodo encargado de extraer todas las tuplas de una consulta y retornar resultado[][]
     * @return
     * @throws SQLException 
     */
    public String[][] tuplasConsulta() throws SQLException{
        ResultSetMetaData consulta = rs.getMetaData();
        int columna = consulta.getColumnCount();
        ArrayList<String[]> tuplas = new ArrayList();
        // Recorre las tuplas de la tabla , hay que arreglar las consultas con las columnas
        while (rs.next()) {
            String[] atributos = new String[columna];
            for(int i = 0; i < columna; i++){
                //System.out.print(rs.getString(i+1) + " ");
                atributos[i] = rs.getString(i+1);     
            }
            tuplas.add(atributos);
        }
        String[][] result = new String[tuplas.size()][columna];
        for(int i=0;i<tuplas.size();i++){
            for(int j=0;j<columna;j++){
                result[i][j]= tuplas.get(i)[j];
            }
            
        }
        //System.out.println(Arrays.deepToString(result));
        return result;
    }
    public ArrayList<String> convertirStringVector(String string){
        ArrayList<String> result = new ArrayList();
        String cadena = "";
        for(int i =0; i<string.length();i++){
            if(string.charAt(i)==','){
                result.add(cadena);
                cadena="";
            }else{
                if(!(string.charAt(i)==' ')){
                    cadena+=string.charAt(i);
                }
            }
        }
        result.add(cadena);
        return result;
    }
    /**
     * Función que revisa si los atributos como un string existen en una tabla
     * @param nombreTabla
     * @param atributos
     * @return 
     */
    public boolean validarAtributos(String nombreTabla,String atributos){
        ArrayList<String> listaA = obtenerAtributos(nombreTabla);
        ArrayList<String> listaO = convertirStringVector(atributos);
        for(int i=0;i<listaO.size();i++){
            if(!listaA.contains(listaO.get(i))){
                return false;
            }
        }
        return true;
    }
    /**
     * Función que revisa si los atributos como un vector existen en una tabla
     * @param nombreTabla1
     * @param nombreTabla2
     * @return 
     */
    public boolean validarAtributosVec(String nombreTabla1,String nombreTabla2){
        ArrayList<String> listaA = obtenerAtributos(nombreTabla1);
        ArrayList<String> listaO = obtenerAtributos(nombreTabla2);
        for(int i=0;i<listaO.size();i++){
            if(!listaA.contains(listaO.get(i))){
                return false;
            }
        }
        return true;
    }
    
    /*
    * Esta funcion sirve para renombrar el nombre de una tabla y sus attributos
    */
    public void renombrarTabla(String nombreTabla, String nombreNuevoTabla, ArrayList<String> listaAtributos){
        for(int i = 0; i < this.listaTablas.size(); i++){
            if(this.listaTablas.get(i).getNombre().equals(nombreTabla)){
                this.listaTablas.get(i).setNombre(nombreNuevoTabla);
                this.listaTablas.get(i).setListaAtributos(listaAtributos);
                this.listaTablas.get(i).setTemporal(true);
            }
        }
    
    } 
    
    /*
    * Esta funcion sirve para obtener la cantidad de elementos de un arraylist
    */
    public int cantidadAtributos(String nombreTabla){
        for(int i = 0; i < this.listaTablas.size(); i++){
            if(this.listaTablas.get(i).getNombre().equals(nombreTabla)){
                return this.listaTablas.get(i).getListaAtributos().size();
            }
        }
        return 0;
    }
    
    /*
    * Esta funcion sirve para obtener la lista de atributos de un string
    */
    public ArrayList<String> listaAtributosString(String listaAtributos){
        ArrayList<String> resultado = new ArrayList<>();
        String atributo = "";
        
        for(int i = 0; i < listaAtributos.length(); i++){
            if(i == (listaAtributos.length()-1)){
                atributo+=listaAtributos.charAt(i);
                resultado.add(atributo);
            }else if(listaAtributos.charAt(i) == ','){
                resultado.add(atributo);
                atributo = "";
            }else if(listaAtributos.charAt(i) == ' '){
                
            }else{
                atributo += listaAtributos.charAt(i);
            }
        }
        return resultado;
    } 
    
    /*
    * Sirve para obtener el select de una consulta
    */
    public String obtenerSelectConsulta(ArrayList<String> listaAtributosTabla, ArrayList<String> listaAtributosTablaNueva){
        String resultado = "";
        
        for(int i = 0; i < listaAtributosTabla.size(); i++){
            if(i == listaAtributosTabla.size()-1){
                resultado += (listaAtributosTabla.get(i)+" as "+listaAtributosTablaNueva.get(i));
            }else{
                resultado += (listaAtributosTabla.get(i)+" as "+listaAtributosTablaNueva.get(i)+",");
            }
        }
        return resultado;
    }
    
    /**
     * Función que obtiene los atributos comunes estre dos tablas
     * @param nombreTabla1
     * @param nombreTabla2
     * @return 
    */
    public ArrayList<String> atributosComunes(String nombreTabla1,String nombreTabla2){
        ArrayList<String> listaA = obtenerAtributos(nombreTabla1);
        ArrayList<String> listaO = obtenerAtributos(nombreTabla2);
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<listaO.size();i++){
            if(listaA.contains(listaO.get(i))){
                result.add(listaO.get(i));
            }
        }
        return result;
    }
    /**
     * Función que elimina los elementos comunes entre dos tablas
     * @param nombreTabla
     * @param comunes
     * @return 
     */
    public ArrayList<String> atributosCorrectos(String nombreTabla,ArrayList<String> comunes){
        ArrayList<String> listaA = obtenerAtributos(nombreTabla);
        for(int i=0;i<comunes.size();i++){
            if(listaA.contains(comunes.get(i))){
                listaA.remove(comunes.get(i));
            }
        }
        
        return listaA;
    }
    
    /*****************************************/
    
    
    public ArrayList<String> atributosSinRepetir(ArrayList<String> lista1, ArrayList<String> lista2){
        ArrayList<String> resultado = new ArrayList<>();
        for(int i = 0; i < lista2.size(); i++){
            if(!lista1.contains(lista2.get(i))){
                resultado.add(lista2.get(i));
            }
        }
        return resultado;
    }
    
    public String construirSelectString(ArrayList<String> lista1,String nombreTabla1,ArrayList<String> lista2,String nombreTabla2){
        String resultado = "";
        for(int i = 0; i < lista1.size(); i++){
            resultado += (nombreTabla1+"."+lista1.get(i)+",");
        }
        for(int i = 0; i < lista2.size(); i++){
            if(i == (lista2.size()-1)){
                resultado += (nombreTabla2+"."+lista2.get(i));
            }else{
                resultado += (nombreTabla2+"."+lista2.get(i)+",");
            }
        }
        
        return resultado;
    }
    
    /**
     * Función que valida que las operaciones sean correctas
     * @param lista
     * @return 
     */
    public boolean validarOperaciones(String lista){
        ArrayList<String> listaO = convertirStringVector(lista);
        for(int i=0;i<listaO.size();i++){
            String ope = listaO.get(i);
            System.out.println(listaO.get(i));
            int o1 = ope.indexOf("sum");
            int o2 = ope.indexOf("count");
            int o3 = ope.indexOf("max");
            int o4 = ope.indexOf("min");
            int o5 = ope.indexOf("avg");
            System.out.println(o1+" "+o2+" "+o3+" "+o4+" "+o5);
            if(o1==-1 && o2==-1 && o3==-1 && o4==-1 && o5==-1){
                return false;
            }
        }
        return true;
    }
    
    public String atributosNoEncotrados(String nombreTabla1,String nombreTabla2){
        String result = "";
        ArrayList<String> listaA = obtenerAtributos(nombreTabla1);
        ArrayList<String> listaO = obtenerAtributos(nombreTabla2);
        for(int i=0;i<listaO.size();i++){
            if(!listaA.contains(listaO.get(i))){
                result+= listaO.get(i)+", ";
            }
        }
        return result;
    }
}