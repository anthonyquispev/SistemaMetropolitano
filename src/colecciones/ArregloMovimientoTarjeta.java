package colecciones;

import configuracion.Metropolitano;
import entidades.*;
import java.io.Serializable;

import java.util.ArrayList;

public class ArregloMovimientoTarjeta implements Serializable {

    private ArrayList<MovimientoTarjeta> movimientos = new ArrayList();
//    private ArrayList<MovimientoTarjeta> movimientos;

    public ArregloMovimientoTarjeta() {
        this.movimientos = new ArrayList<>();
    }

    public ArrayList<MovimientoTarjeta> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<MovimientoTarjeta> movimientos) {
        this.movimientos = movimientos;
    }

    public boolean agregar(MovimientoTarjeta mov) {
        boolean result = false;
        if (this.movimientos.add(mov)) {
            result = true;
        }
        return result;
    }

    public String[][] getDatos(Tarjeta tarjeta) {
        int n = this.nMovimientos(tarjeta);
        String[][] s = new String[n][3];
        int i = 0;
        for (MovimientoTarjeta movimiento : this.movimientos) {
            if (tarjeta.getCodigo().equals(movimiento.getCodigo())) {
                s[i][0] = movimiento.getNombreEstacion();
                s[i][1] = movimiento.getFecha();
                s[i][2] = String.valueOf(movimiento.getMonto());
                i++;
            }
        }
        return s;
    }

    public String[][] getDatos(Estacion estacion) {
        int n = this.nMovmientos(estacion.getNombre());
        String[][] s = new String[n][4];
        int i = 0;
        for (MovimientoTarjeta movimiento : this.movimientos) {
            if (movimiento.getNombreEstacion().equals(estacion.getNombre())) {

                //Busco al nombre del cliente a partir del código de la tarjeta que realizó el movimiento
                Cliente c = Metropolitano.personas.getC(movimiento.getCodigo());
                s[i][0] = c.getNombres();
                s[i][1] = movimiento.getCodigo();
                s[i][2] = movimiento.getFecha();
                s[i][3] = String.valueOf(movimiento.getMonto());
                i++;
            }
        }
        return s;
    }

    public String[][] getDatos(String estacion) {
        int n = this.nMovmientos(estacion);

        String[][] s = new String[n][4];
        int i = 0;
        for (MovimientoTarjeta movimiento : this.movimientos) {
            if (movimiento.getNombreEstacion().equals(estacion)) {

                //Busco al nombre del cliente a partir del código de la tarjeta que realizó el movimiento
                Cliente c = Metropolitano.personas.getC(movimiento.getCodigo());
                s[i][0] = c.getNombres();
                s[i][1] = movimiento.getCodigo();
                s[i][2] = movimiento.getFecha();
                s[i][3] = String.valueOf(movimiento.getMonto());
                i++;
            }
        }
        return s;
    }

    private int nMovimientos(Tarjeta t) {
        int n = 0;
        for (MovimientoTarjeta movimiento : this.movimientos) {
            if (t.getCodigo().equals(movimiento.getCodigo())) {
                n++;
            }
        }
        return n;
    }

    private int nMovmientos(String nombreEstacion) {
        int n = 0;
        for (MovimientoTarjeta movimiento : this.movimientos) {
            if (nombreEstacion.equals(movimiento.getNombreEstacion())) {
                n++;
            }
        }
        return n;
    }

    @Override
    public String toString() {
        return "ArregloMovimientoTarjeta{" + "movimientos=" + movimientos + '}';
    }

}
