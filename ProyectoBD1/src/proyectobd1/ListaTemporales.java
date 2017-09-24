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
public class ListaTemporales {
    ArrayList<Tabla> listaTemporales;

    public ListaTemporales() {
        listaTemporales = new ArrayList();
    }

    
    
    public ArrayList<Tabla> getListaTemporales() {
        return listaTemporales;
    }

    public void setListaTemporales(ArrayList<Tabla> listaTemporales) {
        this.listaTemporales = listaTemporales;
    }
    
    
}
