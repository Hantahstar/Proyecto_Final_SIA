/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.prueba_1_netbeans;

import au.com.bytecode.opencsv.*;
import java.io.*;
import java.util.*;
//Clase para leer y escribir archivos CSV
public class LeerYEscribirCSV {
    //Método para leer un archivo CSV
    public List<String[]> leerCSV(File file)throws IOException{
        List<String[]> datos = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(file))){
            String[] fila;
            while ((fila = csvReader.readNext()) != null) {
                datos.add(fila);
            }
            return datos;
        }
    }
    //Método para escribir un archivo CSV
    public void escribirCSV(File file, List<String[]> datos)throws IOException {
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file, true))){
            for (String[] fila : datos){
                csvWriter.writeNext(fila);
            }
        }

    }
    //Método para escribir un encabezado en un archivo CSV
    public void encabezadoEstudiantes(File file)throws IOException {
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file, false))){
            String[] encabezado = {"Rut", "Nombre", "Apellido", "Grado", "Letra"};
            csvWriter.writeNext(encabezado);
        }
    }

}
