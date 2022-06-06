package colecciones;

import entidades.*;
import excepciones.MiExcepcion;
import java.io.Serializable;
import java.util.ArrayList;

public class ArregloPersona implements Serializable {

    private ArrayList<Persona> personas = new ArrayList();

    public ArregloPersona() {
        this.personas = new ArrayList<>();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public String[][] getPersonasAll() {
        String[][] s = new String[this.personas.size()][6];
        String tipoPersona = "";
        int i = 0;
        for (Persona p : this.personas) {
            if (p instanceof Trabajador) {
                tipoPersona = "Trabajador";
            }
            if (p instanceof Cliente) {
                tipoPersona = "Cliente";
            }
            if (p instanceof Chofer) {
                tipoPersona = "Chofer";
            }
            s[i][0] = p.getNombres();
            s[i][1] = p.getApellidoPaterno();
            s[i][2] = p.getApellidoMaterno();
            s[i][3] = String.valueOf(p.getEdad());
            s[i][4] = p.getDni();
            s[i][5] = tipoPersona;
            i++;
        }
        return s;
    }

    public String[][] getPersonasTrabajadores() {
        int n = this.numeroTrabajadores_();
        String[][] s = new String[n][6];
        int i = 0;
        for (Persona p : this.personas) {
            if (p instanceof Trabajador) {
                s[i][0] = p.getNombres();
                s[i][1] = p.getApellidoPaterno();
                s[i][2] = p.getApellidoMaterno();
                s[i][3] = String.valueOf(p.getEdad());
                s[i][4] = p.getDni();
                s[i][5] = "Trabajador";
                i++;
            }

        }
        return s;
    }

    public String[][] getPersonasClientes() {
        int n = this.numeroClientes();
        String[][] s = new String[n][6];
        int i = 0;
        for (Persona p : this.personas) {
            if (p instanceof Cliente) {
                s[i][0] = p.getNombres();
                s[i][1] = p.getApellidoPaterno();
                s[i][2] = p.getApellidoMaterno();
                s[i][3] = String.valueOf(p.getEdad());
                s[i][4] = p.getDni();
                s[i][5] = "Cliente";
                i++;
            }

        }
        return s;
    }

    public String[][] getPersonasChoferes() {
        int n = this.numeroChoferes_();
        String[][] s = new String[n][6];
        int i = 0;
        for (Persona p : this.personas) {
            if (p instanceof Chofer) {
                s[i][0] = p.getNombres();
                s[i][1] = p.getApellidoPaterno();
                s[i][2] = p.getApellidoMaterno();
                s[i][3] = String.valueOf(p.getEdad());
                s[i][4] = p.getDni();
                s[i][5] = "Chofer";
                i++;
            }

        }
        return s;
    }

    public Login validar(String usu, String pass) throws MiExcepcion {
        if (usu.equals("") || pass.equals("")) {
            throw new MiExcepcion("Complete los campos.");
        } else {
            Login result = null;
            for (Persona persona : this.personas) {
                if ((persona.getUsuario()).entrar(usu, pass)) {
                    result = persona.getUsuario();
                    break;
                }
            }
            return result;
        }
    }

    public String validarCodigo() {
        boolean band;
        String codigo = "";
        do {
            band = true;
            codigo = String.valueOf((int) (Math.random() * 100000000));
            if (this.numeroClientes() > 0) {
                for (Persona persona : this.personas) {
                    if (persona instanceof Cliente) {
                        if (((Cliente) persona).isTarjeta(codigo)) {
                            band = false;
                            break;
                        } else {
                            band = true;
                            break;
                        }
                    }
                }
            } else {
                return codigo;
            }
        } while (band == false);
        return codigo;
    }

    public boolean modificar(Persona pAntigua, Persona pNueva) {
        boolean result = false;
        for (Persona persona : this.personas) {
            if (pAntigua == persona) {
                persona.setNombres(pNueva.getNombres());
                persona.setApellidoPaterno(pNueva.getApellidoPaterno());
                persona.setApellidoMaterno(pNueva.getApellidoMaterno());
                persona.setEdad(pNueva.getEdad());
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean eliminar(Persona p) {
        boolean result = false;
        for (Persona persona : this.personas) {
            if (p == persona) {
                this.personas.remove(persona);
                result = true;
                break;
            }
        }
        return result;
    }

    public Cliente getC(String codigoTarjeta) {
        Cliente c = null;
        for (Persona persona : this.personas) {
            if (persona instanceof Cliente) {
                if (((Cliente) persona).isTarjeta(codigoTarjeta)) {
                    c = (Cliente) persona;
                    break;
                }
            }
        }
        return c;
    }

    public Persona getPersona(Login usuario) {
        Persona p = null;
        for (Persona persona : this.personas) {
            if (persona.getUsuario() == usuario) {
                p = persona;
                break;
            }
        }
        return p;
    }

    public Persona getPersona(String dni) {
        Persona p = null;
        for (Persona persona : this.personas) {
            if (dni.equals(persona.getDni())) {
                p = persona;
                break;
            }
        }
        return p;
    }

    public boolean agregar(Persona p) throws MiExcepcion {
        boolean result = false;
        Login tempLogin = p.getUsuario();
        if (p.getNombres().equals("") || p.getApellidoPaterno().equals("")
                || p.getApellidoMaterno().equals("")
                || String.valueOf(p.getEdad()).equals("")
                || p.getDni().equals("")
                || p.getUsuario().getUsuario().equals("")
                || p.getUsuario().getPassword().equals("")) {
            throw new MiExcepcion("Rellene todos los campos");
        }
        if (!this.validarDni(p.getDni())) {
            throw new MiExcepcion("DNI inválido: Ingrese un número de 8 dígitos");
        }
        if (this.buscar(p.getDni())) {
            throw new MiExcepcion("Este DNI ya ha sido registrado");
        }
        if (this.buscarUsername(tempLogin.getUsuario())) {
            throw new MiExcepcion("Este nombre de usuario ya ha sido registrado");
        } else {
            this.personas.add(p);
            result = true;
        }
        return result;
    }

    public boolean validarDni(String dni) {
        if (dni.length() != 8) {
            return false;
        }
        String numero = "";
        String tempDni = "";
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < dni.length(); i++) {
            numero = dni.substring(i, i + 1);
            for (int j = 0; j < nums.length; j++) {
                if (numero.equals(nums[j])) {
                    tempDni += nums[j];
                }
            }
        }
        if (tempDni.length() != 8) {
            return false;
        } else {
            return true;
        }
    }

    public boolean buscar(String dni) {
        boolean result = false;
        for (Persona p : this.personas) {
            if (dni.equals(p.getDni())) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean buscarUsername(String username) {
        boolean result = false;
        for (Persona persona : this.personas) {
            if (persona instanceof Cliente
                    || persona instanceof Trabajador) {
                if (username.equals(persona.getUsuario().getUsuario())) {
                    result = true;
                    break;
                }
            }

        }
        return result;
    }

    public String[][] getDatosDni2(String txt, int opcion) {
        switch (opcion) {
            case 1:
                return this.getDatosDniTrabajador(txt);
            case 2:
                return this.getDatosDniCliente(txt);
            case 3:
                return this.getDatosDniChofer(txt);
            case 4:
                return this.getDatosDniTodos(txt);
            default:
                return null;
        }
    }

    public String[][] getDatosDniTrabajador(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Trabajador) {
                if ((p.getDni()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Trabajador) {
                    if ((p.getDni()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Trabajador";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosDniCliente(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Cliente) {
                if ((p.getDni()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Cliente) {
                    if ((p.getDni()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Cliente";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosDniChofer(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Chofer) {
                if ((p.getDni()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Chofer) {
                    if ((p.getDni()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Chofer";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosDniTodos(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if ((p.getDni()).contains(txt)) {
                n++;
            }

        }
        String tipoPersona = "";
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if ((p.getDni()).contains(txt)) {
                    if (p instanceof Trabajador) {
                        tipoPersona = "Trabajador";
                    }
                    if (p instanceof Cliente) {
                        tipoPersona = "Cliente";
                    }
                    if (p instanceof Chofer) {
                        tipoPersona = "Chofer";
                    }
                    s[i][0] = p.getNombres();
                    s[i][1] = p.getApellidoPaterno();
                    s[i][2] = p.getApellidoMaterno();
                    s[i][3] = String.valueOf(p.getEdad());
                    s[i][4] = p.getDni();
                    s[i][5] = tipoPersona;
                    i++;
                }

            }
        }
        return s;
    }

    public String[][] getDatosNombres2(String txt, int opcion) {
        switch (opcion) {
            case 1:
                return this.getDatosNombresTrabajador(txt);
            case 2:
                return this.getDatosNombresCliente(txt);
            case 3:
                return this.getDatosNombresChofer(txt);
            case 4:
                return this.getDatosNombresTodos(txt);
            default:
                return null;
        }
    }

    public String[][] getDatosNombresTrabajador(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Trabajador) {
                if ((p.getNombres()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Trabajador) {
                    if ((p.getNombres()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Trabajador";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosNombresCliente(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Cliente) {
                if ((p.getNombres()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Cliente) {
                    if ((p.getNombres()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Cliente";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosNombresChofer(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Chofer) {
                if ((p.getNombres()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Chofer) {
                    if ((p.getNombres()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Chofer";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosNombresTodos(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if ((p.getNombres()).contains(txt)) {
                n++;
            }

        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            String tipoPersona = "";
            int i = 0;
            for (Persona p : this.personas) {
                if ((p.getNombres()).contains(txt)) {
                    if (p instanceof Trabajador) {
                        tipoPersona = "Trabajador";
                    }
                    if (p instanceof Cliente) {
                        tipoPersona = "Cliente";
                    }
                    if (p instanceof Chofer) {
                        tipoPersona = "Chofer";
                    }
                    s[i][0] = p.getNombres();
                    s[i][1] = p.getApellidoPaterno();
                    s[i][2] = p.getApellidoMaterno();
                    s[i][3] = String.valueOf(p.getEdad());
                    s[i][4] = p.getDni();
                    s[i][5] = tipoPersona;
                    i++;
                }

            }
        }
        return s;
    }

    public String[][] getDatosApellidosPaternos2(String txt, int opcion) {
        switch (opcion) {
            case 1:
                return this.getDatosApellidosPaternosTrabajador(txt);
            case 2:
                return this.getDatosApellidosPaternosCliente(txt);
            case 3:
                return this.getDatosApellidosPaternosChofer(txt);
            case 4:
                return this.getDatosApellidosPaternosTodos(txt);
            default:
                return null;
        }
    }

    public String[][] getDatosApellidosPaternosTrabajador(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Trabajador) {
                if ((p.getApellidoPaterno()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Trabajador) {
                    if ((p.getApellidoPaterno()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Trabajador";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosApellidosPaternosCliente(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Cliente) {
                if ((p.getApellidoPaterno()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Cliente) {
                    if ((p.getApellidoPaterno()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Cliente";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosApellidosPaternosChofer(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Chofer) {
                if ((p.getApellidoPaterno()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Chofer) {
                    if ((p.getApellidoPaterno()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Chofer";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosApellidosPaternosTodos(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if ((p.getApellidoPaterno()).contains(txt)) {
                n++;
            }

        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            String tipoPersona = "";
            int i = 0;
            for (Persona p : this.personas) {
                if ((p.getApellidoPaterno()).contains(txt)) {
                    if (p instanceof Trabajador) {
                        tipoPersona = "Trabajador";
                    }
                    if (p instanceof Cliente) {
                        tipoPersona = "Cliente";
                    }
                    if (p instanceof Chofer) {
                        tipoPersona = "Chofer";
                    }
                    s[i][0] = p.getNombres();
                    s[i][1] = p.getApellidoPaterno();
                    s[i][2] = p.getApellidoMaterno();
                    s[i][3] = String.valueOf(p.getEdad());
                    s[i][4] = p.getDni();
                    s[i][5] = tipoPersona;
                    i++;
                }

            }
        }
        return s;
    }

    public String[][] getDatosApellidosMaternos2(String txt, int opcion) {
        switch (opcion) {
            case 1:
                return this.getDatosApellidosMaternosTrabajador(txt);
            case 2:
                return this.getDatosApellidosMaternosCliente(txt);
            case 3:
                return this.getDatosApellidosMaternosChofer(txt);
            case 4:
                return this.getDatosApellidosMaternosTodos(txt);
            default:
                return null;
        }
    }

    public String[][] getDatosApellidosMaternosTrabajador(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Trabajador) {
                if ((p.getApellidoMaterno()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Trabajador) {
                    if ((p.getApellidoMaterno()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Trabajador";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosApellidosMaternosCliente(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Cliente) {
                if ((p.getApellidoMaterno()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Cliente) {
                    if ((p.getApellidoMaterno()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Cliente";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosApellidosMaternosChofer(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Chofer) {
                if ((p.getApellidoMaterno()).contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Chofer) {
                    if ((p.getApellidoMaterno()).contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Chofer";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosApellidosMaternosTodos(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if ((p.getApellidoMaterno()).contains(txt)) {
                n++;
            }

        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            String tipoPersona = "";
            int i = 0;
            for (Persona p : this.personas) {
                if ((p.getApellidoMaterno()).contains(txt)) {
                    if (p instanceof Trabajador) {
                        tipoPersona = "Trabajador";
                    }
                    if (p instanceof Cliente) {
                        tipoPersona = "Cliente";
                    }
                    if (p instanceof Chofer) {
                        tipoPersona = "Chofer";
                    }
                    s[i][0] = p.getNombres();
                    s[i][1] = p.getApellidoPaterno();
                    s[i][2] = p.getApellidoMaterno();
                    s[i][3] = String.valueOf(p.getEdad());
                    s[i][4] = p.getDni();
                    s[i][5] = tipoPersona;
                    i++;
                }

            }
        }
        return s;
    }

    public String[][] getDatos2(String txt, int opcion) {
        switch (opcion) {
            case 1:
                return this.getDatos2Trabajador(txt);
            case 2:
                return this.getDatos2Cliente(txt);
            case 3:
                return this.getDatos2Chofer(txt);
            case 4:
                return this.getDatos2Todos(txt);
            default:
                return null;
        }
    }

    public String[][] getDatos2Trabajador(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Trabajador) {
                if ((p.getNombres()).contains(txt) || p.getApellidoPaterno().contains(txt)
                        || p.getApellidoMaterno().contains(txt) || p.getDni().contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Trabajador) {
                    if ((p.getNombres()).contains(txt) || p.getApellidoPaterno().contains(txt)
                            || p.getApellidoMaterno().contains(txt) || p.getDni().contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Trabajador";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatos2Cliente(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Cliente) {
                if ((p.getNombres()).contains(txt) || p.getApellidoPaterno().contains(txt)
                        || p.getApellidoMaterno().contains(txt) || p.getDni().contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Cliente) {
                    if ((p.getNombres()).contains(txt) || p.getApellidoPaterno().contains(txt)
                            || p.getApellidoMaterno().contains(txt) || p.getDni().contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Cliente";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatos2Chofer(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if (p instanceof Chofer) {
                if ((p.getNombres()).contains(txt) || p.getApellidoPaterno().contains(txt)
                        || p.getApellidoMaterno().contains(txt) || p.getDni().contains(txt)) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Chofer) {
                    if ((p.getNombres()).contains(txt) || p.getApellidoPaterno().contains(txt)
                            || p.getApellidoMaterno().contains(txt) || p.getDni().contains(txt)) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = String.valueOf(p.getEdad());
                        s[i][4] = p.getDni();
                        s[i][5] = "Chofer";
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatos2Todos(String txt) {
        int n = 0;
        for (Persona p : this.personas) {
            if ((p.getNombres()).contains(txt) || p.getApellidoPaterno().contains(txt)
                    || p.getApellidoMaterno().contains(txt) || p.getDni().contains(txt)) {
                n++;
            }

        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][6];
            String tipoPersona = "";
            int i = 0;
            for (Persona p : this.personas) {
                if ((p.getNombres()).contains(txt) || p.getApellidoPaterno().contains(txt)
                        || p.getApellidoMaterno().contains(txt) || p.getDni().contains(txt)) {
                    if (p instanceof Trabajador) {
                        tipoPersona = "Trabajador";
                    }
                    if (p instanceof Cliente) {
                        tipoPersona = "Cliente";
                    }
                    if (p instanceof Chofer) {
                        tipoPersona = "Chofer";
                    }
                    s[i][0] = p.getNombres();
                    s[i][1] = p.getApellidoPaterno();
                    s[i][2] = p.getApellidoMaterno();
                    s[i][3] = String.valueOf(p.getEdad());
                    s[i][4] = p.getDni();
                    s[i][5] = tipoPersona;
                    i++;
                }

            }
        }
        return s;
    }

    public String[][] getDatosDni(String dni) {
        int n = 0;
        for (Persona p : personas) {
            if (p instanceof Cliente) {
                if (((Cliente) p).isMovViaje_1() == false) {
                    if (((Cliente) p).getDni().contains(dni)) {
                        n++;
                    }
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][4];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Cliente) {
                    if (((Cliente) p).isMovViaje_1() == false) {
                        if (((Cliente) p).getDni().contains(dni)) {
                            s[i][0] = ((Cliente) p).getNombres();
                            s[i][1] = ((Cliente) p).getApellidoPaterno();
                            s[i][2] = ((Cliente) p).getApellidoMaterno();
                            s[i][3] = ((Cliente) p).getDni();
                            i++;
                        }
                    }
                }
            }
        }
        return s;
    }

    public String[][] getDatosNombre(String nombre) {
        String nombre_ = nombre.toUpperCase();
        int n = 0;
        for (Persona p : personas) {
            if (p instanceof Cliente) {
                if (((Cliente) p).isMovViaje_1() == false) {
                    if (((Cliente) p).getNombres().contains(nombre_)
                            || ((Cliente) p).getApellidoPaterno().contains(nombre_)
                            || ((Cliente) p).getApellidoMaterno().contains(nombre_)) {
                        n++;
                    }
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][4];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Cliente) {
                    if (((Cliente) p).isMovViaje_1() == false) {
                        if (((Cliente) p).getNombres().contains(nombre_)
                                || ((Cliente) p).getApellidoPaterno().contains(nombre_)
                                || ((Cliente) p).getApellidoMaterno().contains(nombre_)) {
                            s[i][0] = ((Cliente) p).getNombres();
                            s[i][1] = ((Cliente) p).getApellidoPaterno();
                            s[i][2] = ((Cliente) p).getApellidoMaterno();
                            s[i][3] = ((Cliente) p).getDni();
                            i++;
                        }
                    }
                }
            }
        }

        return s;
    }

    public Cliente getCliente(String dni) {
        Cliente c = null;
        for (Persona persona : this.personas) {
            if (persona instanceof Cliente) {
                if (dni.equals(persona.getDni())) {
                    c = (Cliente) persona;
                    break;
                }
            }
        }
        return c;
    }

    public String[] getDnis(int tipo) {
        String s[] = new String[this.numeroClientes()];
        int i = 0;
        for (Persona per : this.personas) {
            if (tipo == 1) {
                if (per instanceof Trabajador) {
                    s[i] = per.getDni();
                    i++;
                }
            } else if (tipo == 2) {
                if (per instanceof Cliente) {
                    s[i] = per.getDni();
                    i++;
                }
            }
        }
        return s;
    }

    public String[] getChoferes() {
        String[] s = new String[this.numeroChoferes_()];
        int i = 0;
        for (Persona persona : this.personas) {
            if (persona instanceof Chofer) {
                s[i] = persona.getNombres();
                i++;
            }
        }
        return s;
    }

    private int numeroClientes() {
        int n = 0;
        for (Persona persona : this.personas) {
            if (persona instanceof Cliente) {
                n++;
            }
        }
        return n;
    }

    private int numeroChoferes_() {
        int n = 0;
        for (Persona persona : this.personas) {
            if (persona instanceof Chofer) {
                n++;
            }
        }
        return n;
    }

    private int numeroTrabajadores_() {
        int n = 0;
        for (Persona persona : this.personas) {
            if (persona instanceof Trabajador) {
                n++;
            }
        }
        return n;
    }

    public String toString() {
        String result = "";
        for (Persona p : this.personas) {
            result += p + "\n";
        }
        return result;
    }

    public String[][] getDatos() {
        int n = 0;
        for (Persona persona : this.personas) {
            if (persona instanceof Cliente) {
                if (((Cliente) persona).isMovViaje_1() == false) {
                    n++;
                }
            }
        }
        String[][] s = null;
        if (n > 0) {
            s = new String[n][4];
            int i = 0;
            for (Persona p : this.personas) {
                if (p instanceof Cliente) {
                    if (((Cliente) p).isMovViaje_1() == false) {
                        s[i][0] = p.getNombres();
                        s[i][1] = p.getApellidoPaterno();
                        s[i][2] = p.getApellidoMaterno();
                        s[i][3] = p.getDni();
                        i++;
                    }
                }

            }
        }

        return s;
    }

    public String[][] getMensajes() {
        String[][] s = new String[this.mensajesSinResponder()][3];
        int i = 0;
        for (Persona persona : this.personas) {
            if (persona instanceof Cliente) {
                for (Mensaje mensaje : ((Cliente) persona).getMensajes()) {
                    if (mensaje.isbRespondido() == false) {
                        s[i][0] = persona.getDni();
                        s[i][1] = mensaje.getFecha();
                        s[i][2] = persona.getNombres() + " "
                                + persona.getApellidoPaterno() + " "
                                + persona.getApellidoMaterno();
                        i++;
                    }
                }
            }
        }
        return s;
    }

    public int mensajesSinResponder() {
        int i = 0;
        for (Persona persona : personas) {
            if (persona instanceof Cliente) {
                for (Mensaje mensaje : ((Cliente) persona).getMensajes()) {
                    if (mensaje.isbRespondido() == false) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

}
