/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.*;

//Clase para mostrar el menú de asistencia
public class MenuAsistencia extends PadreColegio {
    //Constructor de la clase MenuAsistencia
    public MenuAsistencia(Colegio colegio,Curso curso) {
        super(colegio,curso);
        initComponents();
        visual();
    }
    //Método para visualizar la interfaz gráfica y configurarla al gusto
    private void visual(){
        //Botón de buscar
        jButtonBuscar.setBackground(new Color(150,43,69));
        jButtonBuscar.setForeground(Color.white);
        //Botón de eliminar
        jButtonEliminar.setBackground(new Color(150,43,69));
        jButtonEliminar.setForeground(Color.white);
        //Botón de realizar
        jButtonRealizar.setBackground(new Color(150,43,69));
        jButtonRealizar.setForeground(Color.white);
        //Botón de reporte
        jButtonReporte.setBackground(new Color(150,43,69));
        jButtonReporte.setForeground(Color.white);
        //Botón de porcentaje
        jButtonPorcentaje.setBackground(new Color(150,43,69));
        jButtonPorcentaje.setForeground(Color.white);
        //Botón de volver
        jButtonVolver.setBackground(new Color(150,43,69));
        jButtonVolver.setForeground(Color.white);

        jLabelCurso.setBackground(Color.black);
        jLabelCurso.setForeground(Color.white);
        jLabelTitulo.setBackground(Color.black);
        jLabelTitulo.setForeground(Color.white);
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
        jButtonRealizar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelCurso = new javax.swing.JLabel();
        jButtonPorcentaje = new javax.swing.JButton();
        jButtonReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelTitulo.setText("Menú Asistencia");
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonRealizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonRealizar.setText("Realizar asistencia");
        jButtonRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonBuscar.setText("Buscar asistencia");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar asistencia");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jLabelCurso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelCurso.setText(curso.getGrado()+" "+curso.getLetra()+"  Cantidad de estudiantes: "+curso.sizeCurso());

        jButtonPorcentaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonPorcentaje.setText("Generar porcentaje ");
        jButtonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentajeActionPerformed(evt);
            }
        });

        jButtonReporte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonReporte.setText("Crear reporte");
        jButtonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelCurso)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTitulo)
                            .addComponent(jButtonRealizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelTitulo)
                .addGap(5, 5, 5)
                .addComponent(jLabelCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRealizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Método para realizar la asistencia de un curso en una nueva ventana
    private void jButtonRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarActionPerformed
        if (evt.getSource()==jButtonRealizar){
            RealizarAsistencia vv = new RealizarAsistencia(colegio,curso);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setSize(this.getSize());
            vv.setLocation(this.getLocation());
            vv.setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_jButtonRealizarActionPerformed
    //Método para buscar la asistencia de un curso en una nueva ventana
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (evt.getSource()==jButtonBuscar){
            boolean encontradoBuscar = colegio.verificarAsistencia(curso);
            if(colegio.asistenciaEstaVacio() || !encontradoBuscar){
                JOptionPane.showMessageDialog(this, "No hay asistencias disponibles", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            else if(encontradoBuscar){
                //true para buscar
                ListaAsistencia vv = new ListaAsistencia(colegio,curso,true);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose(); 
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    //Método para eliminar la asistencia de un curso en una nueva ventana
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if (evt.getSource()==jButtonEliminar){
            boolean encontradoEliminar = colegio.verificarAsistencia(curso);
            //Si no hay asistencias disponibles o no se encuentra la asistencia
            if(colegio.asistenciaEstaVacio() || !encontradoEliminar){
                JOptionPane.showMessageDialog(this, "No hay asistencias disponibles", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            else if(encontradoEliminar){
                //false para lo otro
                ListaAsistencia vv = new ListaAsistencia(colegio,curso,false);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose(); 
            }
            
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed
    //Método para volver al menú principal
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        if(evt.getSource()==jButtonVolver){
            MenuPrincipal vv = new MenuPrincipal(colegio);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setSize(this.getSize());
            vv.setLocation(this.getLocation());
            vv.setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Para actualizar los CSV de los estudiantes, cursos y asistencias
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal vv = new MenuPrincipal(colegio);
        vv.catchException(this);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    //Método para generar un gráfico de porcentaje de asistencia de un curso
    private void jButtonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentajeActionPerformed
        if (colegio.asistenciaEstaVacio()){
            JOptionPane.showMessageDialog(this, "No hay asistencias disponibles", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else{
            GraficoAsistencia vv = new GraficoAsistencia(colegio.calcularPorcentaje(curso),colegio,curso);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setSize(this.getSize());
            vv.setLocation(this.getLocation());
            vv.setVisible(true);
            this.dispose();     
        }
    }//GEN-LAST:event_jButtonPorcentajeActionPerformed


    // Método que maneja la lógica de descarga y guardado del archivo
    private File descargarArchivo() {
        // Usamos JFileChooser para permitir al usuario seleccionar dónde guardar el archivo
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo");
        String nombreArchivo = curso.getGrado()+curso.getLetra()+".csv";
        // Configuramos el JFileChooser en modo de guardado
        fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
        fileChooser.setSelectedFile(new File(nombreArchivo));
        // Mostramos el cuadro de diálogo para guardar
        int userSelection = fileChooser.showSaveDialog(this);

        // Si el usuario selecciona una ubicación y confirma el guardado
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            return archivo;
        }
        return null;
    }


    //Método para generar un reportaje en un archivo externo
    private void jButtonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReporteActionPerformed
        if (evt.getSource() == jButtonReporte){
            if(colegio.asistenciaEstaVacio()){
                JOptionPane.showMessageDialog(this, "No hay asistencias disponibles", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            else{
                try {
                    //Crear reportaje aqui
                    HashMap<String, Double> cursoRe = colegio.calcularPorcentaje(curso);
                    colegio.generarReporte(cursoRe,curso,descargarArchivo(),this);
                } catch (IOException e){
                    JOptionPane.showMessageDialog(this,"Error al crear reporte\n"+colegio.shortStackTrace(e,10),"Error",JOptionPane.ERROR_MESSAGE);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(this,"Error génerico\n"+colegio.shortStackTrace(e,10),"Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonReporteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonPorcentaje;
    private javax.swing.JButton jButtonRealizar;
    private javax.swing.JButton jButtonReporte;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
