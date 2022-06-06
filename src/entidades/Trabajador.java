package entidades;

import java.io.Serializable;

public class Trabajador extends Persona implements Serializable{

    private double sueldo;

    public Trabajador(double sueldo, String nombres, String apellidoPaterno, String apellidoMaterno, String dni, int edad, Login usuario) {
        super(nombres, apellidoPaterno, apellidoMaterno, dni, edad, usuario);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
