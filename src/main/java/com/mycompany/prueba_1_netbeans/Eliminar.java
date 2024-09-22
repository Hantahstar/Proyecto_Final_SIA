/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Eliminar extends javax.swing.JFrame {

    private Colegio colegio;
    private Curso curso;
    private String titulo;
    private String label;
   
    public Eliminar(Colegio colegio){
        this.colegio = colegio;
        initComponents();
    }
    //eliminar para estudiantes
    public Eliminar(Colegio colegio,Curso curso){
        this.colegio = colegio;
        this.curso = curso;
        initComponents();
        this.remove(jLabel3);
        this.remove(jTextFieldLetra);
        this.revalidate();
        this.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEliminar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPalabraPrin = new javax.swing.JTextField();
        jTextFieldLetra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(840, 460));

        jButtonEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        if (curso==null){
            titulo = "Curso";
        }
        else{
            titulo = "Estudiante";
        }
        jLabel1.setText("Eliminar "+titulo);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        if (curso==null){
            label = "Grado de curso:";
        }
        else{
            label = "Rut de estudiante";
        }
        jLabel2.setText(label);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Paralelo/Letra:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTextFieldPalabraPrin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldPalabraPrin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPalabraPrinKeyPressed(evt);
            }
        });

        jTextFieldLetra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLetraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                            .addComponent(jButtonCancelar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldLetra)
                                .addComponent(jTextFieldPalabraPrin)))))
                .addGap(39, 39, 39))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCancelar, jButtonEliminar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPalabraPrin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void opcionEliminar(){
        if (jTextFieldPalabraPrin.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
         }
        else{
            if(jTextFieldPalabraPrin.getText().trim().isEmpty()||jTextFieldLetra.getText().trim().isEmpty()){
                if(curso==null){
                Curso c = new Curso(jTextFieldPalabraPrin.getText(),jTextFieldLetra.getText());
                if (colegio.verificarCurso(c)==null){
                    JOptionPane.showMessageDialog(this, "Curso no se encuentra en el sistema", "No existe", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    //Eliminar Curso
                    JOptionPane.showMessageDialog(this,colegio.mostrarCurso(c)+"\nCurso Eliminado","Eliminado", JOptionPane.INFORMATION_MESSAGE);
                    colegio.removerCurso(colegio.verificarCurso(c));
                    MenuCursos vv = new MenuCursos(colegio);
                    vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    vv.setVisible(true);
                    this.dispose();
                }
              }
            }
            
            //expulsar estudiante
            else{
                Estudiante e;
                if(curso.contieneEstudiante(jTextFieldPalabraPrin.getText())){
                        e = curso.getEstudiante(jTextFieldPalabraPrin.getText());
                        JOptionPane.showMessageDialog(this,e.toString()+"\nEstudiante Expulsado","Expulsado", JOptionPane.INFORMATION_MESSAGE);
                        curso.removerEstudiante(e);
                        curso.removerEstudiante(jTextFieldPalabraPrin.getText());
                        MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
                        vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        vv.setVisible(true);
                        this.dispose();                       
                }
                else{
                    JOptionPane.showMessageDialog(this, "Estudiante no se encuentra\nEn el sistema", "No existe", JOptionPane.INFORMATION_MESSAGE);
                }        
            }
        }        
    }
    
    
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if (evt.getSource()==jButtonEliminar){
            opcionEliminar();
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(evt.getSource()==jButtonCancelar){
            if (curso!=null){
                MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                vv.setVisible(true);
                this.dispose();
            }
            else{
                MenuCursos vv = new MenuCursos(colegio);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                vv.setVisible(true);
                this.dispose();
            }
            
            
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldPalabraPrinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPalabraPrinKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionEliminar();
        }
    }//GEN-LAST:event_jTextFieldPalabraPrinKeyPressed

    private void jTextFieldLetraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLetraKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionEliminar();
        }
    }//GEN-LAST:event_jTextFieldLetraKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldLetra;
    private javax.swing.JTextField jTextFieldPalabraPrin;
    // End of variables declaration//GEN-END:variables
}
