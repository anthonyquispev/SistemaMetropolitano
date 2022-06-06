package colecciones;

import entidades.Tarjeta;
import java.io.Serializable;
import java.util.ArrayList;

public class ArregloTarjeta implements Serializable {

    private ArrayList<Tarjeta> tarjetas;

    public ArregloTarjeta() {
        this.tarjetas = new ArrayList();
    }

    public void agregar(Tarjeta t) {
        this.tarjetas.add(t);
    }

}
