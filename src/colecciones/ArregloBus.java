package colecciones;

import configuracion.Metropolitano;
import entidades.*;

import java.util.ArrayList;
import entidades.Bus;
import java.io.Serializable;

public class ArregloBus implements Serializable {

    private ArrayList<Bus> buses;

    public ArregloBus() {
        this.buses = new ArrayList();
    }

    public void agregar(Bus bus) {
        this.buses.add(bus);
    }

    public String[] getBus_() {
        String[] s = new String[this.buses.size()];
        int i = 0;
        for (Bus bus : this.buses) {
            s[i] = bus.getTipoBus();
            i++;
        }
        return s;
    }

    public Bus getBus(String tipoBus) {
        for (Bus bus : this.buses) {
            if (tipoBus.equals(bus.getTipoBus())) {
                return bus;
            }
        }
        return null;
    }

    public Bus getBus(int numero) {
        for (Bus bus : this.buses) {
            if (numero == bus.getNumero()) {
                return bus;
            }
        }
        return null;
    }

    //  Si las 2 estaciones son iguales, entonces se muestran los buses que pasan por dicha estación
    public String[] busesDisponibles(boolean matriz[][][][], String estInicial, String estFinal) {
        String[] temp = new String[50];
        String[] retorno = null;
        int cont = 0;
        Estacion estacion1 = Metropolitano.estaciones.getEstacion(estInicial);
        int idEst1 = estacion1.getNumero();
        Estacion estacion2 = Metropolitano.estaciones.getEstacion(estFinal);
        int idEst2 = estacion2.getNumero();

        int direccion;
        if (idEst1 < idEst2) {
            direccion = 0; // de norte a sur
        } else if (idEst1 > idEst2) {
            direccion = 1; // de sur a norte
        } else {
            direccion = 2;
        }
        //Número de buses: 15
        for (int i = 0; i < 15; i++) {
            Bus tempBus = Metropolitano.bus.getBus(i);
            String tipoBus = tempBus.getTipoBus();
            for (int j = 0; j < 2; j++) {
                if (direccion == 0 || direccion == 1) {
                    if (matriz[i][idEst1][direccion][j] == true
                            && matriz[i][idEst2][direccion][j] == true) {
                        temp[cont] = tipoBus;
                        cont++;
                        break;
                    }
                } else {
                    if (matriz[i][idEst1][0][j] == true
                            && matriz[i][idEst2][0][j] == true) {
                        temp[cont] = tipoBus +" - Norte->Sur " + "(Horario:"+(j+1)+")";
                        cont++;
                    }if (matriz[i][idEst1][1][j] == true
                            && matriz[i][idEst2][1][j] == true) {
                        temp[cont] = tipoBus +" - Sur->Norte " + "(Horario:"+(j+1)+")";
                        cont++;
                    }
                }
            }
        }
        if(cont>0){
            retorno = new String[cont];
            for (int i = 0; i < cont; i++) {
                retorno[i] = temp[i];
            }
        }
        return retorno;
    }

    public String distanciaPromedio(String estInicial, String estFinal) {
        Estacion estacion1 = Metropolitano.estaciones.getEstacion(estInicial);
        int numero1 = estacion1.getNumero();
        Estacion estacion2 = Metropolitano.estaciones.getEstacion(estFinal);
        int numero2 = estacion2.getNumero();
        if (numero1 == numero2) {
            return "0 km";
        } else if (numero1 > numero2) {
            int tempNumero = numero1;
            numero1 = numero2;
            numero2 = tempNumero;
        }
        Estacion tempEstacion;
        double distancia = 0;
        for (int i = numero1; i < numero2; i++) {
            tempEstacion = Metropolitano.estaciones.getEstacion(i);
            distancia += tempEstacion.getDistancia();
        }
        distancia /= 1000.0; // m -> km
        distancia = this.dosDecimales(distancia);
        String result = distancia + " km";
        return result;
    }

    public String tiempoPromedio(String estInicial, String estFinal) {
        Estacion estacion1 = Metropolitano.estaciones.getEstacion(estInicial);
        int numero1 = estacion1.getNumero();
        Estacion estacion2 = Metropolitano.estaciones.getEstacion(estFinal);
        int numero2 = estacion2.getNumero();

        if (numero1 == numero2) {
            return "0 minutos";
        } else if (numero1 > numero2) {
            int tempNumero = numero1;
            numero1 = numero2;
            numero2 = tempNumero;
        }
        Estacion tempEstacion;
        double tiempo = 0;
        for (int i = numero1; i < numero2; i++) {
            tempEstacion = Metropolitano.estaciones.getEstacion(i);
            tiempo += tempEstacion.getTiempo();
        }
        tiempo = this.dosDecimales(tiempo);
        String result = tiempo + " minutos";
        return result;
    }

    private double dosDecimales(double numero) {
        double aux = numero * 100;
        aux = Math.round(aux);
        return aux / 100;
    }
}
