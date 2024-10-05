package com.mycompany.prueba_1_netbeans;

import javax.swing.*;
//Clase general para las ventanas de la aplicación
public class PadreColegio extends javax.swing.JFrame{
    //Atributos de la clase
    Colegio colegio;
    Curso curso;
    Path ruta;
    Estudiante estudiante;
    //Constructores de la clase
    public PadreColegio(Colegio colegio,Curso curso){
        this.colegio = colegio;
        this.curso = curso;
        ruta = new Path();
        setIcon();
    }
    public PadreColegio(Colegio colegio){
        this.colegio = colegio;
        this.curso = null;
        ruta = new Path();
        setIcon();
    }
    public PadreColegio(Colegio colegio,Curso curso,Estudiante estudiante){
        this.colegio = colegio;
        this.curso = curso;
        this.estudiante = estudiante;
        ruta = new Path();
        setIcon();
    }
    //Getters y Setters
    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Path getRuta() {
        return ruta;
    }

    public void setRuta(Path ruta) {
        this.ruta = ruta;
    }

    public void setIcon(){
        ImageIcon icon = new ImageIcon("src/images/icono.png");
        this.setIconImage(icon.getImage());
        this.setTitle("Class Manager");
    }
}
