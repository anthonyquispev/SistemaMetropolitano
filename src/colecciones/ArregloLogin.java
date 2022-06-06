package colecciones;

import entidades.Login;
import java.io.Serializable;
import java.util.ArrayList;

public class ArregloLogin implements Serializable {

    private ArrayList<Login> usuarios;

    public ArregloLogin() {
        this.usuarios = new ArrayList();
    }

    public boolean add(Login u) {
        boolean result = false;
        if (!this.buscar(u.getUsuario())) {
            this.usuarios.add(u);
            result = true;
        }
        return result;
    }

    public boolean buscar(String usu) {
        boolean result = false;
        for (Login login : this.usuarios) {
            if (usu.equals(login.getUsuario())) {
                result = true;
                break;
            }
        }
        return result;
    }

    public Login validar(String usu, String pass) {
        Login result = null;
        for (Login l : this.usuarios) {
            if (l.entrar(usu, pass)) {
                result = l;
                break;
            }
        }
        return result;
    }
}
