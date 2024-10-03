/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Eliminar extends javax.swing.JFrame {

    private Colegio colegio;
    private Curso curso;
    public Eliminar(Colegio colegio){
        this.colegio = colegio;
        initComponents();
        visual();
    }
    //eliminar para estudiantes
    public Eliminar(Colegio colegio,Curso curso){
        this.colegio = colegio;
        this.curso = curso;
        initComponents();
        visual();
        this.remove(jLabelLetra);
        this.remove(jTextFieldLetra);
    }
    
    private void visual(){
        this.getContentPane().setBackground(Color.gray);
        jButtonCancelar.setBackground(Color.lightGray);
        jButtonEliminar.setBackground(Color.lightGray);
        jLabelGradoOrRUT.setBackground(Color.black);
        jLabelLetra.setBackground(Color.black);
        jLabelTitulo.setBackground(Color.black);
        jTextFieldGradoOrRUT.setBackground(Color.lightGray);
        jTextFieldLetra.setBackground(Color.lightGray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        String titulo,labelTextFieldGradoOrRut;
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelGradoOrRUT = new javax.swing.JLabel();
        jLabelLetra = new javax.swing.JLabel();
        jTextFieldGradoOrRUT = new javax.swing.JTextField();
        jTextFieldLetra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio");
        setPreferredSize(new java.awt.Dimension(840, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        if (curso==null){
            titulo = "Curso";
        }
        else{
            titulo = "Estudiante";
        }
        jLabelTitulo.setText("Eliminar "+titulo);

        jLabelGradoOrRUT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        if (curso==null){
            labelTextFieldGradoOrRut = "Grado de curso:";
        }
        else{
            labelTextFieldGradoOrRut = "Rut de estudiante";
        }
        jLabelGradoOrRUT.setText(labelTextFieldGradoOrRut);
        jLabelGradoOrRUT.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelLetra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelLetra.setText("Paralelo/Letra:");
        jLabelLetra.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTextFieldGradoOrRUT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldGradoOrRUT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldGradoOrRUTKeyPressed(evt);
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
                    .addComponent(jLabelTitulo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                            .addComponent(jButtonCancelar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelLetra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelGradoOrRUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldLetra)
                                .addComponent(jTextFieldGradoOrRUT)))))
                .addGap(39, 39, 39))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCancelar, jButtonEliminar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGradoOrRUT)
                    .addComponent(jTextFieldGradoOrRUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLetra)
                    .addComponent(jTextFieldLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void eliminarCurso(){
        try{
            Curso c = new Curso(jTextFieldGradoOrRUT.getText(),jTextFieldLetra.getText());
            if (colegio.verificarCurso(c)==null){
                JOptionPane.showMessageDialog(this, "Curso no se encuentra en el sistema", "No existe", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //Eliminar Curso
                JOptionPane.showMessageDialog(this,colegio.mostrarCurso(c)+"\nCurso Eliminado","Eliminado", JOptionPane.INFORMATION_MESSAGE);
                colegio.removerCurso(colegio.verificarCurso(c));

                MenuCursos vv = new MenuCursos(colegio);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose();
            }
        }catch (CursoNullPointerException e){
            //mensaje de exception
            JOptionPane.showMessageDialog(this, "Error al intentar eliminar el curso\nError: Algunos atributos del curso son nulos"+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldGradoOrRUT.setText("");
            jTextFieldLetra.setText("");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Error génerico\n"+colegio.shortStackTrace(e,10),"Error",JOptionPane.ERROR_MESSAGE);
            jTextFieldGradoOrRUT.setText("");
            jTextFieldLetra.setText("");
        }
    }

    private void eliminarEstudiante(){
        try{
            Estudiante e = new Estudiante();
            jTextFieldGradoOrRUT.setText(curso.verificarRut(jTextFieldGradoOrRUT.getText()));
            e.setRut(jTextFieldGradoOrRUT.getText());
            if(curso.contieneEstudiante(jTextFieldGradoOrRUT.getText())){
                e = curso.getEstudiante(jTextFieldGradoOrRUT.getText());
                JOptionPane.showMessageDialog(this,"Nombre: "+e.getNombre()+"\nApellido: "+e.getApellido()+"\nRUT: "+e.getRut()+"\nEstudiante Expulsado","Expulsado", JOptionPane.INFORMATION_MESSAGE);
                curso.removerEstudiante(e);
                curso.removerEstudiante(jTextFieldGradoOrRUT.getText());

                MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Estudiante no se encuentra\nEn el sistema", "No existe", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(EstudianteNullPointerException e){
            JOptionPane.showMessageDialog(this, "Error al intentar eliminar estudiante\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldGradoOrRUT.setText("");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Error génerico\n"+colegio.shortStackTrace(e,10),"Error",JOptionPane.ERROR_MESSAGE);
            jTextFieldGradoOrRUT.setText("");
        }
    }
    
    private void opcionEliminar(){
        if (jTextFieldGradoOrRUT.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(curso==null){
                if (jTextFieldGradoOrRUT.getText().trim().isEmpty()||jTextFieldLetra.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    eliminarCurso();
                }
            }    
            //expulsar estudiante
            else{
                eliminarEstudiante();
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
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose(); 
            }
            else{
                MenuCursos vv = new MenuCursos(colegio);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose(); 
            }
            
            
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldGradoOrRUTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGradoOrRUTKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionEliminar();
        }
    }//GEN-LAST:event_jTextFieldGradoOrRUTKeyPressed

    private void jTextFieldLetraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLetraKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionEliminar();
        }
    }//GEN-LAST:event_jTextFieldLetraKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal vv = new MenuPrincipal(colegio);
        vv.catchException(this);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabelGradoOrRUT;
    private javax.swing.JLabel jLabelLetra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldGradoOrRUT;
    private javax.swing.JTextField jTextFieldLetra;
    // End of variables declaration//GEN-END:variables
}
