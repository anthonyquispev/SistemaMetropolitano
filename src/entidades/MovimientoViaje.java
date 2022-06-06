package entidades;

import java.io.Serializable;

public class MovimientoViaje implements Serializable {

    private String hora_1;
    private String hora_2;

    private String estacionInicial;
    private String estacionFinal;
    private boolean estado;
    private String tipoBus;
    private String dniChofer;
    private String codigo;

    public MovimientoViaje(String codigo, String hora_1, String estacionInicial, String pBus, String dniChofer) {
        this.codigo = codigo;
        this.hora_1 = hora_1;
        this.estacionInicial = estacionInicial;
        this.tipoBus = pBus;
        this.dniChofer = dniChofer;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public MovimientoViaje() {
        this.estado = false;
    }

    public String getEstacionInicial() {
        return estacionInicial;
    }

    public void setEstacionInicial(String estacionInicial) {
        this.estacionInicial = estacionInicial;
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    public String getDniChofer() {
        return dniChofer;
    }

    public void setDniChofer(String dniChofer) {
        this.dniChofer = dniChofer;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean salirEstacion(String estacion, String hora) {
        this.estacionFinal = estacion;
        this.hora_2 = hora;
        return true;
    }

    public String getHora_1() {
        return hora_1;
    }

    public void setHora_1(String hora_1) {
        this.hora_1 = hora_1;
    }

    public String getHora_2() {
        return hora_2;
    }

    public void setHora_2(String hora_2) {
        this.hora_2 = hora_2;
    }

    public String getEstacionInicio() {
        return estacionInicial;
    }

    public void setEstacionInicio(String estacionInicio) {
        this.estacionInicial = estacionInicio;
    }

    public String getEstacionFinal() {
        return estacionFinal;
    }

    public void setEstacionFinal(String estacionFinal) {
        this.estacionFinal = estacionFinal;
    }

}
