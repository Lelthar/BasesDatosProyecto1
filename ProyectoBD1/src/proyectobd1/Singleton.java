/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd1;

/**
 *
 * @author mailon2
 */
public class Singleton {
    // indispensable
    private static Singleton singletonAdm= null;

    // no son static para obligar que sean accedidas
    // desde el Singleton
    //Declaración de atributos
    Administrador administrador;
    ConexionServidor conexionServidor;
    
    // indispensable
    private Singleton() {
       //Inializamos todos los atributos declarados
        administrador = new Administrador();
        conexionServidor = new ConexionServidor();
    }
    
    // indispensable
    public static Singleton getInstance(){
        if (singletonAdm == null){
            singletonAdm = new Singleton();
        }
        return singletonAdm;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public ConexionServidor getConexionServidor() {
        return conexionServidor;
    }

    public void setConexionServidor(ConexionServidor conexionServidor) {
        this.conexionServidor = conexionServidor;
    }
    
    
}
