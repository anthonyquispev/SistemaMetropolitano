package entidades;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona implements Serializable {

    private double efectivo;

    private boolean movViaje_1;

    private ArrayList<Tarjeta> tarjetas;

    private ArrayList<Mensaje> mensajes;

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Cliente(double efectivo, String nombres, String apellidoPaterno, String apellidoMaterno, String dni, int edad, Login usuario) {
        super(nombres, apellidoPaterno, apellidoMaterno, dni, edad, usuario);
        this.efectivo = efectivo;
        this.tarjetas = new ArrayList();
        this.movViaje_1 = false;
        this.mensajes = new ArrayList();
    }

    public boolean isMovViaje_1() {
        return movViaje_1;
    }

    public void setMovViaje_1(boolean movViaje_1) {
        this.movViaje_1 = movViaje_1;
    }

    public boolean agregarTarjeta(Tarjeta t) {
        if (!this.buscar(t.getCodigo())) {
            this.tarjetas.add(t);
            return true;
        }
        return false;
    }

    private boolean buscar(String codigo) {
        for (Tarjeta tarjeta : this.tarjetas) {
            if (codigo.equals(tarjeta.getCodigo())) {
                return true;
            }
        }
        return false;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public ArrayList<Tarjeta> getTarj() {
        return this.tarjetas;
    }

    public String[] getTarjetas() {
        String[] s = new String[this.tarjetas.size()];
        int i = 0;
        for (Tarjeta t : this.tarjetas) {
            s[i] = t.getCodigo();
            i++;
        }
        return s;
    }

    public boolean isTarjeta(String codigo) {
        boolean result = false;
        for (Tarjeta tarjeta : this.tarjetas) {
            if (codigo.equals(tarjeta.getCodigo())) {
                result = true;
                break;
            }
        }
        return result;
    }

    public Tarjeta getTarjeta(String codigo) {
        Tarjeta tarjeta = null;
        for (Tarjeta t : this.tarjetas) {
            if (codigo.equals(t.getCodigo())) {
                tarjeta = t;
                break;
            }
        }
        return tarjeta;
    }

    public Tarjeta getTarjeta(Tarjeta t) {
        Tarjeta tarjeta = null;
        for (Tarjeta tar : this.tarjetas) {
            if (t == tar) {
                tarjeta = tar;
                break;
            }
        }
        return tarjeta;
    }

    public int getNumeroTarjetas() {
        return this.tarjetas.size();
    }

    public String[][] mensajes() {
        if (this.mensajes == null) {
            return null;
        }
        String[][] s = new String[this.mensajes.size()][2];
        int i = 0;
        for (Mensaje mensaje : this.mensajes) {
            s[i][0] = mensaje.getMensajeCliente();
            s[i][1] = mensaje.getMensajeTrabajador();
            i++;
        }
        return s;
    }

    public boolean agregarMensaje(Mensaje m) {
        return this.mensajes.add(m);
    }

    public Mensaje getMensaje(String fecha) {
        Mensaje m = null;
        for (Mensaje mensaje : this.mensajes) {
            if (mensaje.getFecha() == fecha) {
                m = mensaje;
                break;
            }
        }
        return m;
    }

}
