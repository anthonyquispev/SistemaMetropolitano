package principal;

import configuracion.Metropolitano;
import entidades.Chofer;
import entidades.Cliente;
import entidades.Estacion;
import entidades.Login;
import entidades.Persona;
import entidades.Taquilla;
import entidades.Tarjeta;
import entidades.Trabajador;
import enumerados.EnumTipoTarjeta;
import java.util.ArrayList;
import lib.SerializadoraGen;

public class Data {

    public static void main(String[] args) {

        // Al compilar se crean los archivos correspondientes
        // y si estos ya existen, entonces se reemplazan por nuevos archivos, reseteando la data
        
        /* USUARIOS */
        // Tipo de usuario: 2
        Login usuario01 = new Login("1", "1", 2);
        Login usuario02 = new Login("2", "2", 2);
        Login usuario03 = new Login("3", "3", 2);
        Login usuario04 = new Login("4", "4", 2);
        Login usuario05 = new Login("5", "5", 2);
        Login usuario06 = new Login("6", "6", 2);
        Login usuario07 = new Login("7", "7", 2);
        Login usuario08 = new Login("8", "8", 2);
        Login usuario09 = new Login("9", "9", 2);
        // Tipo de usuario: 1
        Login usuario10 = new Login("admin1", "11", 1);
        Login usuario11 = new Login("admin2", "12", 1);
        Login usuario12 = new Login("admin3", "13", 1);
        Login usuario13 = new Login("admin4", "14", 1);

        /* CLIENTES */
        Cliente cliente01 = new Cliente(700,
                "JOSÉ", "MAURO", "BANDERAS", "14123456", 21, usuario01);
        Cliente cliente02 = new Cliente(200,
                "MIGUEL", "MORENO", "SÁNCHEZ", "98456789", 22, usuario02);
        Cliente cliente03 = new Cliente(100,
                "RODRIGO", "JIMÉNEZ", "TORRES", "78451245", 23, usuario03);
        Cliente cliente04 = new Cliente(100,
                "MAURICIO", "PINEDO", "FERNÁNDEZ", "45121214", 23, usuario04);
        Cliente cliente05 = new Cliente(100,
                "FRANCISCO", "MORENO", "BANDERAS", "76123456", 21, usuario05);
        Cliente cliente06 = new Cliente(200,
                "JOSÉ", "RIVERA", "VEGA", "24157956", 50, usuario06);
        Cliente cliente07 = new Cliente(260,
                "MARCOS", "GARCÍA", "ARANA", "12451234", 52, usuario07);
        Cliente cliente08 = new Cliente(120,
                "ALEXANDRA", "MARTÍNEZ", "DÁVILA", "42479564", 60, usuario08);
        Cliente cliente09 = new Cliente(120,
                "MARIANA", "RODRÍGUEZ", "BANDERAS", "19762483", 80, usuario09);

        /* ADMINISTRADORES */
        Trabajador trabajador01 = new Trabajador(20000, "JORGE", "ZAVALETA", "CAMPOS", "45414565", 20, usuario10);
        Trabajador trabajador03 = new Trabajador(10000, "ALEX", "LIZARAZO", "HUANCAHUIRE", "10247036", 20, usuario11);
        Trabajador trabajador04 = new Trabajador(10000, "DANIEL", "TONCONI", "LAURA", "23100145", 20, usuario12);
        Trabajador trabajador02 = new Trabajador(10000, "ANTHONY", "QUISPE", "VEGA", "95123457", 20, usuario13);

        /* ESTACIONES */
        //30Km/h 500 m/min
        Estacion estacion01 = new Estacion("Naranjal", "Norte", new Taquilla(), 0, 800, 800 / Metropolitano.velocidadProm);
        Estacion estacion02 = new Estacion("Izaguirre", "Norte", new Taquilla(), 1, 650, 650 / Metropolitano.velocidadProm);
        Estacion estacion03 = new Estacion("Pacifico", "Norte", new Taquilla(), 2, 450, 450 / Metropolitano.velocidadProm);
        Estacion estacion04 = new Estacion("Independencia", "Norte", new Taquilla(), 3, 400, 400 / Metropolitano.velocidadProm);
        Estacion estacion05 = new Estacion("Los Jazmines", "Norte", new Taquilla(), 4, 530, 530 / Metropolitano.velocidadProm);
        Estacion estacion06 = new Estacion("Tomás Valle", "Centro", new Taquilla(), 5, 580, 580 / Metropolitano.velocidadProm);
        Estacion estacion07 = new Estacion("El Milagro", "Centro", new Taquilla(), 6, 670, 670 / Metropolitano.velocidadProm);
        Estacion estacion08 = new Estacion("Honorio Delgado", "Centro", new Taquilla(), 7, 800, 800 / Metropolitano.velocidadProm);
        Estacion estacion09 = new Estacion("UNI", "Centro", new Taquilla(), 8, 800, 800 / Metropolitano.velocidadProm);
        Estacion estacion10 = new Estacion("Parque del Trabajo", "Sur", new Taquilla(), 9, 750, 750 / Metropolitano.velocidadProm);
        Estacion estacion11 = new Estacion("Caquetá", "Sur", new Taquilla(), 10, 950, 950 / Metropolitano.velocidadProm);
        Estacion estacion12 = new Estacion("Ramón Castilla", "Sur", new Taquilla(), 11, 550, 550 / Metropolitano.velocidadProm);
        Estacion estacion13 = new Estacion("Tacna", "Sur", new Taquilla(), 12, 550, 550 / Metropolitano.velocidadProm);
        Estacion estacion14 = new Estacion("Jirón de la Unión", "Sur", new Taquilla(), 13, 550, 550 / Metropolitano.velocidadProm);
        Estacion estacion15 = new Estacion("Colmena", "Sur", new Taquilla(), 14, 700, 700 / Metropolitano.velocidadProm);
        Estacion estacion16 = new Estacion("Dos de Mayo", "Sur", new Taquilla(), 15, 550, 550 / Metropolitano.velocidadProm);
        Estacion estacion17 = new Estacion("Quilca", "Sur", new Taquilla(), 16, 600, 600 / Metropolitano.velocidadProm);
        Estacion estacion18 = new Estacion("España", "Sur", new Taquilla(), 17, 500, 500 / Metropolitano.velocidadProm);
        Estacion estacion19 = new Estacion("Estacion Central", "Sur", new Taquilla(), 18, 1300, 1300 / Metropolitano.velocidadProm);
        Estacion estacion20 = new Estacion("Estadio Nacional", "Sur", new Taquilla(), 19, 920, 920 / Metropolitano.velocidadProm);
        Estacion estacion21 = new Estacion("México", "Sur", new Taquilla(), 20, 680, 680 / Metropolitano.velocidadProm);
        Estacion estacion22 = new Estacion("Canadá", "Sur", new Taquilla(), 21, 1000, 1000 / Metropolitano.velocidadProm);
        Estacion estacion23 = new Estacion("Javier Prado", "Sur", new Taquilla(), 22, 800, 800 / Metropolitano.velocidadProm);
        Estacion estacion24 = new Estacion("Carnaval Moreyra", "Sur", new Taquilla(), 23, 640, 640 / Metropolitano.velocidadProm);
        Estacion estacion25 = new Estacion("Aramburú", "Sur", new Taquilla(), 24, 700, 700 / Metropolitano.velocidadProm);
        Estacion estacion26 = new Estacion("Domingo Orué", "Sur", new Taquilla(), 25, 610, 610 / Metropolitano.velocidadProm);
        Estacion estacion27 = new Estacion("Angamos", "Sur", new Taquilla(), 26, 700, 700 / Metropolitano.velocidadProm);
        Estacion estacion28 = new Estacion("Ricardo Palma", "Sur", new Taquilla(), 27, 670, 670 / Metropolitano.velocidadProm);
        Estacion estacion29 = new Estacion("Benavides", "Sur", new Taquilla(), 28, 550, 550 / Metropolitano.velocidadProm);
        Estacion estacion30 = new Estacion("28 de Julio", "Sur", new Taquilla(), 29, 850, 850 / Metropolitano.velocidadProm);
        Estacion estacion31 = new Estacion("Plaza de Flores", "Sur", new Taquilla(), 30, 700, 700 / Metropolitano.velocidadProm);
        Estacion estacion32 = new Estacion("Balta", "Sur", new Taquilla(), 31, 850, 850 / Metropolitano.velocidadProm);
        Estacion estacion33 = new Estacion("Bulevar", "Sur", new Taquilla(), 32, 500, 500 / Metropolitano.velocidadProm);
        Estacion estacion34 = new Estacion("Estadio Unión", "Sur", new Taquilla(), 33, 750, 750 / Metropolitano.velocidadProm);
        Estacion estacion35 = new Estacion("Escuela Militar", "Sur", new Taquilla(), 34, 1000, 1000 / Metropolitano.velocidadProm);
        Estacion estacion36 = new Estacion("Terán", "Sur", new Taquilla(), 35, 600, 600 / Metropolitano.velocidadProm);
        Estacion estacion37 = new Estacion("Rosario de Villa", "Sur", new Taquilla(), 36, 900, 900 / Metropolitano.velocidadProm);
        Estacion estacion38 = new Estacion("Matellini", "Sur", new Taquilla(), 37, 0, 0);
        Estacion estacion39 = new Estacion("Estacion virtual", "", new Taquilla(), 38);

        /* TARJETAS */
        Tarjeta t01 = estacion01.getTaquilla().emitirTarjeta(EnumTipoTarjeta.ESCOlAR, 100, "47051411");
        Tarjeta t02 = estacion01.getTaquilla().emitirTarjeta(EnumTipoTarjeta.UNIVERSITARIO, 10, "92250194");
        Tarjeta t03 = estacion01.getTaquilla().emitirTarjeta(EnumTipoTarjeta.GENERAL, 5, "11542191");
        Tarjeta t04 = estacion02.getTaquilla().emitirTarjeta(EnumTipoTarjeta.GENERAL, 3, "42145456");
        Tarjeta t05 = estacion02.getTaquilla().emitirTarjeta(EnumTipoTarjeta.GENERAL, 4, "14547846");
        Tarjeta t06 = estacion03.getTaquilla().emitirTarjeta(EnumTipoTarjeta.UNIVERSITARIO, 5, "95425679");
        Tarjeta t07 = estacion05.getTaquilla().emitirTarjeta(EnumTipoTarjeta.GENERAL, 0, "45124124");
        Tarjeta t08 = estacion10.getTaquilla().emitirTarjeta(EnumTipoTarjeta.ESCOlAR, 0, "11144412");
        Tarjeta t09 = estacion09.getTaquilla().emitirTarjeta(EnumTipoTarjeta.GENERAL, 20, "98745454");
        Tarjeta t10 = estacion09.getTaquilla().emitirTarjeta(EnumTipoTarjeta.GENERAL, 30, "78457844");
        Tarjeta t11 = estacion08.getTaquilla().emitirTarjeta(EnumTipoTarjeta.ESCOlAR, 10, "78439414");
        Tarjeta t12 = estacion08.getTaquilla().emitirTarjeta(EnumTipoTarjeta.ESCOlAR, 40, "12014560");
        Tarjeta t13 = estacion02.getTaquilla().emitirTarjeta(EnumTipoTarjeta.GENERAL, 12, "41001200");
        Tarjeta t14 = estacion03.getTaquilla().emitirTarjeta(EnumTipoTarjeta.UNIVERSITARIO, 1, "62001207");
        Tarjeta t15 = estacion03.getTaquilla().emitirTarjeta(EnumTipoTarjeta.GENERAL, 2, "96324710");
        Tarjeta t16 = estacion03.getTaquilla().emitirTarjeta(EnumTipoTarjeta.ESCOlAR, 3, "95001400");

        /* Agregando tarjetas a clientes */
        cliente01.agregarTarjeta(t01);
        cliente01.agregarTarjeta(t02);
        cliente01.agregarTarjeta(t03);
        cliente02.agregarTarjeta(t04);
        cliente02.agregarTarjeta(t05);
        cliente03.agregarTarjeta(t06);
        cliente03.agregarTarjeta(t07);
        cliente03.agregarTarjeta(t08);
        cliente03.agregarTarjeta(t09);
        cliente03.agregarTarjeta(t10);
        cliente04.agregarTarjeta(t11);
        cliente05.agregarTarjeta(t12);
        cliente06.agregarTarjeta(t13);
        cliente07.agregarTarjeta(t14);
        cliente08.agregarTarjeta(t15);
        cliente09.agregarTarjeta(t16);

        Login usuarioChofer01 = new Login("usuariochofer01", "passwordchofer01", 1);
        Login usuarioChofer02 = new Login("usuariochofer02", "passwordchofer02", 1);
        Login usuarioChofer03 = new Login("usuariochofer03", "passwordchofer03", 1);
        Login usuarioChofer04 = new Login("usuariochofer04", "passwordchofer04", 1);
        Login usuarioChofer05 = new Login("usuariochofer05", "passwordchofer05", 1);
        Login usuarioChofer06 = new Login("usuariochofer06", "passwordchofer06", 1);
        Login usuarioChofer07 = new Login("usuariochofer07", "passwordchofer07", 1);
        Login usuarioChofer08 = new Login("usuariochofer08", "passwordchofer08", 1);
        Login usuarioChofer09 = new Login("usuariochofer09", "passwordchofer09", 1);

        Chofer chofer01 = new Chofer("DASD2", "ANDY JAVIER", "ROCES", "PEÑA", "78451597", 20, usuarioChofer01);
        Chofer chofer02 = new Chofer("A9013", "MIKE MORÁN", "AITOR", "PITARCH", "54701010", 30, usuarioChofer02);
        Chofer chofer03 = new Chofer("A8U82", "RAMON ANCÓN", "MERCADO", "VEGA", "45874545", 40, usuarioChofer03);
        Chofer chofer04 = new Chofer("GR455", "ALONSO JESUS", "LINAREZ", "TONCONI", "14621231", 40, usuarioChofer04);
        Chofer chofer05 = new Chofer("G45YH", "ANA MARÍN", "HUANCA", "ZAPATA", "48451245", 40, usuarioChofer05);
        Chofer chofer06 = new Chofer("F34RS", "MARCO ANDY", "JIMÉNEZ", "MELGAR", "30124590", 40, usuarioChofer06);
        Chofer chofer07 = new Chofer("SG444", "MARIANO JULCA", "VEGA", "LÓPEZ", "60140407", 40, usuarioChofer07);
        Chofer chofer08 = new Chofer("H34RS", "EDISON LONDRA", "ROLDÁN", "PIETRO", "10000214", 40, usuarioChofer08);
        Chofer chofer09 = new Chofer("97HOO", "DANIEL ALEX", "RAMOS", "PINEDA", "45078950", 40, usuarioChofer09);

        ArrayList<Estacion> tempEstaciones = new ArrayList();
        tempEstaciones.add(estacion01);
        tempEstaciones.add(estacion02);
        tempEstaciones.add(estacion03);
        tempEstaciones.add(estacion04);
        tempEstaciones.add(estacion05);
        tempEstaciones.add(estacion06);
        tempEstaciones.add(estacion07);
        tempEstaciones.add(estacion08);
        tempEstaciones.add(estacion09);
        tempEstaciones.add(estacion10);
        tempEstaciones.add(estacion11);
        tempEstaciones.add(estacion12);
        tempEstaciones.add(estacion13);
        tempEstaciones.add(estacion14);
        tempEstaciones.add(estacion15);
        tempEstaciones.add(estacion16);
        tempEstaciones.add(estacion17);
        tempEstaciones.add(estacion18);
        tempEstaciones.add(estacion19);
        tempEstaciones.add(estacion20);
        tempEstaciones.add(estacion21);
        tempEstaciones.add(estacion22);
        tempEstaciones.add(estacion23);
        tempEstaciones.add(estacion24);
        tempEstaciones.add(estacion25);
        tempEstaciones.add(estacion26);
        tempEstaciones.add(estacion27);
        tempEstaciones.add(estacion28);
        tempEstaciones.add(estacion29);
        tempEstaciones.add(estacion30);
        tempEstaciones.add(estacion31);
        tempEstaciones.add(estacion32);
        tempEstaciones.add(estacion33);
        tempEstaciones.add(estacion34);
        tempEstaciones.add(estacion35);
        tempEstaciones.add(estacion36);
        tempEstaciones.add(estacion37);
        tempEstaciones.add(estacion38);
        tempEstaciones.add(estacion39);

        ArrayList<Persona> tempPersonas = new ArrayList();
        tempPersonas.add(trabajador01);
        tempPersonas.add(trabajador02);
        tempPersonas.add(trabajador03);
        tempPersonas.add(trabajador04);
        tempPersonas.add(cliente01);
        tempPersonas.add(cliente02);
        tempPersonas.add(cliente03);
        tempPersonas.add(cliente04);
        tempPersonas.add(cliente05);
        tempPersonas.add(cliente06);
        tempPersonas.add(cliente07);
        tempPersonas.add(cliente08);
        tempPersonas.add(cliente09);
        tempPersonas.add(chofer01);
        tempPersonas.add(chofer02);
        tempPersonas.add(chofer03);
        tempPersonas.add(chofer04);
        tempPersonas.add(chofer05);
        tempPersonas.add(chofer06);
        tempPersonas.add(chofer07);
        tempPersonas.add(chofer08);
        tempPersonas.add(chofer09);

//          SERIALIZACIÓN
        SerializadoraGen.serializar(Metropolitano.FILE_PERSONAS, tempPersonas);
        SerializadoraGen.serializar(Metropolitano.FILE_ESTACIONES, tempEstaciones);
        SerializadoraGen.serializar(Metropolitano.FILE_MOVIMIENTOSTARJETA, Metropolitano.movimientosTarjeta.getMovimientos());
        SerializadoraGen.serializar(Metropolitano.FILE_MOVIMIENTOSVIAJE, Metropolitano.viajes.getMovimientos());
        System.out.println("Archivos agregados correctamente:\nPersonas, Estaciones y Movimientos");

    }

}
