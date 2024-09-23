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
        colegio.cargarCursosDesdeCSV();
        colegio.cargarEstudiantesDesdeCSV();
        //colegio.cargarAsistenciaDesdeCsv();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal vv = new MenuPrincipal(colegio);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                vv.setVisible(true);
            }
           
        });
    }            
}
