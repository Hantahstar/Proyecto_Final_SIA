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
            throw new EstudianteNotNullException("Nombre,apellido y RUT son nulos");
        }
        else if (nombre == null && apellido == null){
            throw new EstudianteNotNullException("Nombre y apellido son nulos");
        }
        else if (nombre == null && rut == null){
            throw new EstudianteNotNullException("Nombre y RUT son nulos");
        }
        else if (rut == null && apellido == null){
            throw new EstudianteNotNullException("RUT y apellido son nulos");
        }
        else if (nombre == null){
            throw new EstudianteNotNullException("Nombre es nulo");
        }
        else if (apellido == null){
            throw new EstudianteNotNullException("Apellido es nulo");
        }
        else if (rut == null){
            throw new EstudianteNotNullException("RUT es nulo");
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
            throw new EstudianteNotNullException("Nombre es nulo");
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
            throw new EstudianteNotNullException("Apellido es nulo");
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
            throw new EstudianteNotNullException("RUT es nulo");
        }
        else if(isNumeric(rut)){
            if(Integer.parseInt(rut)<0){
                throw new EstudianteNotNullException("RUT no puede ser un número negativo");
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
    
    public void toUpperCase(){
        String despues;
        despues = nombre.substring(1);
        char letra = Character.toUpperCase(nombre.charAt(0));
        setNombre(letra+despues); 
        despues = apellido.substring(1);
        letra = Character.toUpperCase(apellido.charAt(0));
        setApellido(letra+despues);
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