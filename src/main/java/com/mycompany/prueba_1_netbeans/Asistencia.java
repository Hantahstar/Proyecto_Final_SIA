/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Asistencia{
    private String fecha;
    private String hora;
    private Curso curso;
    private int cantidadPresentes;
    
    public Asistencia(String fecha,String hora,Curso curso)throws AsistenciaNullPointerException {
        if (fecha == null && hora == null){
            throw new AsistenciaNullPointerException("Fecha y hora tiene valor nulo");
        }
        else if(fecha == null){
            throw new AsistenciaNullPointerException("Fecha tiene valor nulo");
        }
        else if(hora == null){
            throw new AsistenciaNullPointerException("Hora tiene valor nulo");
        }
        else{
            this.curso = curso;
            this.fecha = fecha;
            this.hora = hora;
        }

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
        if (fecha == null){
            throw new AsistenciaNullPointerException("Fecha tiene valor nulo");
        }
        else{
            this.fecha = fecha;
        }

    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        if (hora == null){
            throw new AsistenciaNullPointerException("Hora tiene valor nulo");
        }
        else{
            this.hora = hora;
        }

    }
    public int getCantidadAsist() {
        return cantidadPresentes;
    }
    public void setCantidadPresentes(int cantidadPresentes){
        if (cantidadPresentes<0){
            throw new AsistenciaNullPointerException("La cantidad de presentes no puede tener valores negativos");
        }
        else{
            this.cantidadPresentes = cantidadPresentes;
        }

    }
    public Estudiante getEstudiante(int i){
        return curso.getEstudiante(i);
    }

    public String shortStackTrace(Exception e,int maxLineas){
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        String[] stackTraceString = sw.toString().split("\n");
        StringBuilder shortStackTrace = new StringBuilder();
        for (int i = 0; i< Math.min((stackTraceString.length),maxLineas);i++){
            shortStackTrace.append(stackTraceString[i]).append("\n");
        }
        return shortStackTrace.toString();
    }

    public boolean pasaAsistencia(Curso c,Asistencia asist,JFrame panel){
        try{
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
            asist.setCantidadPresentes(contador);
            return true;
        }catch (AsistenciaNullPointerException ex){
            JOptionPane.showMessageDialog(panel, "Error al pasar la asistencia\nError: "+ex.getMessage()+"\n"+shortStackTrace(ex,10), "Error", JOptionPane.ERROR_MESSAGE);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(panel,"Error génerico\n"+shortStackTrace(ex,10),"Error",JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    @Override
    public String toString(){
        return fecha+","+hora+","+Integer.toString(cantidadPresentes)+"/"+Long.toString(curso.sizeCurso())+"\n";
    }
}