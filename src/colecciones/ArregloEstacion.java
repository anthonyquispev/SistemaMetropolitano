package colecciones;

import entidades.*;
import java.io.Serializable;
import java.util.ArrayList;

public class ArregloEstacion implements Serializable{

    private ArrayList<Estacion> estaciones = new ArrayList();

    public ArregloEstacion() {
        this.estaciones = new ArrayList<>();
    }

    public boolean agregar(Estacion e) {
        if (!buscarNombre(e.getNombre())) {
            this.estaciones.add(e);
            return true;
        }
        return false;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    public boolean buscarNombre(String nombre) {
        boolean result = false;
        for (Estacion est : this.estaciones) {
            if (nombre.equals(est.getNombre())) {
                result = true;
                break;
            }
        }
        return result;
    }

    public Estacion getEstacion(String nombre) {
        Estacion est = null;
        for (Estacion estacion : this.estaciones) {
            if (nombre.equals(estacion.getNombre())) {
                est = estacion;
                break;
            }
        }
        return est;
    }

    public Estacion getEstacion(int numero) {
        Estacion est = null;
        for (Estacion estacion : this.estaciones) {
            if (numero == estacion.getNumero()) {
                est = estacion;
                break;
            }
        }
        return est;
    }

    public String[] getNombresSinEstVirtual() {
        String[] s = new String[this.estaciones.size()-1];
        int i = 0;
        for (Estacion est : this.estaciones) {
            if (!est.getNombre().equals("Estacion virtual")) {
                s[i] = est.getNombre();
                i++;
            }

        }
        return s;
    }
    
    //Con Estación virtual
    public String[] getNombresConEstVirtual(){
        String[] s = new String[this.estaciones.size()];        
        int i = 0;
        for (Estacion est : this.estaciones) {
                s[i] = est.getNombre();
                i++;
        }
        return s;        
    }
}
