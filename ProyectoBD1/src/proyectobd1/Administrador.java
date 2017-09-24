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
public class Administrador {
    ListaTemporales listaTemporales;
    
    public Administrador(){
        listaTemporales = new ListaTemporales();
    }

    public ListaTemporales getListaTemporales() {
        return listaTemporales;
    }

    public void setListaTemporales(ListaTemporales listaTemporales) {
        this.listaTemporales = listaTemporales;
    }
    
    
    
}
