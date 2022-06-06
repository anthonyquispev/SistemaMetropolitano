package entidades;

import java.io.Serializable;

public class Chofer extends Persona implements Serializable {

    private String licencia;

    public Chofer(String licencia, String nombres, String apellidoPaterno, String apellidoMaterno, String dni, int edad, Login usuario) {
        super(nombres, apellidoPaterno, apellidoMaterno, dni, edad, usuario);
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Chofer{" + "licencia=" + licencia + '}';
    }

}
