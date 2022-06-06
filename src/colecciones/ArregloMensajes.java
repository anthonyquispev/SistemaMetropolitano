
package colecciones;

import entidades.Mensaje;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;


public class ArregloMensajes implements Serializable{
    private ArrayList<Mensaje> mensajes;
    
        public ArregloMensajes() {
        this.mensajes = new ArrayList();
    }

//    public Vector agregar(Mensaje m) {
//        Vector v = new Vector();
//        Object[] o = new Object[4];
//        o[0] = 1;
//        o[1] = "Huyna ctm";
//        o[2] = 9.2;
//        o[3] = true;
//        v.add(o);
//        this.mensajes.add(m);
//        return v;
//    }
}
