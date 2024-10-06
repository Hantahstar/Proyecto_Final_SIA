/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


//Ventana para un listado de los cursos
public class ListaCursos extends VentanaPadre {
    //Atributo de instancia
    private int opcion;
    //Constructor de la clase ListaCursos para poder elegir un curso
    public ListaCursos(Colegio colegio,int opcion) {
        super(colegio);
        this.opcion = opcion;
        initComponents();
        //Rellenar los datos del Jtable
        String s = this.colegio.mostrarCurso();
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
    //Constructor de la clase ListaCursos para el caso de que se quiera mostrar solo los cursos
    public ListaCursos(Colegio colegio){
        super(colegio);
        this.opcion = 1;
        initComponents();
        String s = this.colegio.mostrarCurso();
        String[] arr = s.split("\n");
        DefaultTableModel model = (DefaultTableModel) jTableLista.getModel();
        model.setRowCount(0);
        for(int i=0;arr.length>i;i++){
            String[] c = arr[i].split(",");
            model.addRow(c);
        }
        jTableLista.getTableHeader().setReorderingAllowed(false);
        visual();
        this.remove(jTextFieldLetra);
        this.remove(jTextFieldGrado);
        this.remove(jLabelGrado);
        this.remove(jLabelLetra);
        this.remove(jButtonAceptar);
        
    }

    //Setters y getters
    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    //Método para visualizar la interfaz gráfica y configurarla al gusto
    @Override
    public void visual(){
        //botones
        jButtonAceptar.setBackground(new Color(150,43,69));
        jButtonAceptar.setForeground(Color.white);

        jButtonCerrar.setBackground(new Color(150,43,69));
        jButtonCerrar.setForeground(Color.white);
        //labels
        jLabelLetra.setBackground(Color.black);
        jLabelLetra.setForeground(Color.white);

        jLabelGrado.setBackground(Color.black);
        jLabelGrado.setForeground(Color.white);

        jLabelTitulo.setBackground(Color.black);
        jLabelTitulo.setForeground(Color.white);
        //scroll
        jScrollPaneBarra.getVerticalScrollBar().setBackground(Color.black);
        //listas
        jTableLista.setBackground(Color.lightGray);
        jTableLista.setForeground(Color.darkGray);
        jTableLista.getTableHeader().setBackground(Color.darkGray);
        jTableLista.getTableHeader().setForeground(Color.black);
        //textFields
        jTextFieldGrado.setBackground(Color.lightGray);
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

        jScrollPaneBarra = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        String titulo;
        jLabelTitulo = new javax.swing.JLabel();
        jButtonCerrar = new javax.swing.JButton();
        jTextFieldGrado = new javax.swing.JTextField();
        jTextFieldLetra = new javax.swing.JTextField();
        jLabelGrado = new javax.swing.JLabel();
        jLabelLetra = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Colegio"); // NOI18N
        setPreferredSize(new java.awt.Dimension(840, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTableLista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grado", "Paralelo/Letra", "Cant. Estudiantes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class
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
        jTableLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableLista.setShowGrid(false);
        jTableLista.setShowHorizontalLines(true);
        jTableLista.setShowVerticalLines(true);
        jTableLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaMouseClicked(evt);
            }
        });
        jScrollPaneBarra.setViewportView(jTableLista);
        jTableLista.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        if(opcion==1){
            titulo = "Lista Cursos";
        }
        else{
            titulo = "Elegir Curso";
        }
        jLabelTitulo.setText(titulo);
        jLabelTitulo.setToolTipText("");
        jLabelTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jButtonCerrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCerrar.setText("Volver");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jTextFieldGrado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldGrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldGradoKeyPressed(evt);
            }
        });

        jTextFieldLetra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLetraKeyPressed(evt);
            }
        });

        jLabelGrado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelGrado.setText("Grado: ");

        jLabelLetra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelLetra.setText("Paralelo/Letra:");

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
                    .addComponent(jScrollPaneBarra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelGrado)
                                    .addComponent(jLabelLetra))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLetra, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jTextFieldGrado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAceptar, jButtonCerrar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPaneBarra, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGrado)
                    .addComponent(jButtonAceptar))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLetra)
                    .addComponent(jButtonCerrar))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAceptar, jButtonCerrar});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Método para volver al menú de cursos o al menú principal
    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        if (evt.getSource()==jButtonCerrar){
            if(opcion==1){
                MenuCursos vv = new MenuCursos(colegio);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose(); 
                
            }
            else{
                MenuPrincipal vv = new MenuPrincipal(colegio);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setSize(this.getSize());
                vv.setLocation(this.getLocation());
                vv.setVisible(true);
                this.dispose(); 
            }
            
        }
    }//GEN-LAST:event_jButtonCerrarActionPerformed
    //Método para aceptar la elección de un curso
    private void opcionAceptar(){
        if (jTextFieldGrado.getText().trim().isEmpty() || jTextFieldLetra.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe de completar todas las casillas", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    Curso c = new Curso(jTextFieldGrado.getText(),jTextFieldLetra.getText());
                    if (colegio.verificarCurso(c)==null){
                        JOptionPane.showMessageDialog(this, "El curso que eligió no existe", "No existe", JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        //Dependiendo de la opción se abrirá una ventana u otra con el curso seleccionado
                        if(opcion==2){
                            MenuEstudiantes vv = new MenuEstudiantes(colegio,colegio.verificarCurso(c));
                            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            vv.setSize(this.getSize());
                            vv.setLocation(this.getLocation());
                            vv.setVisible(true);
                            this.dispose();
                        }
                        else if(opcion==3){
                            if(colegio.verificarCurso(c).sizeCurso()!=0){
                                //Si el curso tiene estudiantes se abrirá la ventana de asistencia
                                MenuAsistencia vv = new MenuAsistencia(colegio,colegio.verificarCurso(c));
                                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                vv.setSize(this.getSize());
                                vv.setLocation(this.getLocation());
                                vv.setVisible(true);
                                this.dispose();
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "El curso que eligió no tiene estudiantes", "No se puede", JOptionPane.WARNING_MESSAGE);
                            }
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
                //catchers de excepciones
                }catch(CursoNullPointerException e){
                    JOptionPane.showMessageDialog(this, "Error al crear al seleccionar el curso\nError: "+e.getMessage()+"\n"+colegio.shortStackTrace(e,10), "Error", JOptionPane.ERROR_MESSAGE);
                    jTextFieldGrado.setText("");
                    jTextFieldLetra.setText("");
                }catch (Exception e){
                    JOptionPane.showMessageDialog(this,"Error génerico\n"+colegio.shortStackTrace(e,10),"Error",JOptionPane.ERROR_MESSAGE);
                    jTextFieldGrado.setText("");
                    jTextFieldLetra.setText("");
                }

            }
    }
    //Método para aceptar la elección de un curso al presionar el botón aceptar
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if(evt.getSource()==jButtonAceptar){
            opcionAceptar();
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed
    //Método para aceptar la elección de un curso al presionar la tecla enter
    private void jTextFieldGradoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGradoKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldGradoKeyPressed
    //Método para aceptar la elección de un curso al presionar la tecla enter
    private void jTextFieldLetraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLetraKeyPressed
        int keycode = evt.getKeyCode();
        if (keycode==10){
            opcionAceptar();
        }
    }//GEN-LAST:event_jTextFieldLetraKeyPressed
    //Método para aceptar la elección de un curso al hacer click en la tabla de cursos
    private void jTableListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaMouseClicked
        if(opcion!=1){
            String grado,letra;
            int fila = jTableLista.getSelectedRow();
            if (fila!=-1){
                grado = (String) jTableLista.getValueAt(fila,0);
                letra = (String)jTableLista.getValueAt(fila,1);
                jTextFieldGrado.setText(grado);
                jTextFieldLetra.setText(letra);
                opcionAceptar();
            }
        }
    }//GEN-LAST:event_jTableListaMouseClicked
    //Al cerrar la ventana se actualizarán todos los CSV
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal vv = new MenuPrincipal(colegio);
        vv.catchException(this);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JLabel jLabelGrado;
    private javax.swing.JLabel jLabelLetra;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPaneBarra;
    private javax.swing.JTable jTableLista;
    private javax.swing.JTextField jTextFieldGrado;
    private javax.swing.JTextField jTextFieldLetra;
    // End of variables declaration//GEN-END:variables
}
