package colecciones;

import configuracion.Metropolitano;
import entidades.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ArregloMovimientoViaje implements Serializable {

    private ArrayList<MovimientoViaje> movimientos = new ArrayList();

    public ArregloMovimientoViaje() {
        this.movimientos = new ArrayList<>();
    }

    public ArrayList<MovimientoViaje> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<MovimientoViaje> movimientos) {
        this.movimientos = movimientos;
    }

    public String[][] getDatos(String estInicial, String estFinal) {
        if (estInicial.equals("Estacion virtual")) {
            return null;
        }
        int n = 0;
        String[][] s = null;
        for (MovimientoViaje movimiento : this.movimientos) {
            if (movimiento.isEstado() == false && movimiento.getEstacionInicial().equals(estInicial)
                    && movimiento.getEstacionFinal().equals(estFinal)) {
                n++;
            }
        }
        if (n > 0) {
            s = new String[n][7];
            int i = 0;
            for (MovimientoViaje movimiento : this.movimientos) {
                if (movimiento.getEstacionInicial().equals(estInicial)
                        && movimiento.getEstacionFinal().equals(estFinal)) {
                    Cliente tempCliente = Metropolitano.personas.getC(movimiento.getCodigo());
                    s[i][0] = movimiento.getEstacionInicial();
                    s[i][1] = movimiento.getHora_1();
                    s[i][2] = movimiento.getEstacionFinal();
                    s[i][3] = movimiento.getHora_2();
                    s[i][4] = tempCliente.getApellidoPaterno() + " "
                            + tempCliente.getApellidoMaterno() + " "
                            + tempCliente.getNombres();
                    s[i][5] = movimiento.getCodigo();
                    i++;
                }
            }
        }

        return s;
    }

    public String[][] getDatos2() {
        int n = 0;
        for (MovimientoViaje movimiento : this.movimientos) {
            if (movimiento.isEstado() == true) {
                n++;
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][7];
            int i = 0;
            for (MovimientoViaje mov : this.movimientos) {
                if (mov.isEstado() == true) {

                    Cliente c = Metropolitano.personas.getC(mov.getCodigo());
                    s[i][0] = c.getNombres();
                    s[i][1] = c.getDni();
                    s[i][2] = mov.getCodigo();
                    s[i][3] = mov.getEstacionInicio();
                    s[i][4] = mov.getTipoBus();
                    s[i][5] = mov.getDniChofer();
                    s[i][6] = mov.getHora_1();
                    i++;
                }
            }
        }

        return s;
    }

    public String[][] getDatos3() {
        int n = 0;
        for (MovimientoViaje movimiento : this.movimientos) {
            if (movimiento.isEstado() == false) {
                n++;
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][10];
            int i = 0;
            for (MovimientoViaje mov : this.movimientos) {
                if (mov.isEstado() == false) {

                    Cliente c = Metropolitano.personas.getC(mov.getCodigo());
                    s[i][0] = c.getNombres();
                    s[i][1] = c.getApellidoPaterno();
                    s[i][2] = c.getApellidoMaterno();
                    s[i][3] = c.getDni();
                    s[i][4] = mov.getEstacionInicial();
                    s[i][5] = mov.getHora_1();
                    s[i][6] = mov.getTipoBus();
                    s[i][7] = mov.getDniChofer();
                    s[i][8] = mov.getEstacionFinal();
                    s[i][9] = mov.getHora_2();
                    i++;
                }
            }
        }

        return s;
    }

    public String[][] getDatos4(Tarjeta t) {
        int n = this.nMovs(t);
        String[][] s = new String[n][3];
        int i = 0;
        for (MovimientoViaje mov : this.movimientos) {
            if (t.getCodigo().equals(mov.getCodigo()) && mov.isEstado() == false) {

                s[i][0] = mov.getHora_1();
                s[i][1] = mov.getEstacionInicial();
                s[i][2] = mov.getEstacionFinal();
                i++;
            }
        }
        return s;
    }

    private int nMovs(Tarjeta t) {
        int n = 0;

        for (MovimientoViaje movimiento : this.movimientos) {
            if (t.getCodigo().equals(movimiento.getCodigo())
                    && movimiento.isEstado() == false) {
                n++;
            }
        }
        return n;
    }

    public MovimientoViaje getMovimientoViaje(String fecha1) {
        MovimientoViaje mov = null;
        for (MovimientoViaje movimiento : this.movimientos) {
            if (movimiento.getHora_1() == fecha1) {
                mov = movimiento;
            }
        }
        return mov;
    }

    public boolean agregar(MovimientoViaje mov) {
        boolean result = false;
        if (this.movimientos.add(mov)) {
            result = true;
        }
        return result;
    }
}
