/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String rut;
    private boolean asistencia;
    private boolean inasistenciaJust;
    public Estudiante(String nombre,String apellido,String rut){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
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
    public boolean isAsistencia() {
        return asistencia;
    }
    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    public boolean isInasistenciaJust() {
        return inasistenciaJust;
    }
    public void setInasistenciaJust(boolean inasistenciaJust) {
        this.inasistenciaJust = inasistenciaJust;
    }
    //presente
    public void estado(Estudiante e){
        e.setAsistencia(true);
        e.setInasistenciaJust(false);
    }
    //falta
    public void estado(){
        setAsistencia(false);
        setInasistenciaJust(false);
    }
    //justificado
    public void estadoEspecial(Estudiante e){
        e.setAsistencia(false);
        e.setInasistenciaJust(true);
    }
    //fuera de horario
    public void estadoEspecial(){
        setAsistencia(true);
        setInasistenciaJust(true);
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