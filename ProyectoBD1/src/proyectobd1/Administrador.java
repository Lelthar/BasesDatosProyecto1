/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd1;

import frames.VentanaDiferenciaConjuntos;
import frames.VentanaDivision;
import frames.VentanaProductoCartesiano;
import frames.VentanaProyeccion;
import frames.VentanaSeleccion;
import frames.VentanaUnion;
import frames.VentanaInterseccion;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mailon2
 */
public class Administrador {
    ArrayList<Tabla> listaTemporales;
    
    public Administrador(){
        listaTemporales = new ArrayList();
    }

    public ArrayList<Tabla> getListaTemporales() {
        return listaTemporales;
    }

    public void setListaTemporales(ArrayList<Tabla> listaTemporales) {
        this.listaTemporales = listaTemporales;
    }

    /**
     * Metodo que permite cargas los datos en la tabla de la ventana Selección.
     * @param ventana
     * @throws SQLException 
     */
    public  void tablaSeleccion(VentanaSeleccion ventana) throws SQLException{
        String[] atributos = Singleton.getInstance().getConexionServidor().atributosCosulta();
        String[][] datos = Singleton.getInstance().getConexionServidor().tuplasConsulta();
        
        DefaultTableModel modelo = new DefaultTableModel(datos,atributos);
        
        ventana.jTableSelecc.setModel(modelo);
    }
    
    /**
     * Metodo que permite cargas los datos en la tabla de la ventana Unión.
     * @param ventana
     * @throws SQLException 
     */
    public  void tablaUnion(VentanaUnion ventana) throws SQLException{
        String[] atributos = Singleton.getInstance().getConexionServidor().atributosCosulta();
        String[][] datos = Singleton.getInstance().getConexionServidor().tuplasConsulta();
        
        DefaultTableModel modelo = new DefaultTableModel(datos,atributos);
        
        ventana.jTableResultado.setModel(modelo);
    }
    
    /**
     * Metodo que permite cargas los datos en la tabla de la ventana Proyección.
     * @param ventana
     * @throws SQLException 
     */
    public void tablaProyeccion(VentanaProyeccion ventana) throws SQLException{
        String[] atributos = Singleton.getInstance().getConexionServidor().atributosCosulta();
        String[][] datos = Singleton.getInstance().getConexionServidor().tuplasConsulta();
        
        DefaultTableModel modelo = new DefaultTableModel(datos,atributos);
        
        ventana.jTableProyec.setModel(modelo);
    }
    
    public void tablaProductoCartesiano(VentanaProductoCartesiano ventana) throws SQLException{
        String[] atributos = Singleton.getInstance().getConexionServidor().atributosCosulta();
        String[][] datos = Singleton.getInstance().getConexionServidor().tuplasConsulta();
        
        DefaultTableModel modelo = new DefaultTableModel(datos,atributos);
        
        ventana.jTableResul.setModel(modelo);
    }
    
    /**
     * Metodo que permite cargas los datos en la tabla de la ventana Diferencia de conjuntos.
     * @param ventana
     * @throws SQLException 
     */
    public  void tablaDiferenciaConjuntos(VentanaDiferenciaConjuntos ventana) throws SQLException{
        String[] atributos = Singleton.getInstance().getConexionServidor().atributosCosulta();
        String[][] datos = Singleton.getInstance().getConexionServidor().tuplasConsulta();
        
        DefaultTableModel modelo = new DefaultTableModel(datos,atributos);
        
        ventana.jTableResultado.setModel(modelo);
    }
    
    /**
     * Metodo que permite cargas los datos en la tabla de la ventana Insercción.
     * @param ventana
     * @throws SQLException 
     */
    public void tablaInterseccion(VentanaInterseccion ventana) throws SQLException{
        String[] atributos = Singleton.getInstance().getConexionServidor().atributosCosulta();
        String[][] datos = Singleton.getInstance().getConexionServidor().tuplasConsulta();
        
        DefaultTableModel modelo = new DefaultTableModel(datos,atributos);
        
        ventana.jTableResul.setModel(modelo);
    }
    
    public void tablaDivision(VentanaDivision ventana) throws SQLException{
        String[] atributos = Singleton.getInstance().getConexionServidor().atributosCosulta();
        String[][] datos = Singleton.getInstance().getConexionServidor().tuplasConsulta();
        
        DefaultTableModel modelo = new DefaultTableModel(datos,atributos);
        
        ventana.jTableResul.setModel(modelo);
    }
}
