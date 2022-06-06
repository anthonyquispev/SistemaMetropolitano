package entidades;

import java.io.Serializable;

public class Persona implements Serializable{

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String dni;
    private int edad;

    private Login usuario;

    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno, String dni, int edad, Login usuario) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
        this.edad = edad;
        this.usuario = usuario;
    }

    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno, int edad) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
    }

    public void setUsuario(Login usuario) {
        this.usuario = usuario;
    }

    public Login getUsuario() {
        return usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", dni=" + dni + ", edad=" + edad + ", usuario=" + usuario + '}';
    }

}
