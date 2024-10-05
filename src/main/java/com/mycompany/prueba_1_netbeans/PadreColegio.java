package com.mycompany.prueba_1_netbeans;

import java.awt.BorderLayout;
import java.awt.Graphics;
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
        setBasicVisual();
    }
    public PadreColegio(Colegio colegio){
        this.colegio = colegio;
        this.curso = null;
        ruta = new Path();
        setBasicVisual();
    }
    public PadreColegio(Colegio colegio,Curso curso,Estudiante estudiante){
        this.colegio = colegio;
        this.curso = curso;
        this.estudiante = estudiante;
        ruta = new Path();
        setBasicVisual();
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

    //Método para establecer la apariencia básica de las ventanas
    public void setBasicVisual(){

        ImageIcon icon = new ImageIcon("src/images/icono.png");
        ImageIcon background = new ImageIcon("src/images/fondo.png");

        this.setIconImage(icon.getImage());
        this.setTitle("Class Manager");
        JPanel panelConFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar la imagen de fondo
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panelConFondo.setLayout(new BorderLayout());
        this.setContentPane(panelConFondo);


    }
}
