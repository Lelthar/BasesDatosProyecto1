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
    private Boolean temporal;
    private ArrayList<String> listaAtributos;
    
    public Tabla(){
        this.nombre = null;
        this.temporal = null;
        this.listaAtributos = new ArrayList();
    }
    
    public Tabla(String nombre) {
        this.nombre = nombre;
    }
    
    public Tabla(String nombre, Boolean temporal, ArrayList<String> listaAtributos) {
        this.nombre = nombre;
        this.temporal = temporal;
        this.listaAtributos = listaAtributos;
    }

    public ArrayList<String> getListaAtributos() {
        return listaAtributos;
    }

    public void setListaAtributos(ArrayList<String> listaAtributos) {
        this.listaAtributos = listaAtributos;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimirTabla(){
        System.out.println("Nombre tabla: "+nombre);
        System.out.println("Atributos: ");
        for(int i = 0; i < listaAtributos.size(); i++){
            System.out.print(listaAtributos.get(i)+" ");
        }
        System.out.println("");
    }
    
}
