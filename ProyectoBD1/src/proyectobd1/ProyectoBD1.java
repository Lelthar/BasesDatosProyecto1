/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd1;

import frames.servidor;

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
        servidor server = new servidor();
        server.setVisible(true);
    }
}
