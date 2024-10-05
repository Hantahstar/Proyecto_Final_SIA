/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
import java.io.IOException;
import javax.swing.*;

//Clase para mostrar el menú principal
public class MenuPrincipal extends PadreColegio {
    //Constructor de la clase MenuPrincipal
    public MenuPrincipal(Colegio colegio) {
        super(colegio);
        initComponents();
        visual();
    }

    //Método para visualizar la interfaz gráfica y configurarla al gusto
    private void visual(){
        this.getContentPane().setBackground(Color.gray);
        jButtonAsistencias.setBackground(Color.lightGray);
        jButtonCursos.setBackground(Color.lightGray);
        jButtonEstudiantes.setBackground(Color.lightGray);
        jButtonSalir.setBackground(Color.lightGray);
        jLabelTitulo.setBackground(Color.black);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonCursos = new javax.swing.JButton();
        jButtonEstudiantes = new javax.swing.JButton();
        jButtonAsistencias = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Colegio");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(840, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Menú principal");
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonCursos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCursos.setText("Menú Cursos");
        jButtonCursos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCursosActionPerformed(evt);
            }
        });

        jButtonEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonEstudiantes.setText("Menú Estudiantes");
        jButtonEstudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstudiantesActionPerformed(evt);
            }
        });

        jButtonAsistencias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonAsistencias.setText("Realizar asistencia");
        jButtonAsistencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsistenciasActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButtonCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAsistencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jButtonCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAsistencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        getAccessibleContext().setAccessibleName("frame1");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Método para ir al menú de cursos
    private void jButtonCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCursosActionPerformed
        if (evt.getSource()==jButtonCursos){
            MenuCursos vv = new MenuCursos(this.colegio);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setSize(this.getSize());
            vv.setLocation(this.getLocation());
            vv.setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_jButtonCursosActionPerformed
    //Método para ir al menú de asistencias
    private void jButtonAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsistenciasActionPerformed
        if (evt.getSource()==jButtonAsistencias){
            if(colegio.cursoEstaVacio()){
                //En el caso de que no haya cursos disponibles
                JOptionPane.showMessageDialog(this, "No hay cursos disponibles", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            else{
                //se pone 3 como parametro para que vaya al menu de asistencias
                ListaCursos vv = new ListaCursos(colegio,3);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose(); 
            }
        }
    }//GEN-LAST:event_jButtonAsistenciasActionPerformed
    //Método para ir al menú de estudiantes
    private void jButtonEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstudiantesActionPerformed
        if (evt.getSource()==jButtonEstudiantes){
            if(!colegio.cursoEstaVacio()){
                //se pone 2 como parametro para que vaya al menu de estudiantes
                ListaCursos vv = new ListaCursos(colegio,2);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose(); 
                //Ventana de estudiantes
            }
            else{
                //No hay cursos disponibles
                JOptionPane.showMessageDialog(this, "No hay cursos disponibles", "Advertencia", JOptionPane.WARNING_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_jButtonEstudiantesActionPerformed
    //Método para salir de la aplicación
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        if(evt.getSource()==jButtonSalir){
            catchException(this);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed

    //Método para actualizar los CSV de los estudiantes, cursos y asistencias y capturar excepciones
    public void catchException(JFrame panel){
        try{
            colegio.actualizar(ruta.getPathEstudiantes(),1);
            colegio.actualizar(ruta.getPathCursos(),2);
            colegio.actualizar(ruta.getPathAsistencia(),3);
            this.dispose();
        }catch (EstudianteNullPointerException e){
            JOptionPane.showMessageDialog(panel, "Error al actualizar estudiante/s\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);

        }catch (CursoNullPointerException e){
            JOptionPane.showMessageDialog(panel, "Error al actualizar curso/s\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);

        }catch (AsistenciaNullPointerException e){
            JOptionPane.showMessageDialog(panel, "Error al actualizar asistencia/s\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);

        }catch (IOException e){
            JOptionPane.showMessageDialog(panel, "Errores de CSV\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(panel, "Error génerico\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Para actualizar los CSV de los estudiantes, cursos y asistencias al cerrar la ventana
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        catchException(this);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAsistencias;
    private javax.swing.JButton jButtonCursos;
    private javax.swing.JButton jButtonEstudiantes;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
