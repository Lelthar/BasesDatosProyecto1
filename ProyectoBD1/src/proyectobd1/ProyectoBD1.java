/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd1;

import java.sql.*;

/**
 *
 * @author Gerald
 */
public class ProyectoBD1 {
    /*
    server:  LAPTOP-2DT4U23K\SQLEXPRESS
    usuario: LAPTOP-2DT4U23K\Gerald
    pass: *******
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        conectarBaseDatos();
    }
    
    public static void conectarBaseDatos(){
        try{
            Connection con = DriverManager.getConnection("jdbc:odbc:Coneccion_sql");
            /*Statement sentencia = con.createStatement();
            ResultSet resultado = sentencia.executeQuery("select * from cliente");
            while(resultado.next()){
                System.out.println(resultado.getString("nombre_cliente"));
            }*/
        }catch(Exception e){
            System.out.println("error");
        }
    
    }
    
}
