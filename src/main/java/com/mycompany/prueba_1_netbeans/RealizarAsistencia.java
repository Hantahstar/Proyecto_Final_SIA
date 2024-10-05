/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//Ventana para registrar asistencia
public class RealizarAsistencia extends VentanaPadre {
    //Atributo de instancia
    public RealizarAsistencia(Colegio colegio,Curso curso) {
        super(colegio,curso);
        initComponents();
        visual();
    }

    //Para tener a mano las configuraciones visuales de la ventana
    private void visual(){
        //Botón de aceptar
        jButtonAceptar.setBackground(new Color(150,43,69));
        jButtonAceptar.setForeground(Color.white);
        //Botón de cancelar
        jButtonCancelar.setBackground(new Color(150,43,69));
        jButtonCancelar.setForeground(Color.white);
        //Labels
        jLabelFecha.setBackground(Color.black);
        jLabelFecha.setForeground(Color.white);

        jLabelFormatoFecha.setBackground(Color.black);
        jLabelFormatoFecha.setForeground(Color.white);

        jLabelFormatoHora.setBackground(Color.black);
        jLabelFormatoHora.setForeground(Color.white);

        jLabelHora.setBackground(Color.black);
        jLabelHora.setForeground(Color.white);

        jLabelTitulo.setBackground(Color.black);
        jLabelTitulo.setForeground(Color.white);

        jTextFieldFecha.setBackground(Color.lightGray);
        jTextFieldHora.setBackground(Color.lightGray);
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
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFormatoFecha = new javax.swing.JLabel();
        jLabelFormatoHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFecha.setText("Fecha asistencia:");
        jLabelFecha.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelHora.setText("Hora asistencia:");
        jLabelHora.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTextFieldFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFechaKeyPressed(evt);
            }
        });

        jTextFieldHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldHoraKeyPressed(evt);
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

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelTitulo.setText("Realizar Asistencia");

        jLabelFormatoFecha.setText("(formato DD/MM/AAAA ej: 21/07/2004)");

        jLabelFormatoHora.setText("(formato HH:MM ej: 22:30)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTitulo))
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
                                .addComponent(jTextFieldFecha)
                                .addGap(11, 11, 11))
                            .addComponent(jLabelFormatoFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFormatoHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldHora)
                                .addGap(11, 11, 11)))))
                .addGap(33, 33, 33))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAceptar, jButtonCancelar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFormatoFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHora)
                    .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabelFormatoHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    //Al presionar el botón enter o clickear en el botón de aceptar llama este método
    private void opcionAceptar(){
        //realizar asistencia
        //verifica que ambos TextField tengan algo
        if (jTextFieldFecha.getText().trim().isEmpty() || jTextFieldHora.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        //verificar el formato esté correcto
        if ((jTextFieldFecha.getText().length() != 10) && ((jTextFieldFecha.getText().charAt(2))!='/'&&(jTextFieldFecha.getText().charAt(5))!='/')){
            JOptionPane.showMessageDialog(this, "Formato no válido, intente otra vez", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (jTextFieldHora.getText().charAt(2)!=':') {
            JOptionPane.showMessageDialog(this, "Formato no válido, intente otra vez", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
        //una vez ya esté verificado
        else{
            //crear copia  del curso y objeto de asistencia
            try{
                Asistencia asist = new Asistencia(jTextFieldFecha.getText(),jTextFieldHora.getText(),new Curso(curso));
                if(colegio.verificarAsistencia(asist)!=null){
                    JOptionPane.showMessageDialog(this, "Asistencia ya existe en el sistema", "Existe", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    //pasa la asistencia
                    if(asist.pasaAsistencia(curso,asist,this)){
                        colegio.agregarAsistencia(asist);
                        JOptionPane.showMessageDialog(this,"Asistencia fecha : "+asist.getFecha()+"\nhora: "+asist.getHora(), "Existe", JOptionPane.INFORMATION_MESSAGE);
                        MenuAsistencia vv = new MenuAsistencia(colegio,curso);
                        vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        vv.setSize(this.getSize());
                        vv.setLocation(this.getLocation());
                        vv.setVisible(true);
                        this.dispose();
                    }
                    //esto en el caso que se cancele y retorne false
                    else{
                        JOptionPane.showMessageDialog(this,"Pase de asistencia cancelado", "Cancelado", JOptionPane.WARNING_MESSAGE);
                    }
                }
            //catchers para tomar excepciones
            }catch (AsistenciaNullPointerException e){
                JOptionPane.showMessageDialog(this, "Error al realizar la asistencia\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
                jTextFieldFecha.setText("");
                jTextFieldHora.setText("");
            }catch (Exception e){
                JOptionPane.showMessageDialog(this,"Error génerico\n"+colegio.shortStackTrace(e,10),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    //Evento de botón "aceptar" de la ventana
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if (evt.getSource()==jButtonAceptar){
            opcionAceptar();
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    //Evento de botón "eliminar" de la ventana
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if(evt.getSource()==jButtonCancelar){
            MenuAsistencia vv = new MenuAsistencia(colegio,curso);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setSize(this.getSize());
            vv.setLocation(this.getLocation());
            vv.setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    //Evento al presionar el botón enter
    private void jTextFieldFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFechaKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldFechaKeyPressed

    //Evento al presionar enter
    private void jTextFieldHoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHoraKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldHoraKeyPressed

    //El CSV se actualiza por completo al cerrarse en cualquiera de las ventanas
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal vv = new MenuPrincipal(colegio);
        vv.catchException(this);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFormatoFecha;
    private javax.swing.JLabel jLabelFormatoHora;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldHora;
    // End of variables declaration//GEN-END:variables
}
