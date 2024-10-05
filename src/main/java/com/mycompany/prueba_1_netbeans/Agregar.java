/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Clase ventana Agregar, funciona para agregar cursos y estudiantes
public class Agregar extends PadreColegio {
    //Contructor para agregar curso
    public Agregar(Colegio colegio) {
        super(colegio);
        initComponents();
        visual();
        this.remove(jLabelApellido);
        this.remove(jTextFieldApellido);
    }
    //Constructor para agregar estudiante
    public Agregar(Colegio colegio,Curso curso){
        super(colegio,curso);
        initComponents();
        visual();
    }
    //método para tener a mano las configuraciones de las visuales
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
        String titulo,labelTextFieldGradoOrRut,labelTextFieldLetraOrNombre;
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
            labelTextFieldGradoOrRut = "Grado de curso:";
        }
        else{
            labelTextFieldGradoOrRut = "Rut:";
        }
        jLabelGradoOrRUT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelGradoOrRUT.setText(labelTextFieldGradoOrRut);

        jLabelLetraOrNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        if (curso==null){
            labelTextFieldLetraOrNombre = "Paralelo/letra:";
        }
        else{
            labelTextFieldLetraOrNombre = "Nombre:";
        }
        jLabelLetraOrNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelLetraOrNombre.setText(labelTextFieldLetraOrNombre);

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


    //Acción que se realiza al presionar el botón "cancelar" depende de si en el constructor se pasó un objeto de Curso o no
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(evt.getSource()==jButtonCancelar){
            if (curso==null){
                //Regresa al menú de cursos
                MenuCursos vv = new MenuCursos(colegio);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose(); 
            }
            else{
                //Regresa al menú de estudiantes
                MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose(); 
            }
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    //Evento que se activa al cliquear el botón "aceptar"
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if (evt.getSource()==jButtonAceptar){
            opcionAceptar();
        }    
    }//GEN-LAST:event_jButtonAceptarActionPerformed
    //Evento que sucede al presionar la tecla enter
    private void jTextFieldGradoOrRUTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGradoOrRUTKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldGradoOrRUTKeyPressed
    //Evento al presionar la tecla enter
    private void jTextFieldLetraOrNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLetraOrNombreKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldLetraOrNombreKeyPressed
    //Evento al presionar la tecla enter
    private void jTextFieldApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyPressed
       int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyPressed
    //Al cerrar la ventana se actualizan los CSV
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal vv = new MenuPrincipal(colegio);
        vv.catchException(this);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    //Método cuando la clase Agregar en su constructor no pasa un objeto tipo Curso
    private void agregarCurso(){
        try{
            Curso c = new Curso(jTextFieldGradoOrRUT.getText(),jTextFieldLetraOrNombre.getText());
            if (colegio.verificarCurso(c)==null){
                if (c.formatoCorrecto()){
                    colegio.agregarCurso(c,ruta.getPathCursos());
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


    //Método para agregar estudiantes
    private void agregarEstudiante(){
        try{
            Estudiante e = new Estudiante(jTextFieldLetraOrNombre.getText(),jTextFieldApellido.getText(),jTextFieldGradoOrRUT.getText());
            e.toUpperCase();
            e.setRut(curso.verificarRut(e.getRut()));
            if(colegio.verificarEstudiante(e.getRut())){
                //Caso donde estudiante que se quiere agregar ya se haya añadido con anterioridad
                JOptionPane.showMessageDialog(this, "Estudiante ya registrado en el sistema", "Existe", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //Agrega automáticamente al CSV de estudiante en el caso de no estar registrado en el sistema, además de la colección en si
                curso.agregarEstudiante(jTextFieldGradoOrRUT.getText(),e);
                curso.agregarEstudiante(e,ruta.getPathEstudiantes());
                JOptionPane.showMessageDialog(this, "Estudiante agregado", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose();
            }
        //catchers de excepciones
        }catch(EstudianteNullPointerException e){
            JOptionPane.showMessageDialog(this, "Error al crear al estudiante\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldGradoOrRUT.setText("");
            jTextFieldLetraOrNombre.setText("");
            jTextFieldApellido.setText("");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Error génerico","Error",JOptionPane.ERROR_MESSAGE);
            jTextFieldGradoOrRUT.setText("");
            jTextFieldLetraOrNombre.setText("");
            jTextFieldApellido.setText("");
        }
    }

    //Método utilizado por varios eventos para poder ingresar los datos al querer agregar, llama a los dos métodos de agregar dependiendo el caso
    private void opcionAceptar(){
        if (jTextFieldGradoOrRUT.getText().trim().isEmpty() || jTextFieldLetraOrNombre.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //agregar curso, si no se pasa la instancia de un curso en el constructor entonces se pasa a la versión de agregar del curso
            if(curso==null){
                agregarCurso();
            }

            //agregar estudiantes
            else{
                agregarEstudiante();
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
