package entidades;

import java.io.Serializable;

public class Estacion implements Serializable {

    private String nombre;
    private String ubicacion;
    private int aforo;

    // Longitud que debe recorrer para llegar hacia la próxima estación
    private double distancia;

    // Tiempo que demora en llegar hacia la próxima estación
    private double tiempo;

    // Posición en la matriz
    private int numero;

    private Taquilla taquilla;

    public Estacion(String nombre, String ubicacion, Taquilla taquilla, int numero) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.taquilla = taquilla;
        this.numero = numero;
    }

    public Estacion(String nombre, String ubicacion, Taquilla taquilla, int numero, double distancia, double tiempo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.taquilla = taquilla;
        this.numero = numero;
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public double getDistancia() {
        return distancia;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public Taquilla getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(Taquilla taquilla) {
        this.taquilla = taquilla;
    }

    @Override
    public String toString() {
        return "Estacion{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", aforo=" + aforo + ", taquilla=" + taquilla + '}';
    }

}
