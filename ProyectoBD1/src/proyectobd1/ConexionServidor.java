/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gerald
 */
public class ConexionServidor {
    String bd;
    String userName;
    String userPassword;
    Connection con;  
    Statement stmt;  
    ResultSet rs;  
    ResultSetMetaData rsCantidadColumnas;
    
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
    
    
}
