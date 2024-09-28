/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class Buscar extends javax.swing.JFrame {

    private Colegio colegio;
    private Curso curso;
    private String titulo;
    private String label;
    private boolean opcion;
    private final String pathEstudiantes = "src/main/java/Estudiantes.csv";
    private final String pathCursos = "src/main/java/Cursos.csv";
    private final String pathAsistencia = "src/main/java/Asistencia.csv";
    //buscar curso
    public Buscar(Colegio colegio) {
        this.colegio = colegio;
        initComponents();
        visual();
    }
    //buscar estudiantes
    public Buscar(Colegio colegio,Curso curso,boolean opcion){
        this.colegio = colegio;
        this.curso = curso;
        this.opcion = opcion;
        initComponents();
        visual();
        this.remove(jTextFieldLetra);
        this.remove(jLabelLetra);
    }

    private void visual(){
        this.getContentPane().setBackground(Color.gray);
        jButtonBuscar.setBackground(Color.lightGray);
        jButtonCancelar.setBackground(Color.lightGray);
        jLabelGradoOrRUT.setBackground(Color.black);
        jLabelLetra.setBackground(Color.black);
        jLabelTitulo.setBackground(Color.black);
        jTextFieldGradoOrRUT.setBackground(Color.lightGray);
        jTextFieldLetra.setBackground(Color.lightGray);
    }

    public boolean isOpcion() {
        return opcion;
    }

    public void setOpcion(boolean opcion) {
        this.opcion = opcion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBuscar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelGradoOrRUT = new javax.swing.JLabel();
        jLabelLetra = new javax.swing.JLabel();
        jTextFieldGradoOrRUT = new javax.swing.JTextField();
        jTextFieldLetra = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio");
        setPreferredSize(new java.awt.Dimension(840, 460));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelGradoOrRUT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        if(curso==null){
            label = "Grado de curso:";
        }
        else{
            label = "Rut de estudiante";
        }
        jLabelGradoOrRUT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelGradoOrRUT.setText(label);

        jLabelLetra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelLetra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelLetra.setText("Paralelo/letra:");

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

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        if(curso==null){
            titulo = "Curso";
        }
        else{
            titulo = "Estudiante";
        }
        jLabelTitulo.setText("Buscar "+titulo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(134, 134, 134)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelGradoOrRUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelLetra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jTextFieldLetra))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jTextFieldGradoOrRUT)))))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGradoOrRUT)
                    .addComponent(jTextFieldGradoOrRUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLetra))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldGradoOrRUT, jTextFieldLetra});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void opcionBuscar(){
        if (jTextFieldGradoOrRUT.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(curso==null){
                //las dos casillas de buscar curso deben de estar con texto
                if (jTextFieldGradoOrRUT.getText().trim().isEmpty() || jTextFieldLetra.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    try{
                        Curso c = new Curso(jTextFieldGradoOrRUT.getText(),jTextFieldLetra.getText());
                        c = colegio.verificarCurso(c);
                        if (c==null){
                            JOptionPane.showMessageDialog(this, "Curso no se encuentra en el sistema", "No existe", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            //mostrarCurso
                            JOptionPane.showMessageDialog(this,(colegio.mostrarCurso(c)),"Encontrado", JOptionPane.INFORMATION_MESSAGE);
                            MenuCursos vv = new MenuCursos(colegio);
                            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            vv.setSize(this.getSize());
                            vv.setLocation(this.getLocation());
                            vv.setVisible(true);
                            this.dispose();
                        }
                    }catch (CursoNullPointerException e){
                        JOptionPane.showMessageDialog(this, "Error al buscar el curso\nError: Algunos atributos del curso son nulos"+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
                        jTextFieldGradoOrRUT.setText("");
                        jTextFieldLetra.setText("");
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(this,"Error génerico\n"+colegio.shortStackTrace(e,10),"Error",JOptionPane.ERROR_MESSAGE);                        jTextFieldGradoOrRUT.setText("");
                        jTextFieldGradoOrRUT.setText("");
                        jTextFieldLetra.setText("");
                    }

                }    
            }
            else{
                try{
                    Estudiante e = new Estudiante();
                    jTextFieldGradoOrRUT.setText(curso.verificarRut(jTextFieldGradoOrRUT.getText()));
                    e.setRut(jTextFieldGradoOrRUT.getText());
                    if(curso.contieneEstudiante(jTextFieldGradoOrRUT.getText())){
                        e = curso.getEstudiante(jTextFieldGradoOrRUT.getText());
                        JOptionPane.showMessageDialog(this,"RUT: "+e.getRut()+"\nNombre: "+e.getNombre()+"\nApellido: "+e.getApellido()+"\nEstudiante Encontrado","Encontrado", JOptionPane.INFORMATION_MESSAGE);
                        if(isOpcion()){
                            MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
                            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            vv.setSize(this.getSize());
                            vv.setLocation(this.getLocation());
                            vv.setVisible(true);
                            this.dispose();
                        }
                        else{
                            //Ventana a modificar
                            Modificar vv = new  Modificar(colegio,curso,e);
                            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            vv.setSize(this.getSize());
                            vv.setLocation(this.getLocation());
                            vv.setVisible(true);
                            this.dispose();
                        }

                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Estudiante no se encuentra en el sistema", "No existe", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch (EstudianteNullPointerException e){
                    JOptionPane.showMessageDialog(this, "Error al buscar el estudiante\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
                    jTextFieldGradoOrRUT.setText("");
                    jTextFieldLetra.setText("");
                }catch (Exception e){
                    JOptionPane.showMessageDialog(this,"Error génerico\n"+colegio.shortStackTrace(e,10),"Error",JOptionPane.ERROR_MESSAGE);
                    jTextFieldGradoOrRUT.setText("");
                }

            }   
        }
    }
    
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (evt.getSource()==jButtonBuscar){
            opcionBuscar();   
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(evt.getSource()==jButtonCancelar){
            if(curso==null){
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

    private void jTextFieldGradoOrRUTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGradoOrRUTKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionBuscar();
        }
    }//GEN-LAST:event_jTextFieldGradoOrRUTKeyPressed

    private void jTextFieldLetraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLetraKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionBuscar();
        }
    }//GEN-LAST:event_jTextFieldLetraKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        colegio.actualizar(pathEstudiantes,1);
        colegio.actualizar(pathCursos,2);
        colegio.actualizar(pathAsistencia,3);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelGradoOrRUT;
    private javax.swing.JLabel jLabelLetra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldGradoOrRUT;
    private javax.swing.JTextField jTextFieldLetra;
    // End of variables declaration//GEN-END:variables
}
