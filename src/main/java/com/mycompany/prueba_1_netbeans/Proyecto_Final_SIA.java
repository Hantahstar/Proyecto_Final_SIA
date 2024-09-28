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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal vv = new MenuPrincipal(colegio);
                colegio.cargarCursosDesdeCSV(vv);
                colegio.cargarEstudiantesDesdeCSV(vv);
                colegio.cargarAsistenciaDesdeCSV(vv);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setVisible(true);
            }
           
        });
    }            
}
