/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import au.com.bytecode.opencsv.CSVWriter;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Curso{
    private String grado;
    private String letra;
    private final ArrayList <Estudiante> listCurso;
    private final Map <String,Estudiante> mapaEstudiante;

    public Curso(String grado,String letra)throws CursoNullPointerException {
        if(grado == null && letra == null){
            throw new CursoNullPointerException("Grado y letra tienen valor nulo");
        }
        else if (grado == null){
            throw new CursoNullPointerException("Grado es un valor nulo");
        }
        else if (letra == null){
            throw new CursoNullPointerException("Letra es un valor nulo");
        }
        else{
            this.grado = grado;
            this.letra = letra;
            this.listCurso = new ArrayList<>();
            this.mapaEstudiante = new HashMap<>();
        }
    }
    //crear una copia del curso
    public Curso(Curso otroCurso){
        int i;
        this.grado = otroCurso.getGrado();
        this.letra = otroCurso.getLetra();
        this.listCurso = new ArrayList<>();
        this.mapaEstudiante = new HashMap<>();
        for(i=0;otroCurso.sizeCurso()>i;i++){
            this.listCurso.add(otroCurso.getEstudiante(i));
            this.mapaEstudiante.put(otroCurso.getEstudiante(i).getRut(),otroCurso.getEstudiante(i));
        }
        
    }
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado)throws CursoNullPointerException {
        if (grado == null){
            throw new CursoNullPointerException("Grado es un valor nulo");
        }
        this.grado = grado;
    }
    
    public String getLetra() {
        return letra;
    }
    
    public void setLetra(String letra)throws CursoNullPointerException {
        if (letra == null){
            throw new CursoNullPointerException("Letra es un valor nulo");
        }
        this.letra = letra;
    }
    
    public long sizeCurso(){
        return listCurso.size();
    }
    public boolean estaCursoVacio(){
        return listCurso.isEmpty();
    }
    
    public void removerEstudiante(String key){
        mapaEstudiante.remove(key);
    }
    
    public void removerEstudiante(Estudiante estudiante){
        listCurso.remove(estudiante);
    }
    
    public Estudiante getEstudiante(int i){
        return listCurso.get(i);
    }
    public Estudiante getEstudiante(String key){
        return mapaEstudiante.get(key);
    }
    public void agregarEstudiante(String rut,Estudiante estudianteAgregar) {
        mapaEstudiante.put(rut,estudianteAgregar);


    }
    public void agregarEstudiante(Estudiante estudianteAgregar){
        listCurso.add(estudianteAgregar);   
    }
    
    public void agregarEstudiante(Estudiante estudianteAgregar,String path){
        File file = new File(path);
        agregarEstudiante(estudianteAgregar);

        
        List<String[]> datos = new ArrayList<>();

        String[] fila = new String[5];
        fila[0] = estudianteAgregar.getRut(); 
        fila[1] = estudianteAgregar.getNombre();
        fila[2] = estudianteAgregar.getApellido(); 
        fila[3] = this.getGrado();
        fila[4] = this.getLetra();

        // Añadir la fila a los datos
        datos.add(fila);

        LeerYEscribirCSV csv = new LeerYEscribirCSV();
        csv.escribirCSV(file, datos);
    }
    public String mostrarEstudiante(){
        String ret = "";
        int i;
        for(i=0;listCurso.size()>i;i++){
            ret+= listCurso.get(i).toString();
        }
        return ret;
    }
    public boolean contieneEstudiante(String rut){
        return mapaEstudiante.containsKey(rut);
    }
    
    public boolean formatoCorrecto()throws CursoNullPointerException{
        String nivel;
        if (((Character.isDigit(grado.charAt(0))) && (Character.isAlphabetic(letra.charAt(0)))) && letra.length() == 1){
            if( ((Character.isAlphabetic(grado.charAt(1))) && (Character.isAlphabetic(grado.charAt(2)))) && (grado.charAt(3) == ' ')){
                nivel = grado.substring(4);
                if((isAlphabetic(nivel)) && (nivel.length() == 6 || nivel.length() == 5)){
                    toUpperCase();
                    return true;  
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }   
        }
        else{
            return false;
        }
    }
    
    
    public void toUpperCase()throws CursoNullPointerException{
        String antes,despues;
        setLetra(letra.toUpperCase());
        antes = grado.substring(0,4);
        char letra = Character.toUpperCase(grado.charAt(4));
        despues = grado.substring(5);
        setGrado(antes+letra+despues); 
           
    }
    
    public boolean isAlphabetic(String cadena){
        int i;
        for(i=0;cadena.length()>i;i++){
            if(Character.isDigit(cadena.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public boolean isPoint(String cadena){
        int i;
        for (i=0;cadena.length()>i;i++){
            if(cadena.charAt(i) == '.'){
                return true;
            }
        }
        return false;
    }

    public String verificarRut(String rut){
        int i;
        char caracter;
        String antes,despues;
        if(isPoint(rut)){
            for(i = 0;rut.length()>i;i++){
                if(rut.charAt(i) == '.'){
                    antes = rut.substring(0,i);
                    despues = rut.substring(i+1);
                    rut = antes+despues;
                }
            }
            caracter = rut.charAt(rut.length()-2);
            if(caracter == '-'){
                antes = rut.substring(0,rut.length()-2);
                despues = rut.substring(rut.length()-1);
                rut = antes+despues;
            }
            return rut;
        }
        else{
            caracter = rut.charAt(rut.length()-2);
            if(caracter == '-'){
                antes = rut.substring(0,rut.length()-2);
                despues = rut.substring(rut.length()-1);
                return (antes+despues);
            }
        }
        return rut;
    }

    
    @Override
    public String toString(){
        return (grado+","+letra+","+Long.toString(sizeCurso())+"\n");
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

    public void cargarEstudiantes(List<String[]> datosCSV, JFrame panel) {
        try{
            for (String[] fila : datosCSV) {
                if (fila.length >= 5) {
                    String rut = fila[0];
                    String nombre = fila[1];
                    String apellido = fila[2];
                    String gradoM = fila[3];
                    String letraM = fila[4];


                    if (this.grado.equals(gradoM) && this.letra.equals(letraM)) {
                        Estudiante estudiante = new Estudiante(nombre, apellido, rut);
                        listCurso.add(estudiante);
                        mapaEstudiante.put(rut,estudiante);
                    }
                } else {
                    System.out.println("Error: fila con formato incorrecto en el CSV.");
                }
            }
        }catch (EstudianteNullPointerException e){
            JOptionPane.showMessageDialog(panel, "Error al cargar un estudiante\nError: "+e.getMessage()+"\n"+shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);

        }catch (Exception e){
            JOptionPane.showMessageDialog(panel,"Error génerico\n"+shortStackTrace(e,10),"Error",JOptionPane.ERROR_MESSAGE);
        }

    } 
    
    
    
    public void actualizarCSVEstudiantes() {
        File file = new File("src/main/java/Estudiantes.csv");
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file,true))) { 
            for (Estudiante estudiante : listCurso) {
                String[] fila = new String[5];
                fila[0] = estudiante.getRut(); 
                fila[1] = estudiante.getNombre(); 
                fila[2] = estudiante.getApellido(); 
                fila[3] = this.getGrado(); 
                fila[4] = this.getLetra();
                csvWriter.writeNext(fila); 
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}