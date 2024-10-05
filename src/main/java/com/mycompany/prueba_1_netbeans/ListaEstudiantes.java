/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

//Clase para mostrar la lista de estudiantes de un curso
public class ListaEstudiantes extends PadreColegio {
    //Constructor de la clase ListaEstudiantes
    public ListaEstudiantes(Colegio colegio,Curso curso) {
        super(colegio,curso);
        initComponents();
        //Mostrar la lista de estudiantes en la tabla
        int i;
        String s = this.curso.mostrarEstudiante();
        String[] arr = s.split("\n");
        DefaultTableModel model = (DefaultTableModel) jTableLista.getModel();
        model.setRowCount(0);
        for(i=0;curso.sizeCurso()>i;i++){
            String[] c = arr[i].split(",");
            model.addRow(c);
        }
        jTableLista.getTableHeader().setReorderingAllowed(false);
        visual();
    }
    //Método para visualizar la interfaz gráfica y configurarla al gusto
    private void visual(){
        //panel
        this.getContentPane().setBackground(Color.gray);
        //boton
        jButtonCerrar.setBackground(new Color(150,43,69));
        jButtonCerrar.setForeground(Color.white);
        //labels
        jLabelCurso.setBackground(Color.black);
        jLabelCurso.setForeground(Color.white);

        jLabelTitulo.setBackground(Color.black);
        jLabelTitulo.setForeground(Color.white);

        //scroll
        jScrollPaneBarra.getVerticalScrollBar().setBackground(Color.black);
        //listas
        jTableLista.setBackground(Color.lightGray);
        jTableLista.setForeground(Color.darkGray);
        jTableLista.getTableHeader().setBackground(Color.darkGray);
        jTableLista.getTableHeader().setForeground(Color.white);
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
        jButtonCerrar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
                "Rut", "Nombre", "Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPaneBarra.setViewportView(jTableLista);
        jTableLista.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButtonCerrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCerrar.setText("Volver");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setText("Lista de estudiantes");

        jLabelCurso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelCurso.setText(curso.getGrado()+" "+curso.getLetra());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneBarra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(230, 230, 230)
                        .addComponent(jButtonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneBarra, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCerrar)
                    .addComponent(jLabelCurso))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Método para volver al menú de estudiantes
    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        if (evt.getSource()==jButtonCerrar){
            MenuEstudiantes vv = new MenuEstudiantes(colegio,curso);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setSize(this.getSize());
            vv.setLocation(this.getLocation());
            vv.setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_jButtonCerrarActionPerformed
    //Para actualizar los CSV de los estudiantes, cursos y asistencias
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal vv = new MenuPrincipal(colegio);
        vv.catchException(this);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPaneBarra;
    private javax.swing.JTable jTableLista;
    // End of variables declaration//GEN-END:variables
}
