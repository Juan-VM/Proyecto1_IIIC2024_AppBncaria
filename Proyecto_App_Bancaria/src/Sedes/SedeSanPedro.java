package Sedes;

import Personas.Administradores;
import Personas.Usuarios;
import java.util.ArrayList;

public class SedeSanPedro{

    public static ArrayList<Usuarios> ListaUsers = new ArrayList<>();
    public static ArrayList<Administradores> ListaAdmins = new ArrayList<>();
    public static ArrayList<Usuarios> ListaCuentasBloqueadas = new ArrayList<>();

    public static ArrayList<Usuarios> getListaUsers() {
        return ListaUsers;
    }

    public static ArrayList<Administradores> getListaAdmins() {
        return ListaAdmins;
    }

    public static ArrayList<Usuarios> getListaCuentasBloqueadas() {
        return ListaCuentasBloqueadas;
    }

    public static void setListaCuentasBloqueadas(ArrayList<Usuarios> ListaCuentasBloqueadas) {
        SedeSanPedro.ListaCuentasBloqueadas = ListaCuentasBloqueadas;
    }
    
    
}
