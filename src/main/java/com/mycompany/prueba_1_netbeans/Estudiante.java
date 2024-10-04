package com.mycompany.prueba_1_netbeans;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String rut;
    private int estado;

    // Constructor que inicializa los atributos del estudiante
    public Estudiante(String nombre, String apellido, String rut) throws EstudianteNullPointerException {
        if (nombre == null && apellido == null && rut == null) {
            throw new EstudianteNullPointerException("Nombre, apellido y RUT son nulos");
        } else if (nombre == null && apellido == null) {
            throw new EstudianteNullPointerException("Nombre y apellido son nulos");
        } else if (nombre == null && rut == null) {
            throw new EstudianteNullPointerException("Nombre y RUT son nulos");
        } else if (rut == null && apellido == null) {
            throw new EstudianteNullPointerException("RUT y apellido son nulos");
        } else if (nombre == null) {
            throw new EstudianteNullPointerException("Nombre es nulo");
        } else if (apellido == null) {
            throw new EstudianteNullPointerException("Apellido es nulo");
        } else if (rut == null) {
            throw new EstudianteNullPointerException("RUT es nulo");
        } else {
            this.nombre = nombre;
            this.apellido = apellido;
            this.rut = rut;
            this.estado = 0;
        }
    }

    // Constructor por defecto
    public Estudiante() {
        this.nombre = null;
        this.apellido = null;
        this.rut = null;
        this.estado = 0;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) throws EstudianteNullPointerException {
        if (nombre == null) {
            throw new EstudianteNullPointerException("Nombre es nulo");
        } else {
            this.nombre = nombre;
        }
    }

    // Getter para el apellido
    public String getApellido() {
        return apellido;
    }

    // Setter para el apellido
    public void setApellido(String apellido) throws EstudianteNullPointerException {
        if (apellido == null) {
            throw new EstudianteNullPointerException("Apellido es nulo");
        } else {
            this.apellido = apellido;
        }
    }

    // Getter para el RUT
    public String getRut() {
        return rut;
    }

    // Setter para el RUT
    public void setRut(String rut) throws EstudianteNullPointerException {
        if (rut == null) {
            throw new EstudianteNullPointerException("RUT es nulo");
        } else if (isNumeric(rut)) {
            if (Integer.parseInt(rut) < 0) {
                throw new EstudianteNullPointerException("RUT no puede ser un número negativo");
            }
        } else {
            this.rut = rut;
        }
    }

    // Setter para el estado
    public void setEstado(int estado) {
        this.estado = estado;
    }

    // Getter para el estado
    public int getEstado() {
        return this.estado;
    }

    // Método que convierte el nombre o apellido a mayúsculas
    private String toUpperCaseNombreOrApellido(String nombreOrApellido) {
        String despues, antes;
        char letra;
        for (int i = 0; nombreOrApellido.length() > i; i++) {
            if (i == 0) {
                letra = Character.toUpperCase(nombreOrApellido.charAt(0));
                despues = nombreOrApellido.substring(1);
                nombreOrApellido = letra + despues;
            } else if (nombreOrApellido.charAt(i) == ' ') {
                antes = nombreOrApellido.substring(0, i + 1);
                letra = Character.toUpperCase(nombreOrApellido.charAt(i + 1));
                despues = nombreOrApellido.substring(i + 2);
                nombreOrApellido = antes + letra + despues;
            }
        }
        return nombreOrApellido;
    }

    // Método que convierte el nombre y apellido a mayúsculas
    public void toUpperCase() throws EstudianteNullPointerException {
        setNombre(toUpperCaseNombreOrApellido(nombre));
        setApellido(toUpperCaseNombreOrApellido(apellido));
    }

    // Método que verifica si una cadena es numérica
    public boolean isNumeric(String cadena) {
        for (int i = 0; cadena.length() > i; i++) {
            if (Character.isAlphabetic(cadena.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Método sobreescrito de Object toString()
    @Override
    public String toString() {
        return (rut + "," + nombre + "," + apellido + "\n");
    }
}