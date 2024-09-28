/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
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
    private final String pathEstudiantes = "src/main/java/Estudiantes.csv";
    private final String pathCursos = "src/main/java/Cursos.csv";
    private final String pathAsistencia = "src/main/java/Asistencia.csv";
    //agregar curso
    public Agregar(Colegio colegio) {
        this.colegio = colegio;
        initComponents();
        visual();
        this.remove(jLabelApellido);
        this.remove(jTextFieldApellido);
    }
    //agregar estudiante
    public Agregar(Colegio colegio,Curso curso){
        this.colegio = colegio;
        this.curso = curso;
        initComponents();
        visual();
    }
    
    private void visual(){
        this.getContentPane().setBackground(Color.gray);
        jButtonAceptar.setBackground(Color.lightGray);
        jButtonCancelar.setBackground(Color.lightGray);
        jLabelApellido.setBackground(Color.black);
        jLabelGradoOrRUT.setBackground(Color.black);
        jLabelLetraOrNombre.setBackground(Color.black);
        jLabelTitulo.setBackground(Color.black);
        jTextFieldApellido.setBackground(Color.lightGray);
        jTextFieldGradoOrRUT.setBackground(Color.lightGray);
        jTextFieldLetraOrNombre.setBackground(Color.lightGray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelGradoOrRUT = new javax.swing.JLabel();
        jLabelLetraOrNombre = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldGradoOrRUT = new javax.swing.JTextField();
        jTextFieldLetraOrNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio");
        setPreferredSize(new java.awt.Dimension(840, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelGradoOrRUT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        if(curso==null){
            text1 = "Grado de curso:";
        }
        else{
            text1 = "Rut:";
        }
        jLabelGradoOrRUT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelGradoOrRUT.setText(text1);

        jLabelLetraOrNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        if (curso==null){
            text2 = "Paralelo/letra:";
        }
        else{
            text2 = "Nombre:";
        }
        jLabelLetraOrNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelLetraOrNombre.setText(text2);

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

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        if (curso==null){
            titulo = "Curso";
        }
        else{
            titulo = "Estudiante";
        }
        jLabelTitulo.setText("Agregar "+titulo);

        jLabelApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelApellido.setText("Apellido:");

        jTextFieldGradoOrRUT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldGradoOrRUT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldGradoOrRUTKeyPressed(evt);
            }
        });

        jTextFieldLetraOrNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldLetraOrNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLetraOrNombreKeyPressed(evt);
            }
        });

        jTextFieldApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyPressed(evt);
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
                            .addComponent(jLabelLetraOrNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelGradoOrRUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldGradoOrRUT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldLetraOrNombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGradoOrRUT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGradoOrRUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLetraOrNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLetraOrNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
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
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose(); 
            }
            else{
                MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
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

    private void jTextFieldGradoOrRUTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGradoOrRUTKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldGradoOrRUTKeyPressed

    private void jTextFieldLetraOrNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLetraOrNombreKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldLetraOrNombreKeyPressed

    private void jTextFieldApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyPressed
       int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        colegio.actualizar(pathEstudiantes,1);
        colegio.actualizar(pathCursos,2);
        colegio.actualizar(pathAsistencia,3);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void opcionAceptar(){
        if (jTextFieldGradoOrRUT.getText().trim().isEmpty() || jTextFieldLetraOrNombre.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //agregar curso, si no se pasa la instancia de un curso en el constructor entonces se pasa a la versión de agregar del curso
            if(curso==null){
                try{
                    Curso c = new Curso(jTextFieldGradoOrRUT.getText(),jTextFieldLetraOrNombre.getText());
                    if (colegio.verificarCurso(c)==null){
                        if (c.formatoCorrecto()){
                            colegio.agregarCurso(c,pathCursos);
                            JOptionPane.showMessageDialog(this, "Curso agregado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                            MenuCursos vv = new MenuCursos(colegio);
                            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            vv.setSize(this.getSize());
                            vv.setLocation(this.getLocation());
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
                }catch (CursoNullPointerException e){
                    //muestra el StackTrace de la excepción causada
                    JOptionPane.showMessageDialog(this, "Error al crear el curso\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
                    jTextFieldGradoOrRUT.setText("");
                    jTextFieldLetraOrNombre.setText("");
                }catch (Exception e){
                    JOptionPane.showMessageDialog(this,"Error génerico\n"+colegio.shortStackTrace(e,10),"Error",JOptionPane.ERROR_MESSAGE);
                    jTextFieldGradoOrRUT.setText("");
                    jTextFieldLetraOrNombre.setText("");
                }

            
            }

            //agregar estudiantes
            else{
                try{
                    Estudiante e = new Estudiante(jTextFieldLetraOrNombre.getText(),jTextFieldApellido.getText(),jTextFieldGradoOrRUT.getText());
                    e.toUpperCase();
                    e.setRut(curso.verificarRut(e.getRut()));
                    if(colegio.verificarEstudiante(e.getRut())){
                        JOptionPane.showMessageDialog(this, "Estudiante ya registrado en el sistema", "Existe", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        curso.agregarEstudiante(jTextFieldGradoOrRUT.getText(),e);
                        curso.agregarEstudiante(e,pathEstudiantes);
                        JOptionPane.showMessageDialog(this, "Estudiante agregado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                        MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
                        vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        vv.setSize(this.getSize());
                        vv.setLocation(this.getLocation());
                        vv.setVisible(true);
                        this.dispose();
                    }
                }catch(EstudianteNullPointerException e){
                    JOptionPane.showMessageDialog(this, "Error al crear al estudiante\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
                    jTextFieldGradoOrRUT.setText("");
                    jTextFieldLetraOrNombre.setText("");
                    jTextFieldApellido.setText("");
                }catch (Exception e){
                    JOptionPane.showMessageDialog(this,"Error génerico","Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        }    
    }     
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelGradoOrRUT;
    private javax.swing.JLabel jLabelLetraOrNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldGradoOrRUT;
    private javax.swing.JTextField jTextFieldLetraOrNombre;
    // End of variables declaration//GEN-END:variables
}
