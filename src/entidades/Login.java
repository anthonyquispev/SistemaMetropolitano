package entidades;

import java.io.Serializable;

public class Login implements Serializable {

    private String usuario;
    private String password;
    private int tipo;
    private boolean activo;
    private boolean logueado;

    public Login(String usuario, String password, int tipo) {
        this.usuario = usuario;
        this.password = password;
        this.tipo = tipo;
        this.activo = true;
        this.logueado = false;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivo() {
        return activo;
    }

    public boolean isLogueado() {
        return logueado;
    }

    public String getPassword() {
        return password;
    }

    public boolean entrar(String usu, String pass) {
        boolean result = false;
        if (this.getUsuario().equalsIgnoreCase(usu)
                && this.password.equals(pass)
                && this.isActivo()
                && !this.isLogueado()) {
            this.logueado = true;
            result = true;
        }
        return result;
    }

    public boolean salir() {
        boolean result = false;
        if (isLogueado()) {
            this.logueado = false;
            result = true;
        }
        return result;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Login{" + "usuario=" + usuario + ", password=" + password + ", tipo=" + tipo + ", activo=" + activo + ", logueado=" + logueado + '}';
    }

}
