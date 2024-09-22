/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Agregar extends javax.swing.JFrame {
    
    private Colegio colegio;
    private Curso curso;
    private String titulo,text1,text2;
    private boolean opcion;
    //agregar curso
    public Agregar(Colegio colegio) {
        this.colegio = colegio;
        this.opcion = false;
        initComponents();
        this.remove(jLabel5);
        this.remove(jTextFieldC3);
    }
    //agregar estudiante
    public Agregar(Colegio colegio,Curso curso){
        this.colegio = colegio;
        this.curso = curso;
        this.opcion = false;
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldA1 = new javax.swing.JTextField();
        jTextFieldB2 = new javax.swing.JTextField();
        jTextFieldC3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(840, 460));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        if(curso==null){
            text1 = "Grado de curso:";
        }
        else{
            text1 = "Rut:";
        }
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText(text1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        if (curso==null){
            text2 = "Paralelo/letra:";
        }
        else{
            text2 = "Nombre:";
        }
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText(text2);

        jButtonAceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonAceptar.setText("Agregar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        if (curso==null){
            titulo = "Curso";
        }
        else{
            titulo = "Estudiante";
        }
        jLabel4.setText("Agregar "+titulo);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Apellido:");

        jTextFieldA1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldA1KeyPressed(evt);
            }
        });

        jTextFieldB2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldB2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldB2KeyPressed(evt);
            }
        });

        jTextFieldC3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldC3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldC3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldC3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldA1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldB2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(evt.getSource()==jButtonCancelar){
            if (curso==null){
                MenuCursos vv = new MenuCursos(colegio);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                vv.setVisible(true);
                this.dispose();
            }
            else{
                MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                vv.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if (evt.getSource()==jButtonAceptar){
            opcionAceptar();
        }    
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jTextFieldA1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldA1KeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldA1KeyPressed

    private void jTextFieldB2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldB2KeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldB2KeyPressed

    private void jTextFieldC3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldC3KeyPressed
       int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldC3KeyPressed

    private void opcionAceptar(){
         if (jTextFieldA1.getText().trim().isEmpty() || jTextFieldB2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
         }
         else{
             //agregar curso, si no se pasa la instancia de un curso entonces se pasa a la versión de agregar del curso
             if(curso==null){
                Curso c = new Curso(jTextFieldA1.getText(),jTextFieldB2.getText());
                if (colegio.verificarCurso(c)==null){
                    if (c.formatoCorrecto()){
                        colegio.agregarCurso(c);
                        JOptionPane.showMessageDialog(this, "Curso agregado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                        MenuCursos vv = new MenuCursos(colegio);
                        vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        vv.setVisible(true);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Formato no valido\nEjemplo de formato valido:\nGrado: 1ro medio\nLetra: a", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Curso ya está en el sistema", "Existe", JOptionPane.INFORMATION_MESSAGE);
                }
            
            }
             
             //agregar estudiantes 
            else{
                Estudiante e = new Estudiante(jTextFieldB2.getText(),jTextFieldC3.getText(),jTextFieldA1.getText());
                e.toUpperCase();
                e.setRut(curso.verificarRut(e.getRut()));
                if(colegio.verificarEstudiante(e.getRut())){
                    JOptionPane.showMessageDialog(this, "Estudiante ya registrado en el sistema", "Existe", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    curso.agregarEstudiante(jTextFieldA1.getText(),e);
                    curso.agregarEstudiante(e);
                    JOptionPane.showMessageDialog(this, "Estudiante agregado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                    MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
                    vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    vv.setVisible(true);
                    this.dispose();  
                }
            }          
        }    
    }     
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldA1;
    private javax.swing.JTextField jTextFieldB2;
    private javax.swing.JTextField jTextFieldC3;
    // End of variables declaration//GEN-END:variables
}
