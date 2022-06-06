package principal;

import configuracion.Metropolitano;
import entidades.Bus;
import formulariosCliente.frmIngreso;
import lib.SerializadoraGen;

public class App {

    public static void main(String[] args) {
        Bus bus01 = new Bus("A", 0);
        Bus bus02 = new Bus("B", 1);
        Bus bus03 = new Bus("C", 2);
        Bus bus04 = new Bus("D", 3);
        Bus bus05 = new Bus("EX1", 4);
        Bus bus06 = new Bus("EX2", 5);
        Bus bus07 = new Bus("EX3", 6);
        Bus bus08 = new Bus("EX4", 7);
        Bus bus09 = new Bus("EX5", 8);
        Bus bus10 = new Bus("EX6", 9);
        Bus bus11 = new Bus("EX7", 10);
        Bus bus12 = new Bus("EX8", 11);
        Bus bus13 = new Bus("SX9", 12);
        Bus bus14 = new Bus("SX", 13);
        Bus bus15 = new Bus("SXN", 14);

        Metropolitano.bus.agregar(bus01);
        Metropolitano.bus.agregar(bus02);
        Metropolitano.bus.agregar(bus03);
        Metropolitano.bus.agregar(bus04);
        Metropolitano.bus.agregar(bus05);
        Metropolitano.bus.agregar(bus06);
        Metropolitano.bus.agregar(bus07);
        Metropolitano.bus.agregar(bus08);
        Metropolitano.bus.agregar(bus09);
        Metropolitano.bus.agregar(bus10);
        Metropolitano.bus.agregar(bus11);
        Metropolitano.bus.agregar(bus12);
        Metropolitano.bus.agregar(bus13);
        Metropolitano.bus.agregar(bus14);
        Metropolitano.bus.agregar(bus15);

        //  DESERIALIZACIÓN
        Metropolitano.personas.setPersonas(SerializadoraGen.deserializar(Metropolitano.FILE_PERSONAS));
        Metropolitano.estaciones.setEstaciones(SerializadoraGen.deserializar(Metropolitano.FILE_ESTACIONES));
        Metropolitano.movimientosTarjeta.setMovimientos(SerializadoraGen.deserializar(Metropolitano.FILE_MOVIMIENTOSTARJETA));
        Metropolitano.viajes.setMovimientos(SerializadoraGen.deserializar(Metropolitano.FILE_MOVIMIENTOSVIAJE));

        // SERIALIZACIÓN
        // Se realiza la serialización al momento de presionar el botón EXIT del frame Ingreso, 
        // pero se puede modificar para que se guarden los datos constantemente.

        //  ABRIR VENTANA PRINCIPAL
        frmIngreso frm = new frmIngreso();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);        
    }
}
