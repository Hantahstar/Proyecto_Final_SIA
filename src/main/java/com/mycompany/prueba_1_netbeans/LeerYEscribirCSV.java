/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import au.com.bytecode.opencsv.*;
import java.io.*;
import java.util.*;

public class LeerYEscribirCSV {
    
    private BufferedReader lector;
    private String linea;
    private String partes[];


    public List<String[]> leerCSV(File file)throws IOException{
        List<String[]> datos = new ArrayList<>();
        CSVReader csvReader = new CSVReader(new FileReader(file));
        String[] fila;
        while ((fila = csvReader.readNext()) != null) {
            datos.add(fila);
        }
        return datos;
    }

    public void escribirCSV(File file, List<String[]> datos)throws IOException {
        CSVWriter csvWriter = new CSVWriter(new FileWriter(file, true));
        for (String[] fila : datos){
            csvWriter.writeNext(fila);
        }
    }

    public void encabezadoEstudiantes(File file)throws IOException {
        CSVWriter csvWriter = new CSVWriter(new FileWriter(file, false));
        String[] encabezado = {"Rut", "Nombre", "Apellido", "Grado", "Letra"};
        csvWriter.writeNext(encabezado);
    }

    public void dejarEnBlanco(File file)throws IOException {
        CSVWriter csvWriter = new CSVWriter(new FileWriter(file, false));
    }

}
