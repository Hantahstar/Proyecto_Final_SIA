/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Colegio{
    private  ArrayList<Curso> cursos;
    private ArrayList <Asistencia> asistencias;

    public Colegio() {
        this.cursos = new ArrayList<>();
        this.asistencias = new ArrayList<>();
    }
    public void listarCurso(){
        // Sección 1ro Básico
        Curso primeroA = new Curso("1ro Basico", "A");
        Estudiante ePrimeroA1 = new Estudiante("Carla", "Pérez", "213456789");
        Estudiante ePrimeroA2 = new Estudiante("Mario", "Gutiérrez", "212349876");
        cursos.add(primeroA);
        cursos.get(0).agregarEstudiante("213456789", ePrimeroA1);
        cursos.get(0).agregarEstudiante(ePrimeroA1);
        cursos.get(0).agregarEstudiante("212349876", ePrimeroA2);
        cursos.get(0).agregarEstudiante(ePrimeroA2);

        Curso primeroB = new Curso("1ro Basico", "B");
        Estudiante ePrimeroB1 = new Estudiante("Sofía", "Muñoz", "213658795");
        Estudiante ePrimeroB2 = new Estudiante("Carlos", "Romero", "211234567");
        cursos.add(primeroB);
        cursos.get(1).agregarEstudiante("213658795", ePrimeroB1);
        cursos.get(1).agregarEstudiante(ePrimeroB1);
        cursos.get(1).agregarEstudiante("211234567", ePrimeroB2);
        cursos.get(1).agregarEstudiante(ePrimeroB2);

        Curso primeroC = new Curso("1ro Basico", "C");
        Estudiante ePrimeroC1 = new Estudiante("Tomás", "Rojas", "212567890");
        Estudiante ePrimeroC2 = new Estudiante("Ana", "Salas", "210987654");
        cursos.add(primeroC);
        cursos.get(2).agregarEstudiante("212567890", ePrimeroC1);
        cursos.get(2).agregarEstudiante(ePrimeroC1);
        cursos.get(2).agregarEstudiante("210987654", ePrimeroC2);
        cursos.get(2).agregarEstudiante(ePrimeroC2);

        // Sección 2do Basico
        Curso segundoA = new Curso("2do Basico", "A");
        Estudiante eSegundoA1 = new Estudiante("Martín", "Castro", "209876543");
        Estudiante eSegundoA2 = new Estudiante("Elena", "Molina", "218765432");
        cursos.add(segundoA);
        cursos.get(3).agregarEstudiante("209876543", eSegundoA1);
        cursos.get(3).agregarEstudiante(eSegundoA1);
        cursos.get(3).agregarEstudiante("218765432", eSegundoA2);
        cursos.get(3).agregarEstudiante(eSegundoA2);

        Curso segundoB = new Curso("2do Basico", "B");
        Estudiante eSegundoB1 = new Estudiante("Diego", "Soto", "219876542");
        Estudiante eSegundoB2 = new Estudiante("Valeria", "Poblete", "207654321");
        cursos.add(segundoB);
        cursos.get(4).agregarEstudiante("219876542", eSegundoB1);
        cursos.get(4).agregarEstudiante(eSegundoB1);
        cursos.get(4).agregarEstudiante("207654321", eSegundoB2);
        cursos.get(4).agregarEstudiante(eSegundoB2);

        Curso segundoC = new Curso("2do Basico", "C");
        Estudiante eSegundoC1 = new Estudiante("Fernando", "Araya", "209654321");
        Estudiante eSegundoC2 = new Estudiante("Paulina", "Silva", "217654321");
        cursos.add(segundoC);
        cursos.get(5).agregarEstudiante("209654321", eSegundoC1);
        cursos.get(5).agregarEstudiante(eSegundoC1);
        cursos.get(5).agregarEstudiante("217654321", eSegundoC2);
        cursos.get(5).agregarEstudiante(eSegundoC2);

        // Sección 3ro Basico
        Curso terceroA = new Curso("3ro Basico", "A");
        Estudiante eTerceroA1 = new Estudiante("Isabella", "Fernández", "205432189");
        Estudiante eTerceroA2 = new Estudiante("Javier", "López", "206543210");
        cursos.add(terceroA);
        cursos.get(6).agregarEstudiante("205432189", eTerceroA1);
        cursos.get(6).agregarEstudiante(eTerceroA1);
        cursos.get(6).agregarEstudiante("206543210", eTerceroA2);
        cursos.get(6).agregarEstudiante(eTerceroA2);

        Curso terceroB = new Curso("3ro Basico", "B");
        Estudiante eTerceroB1 = new Estudiante("Gabriela", "Riquelme", "203214589");
        Estudiante eTerceroB2 = new Estudiante("Ignacio", "Cáceres", "202134567");
        cursos.add(terceroB);
        cursos.get(7).agregarEstudiante("203214589", eTerceroB1);
        cursos.get(7).agregarEstudiante(eTerceroB1);
        cursos.get(7).agregarEstudiante("202134567", eTerceroB2);
        cursos.get(7).agregarEstudiante(eTerceroB2);

        Curso terceroC = new Curso("3ro Basico", "C");
        Estudiante eTerceroC1 = new Estudiante("Samuel", "Vargas", "209432187");
        Estudiante eTerceroC2 = new Estudiante("Laura", "Morales", "204321234");
        cursos.add(terceroC);
        cursos.get(8).agregarEstudiante("209432187", eTerceroC1);
        cursos.get(8).agregarEstudiante(eTerceroC1);
        cursos.get(8).agregarEstudiante("204321234", eTerceroC2);
        cursos.get(8).agregarEstudiante(eTerceroC2);

        // Sección 4to Basico
        Curso cuartoA = new Curso("4to Basico", "A");
        Estudiante eCuartoA1 = new Estudiante("Luis", "Reyes", "205678321");
        Estudiante eCuartoA2 = new Estudiante("Catalina", "Ortega", "209876521");
        cursos.add(cuartoA);
        cursos.get(9).agregarEstudiante("205678321", eCuartoA1);
        cursos.get(9).agregarEstudiante(eCuartoA1);
        cursos.get(9).agregarEstudiante("209876521", eCuartoA2);
        cursos.get(9).agregarEstudiante(eCuartoA2);

        Curso cuartoB = new Curso("4to Basico", "B");
        Estudiante eCuartoB1 = new Estudiante("Mónica", "Zamora", "208765432");
        Estudiante eCuartoB2 = new Estudiante("Pablo", "Lagos", "206543211");
        cursos.add(cuartoB);
        cursos.get(10).agregarEstudiante("208765432", eCuartoB1);
        cursos.get(10).agregarEstudiante(eCuartoB1);
        cursos.get(10).agregarEstudiante("206543211", eCuartoB2);
        cursos.get(10).agregarEstudiante(eCuartoB2);

        Curso cuartoC = new Curso("4to Basico", "C");
        Estudiante eCuartoC1 = new Estudiante("Andrés", "Paredes", "205432111");
        Estudiante eCuartoC2 = new Estudiante("Lucía", "Vega", "206789321");
        cursos.add(cuartoC);
        cursos.get(11).agregarEstudiante("205432111", eCuartoC1);
        cursos.get(11).agregarEstudiante(eCuartoC1);
        cursos.get(11).agregarEstudiante("206789321", eCuartoC2);
        cursos.get(11).agregarEstudiante(eCuartoC2);

        // Sección 5to Basico
        Curso quintoA = new Curso("5to Basico", "A");
        Estudiante eQuintoA1 = new Estudiante("Raúl", "Sepúlveda", "205432233");
        Estudiante eQuintoA2 = new Estudiante("Viviana", "Olivares", "205432276");
        cursos.add(quintoA);
        cursos.get(12).agregarEstudiante("205432233", eQuintoA1);
        cursos.get(12).agregarEstudiante(eQuintoA1);
        cursos.get(12).agregarEstudiante("205432276", eQuintoA2);
        cursos.get(12).agregarEstudiante(eQuintoA2);

        Curso quintoB = new Curso("5to Basico", "B");
        Estudiante eQuintoB1 = new Estudiante("Joaquín", "Sanhueza", "208765329");
        Estudiante eQuintoB2 = new Estudiante("Diana", "Escobar", "209432188");
        cursos.add(quintoB);
        cursos.get(13).agregarEstudiante("208765329", eQuintoB1);
        cursos.get(13).agregarEstudiante(eQuintoB1);
        cursos.get(13).agregarEstudiante("209432188", eQuintoB2);
        cursos.get(13).agregarEstudiante(eQuintoB2);

        Curso quintoC = new Curso("5to Basico", "C");
        Estudiante eQuintoC1 = new Estudiante("Miguel", "Saavedra", "204321220");
        Estudiante eQuintoC2 = new Estudiante("Teresa", "Carrasco", "201432122");
        cursos.add(quintoC);
        cursos.get(14).agregarEstudiante("204321220", eQuintoC1);
        cursos.get(14).agregarEstudiante(eQuintoC1);
        cursos.get(14).agregarEstudiante("201432122", eQuintoC2);
        cursos.get(14).agregarEstudiante(eQuintoC2);

        // Sección 6to Basico
        Curso sextoA = new Curso("6to Basico", "A");
        Estudiante eSextoA1 = new Estudiante("Francisco", "Fuentes", "203213255");
        Estudiante eSextoA2 = new Estudiante("Julia", "Contreras", "209543212");
        cursos.add(sextoA);
        cursos.get(15).agregarEstudiante("203213255", eSextoA1);
        cursos.get(15).agregarEstudiante(eSextoA1);
        cursos.get(15).agregarEstudiante("209543212", eSextoA2);
        cursos.get(15).agregarEstudiante(eSextoA2);

        Curso sextoB = new Curso("6to Basico", "B");
        Estudiante eSextoB1 = new Estudiante("Ricardo", "Ahumada", "205432146");
        Estudiante eSextoB2 = new Estudiante("Daniela", "Quezada", "204323456");
        cursos.add(sextoB);
        cursos.get(16).agregarEstudiante("205432146", eSextoB1);
        cursos.get(16).agregarEstudiante(eSextoB1);
        cursos.get(16).agregarEstudiante("204323456", eSextoB2);
        cursos.get(16).agregarEstudiante(eSextoB2);

        Curso sextoC = new Curso("6to Basico", "C");
        Estudiante eSextoC1 = new Estudiante("Álvaro", "Garrido", "208765212");
        Estudiante eSextoC2 = new Estudiante("Loreto", "Bustos", "209876245");
        cursos.add(sextoC);
        cursos.get(17).agregarEstudiante("208765212", eSextoC1);
        cursos.get(17).agregarEstudiante(eSextoC1);
        cursos.get(17).agregarEstudiante("209876245", eSextoC2);
        cursos.get(17).agregarEstudiante(eSextoC2);

        // Sección 7mo básico 
        Curso septimoA = new Curso("7mo Basico", "A");
        Estudiante eSeptimoA1 = new Estudiante("José", "González", "202345678");
        Estudiante eSeptimoA2 = new Estudiante("Gabriela", "Espinoza", "203456789");
        cursos.add(septimoA);
        cursos.get(18).agregarEstudiante("202345678", eSeptimoA1);
        cursos.get(18).agregarEstudiante(eSeptimoA1);
        cursos.get(18).agregarEstudiante("203456789", eSeptimoA2);
        cursos.get(18).agregarEstudiante(eSeptimoA2);

        Curso septimoB = new Curso("7mo Basico", "B");
        Estudiante eSeptimoB1 = new Estudiante("Ricardo", "Guzmán", "207654398");
        Estudiante eSeptimoB2 = new Estudiante("Patricia", "Valenzuela", "209876543");
        cursos.add(septimoB);
        cursos.get(19).agregarEstudiante("207654398", eSeptimoB1);
        cursos.get(19).agregarEstudiante(eSeptimoB1);
        cursos.get(19).agregarEstudiante("209876543", eSeptimoB2);
        cursos.get(19).agregarEstudiante(eSeptimoB2);

        Curso septimoC = new Curso("7mo Basico", "C");
        Estudiante eSeptimoC1 = new Estudiante("Tomás", "Moreno", "201234567");
        Estudiante eSeptimoC2 = new Estudiante("Rocío", "Tapia", "208765234");
        cursos.add(septimoC);
        cursos.get(20).agregarEstudiante("201234567", eSeptimoC1);
        cursos.get(20).agregarEstudiante(eSeptimoC1);
        cursos.get(20).agregarEstudiante("208765234", eSeptimoC2);
        cursos.get(20).agregarEstudiante(eSeptimoC2);

        // Sección 8vo Basico
        Curso octavoA = new Curso("8vo Basico", "A");
        Estudiante eOctavoA1 = new Estudiante("Cristóbal", "Navarro", "209765432");
        Estudiante eOctavoA2 = new Estudiante("Camila", "Cortez", "201765432");
        cursos.add(octavoA);
        cursos.get(21).agregarEstudiante("209765432", eOctavoA1);
        cursos.get(21).agregarEstudiante(eOctavoA1);
        cursos.get(21).agregarEstudiante("201765432", eOctavoA2);
        cursos.get(21).agregarEstudiante(eOctavoA2);

        Curso octavoB = new Curso("8vo Basico", "B");
        Estudiante eOctavoB1 = new Estudiante("Felipe", "Rivera", "205432165");
        Estudiante eOctavoB2 = new Estudiante("Mariana", "Vidal", "202345678");
        cursos.add(octavoB);
        cursos.get(22).agregarEstudiante("205432165", eOctavoB1);
        cursos.get(22).agregarEstudiante(eOctavoB1);
        cursos.get(22).agregarEstudiante("202345678", eOctavoB2);
        cursos.get(22).agregarEstudiante(eOctavoB2);

        Curso octavoC = new Curso("8vo Basico", "C");
        Estudiante eOctavoC1 = new Estudiante("Manuel", "Pizarro", "207654329");
        Estudiante eOctavoC2 = new Estudiante("Sara", "Alvarez", "209987654");
        cursos.add(octavoC);
        cursos.get(23).agregarEstudiante("207654329", eOctavoC1);
        cursos.get(23).agregarEstudiante(eOctavoC1);
        cursos.get(23).agregarEstudiante("209987654", eOctavoC2);
        cursos.get(23).agregarEstudiante(eOctavoC2);

        // Sección 1ro Medio
        Curso primeroMA = new Curso("1ro Medio", "A");
        Estudiante ePrimeroMA1 = new Estudiante("Matías", "Salazar", "208765342");
        Estudiante ePrimeroMA2 = new Estudiante("Valentina", "Herrera", "206543212");
        cursos.add(primeroMA);
        cursos.get(24).agregarEstudiante("208765342", ePrimeroMA1);
        cursos.get(24).agregarEstudiante(ePrimeroMA1);
        cursos.get(24).agregarEstudiante("206543212", ePrimeroMA2);
        cursos.get(24).agregarEstudiante(ePrimeroMA2);

        Curso primeroMB = new Curso("1ro Medio", "B");
        Estudiante ePrimeroMB1 = new Estudiante("Pablo", "Castillo", "201987654");
        Estudiante ePrimeroMB2 = new Estudiante("Fernanda", "Martínez", "203456789");
        cursos.add(primeroMB);
        cursos.get(25).agregarEstudiante("201987654", ePrimeroMB1);
        cursos.get(25).agregarEstudiante(ePrimeroMB1);
        cursos.get(25).agregarEstudiante("203456789", ePrimeroMB2);
        cursos.get(25).agregarEstudiante(ePrimeroMB2);

        Curso primeroMC = new Curso("1ro Medio", "C");
        Estudiante ePrimeroMC1 = new Estudiante("Rodrigo", "Muñoz", "202123456");
        Estudiante ePrimeroMC2 = new Estudiante("Ximena", "Jiménez", "204567890");
        cursos.add(primeroMC);
        cursos.get(26).agregarEstudiante("202123456", ePrimeroMC1);
        cursos.get(26).agregarEstudiante(ePrimeroMC1);
        cursos.get(26).agregarEstudiante("204567890", ePrimeroMC2);
        cursos.get(26).agregarEstudiante(ePrimeroMC2);

        // Sección 2do Medio
        Curso segundoMA = new Curso("2do Medio", "A");
        Estudiante eSegundoMA1 = new Estudiante("Juan", "Vergara", "209876542");
        Estudiante eSegundoMA2 = new Estudiante("Loreto", "Gallardo", "203456120");
        cursos.add(segundoMA);
        cursos.get(27).agregarEstudiante("209876542", eSegundoMA1);
        cursos.get(27).agregarEstudiante(eSegundoMA1);
        cursos.get(27).agregarEstudiante("203456120", eSegundoMA2);
        cursos.get(27).agregarEstudiante(eSegundoMA2);

        Curso segundoMB = new Curso("2do Medio", "B");
        Estudiante eSegundoMB1 = new Estudiante("Constanza", "Sandoval", "204321234");
        Estudiante eSegundoMB2 = new Estudiante("Gonzalo", "Ávila", "207654389");
        cursos.add(segundoMB);
        cursos.get(28).agregarEstudiante("204321234", eSegundoMB1);
        cursos.get(28).agregarEstudiante(eSegundoMB1);
        cursos.get(28).agregarEstudiante("207654389", eSegundoMB2);
        cursos.get(28).agregarEstudiante(eSegundoMB2);

        Curso segundoMC = new Curso("2do Medio", "C");
        Estudiante eSegundoMC1 = new Estudiante("Bárbara", "Suárez", "208765434");
        Estudiante eSegundoMC2 = new Estudiante("Renato", "Aravena", "201234576");
        cursos.add(segundoMC);
        cursos.get(29).agregarEstudiante("208765434", eSegundoMC1);
        cursos.get(29).agregarEstudiante(eSegundoMC1);
        cursos.get(29).agregarEstudiante("201234576", eSegundoMC2);
        cursos.get(29).agregarEstudiante(eSegundoMC2);

        // Sección 3ro Medio
        Curso terceroMA = new Curso("3ro Medio", "A");
        Estudiante eTerceroMA1 = new Estudiante("Ignacio", "Cifuentes", "209876543");
        Estudiante eTerceroMA2 = new Estudiante("Sofía", "Bravo", "207654321");
        cursos.add(terceroMA);
        cursos.get(30).agregarEstudiante("209876543", eTerceroMA1);
        cursos.get(30).agregarEstudiante(eTerceroMA1);
        cursos.get(30).agregarEstudiante("207654321", eTerceroMA2);
        cursos.get(30).agregarEstudiante(eTerceroMA2);

        Curso terceroMB = new Curso("3ro Medio", "B");
        Estudiante eTerceroMB1 = new Estudiante("Sebastián", "Mora", "208765342");
        Estudiante eTerceroMB2 = new Estudiante("Martina", "Rojas", "204321234");
        cursos.add(terceroMB);
        cursos.get(31).agregarEstudiante("208765342", eTerceroMB1);
        cursos.get(31).agregarEstudiante(eTerceroMB1);
        cursos.get(31).agregarEstudiante("204321234", eTerceroMB2);
        cursos.get(31).agregarEstudiante(eTerceroMB2);

        Curso terceroMC = new Curso("3ro Medio", "C");
        Estudiante eTerceroMC1 = new Estudiante("Paula", "Silva", "203456789");
        Estudiante eTerceroMC2 = new Estudiante("Diego", "Soto", "209876543");
        cursos.add(terceroMC);
        cursos.get(32).agregarEstudiante("203456789", eTerceroMC1);
        cursos.get(32).agregarEstudiante(eTerceroMC1);
        cursos.get(32).agregarEstudiante("209876543", eTerceroMC2);
        cursos.get(32).agregarEstudiante(eTerceroMC2);

        
        Curso cuartoMA = new Curso("4to Medio","A");
        Estudiante eCuartoMA = new Estudiante("Daniel","Savedra","212194026");
        Estudiante eCuartoMA2 = new Estudiante("Matías","Diaz","220380025");
        cursos.add(cuartoMA);
        cursos.get(33).agregarEstudiante("212194026",eCuartoMA);
        cursos.get(33).agregarEstudiante(eCuartoMA);
        cursos.get(33).agregarEstudiante("220380025",eCuartoMA2);
        cursos.get(33).agregarEstudiante(eCuartoMA2);
        
        Curso cuartoMB = new Curso("4to Medio", "B");
        Estudiante eCuartoMB1 = new Estudiante("Tomás", "Riquelme", "209876321");
        Estudiante eCuartoMB2 = new Estudiante("Isidora", "Peña", "208765123");
        cursos.add(cuartoMB);
        cursos.get(34).agregarEstudiante("209876321", eCuartoMB1);
        cursos.get(34).agregarEstudiante(eCuartoMB1);
        cursos.get(34).agregarEstudiante("208765123", eCuartoMB2);
        cursos.get(34).agregarEstudiante(eCuartoMB2);

        // Sección 4to Medio C
        Curso cuartoMC = new Curso("4to Medio", "C");
        Estudiante eCuartoMC1 = new Estudiante("Claudio", "Ulloa", "207654210");
        Estudiante eCuartoMC2 = new Estudiante("Carolina", "Salinas", "209876450");
        cursos.add(cuartoMC);
        cursos.get(35).agregarEstudiante("207654210", eCuartoMC1);
        cursos.get(35).agregarEstudiante(eCuartoMC1);
        cursos.get(35).agregarEstudiante("209876450", eCuartoMC2);
        cursos.get(35).agregarEstudiante(eCuartoMC2);
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
                if(cursos.get(i).getGrado().equals(c.getGrado()) && cursos.get(i).getLetra().equals(c.getLetra())){
                    return cursos.get(i);
                }
            }

        }
        return null;
    }
    public void agregarCurso(Curso c){
        cursos.add(c);
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
                    if(e.isAsistencia() && !e.isInasistenciaJust()){
                        estado = "Presente";
                    }
                    else if(!e.isAsistencia() && !e.isInasistenciaJust()){
                        estado = "Faltó";
                    }
                    else if(!e.isAsistencia() && e.isInasistenciaJust()){
                        estado = "Falta extraordinaria";
                    }
                    else if(e.isAsistencia() && e.isInasistenciaJust()){
                        estado = "Sale antes del horario";
                    }
                    selectionOpcion = JOptionPane.showOptionDialog(panel,e.toString()+"\n"+estado,"Asistencia Fecha :"+asist.getFecha()+" Hora :"+asist.getHora(),JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcionesVista,opcionesVista[0]);
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
}