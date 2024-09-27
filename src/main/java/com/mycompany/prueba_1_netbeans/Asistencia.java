/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Asistencia{
    private String fecha;
    private String hora;
    private Curso curso;
    private int cantidadPresentes;
    
    public Asistencia(String fecha,String hora,Curso curso){
        this.curso = curso;
        this.fecha = fecha;
        this.hora = hora;
    }
   
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public int getCantidadAsist() {
        return cantidadPresentes;
    }
    public void setCantidadAsist(int cantidadAsist){
        this.cantidadPresentes = cantidadAsist;
    }
    public Estudiante getEstudiante(int i){
        return curso.getEstudiante(i);
    }
    
    public boolean pasaAsistencia(Curso c,Asistencia asist,JFrame panel){
        int i, contador = 0;
        String[] opciones = {"Presente","Faltó","Falta just.","Sale fuera de horario","Cancelar"};
        int selectionOpcion;
        Estudiante e;
        for(i=0;c.sizeCurso()>i;i++){
            e = asist.getEstudiante(i);
            selectionOpcion = JOptionPane.showOptionDialog(panel,("Nombre : "+e.getNombre()+" "+e.getApellido()+"\nRut : "+e.getRut()),"Asistencia",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
            switch((selectionOpcion+1)){
                case 1:
                    contador++;
                    e.setEstado(1);
                    break;
                case 2:
                    e.setEstado(2);
                    break;
                case 3:
                    e.setEstado(3);
                    break;
                case 4:
                    e.setEstado(4);
                    break;
                case 5, 0:
                    return false;

            }
        }
        asist.setCantidadAsist(contador);
        return true;
    }
    
    @Override
    public String toString(){
        return fecha+","+hora+","+Integer.toString(cantidadPresentes)+"/"+Long.toString(curso.sizeCurso())+"\n";
    }
}