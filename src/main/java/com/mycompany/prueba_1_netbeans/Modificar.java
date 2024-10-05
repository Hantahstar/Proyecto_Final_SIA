/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Clase para modificar un estudiante
public class Modificar extends PadreColegio {
    //Constructor de la clase Modificar
    public Modificar(Colegio colegio,Curso curso,Estudiante estudiante) {
        super(colegio,curso,estudiante);
        initComponents();
        visual();
    }
    //Método para visualizar la interfaz gráfica y configurarla al gusto
    private void visual(){
        //Botón de cancelar
        jButtonCancelar.setBackground(new Color(150,43,69));
        jButtonCancelar.setForeground(Color.white);
        //Botón de modificar
        jButtonModificar.setBackground(new Color(150,43,69));
        jButtonModificar.setForeground(Color.white);
        //Labels
        jLabelApellido.setBackground(Color.black);
        jLabelApellido.setForeground(Color.white);

        jLabelApellidoOG.setBackground(Color.black);
        jLabelApellidoOG.setForeground(Color.white);

        jLabelNombre.setBackground(Color.black);
        jLabelNombre.setForeground(Color.white);

        jLabelNombreOG.setBackground(Color.black);
        jLabelNombreOG.setForeground(Color.white);

        jLabelRUT.setBackground(Color.black);
        jLabelRUT.setForeground(Color.white);

        jLabelTitulo.setBackground(Color.black);
        jLabelTitulo.setForeground(Color.white);

        jTextFieldApellido.setBackground(Color.lightGray);
        jTextFieldNombre.setBackground(Color.lightGray);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonModificar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelRUT = new javax.swing.JLabel();
        jLabelNombreOG = new javax.swing.JLabel();
        jLabelApellidoOG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombre.setText("Nombre:");

        jLabelApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelApellido.setText("Apellido");

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyPressed(evt);
            }
        });

        jTextFieldApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyPressed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelTitulo.setText("Modificar Estudiante");

        jLabelRUT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelRUT.setText("RUT Estudiante: "+estudiante.getRut());

        jLabelNombreOG.setText("Nombre original: "+estudiante.getNombre());

        jLabelApellidoOG.setText("Apellido original: "+estudiante.getApellido());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelRUT)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addGap(134, 134, 134)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelNombreOG)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jTextFieldNombre)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelApellidoOG)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jTextFieldApellido))))))
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jLabelRUT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabelNombreOG)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelApellidoOG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Método para modificar un estudiante
    private void opcionModificar(){
        //Si no se completan todas las casillas, se muestra un mensaje de advertencia
        if(jTextFieldNombre.getText().trim().isEmpty() || jTextFieldApellido.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                //Se modifican los datos del estudiante
                estudiante.setNombre(jTextFieldNombre.getText());
                estudiante.setApellido(jTextFieldApellido.getText());
                estudiante.toUpperCase();

                JOptionPane.showMessageDialog(this, "Estudiante modificado\nDatos cambiados:\nNombre: "+estudiante.getNombre()+"\nApellido: "+estudiante.getApellido(), "Modificado", JOptionPane.INFORMATION_MESSAGE);
                MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose();

            //En caso de que ocurra un error, se muestra un mensaje de error
            }catch (EstudianteNullPointerException e){
                JOptionPane.showMessageDialog(this, "Error al intentar modificar estudiante\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
                jTextFieldNombre.setText("");
                jTextFieldApellido.setText("");
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,"Error génerico\n"+colegio.shortStackTrace(e,10),"Error",JOptionPane.ERROR_MESSAGE);                jTextFieldNombre.setText("");
                jTextFieldNombre.setText("");
                jTextFieldApellido.setText("");
            }

        }
    }
    //Método para modificar un estudiante
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if (evt.getSource()==jButtonModificar){
            opcionModificar();
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed
    //Método para volver al menú de estudiantes
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(evt.getSource()==jButtonCancelar){
            MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setSize(this.getSize());
            vv.setLocation(this.getLocation());
            vv.setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    //Método para al presionar enter en la casilla de nombre se ejecute la opción de modificar
    private void jTextFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionModificar();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyPressed
    //Método para al presionar enter en la casilla de apellido se ejecute la opción de modificar
    private void jTextFieldApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionModificar();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyPressed
    //Actualiza los CSV de los estudiantes, cursos y asistencias
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal vv = new MenuPrincipal(colegio);
        vv.catchException(this);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelApellidoOG;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombreOG;
    private javax.swing.JLabel jLabelRUT;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
