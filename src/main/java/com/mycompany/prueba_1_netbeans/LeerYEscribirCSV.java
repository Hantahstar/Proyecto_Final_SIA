/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

/**
 *
 * @author danielsaavedra
 */
import au.com.bytecode.opencsv.*;
import java.io.*;
import java.util.*;



/**
 *
 * @author danielsaavedra
 */
public class LeerYEscribirCSV {
    
    private BufferedReader lector;
    private String linea;
    private String partes[];
   
        
        public List<String[]> leerCSV(File file) {
            List<String[]> datos = new ArrayList<>();
            try (CSVReader csvReader = new CSVReader(new FileReader(file))) {
                String[] fila;
                while ((fila = csvReader.readNext()) != null) {
                     
                    datos.add(fila);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return datos;
        }
        
        
        
        public void escribirCSV(File file, List<String[]> datos) {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file, true))) {
                for (String[] fila : datos) {
                    csvWriter.writeNext(fila); 
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }    
        
        
        public void encabezadoEstudiantes(File file) {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file, false))) {
                String[] encabezado = {"Rut", "Nombre", "Apellido", "Grado", "Letra"};
                csvWriter.writeNext(encabezado);
            } catch (IOException ex) {
            
            }
        }
        
        public void encabezadoCursos(File file) {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file, false))) {              
                
            } catch (IOException ex) {
            
            }
        }
}
