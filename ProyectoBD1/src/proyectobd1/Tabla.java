/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd1;

import java.util.ArrayList;

/**
 *
 * @author mailon2
 */
public class Tabla {
    private String nombre;
    private ArrayList<String> listaAtributos;
    
    public Tabla(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
