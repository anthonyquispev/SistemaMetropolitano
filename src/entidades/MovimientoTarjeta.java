package entidades;

import java.io.Serializable;

public class MovimientoTarjeta implements Serializable {

    // Código de la tarjeta que realizó el movimiento
    private String codigo;

    //Estación en dónde se realizó el movimiento
    private String nombreEstacion;

    private String fecha;
    private double monto;

    public MovimientoTarjeta(String codigo, String nombreEstacion, String fecha, double monto) {
        this.codigo = codigo;
        this.nombreEstacion = nombreEstacion;
        this.fecha = fecha;
        this.monto = monto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
