/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba_1_netbeans;
import javax.swing.*;
import java.io.IOException;

//Clase para manejar los paths de los archivos CSV
public class Proyecto_Final_SIA {
    //Método main
    public static void main(String[] args){
        //Instancias de las clases
        Colegio colegio = new Colegio();
        Path ruta = new Path();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal vv = new MenuPrincipal(colegio);
                vv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                try{
                    //Cargar los datos de los archivos CSV
                    colegio.cargarCursosDesdeCSV(ruta.getPathCursos());
                    colegio.cargarEstudiantesDesdeCSV(ruta.getPathEstudiantes());
                    colegio.cargarAsistenciaDesdeCSV(ruta.getPathAsistencia());
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                    vv = new MenuPrincipal(colegio);
                    vv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    vv.setVisible(true);
                //Manejo de excepciones
                }catch (EstudianteNullPointerException e){
                    JOptionPane.showMessageDialog(vv, "Error al cargar estudiante/s\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);

                }catch (CursoNullPointerException e){
                    JOptionPane.showMessageDialog(vv, "Error al cargar curso/s\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);

                }catch (AsistenciaNullPointerException e){
                    JOptionPane.showMessageDialog(vv, "Error al cargar asistencia/s\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);

                }catch(IOException e){
                    JOptionPane.showMessageDialog(vv, "Error con el CSV\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(vv, "Error génerico\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
           
        });
    }            
}
