
package Sedes;

import Personas.Administradores;
import Personas.Usuarios;
import java.util.ArrayList;


public class Sedes {
    public static ArrayList<Usuarios> ListaUsers = new ArrayList<>();
    public static ArrayList<Administradores> ListaAdmins = new ArrayList<>();

    public static ArrayList<Usuarios> getListaUsers() {
        return ListaUsers;
    }

    public static void setListaUsers(ArrayList<Usuarios> ListaUsers) {
        Sedes.ListaUsers = ListaUsers;
    }

    public static ArrayList<Administradores> getListaAdmins() {
        return ListaAdmins;
    }

    public static void setListaAdmins(ArrayList<Administradores> ListaAdmins) {
        Sedes.ListaAdmins = ListaAdmins;
    }
    
    
    
}
