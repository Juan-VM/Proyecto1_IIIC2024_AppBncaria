
package ClasesProyecto;

import Personas.Usuarios;
import java.util.ArrayList;

public class Personas {
    private String usuario;
    private String password;
    private String cedula;
    private int claveNumerica;
    private String telefono;
    private String apellidos;
    private int rol;
    private String sede;
    public  String comentario;
    private double saldoDeLaCuenta;
    private double saldoCuentaAhorro;
    private double saldoCuentaSimpe;
    private boolean estadoCuentaSimpe;
    private boolean estadoCuentaAhorro;
    ArrayList<String> comprobantes = new ArrayList<>();
    
    public Personas(String usuario, String apellidos, String password, String cedula, String telefono, int claveNumerica, int rol, String sede){
        this.usuario = usuario;
        this.password = password;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.telefono = telefono;
        this.claveNumerica = claveNumerica;
        this.rol = rol;
        this.sede = sede;
    }
    
    public Personas(){
        
    }
    public Personas(String usuario, String comentario){
        
    }
    
    
    public String getUsuario(){ //Retorna el valor de usuario.
        return usuario;
    }
    
    public String getPassword(){ //Retorna el valor de password.
        return password;
    }
    
    public int getClaveNumerica(){ //Retorna el valor de claveNumerica.
        return claveNumerica;
    }
    
    
    public void setUsuario(String usuario){  //Establece el valor de usuario.
        this.usuario = usuario;
    }
    
    public void setPassword(String password){  //Establece el valor de password.
        this.password = password;
    }
    
    public void setClaveNumerica(int claveNumerica){  //Establece el valor de claveNumerica.
        this.claveNumerica = claveNumerica;
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public  String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double getSaldoDeLaCuenta() {
        return saldoDeLaCuenta;
    }

    public void setSaldoDeLaCuenta(double saldoDeLaCuenta) {
        this.saldoDeLaCuenta = saldoDeLaCuenta;
    }

    public double getSaldoCuentaAhorro() {
        return saldoCuentaAhorro;
    }

    public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
        this.saldoCuentaAhorro = saldoCuentaAhorro;
    }

    public double getSaldoCuentaSimpe() {
        return saldoCuentaSimpe;
    }

    public void setSaldoCuentaSimpe(double saldoCuentaSimpe) {
        this.saldoCuentaSimpe = saldoCuentaSimpe;
    }

    public boolean getEstadoCuentaSimpe() {
        return estadoCuentaSimpe;
    }

    public void setEstadoCuentaSimpe(boolean estadoCuentaSimpe) {
        this.estadoCuentaSimpe = estadoCuentaSimpe;
    }

    public boolean getEstadoCuentaAhorro() {
        return estadoCuentaAhorro;
    }

    public void setEstadoCuentaAhorro(boolean estadoCuentaAhorro) {
        this.estadoCuentaAhorro = estadoCuentaAhorro;
    }
    
    public static void depositarDinero(double cantidad, String cuentaDestino){
        
    }
    public static void retirarDinero (double cantidad, String cuentaDestino){
        
    }
    
    public static int obtenerIndicePersona(ArrayList<Personas> lista, int claveNumerica){
        
        int indiceDelObjeto = -1;
        
        for( Personas i : lista){
            if( i.getClaveNumerica() == claveNumerica){
                indiceDelObjeto = lista.indexOf(i);
            }
        }
        return indiceDelObjeto;
    }
    
    
    public class Comentario {
       // private String 
    }
    
    public  void addComprobantesSimpe(String comprobante){
        this.comprobantes.add(comprobante);
    }
    
    public  void mostarHistorial(){
        for(String i : comprobantes){
            System.out.println(i);
        }
    }
} //Fin clase persona
