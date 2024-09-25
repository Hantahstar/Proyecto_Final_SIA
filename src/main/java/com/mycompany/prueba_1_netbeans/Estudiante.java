/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String rut;
    //private boolean asistencia;
    //private boolean inasistenciaJust;
    private int estado;
    public Estudiante(String nombre,String apellido,String rut){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.estado = 0;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
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

    @Override
    public String toString() {
        return (rut+","+nombre+","+apellido+"\n");
    }

}