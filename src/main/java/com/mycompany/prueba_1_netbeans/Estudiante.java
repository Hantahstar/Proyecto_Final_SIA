/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String rut;
    private int estado;

    public Estudiante(String nombre,String apellido,String rut){
        if (nombre == null && apellido == null && rut == null){
            throw new EstudianteNullPointerException("Nombre,apellido y RUT son nulos");
        }
        else if (nombre == null && apellido == null){
            throw new EstudianteNullPointerException("Nombre y apellido son nulos");
        }
        else if (nombre == null && rut == null){
            throw new EstudianteNullPointerException("Nombre y RUT son nulos");
        }
        else if (rut == null && apellido == null){
            throw new EstudianteNullPointerException("RUT y apellido son nulos");
        }
        else if (nombre == null){
            throw new EstudianteNullPointerException("Nombre es nulo");
        }
        else if (apellido == null){
            throw new EstudianteNullPointerException("Apellido es nulo");
        }
        else if (rut == null){
            throw new EstudianteNullPointerException("RUT es nulo");
        }
        else{
            this.nombre = nombre;
            this.apellido = apellido;
            this.rut = rut;
            this.estado = 0;
        }
    }
    public Estudiante(){
        this.nombre = null;
        this.apellido = null;
        this.rut = null;
        this.estado = 0;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre == null){
            throw new EstudianteNullPointerException("Nombre es nulo");
        }
        else{
            this.nombre = nombre;
        }

    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        if (apellido == null){
            throw new EstudianteNullPointerException("Apellido es nulo");
        }
        else{
            this.apellido = apellido;
        }

    }
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        if (rut == null){
            throw new EstudianteNullPointerException("RUT es nulo");
        }
        else if(isNumeric(rut)){
            if(Integer.parseInt(rut)<0){
                throw new EstudianteNullPointerException("RUT no puede ser un número negativo");
            }
        }
        else{
            this.rut = rut;
        }

    }
    
    public void setEstado(int estado){
        this.estado = estado;
    }
    public int getEstado(){
        return this.estado;
    }

    private String toUpperCaseNombreOrApellido(String nombreOrApellido){
        String despues,antes;
        char letra;
        for(int i=0;nombreOrApellido.length()>i;i++){
            if(i == 0){
                letra = Character.toUpperCase(nombreOrApellido.charAt(0));
                despues = nombreOrApellido.substring(1);
                nombreOrApellido = letra+despues;
            }
            else if(nombreOrApellido.charAt(i) == ' '){
                antes = nombreOrApellido.substring(0,i+1);
                letra = Character.toUpperCase(nombreOrApellido.charAt(i+1));
                despues = nombreOrApellido.substring(i+2);
                nombreOrApellido = antes+letra+despues;
            }
        }
        return nombreOrApellido;
    }

    public void toUpperCase(){
        setNombre(toUpperCaseNombreOrApellido(nombre));
        setApellido(toUpperCaseNombreOrApellido(apellido));
    }


    public boolean isNumeric(String cadena){
        for(int i=0;cadena.length()>i;i++){
            if(Character.isAlphabetic(cadena.charAt(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return (rut+","+nombre+","+apellido+"\n");
    }

}