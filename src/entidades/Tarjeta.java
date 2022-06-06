package entidades;

import configuracion.Metropolitano;
import enumerados.EnumTipoTarjeta;
import entidades.*;
import java.io.Serializable;

public class Tarjeta implements Serializable {

    private double saldo;
    private String codigo;
    private EnumTipoTarjeta tipo;

    public Tarjeta() {
    }

    public Tarjeta(double saldo) {
        this.saldo = saldo;
    }

    public Tarjeta(String codigo, double saldo) {
        this.saldo = saldo;
        this.codigo = codigo;
    }

    public MovimientoViaje entrarBus(String estacion, String pBus, String dniChofer, String hora) {
        MovimientoViaje mov = null;
        double porcentaje = this.tipo.getPorcentaje();
        double monto = Metropolitano.pagoBus * porcentaje;
        if (this.saldo >= monto) {
            this.pagarBus(monto);
            mov = new MovimientoViaje(this.getCodigo(), hora, estacion, pBus, dniChofer);
            mov.setEstado(true);
            Estacion tempEstacion = Metropolitano.estaciones.getEstacion(estacion);
            Taquilla taq = tempEstacion.getTaquilla();
            taq.viajarBus(monto);

            return mov;
        }
        return mov;
    }

    public MovimientoTarjeta recargar2(String fecha, double monto, String nombreEstacion) {
        MovimientoTarjeta mov = null;
        if (monto > 0) {

            // Actualizar los datos de la taquilla
            Estacion tempEstacion = Metropolitano.estaciones.getEstacion(nombreEstacion);
            Taquilla taq = tempEstacion.getTaquilla();
            taq.recargar(monto);

            this.incrementarSaldo(monto);

            mov = new MovimientoTarjeta(this.getCodigo(), nombreEstacion, fecha, monto);

            return mov;
        }
        return mov;
    }

    public void incrementarSaldo(double monto) {
        double nuevoSaldo = this.getSaldo() + monto;
        this.saldo = nuevoSaldo;
    }

    public void pagarBus(double monto) {
        double nuevoSaldo = this.getSaldo() - monto;
        this.saldo = nuevoSaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public EnumTipoTarjeta getTipo() {
        return tipo;
    }

    public void setEnumTipo(EnumTipoTarjeta tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }
}
