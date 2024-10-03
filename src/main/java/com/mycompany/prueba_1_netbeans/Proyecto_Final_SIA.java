/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba_1_netbeans;

/**
 *
 * @author Usuario
 */
import javax.swing.*;

public class Proyecto_Final_SIA {
    
    public static void main(String[] args) {
        Colegio colegio = new Colegio();
        Path ruta = new Path();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal vv = new MenuPrincipal(colegio);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setVisible(true);
                try{
                    colegio.cargarCursosDesdeCSV(ruta.getPathCursos());
                    colegio.cargarEstudiantesDesdeCSV(ruta.getPathEstudiantes());
                    colegio.cargarAsistenciaDesdeCSV(ruta.getPathAsistencia());
                }catch (EstudianteNullPointerException e){
                    JOptionPane.showMessageDialog(vv, "Error al cargar estudiante/s\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);

                }catch (CursoNullPointerException e){
                    JOptionPane.showMessageDialog(vv, "Error al cargar curso/s\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);

                }catch (AsistenciaNullPointerException e){
                    JOptionPane.showMessageDialog(vv, "Error al cargar asistencia/s\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);

                }catch (Exception e){
                    JOptionPane.showMessageDialog(vv, "Error génerico\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
           
        });
    }            
}
