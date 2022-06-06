package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializadoraGen {

    public static void serializar(String nombreArchivo, ArrayList array) {
        try {
            FileOutputStream file = new FileOutputStream(nombreArchivo);
            ObjectOutputStream escritor = new ObjectOutputStream(file);
            escritor.writeObject(array);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList deserializar(String nombreArchivo) {
        ArrayList retorno = new ArrayList();
        try {
            FileInputStream file = new FileInputStream(nombreArchivo);
            ObjectInputStream lector = new ObjectInputStream(file);
            retorno = (ArrayList) lector.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return retorno;
    }
}
