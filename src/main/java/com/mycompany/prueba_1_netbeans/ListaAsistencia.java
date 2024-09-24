/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ListaAsistencia extends javax.swing.JFrame {
    private Colegio colegio;
    private Curso curso;
    private boolean opcion;
    private final String pathEstudiantes = "src/main/java/Estudiantes.csv";
    private final String pathCursos = "src/main/java/Cursos.csv";
    //booleano true es para buscar y false para eliminar
    public ListaAsistencia(Colegio colegio,Curso curso,boolean opcion) {
        this.colegio = colegio;
        this.curso = curso;
        this.opcion = opcion;
        initComponents();
        String s = this.colegio.mostrarAsistencia(this.curso);
        String[] arr = s.split("\n");
        DefaultTableModel model = (DefaultTableModel) jTableLista.getModel();
        model.setRowCount(0);
        for(int i=0;arr.length>i;i++){
            String[] c = arr[i].split(",");
            model.addRow(c);
        }
        jTableLista.getTableHeader().setReorderingAllowed(false);
        visual();
    }
    
    private void visual(){
        this.getContentPane().setBackground(Color.gray);
        jButtonAceptar.setBackground(Color.lightGray);
        jButtonCerrar.setBackground(Color.lightGray);
        jLabelHora.setBackground(Color.black);
        jLabelFecha.setBackground(Color.black);
        jLabelTitulo.setBackground(Color.black);
        jScrollPaneBarra.getVerticalScrollBar().setBackground(Color.black);
        jTableLista.setBackground(Color.black);
        jTableLista.setForeground(Color.darkGray);
        jTableLista.getTableHeader().setBackground(Color.darkGray);
        jTableLista.getTableHeader().setForeground(Color.white);
        jTextFieldHora.setBackground(Color.lightGray);
        jTextFieldFecha.setBackground(Color.lightGray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneBarra = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonCerrar = new javax.swing.JButton();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio");
        setPreferredSize(new java.awt.Dimension(840, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTableLista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Hora", "Presentes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLista.setAutoscrolls(false);
        jTableLista.setColumnSelectionAllowed(true);
        jTableLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaMouseClicked(evt);
            }
        });
        jScrollPaneBarra.setViewportView(jTableLista);
        jTableLista.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitulo.setText("Elegir Asistencia");

        jButtonCerrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCerrar.setText("Cancelar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

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

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFecha.setText("Fecha:");

        jLabelHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelHora.setText("Hora:");

        jButtonAceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addGap(254, 254, 254))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFecha)
                            .addComponent(jTextFieldHora))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneBarra, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha)
                    .addComponent(jButtonAceptar))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHora)
                    .addComponent(jButtonCerrar))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        if (evt.getSource()==jButtonCerrar){
            MenuAsistencia vv = new MenuAsistencia(colegio,curso);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setSize(this.getSize());
            vv.setLocation(this.getLocation());
            vv.setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_jButtonCerrarActionPerformed
    
    private void opcionAceptar(){
        if (jTextFieldFecha.getText().trim().isEmpty() || jTextFieldHora.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            else if ((jTextFieldFecha.getText().length() != 10) && ((jTextFieldFecha.getText().charAt(2))!='/'&&(jTextFieldFecha.getText().charAt(5))!='/')){
                JOptionPane.showMessageDialog(this, "Formato no válido, intente otra vez", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (jTextFieldHora.getText().charAt(2)!=':') {
                JOptionPane.showMessageDialog(this, "Formato no válido, intente otra vez", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //buscar asistencia
                if(opcion){
                    Asistencia asist = new Asistencia(jTextFieldFecha.getText(),jTextFieldHora.getText(),curso);
                    asist = colegio.verificarAsistencia(asist);
                    if(asist!=null){
                        colegio.mostrarAsistencia(asist,this);
                        MenuAsistencia vv = new MenuAsistencia(colegio,curso);
                        vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        vv.setSize(this.getSize());
                        vv.setLocation(this.getLocation());
                        vv.setVisible(true);
                        this.dispose(); 
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Asistencia no está registrada en el sistema", "No existe", JOptionPane.WARNING_MESSAGE);
                    }
                }
                
                //eliminar asistencia
                else{
                    Asistencia asist = new Asistencia(jTextFieldFecha.getText(),jTextFieldHora.getText(),curso);
                    asist = colegio.verificarAsistencia(asist);
                    if(asist!=null){
                        colegio.removerAsistencia(asist);
                        JOptionPane.showMessageDialog(this, "Asistencia de fecha: "+asist.getFecha()+"\nhora: "+asist.getHora(), "Eliminado", JOptionPane.INFORMATION_MESSAGE);
                        MenuAsistencia vv = new MenuAsistencia(colegio,curso);
                        vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        vv.setSize(this.getSize());
                        vv.setLocation(this.getLocation());
                        vv.setVisible(true);
                        this.dispose();                         
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Asistencia no está registrada en el sistema", "No existe", JOptionPane.WARNING_MESSAGE);
                    }                   
                }
            }
        
    }
    
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if(evt.getSource()==jButtonAceptar){
            opcionAceptar();
        }    
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jTextFieldFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFechaKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldFechaKeyPressed

    private void jTextFieldHoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHoraKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldHoraKeyPressed

    private void jTableListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaMouseClicked
       String fecha,hora;
        int fila = jTableLista.getSelectedRow();
        if (fila!=-1){
            fecha = (String) jTableLista.getValueAt(fila,0);
            hora = (String)jTableLista.getValueAt(fila,1);
            jTextFieldFecha.setText(fecha);
            jTextFieldHora.setText(hora);
            opcionAceptar();
        }
    }//GEN-LAST:event_jTableListaMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        colegio.actualizar(pathEstudiantes,1);
        colegio.actualizar(pathCursos,2);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPaneBarra;
    private javax.swing.JTable jTableLista;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldHora;
    // End of variables declaration//GEN-END:variables
}
