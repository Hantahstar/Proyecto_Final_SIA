package com.mycompany.prueba_1_netbeans;

public class PadreColegio extends javax.swing.JFrame{
    Colegio colegio;
    Curso curso;
    Path ruta;
    Estudiante estudiante;
    public PadreColegio(Colegio colegio,Curso curso){
        this.colegio = colegio;
        this.curso = curso;
        ruta = new Path();
    }
    public PadreColegio(Colegio colegio){
        this.colegio = colegio;
        this.curso = null;
        ruta = new Path();
    }
    public PadreColegio(Colegio colegio,Curso curso,Estudiante estudiante){
        this.colegio = colegio;
        this.curso = curso;
        this.estudiante = estudiante;
        ruta = new Path();
    }

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
}
