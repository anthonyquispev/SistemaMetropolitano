package entidades;

import enumerados.EnumTipoTarjeta;
import java.io.Serializable;

public class Taquilla implements Serializable {

    private double montoRecaudado;
    private double montoViajes;
    private int nRecargas;
    private int nViajes;
    private int nTarjetasEmitidas;

    private boolean activo;

    public Taquilla() {
        this.montoRecaudado = 0;
        this.montoViajes = 0;
        this.nRecargas = 0;
        this.nTarjetasEmitidas = 0;
        this.activo = true;
    }

    public void recargar(double monto) {
        this.montoRecaudado += monto;
        this.nRecargas++;
    }

    public void viajarBus(double monto) {
        this.montoViajes += monto;
        this.nViajes++;
    }

    public double getMontoViajes() {
        return montoViajes;
    }

    public void setMontoViajes(double montoViajes) {
        this.montoViajes = montoViajes;
    }

    public int getnViajes() {
        return nViajes;
    }

    public void setnViajes(int nViajes) {
        this.nViajes = nViajes;
    }

    public Tarjeta emitirTarjeta(EnumTipoTarjeta tipo, double saldo, String codigo) {
        Tarjeta t = new Tarjeta(codigo, saldo);
        t.setEnumTipo(tipo);
        return t;
    }

    public int getnRecargas() {
        return nRecargas;
    }

    public double getMontoRecaudado() {
        return montoRecaudado;
    }

    public int getnTarjetasEmitidas() {
        return nTarjetasEmitidas;
    }

    public void setnTarjetasEmitidas(int nTarjetasEmitidas) {
        this.nTarjetasEmitidas = nTarjetasEmitidas;
    }

}
