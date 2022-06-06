package entidades;

import java.io.Serializable;

public class Bus implements Serializable {

    private String tipoBus;
    
    //posición en la matriz
    private int numero; 

    public Bus(String tipoBus, int numero) {
        this.tipoBus = tipoBus;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
