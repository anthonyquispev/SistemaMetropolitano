package enumerados;

public enum EnumTipoTarjeta {

    GENERAL("GENERAL", 1.0),
    ESCOlAR("ESCOLAR", 0.5),
    UNIVERSITARIO("UNIVERSITARIO", 0.75);

    private final String nombre;
    private double porcentaje;

    private EnumTipoTarjeta(String nombre, double porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

}
