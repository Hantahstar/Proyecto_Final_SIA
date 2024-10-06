/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Asistencia extends EscolarPadre{
    //Atributos de instancia
    private String fecha;
    private String hora;
    private Curso curso;
    private int cantidadPresentes;
    //Método constructor con consideración de excepciones
    public Asistencia(String fecha,String hora,Curso curso)throws AsistenciaNullPointerException {
        super();
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
    //Getters y Setters
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha)throws AsistenciaNullPointerException {
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
    public void setHora(String hora)throws AsistenciaNullPointerException {
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
    public void setCantidadPresentes(int cantidadPresentes)throws AsistenciaNullPointerException{
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
    //Método compartido por varias clases para acortar el máximo de líneas de error del StackTrace
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
    //Método utilizado una vez se realice la asistencia, muestra JOptionPanes de opciones para decir los diferentes caso de asistencia del estudiante
    public boolean pasaAsistencia(Curso c,Asistencia asist,JFrame panel)throws AsistenciaNullPointerException{
        int i, contador = 0;
        //Opciones del JOPtion
        String[] opciones = {"Presente","Faltó","Falta just.","Sale fuera de horario","Cancelar"};
        int selectionOpcion;
        Estudiante e;
        for(i=0;c.sizeCurso()>i;i++){
            e = asist.getEstudiante(i);
            selectionOpcion = JOptionPane.showOptionDialog(panel,("Nombre : "+e.getNombre()+" "+e.getApellido()+"\nRut : "+e.getRut()),"Asistencia",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
            //Dependiendo la opción elegida actualizará el "estado" de cada estudiante en este pase de asistencia
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
                    //Caso donde se cancele o se cierre alguno de los popup
                    return false;

            }
        }
        //Al terminar se setea la cantidad de personas presentes en este pase de asistencia
        asist.setCantidadPresentes(contador);
        return true;
    }
    //Método sobreescrito de EscolarPadre guardarCadena()
    @Override
    public String guardarCadena(){
        return fecha+","+hora+","+Integer.toString(cantidadPresentes)+"/"+Long.toString(curso.sizeCurso())+"\n";
    }
}