package configuracion;

import colecciones.*;
import entidades.*;
import java.io.Serializable;
import java.util.Date;

public class Metropolitano implements Serializable {

    public static Date hInicio;
    public static Date hFin;
    public static double precioTarjeta;
    public static double pagoBus = 2.0; // pago general para ingresar al bus
    public static double velocidadProm = 350; //21 km/h  ->  350 m/min

    //  Arreglo de personas
    public static final String FILE_PERSONAS = "personas.txt";
    public static ArregloPersona personas = new ArregloPersona();

    //  Arreglo de estaciones
    public static final String FILE_ESTACIONES = "estaciones.txt";
    public static ArregloEstacion estaciones = new ArregloEstacion();

    //  Arreglo de movimientos de tarjeta
    public static final String FILE_MOVIMIENTOSTARJETA = "movimientosTarjeta.txt";
    public static ArregloMovimientoTarjeta movimientosTarjeta = new ArregloMovimientoTarjeta();

    //  Arreglo de viajes
    public static final String FILE_MOVIMIENTOSVIAJE = "movimientosViaje.txt";
    public static ArregloMovimientoViaje viajes = new ArregloMovimientoViaje();

    //  Arreglo de buses
    public static ArregloBus bus = new ArregloBus();
        
    public static Login usuarioActual;
    public static ArregloLogin u = new ArregloLogin();

    public static Estacion estacionActual;

    public static Persona personaActual;
    public static Cliente clienteActual;
    public static Trabajador trabajadorActual;
    public static Tarjeta tarjetaActual;
    public static Bus busActual;
    public static MovimientoViaje movimientoViajeActual;
    public static Mensaje mensajeActual;

}
