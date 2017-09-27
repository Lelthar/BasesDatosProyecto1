/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
    public ArrayList<String> listaTablas;
    
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

    public void agregarNombreTabla(String nombreTabla){
        this.listaTablas.add(nombreTabla);
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
            mostrarNombreTablas();
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
            while (rs.next()) {
                for(int i = 0; i < rsCantidadColumnas.getColumnCount(); i++){
                    System.out.print(rs.getString(i+1) + " ");  
                }
                System.out.println("");
            }
            System.out.println("Consulta realizada...");
        }else{
            stmt.executeUpdate(consulta);
            System.out.println("Instruccion sql realizada...");
        }  
    }
    
    public void agregarListaTablas() throws SQLException{
        if(con != null){
            String[] types = {"TABLE"};
            rs = metaDatos.getTables(null, "dbo", "%", types);
            while (rs.next()) {
                agregarNombreTabla(rs.getString(3));
            }
            
            System.out.println("Se agregaron existosamente los nombres de las tablas...");
        }
    }
    
    public boolean existeTablaP(String nombreTabla){
        for(int i = 0; i < this.listaTablas.size(); i++){
            if(this.listaTablas.get(i).equals(nombreTabla)){
                return true;
            }
        }
        return false;
    
    }
    
    
}
