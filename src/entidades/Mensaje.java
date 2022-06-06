package entidades;

import java.io.Serializable;

public class Mensaje implements Serializable{

    private String[] mensaje;
    private String fecha;
    private boolean bRespondido;

    public Mensaje(String fecha){
        this.mensaje = new String[2];
        this.fecha = fecha;
        this.bRespondido = false;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isbRespondido() {
        return bRespondido;
    }

    public void setbRespondido(boolean bRespondido) {
        this.bRespondido = bRespondido;
    }

    public String[] getMensaje() {
        return mensaje;
    }

    public void setMensaje(String[] mensaje) {
        this.mensaje = mensaje;
    }

    public void setMensajeCliente(String mensaje) {
        this.mensaje[0] = mensaje;
    }

    public void setMensajeTrabajador(String mensaje) {
        this.mensaje[1] = mensaje;
    }
    public String getMensajeCliente() {
        return this.mensaje[0];
    }

    public String getMensajeTrabajador() {
        return this.mensaje[1];
    }    

    public String getMsj() {
        String result = "Mensaje";
        result += "\nCliente:" + this.mensaje[0];
        if (this.mensaje[1] != null) {
            result += "\nRespuesta del admin:" + this.mensaje[1];
        }

        return result;
    }

}
