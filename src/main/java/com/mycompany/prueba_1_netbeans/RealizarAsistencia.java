/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class RealizarAsistencia extends javax.swing.JFrame {
    private Colegio colegio;
    private Curso curso;
    public RealizarAsistencia(Colegio colegio,Curso curso) {
        this.colegio = colegio;
        this.curso = curso;
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

        jLabelFecha = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jTextFieldA1 = new javax.swing.JTextField();
        jTextFieldB2 = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(840, 460));

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFecha.setText("Fecha asistencia:");
        jLabelFecha.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelHora.setText("Hora asistencia:");
        jLabelHora.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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
        jLabel4.setText("Realizar Asistencia");

        jLabel1.setText("(formato DD/MM/AAAA ej: 21/07/2004)");

        jLabel2.setText("(formato HH:MM ej: 22:30)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButtonAceptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelHora)
                                    .addComponent(jLabelFecha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldA1)
                                .addGap(11, 11, 11))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldB2)
                                .addGap(11, 11, 11)))))
                .addGap(33, 33, 33))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAceptar, jButtonCancelar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha)
                    .addComponent(jTextFieldA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHora)
                    .addComponent(jTextFieldB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    private void opcionAceptar(){
        //realizar asistencia
            if (jTextFieldA1.getText().trim().isEmpty() || jTextFieldB2.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            if ((jTextFieldA1.getText().length() != 10) && ((jTextFieldA1.getText().charAt(2))!='/'&&(jTextFieldA1.getText().charAt(5))!='/')){
                JOptionPane.showMessageDialog(this, "Formato no válido, intente otra vez", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (jTextFieldB2.getText().charAt(2)!=':') {
                JOptionPane.showMessageDialog(this, "Formato no válido, intente otra vez", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
            
            else{
                //crear copia  del curso
                //aun sin hacer
                Asistencia asist = new Asistencia(jTextFieldA1.getText(),jTextFieldB2.getText(),new Curso(curso));
                if(colegio.verificarAsistencia(asist)!=null){
                    JOptionPane.showMessageDialog(this, "Asistencia ya existe en el sistema", "Existe", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    if(asist.pasaAsistencia(curso,asist,this)){
                        colegio.agregarAsistencia(asist);
                        JOptionPane.showMessageDialog(this,"Asistencia fecha : "+asist.getFecha()+"\nhora: "+asist.getHora(), "Existe", JOptionPane.INFORMATION_MESSAGE);
                        MenuAsistencia vv = new MenuAsistencia(colegio,curso);
                        vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        vv.setAlwaysOnTop(true);
                        vv.setVisible(true);
                        this.dispose(); 
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Pase de asistencia cancelado", "Cancelado", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
            
    }
    
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if (evt.getSource()==jButtonAceptar){
            opcionAceptar();
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(evt.getSource()==jButtonCancelar){
            MenuAsistencia vv = new MenuAsistencia(colegio,curso);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setAlwaysOnTop(true);
            vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
            vv.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JTextField jTextFieldA1;
    private javax.swing.JTextField jTextFieldB2;
    // End of variables declaration//GEN-END:variables
}
