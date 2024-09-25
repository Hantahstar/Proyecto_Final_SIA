/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import au.com.bytecode.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Colegio{
    private ArrayList<Curso> cursos;
    private ArrayList <Asistencia> asistencias; 

    public Colegio() {
        this.cursos = new ArrayList<>();
        this.asistencias = new ArrayList<>();
    }
    
    public boolean cursoEstaVacio(){
        return cursos.isEmpty();
    }
    public boolean asistenciaEstaVacio(){
        return asistencias.isEmpty();
    }
    public boolean removerCurso(Curso c){
        return cursos.remove(c);
    }
    public void removerAsistencia(Asistencia a){
        asistencias.remove(a);
    }
    public void agregarAsistencia(Asistencia a){
        asistencias.add(a);
    }
    public Curso verificarCurso(Curso c){
        int i;
        if (c==null){
            return null;
        }
        for (i=0;cursos.size()>i;i++){
            if (c.getGrado()!=null && c.getLetra()!=null){
                if(cursos.get(i).getGrado().equalsIgnoreCase(c.getGrado()) && cursos.get(i).getLetra().equalsIgnoreCase(c.getLetra())){
                    return cursos.get(i);
                }
            }

        }
        return null;
    }
     public void agregarCurso(Curso c,String path){
        File file = new File(path);
        cursos.add(c);

        List<String[]> datos = new ArrayList<>();

        String[] fila = new String[2];
        fila[0] = c.getGrado(); 
        fila[1] = c.getLetra();

        // Añadir la fila a los datos
        datos.add(fila);

        LeerYEscribirCSV csv = new LeerYEscribirCSV();
        csv.escribirCSV(file, datos);
    }
    
    public String mostrarCurso(){
        int i;
        String ret = "";
        for(i=0;cursos.size()>i;i++){
            ret+= cursos.get(i).toString();
        }
        return ret;
    }
    
    public String mostrarCurso(Curso c){
        String curso = ("Curso: \nGrado: "+c.getGrado()+"\nParalelo/Letra: "+c.getLetra()+"\nCantidad de estudiantes: "+c.sizeCurso());
        return curso; 
    }
    
    public boolean verificarEstudiante(String rut){
        int i;
        for(i=0;cursos.size()>i;i++){
            if(cursos.get(i).contieneEstudiante(rut)){
                return true;
            }
        }
        return false;
    }
    public Asistencia verificarAsistencia(Asistencia a){
        int i;
        for (i=0;asistencias.size()>i;i++){
            if(asistencias.get(i).getFecha().equals(a.getFecha())&&asistencias.get(i).getHora().equals(a.getHora())){
                if (asistencias.get(i).getCurso().getGrado().equals(a.getCurso().getGrado()) && asistencias.get(i).getCurso().getLetra().equals(a.getCurso().getLetra())) {
                    return asistencias.get(i);
                }
            }
        }
        return null;
    }
    public String mostrarAsistencia(Curso c){
        int i;
        String ret = "";
        for(i=0;asistencias.size()>i;i++){
            if(asistencias.get(i).getCurso().getGrado().equals(c.getGrado()) && asistencias.get(i).getCurso().getLetra().equals(c.getLetra())){
                ret+=asistencias.get(i).toString();
            }
        }
        return ret;
    }
    
    
    //en desarrollo, no sé si está bien siquiera
    public double promedioAsistencia(Curso c){
        int i;
        Curso cursoAsist;
        double contador = 0.0f;
        double porcenUnitario = 0.0f;
        for (i=0;asistencias.size()>i;i++){
            cursoAsist = asistencias.get(i).getCurso();
            if ((c.getGrado().equalsIgnoreCase(cursoAsist.getGrado())) && (c.getLetra().equalsIgnoreCase(cursoAsist.getLetra()))){
                porcenUnitario+= (double) (asistencias.get(i).getCantidadAsist())/ (double)cursoAsist.sizeCurso();
                contador++;        
            }
        }
        return porcenUnitario/contador;
        
    }
    
    public void mostrarAsistencia(Asistencia asist,JFrame panel){
        int i;
        String[] opciones = {"Revisar lista","Volver"};
        String[] opcionesVista = {"Continuar","Volver"};
        int selectionOpcion;
        Curso c = asist.getCurso();
        Estudiante e;
        String estado = new String();
        selectionOpcion = JOptionPane.showOptionDialog(panel,"Asistencia fecha: "+asist.getFecha()+"\nhora: "+asist.getHora(),"Encontrado",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
        switch(selectionOpcion+1){
            case 0:
                return;
            case 1:
                for(i=0;c.sizeCurso()>i;i++){
                    e = asist.getEstudiante(i);
                    if (e.getEstado()<=0){
                        estado = "no valido";
                    }
                    else if(e.getEstado() == 1){
                        estado = "Presente";
                    }
                    else if(e.getEstado() == 2){
                        estado = "Faltó";
                    }
                    else if(e.getEstado() == 3){
                        estado = "Falta extraordinaria";
                    }
                    else if(e.getEstado() == 4){
                        estado = "Sale antes del horario";
                    }
                    selectionOpcion = JOptionPane.showOptionDialog(panel,"Nombre: "+e.getNombre()+"\nApellido: "+e.getApellido()+"\nRUT: "+e.getRut()+"\n"+estado,"Asistencia Fecha :"+asist.getFecha()+" Hora :"+asist.getHora(),JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionesVista,opcionesVista[0]);
                    switch(selectionOpcion+1){
                        case 0:
                            return;
                        case 1:
                            continue;
                        case 2:
                            return;
                    }   
                }
                return;
            case 2:
                return; 
        }
    }



    public void actualizarCSV()
    {
        File file = new File("src/main/java/Cursos.csv");
        try(CSVWriter csvWriter = new CSVWriter(new FileWriter(file,true)))
        {
            for (Curso rec : cursos)
            {
                String [] fila = new String[2];
                fila[0] = rec.getGrado();
                fila[1] = rec.getLetra();
                csvWriter.writeNext(fila);
            }

        } catch (IOException e) {
        }
    }

    public void cargarEstudiantesDesdeCSV() {

        File file = new File("src/main/java/Estudiantes.csv");

        LeerYEscribirCSV lectorCSV = new LeerYEscribirCSV();
        List <String[]> datosCSV = lectorCSV.leerCSV(file);

        for (Curso curso : cursos) {
            curso.cargarEstudiantes(datosCSV); 
        }
    }

    public void cargarAsistenciaDesdeCSV() {
    File file = new File("src/main/java/Asistencia.csv");
    LeerYEscribirCSV lectorCSV = new LeerYEscribirCSV();
    List<String[]> datosCSV = lectorCSV.leerCSV(file);
    
    if (datosCSV != null) {
        String grado = "", letra = "", fecha = "", hora = "";
        Curso curso = null;
        int dif = 0;
        int cont = 0;
        Estudiante e;
        for (String[] aux : datosCSV) {
            if (aux.length >= 5) {
                String nuevoGrado = aux[0];
                String nuevaLetra = aux[1];
                String nuevaFecha = aux[2];
                String nuevaHora = aux[3];
                if (dif == 0 || !grado.equals(nuevoGrado) || !letra.equals(nuevaLetra) || !fecha.equals(nuevaFecha) || !hora.equals(nuevaHora)) {
                    if (dif > 0 && curso!=null) {
                        Asistencia asist = new Asistencia(fecha, hora, curso);
                        asist.setCantidadAsist(cont);
                        asistencias.add(asist);
                    }

                    grado = nuevoGrado;
                    letra = nuevaLetra;
                    fecha = nuevaFecha;
                    hora = nuevaHora;
                    curso = new Curso(grado, letra);
                    dif++;
                }
                e = new Estudiante(aux[5], aux[6],aux[4]);
                int estado = Integer.parseInt(aux[7]);
                if (estado == 1){
                    cont++;
                }
                e.setEstado(estado);
                curso.agregarEstudiante(aux[4], e);
                curso.agregarEstudiante(e);
            }
        }

        // Agregar la última asistencia después del último cambio
        if (dif > 0) {
            Asistencia asist = new Asistencia(fecha, hora, curso);
            asistencias.add(asist);
        }
    } else {
        System.out.println("Error: no se pudo leer el archivo CSV.");
    }
}

    public void actualizar(String path,int numero){
        File file = new File(path);
        LeerYEscribirCSV p = new LeerYEscribirCSV();

        if(numero == 1)
        {
            p.encabezadoEstudiantes(file);
            for (Curso curso : cursos) {
                curso.actualizarCSV();
            }
        }
        else if(numero == 2){
            p.encabezadoCursos(file);
            actualizarCSV();
        }
        else{
            p.encabezadoAsistencia(file);
            actualizarCSVAsistencias();
        }


    }

    public void actualizarCSVAsistencias(){

        File file = new File("src/main/java/Asistencia.csv");
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file,true)))
        {
            for (int i = 0 ; i < asistencias.size();i++)
            {
                Curso c = asistencias.get(i).getCurso();

                for (int j = 0 ; j < c.sizeCurso(); j++)
                {
                    Estudiante e = c.getEstudiante(j);
                    String [] fila = new String [8];
                    fila[0] = c.getGrado();
                    fila[1] = c.getLetra();
                    fila[2] = asistencias.get(i).getFecha();
                    fila[3] = asistencias.get(i).getHora();
                    fila[4] = e.getRut();
                    fila[5] = e.getNombre();
                    fila[6] = e.getApellido();
                    fila[7] = Integer.toString(e.getEstado());
                    csvWriter.writeNext(fila);
                }
            }
        }catch (IOException e) {
        }
    }


    public void cargarCursosDesdeCSV() {
        File file = new File("src/main/java/Cursos.csv");

        LeerYEscribirCSV lectorCSV = new LeerYEscribirCSV();
        List<String[]> datosCSV = lectorCSV.leerCSV(file);

        if (datosCSV != null) {
            for (String[] fila : datosCSV) {
                
                if (fila.length >= 2) { 
                    String grado = fila[0];
                    String letra = fila[1];

                    
                    Curso curso = new Curso(grado, letra);
                    cursos.add(curso);
                } else {
                    System.out.println("Error: fila con formato incorrecto en el CSV.");
                }
            }
        } else {
            System.out.println("Error: no se pudo leer el archivo CSV.");
        }
    }
}