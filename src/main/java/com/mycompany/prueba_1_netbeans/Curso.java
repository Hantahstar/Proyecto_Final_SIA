/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.util.*;

public class Curso{
    private String grado;
    private String letra;
    private final ArrayList <Estudiante> listCurso;
    private final Map <String,Estudiante> mapaEstudiante;

    public Curso(String grado,String letra) {
        this.grado = grado;
        this.letra = letra;
        this.listCurso = new ArrayList<>();
        this.mapaEstudiante = new HashMap<>();
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

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    public String getLetra() {
        return letra;
    }
    
    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public long sizeCurso(){
        return listCurso.size();
    }
    public boolean estaCursoVacio(){
        return listCurso.isEmpty();
    }
    
    public Estudiante removerEstudiante(String key){
        return mapaEstudiante.remove(key);
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
    public boolean agregarEstudiante(String rut,Estudiante estudianteAgregar)
    {
        String rutCpy = rut,rutP1,rutP2;
        String[] rutTotal; 
        if(rutCpy.charAt(rutCpy.length()-2) == '-'){
            rutTotal = rutCpy.split("-");
            rutP1 = rutTotal[0];
            rutP2 = rutTotal[1];
            rut = rutP1.concat(rutP2);
        }
        if (mapaEstudiante.containsKey(rut)){
            return false;
        }
        else{

            mapaEstudiante.put(rut,estudianteAgregar);
            return true;
        }

    }
    public void agregarEstudiante(Estudiante estudianteAgregar){
        listCurso.add(estudianteAgregar);
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
    
    public void toUpperCase(){
        String antes,despues;
        setLetra(letra.toUpperCase());
        antes = grado.substring(0,4);
        
        char letra = Character.toUpperCase(grado.charAt(4));
        despues = grado.substring(4+1);
        setGrado(antes+letra+despues);   
    }
    
      public String verificarRut(String rut){
         char caracter;
         String antes,despues;
         caracter = rut.charAt(rut.length()-2);
         if (caracter == '-'){
             antes = rut.substring(0,rut.length()-2);
             despues = rut.substring(rut.length()-1);
             return (antes+despues);
         }
         return rut;
     }
    
    @Override
    public String toString(){
        return (grado+","+letra+","+Long.toString(sizeCurso())+"\n");
    }
}