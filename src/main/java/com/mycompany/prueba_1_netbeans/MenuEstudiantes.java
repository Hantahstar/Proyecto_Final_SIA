/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MenuEstudiantes extends javax.swing.JFrame {

    private Colegio colegio;
    private Curso curso;
    public MenuEstudiantes(Colegio colegio,Curso curso) {
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

        jLabel1 = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelCurso = new javax.swing.JLabel();
        jButtonMostrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Colegio");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(840, 460));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Menú Estudiantes");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonAgregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonAgregar.setText("Agregar estudiante");
        jButtonAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonBuscar.setText("Buscar estudiante");
        jButtonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonEliminar.setText("Expulsar estudiante");
        jButtonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonVolver.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonVolver.setText("Volver menu principal");
        jButtonVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jLabelCurso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelCurso.setText(curso.getGrado()+" "+curso.getLetra()+" Cantidad de estudiantes: "+curso.sizeCurso());
        jLabelCurso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonMostrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonMostrar.setText("Mostrar estudiantes");
        jButtonMostrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonModificar.setText("Modificar estudiante");
        jButtonModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCurso))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        if(evt.getSource()==jButtonAgregar){
            Agregar vv = new Agregar(colegio,curso);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
            vv.setVisible(true);
            this.dispose();
            
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        if (evt.getSource()==jButtonVolver){
            MenuPrincipal vv = new MenuPrincipal(colegio);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
            vv.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if(evt.getSource()==jButtonEliminar){
            if(curso.estaCursoVacio()){
                JOptionPane.showMessageDialog(this, "No hay ningún estudiante en el curso", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            else{
                Eliminar vv = new Eliminar(colegio,curso);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                vv.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (evt.getSource()==jButtonBuscar){
            //true para buscar y false para modificar
            Buscar vv = new Buscar(colegio,curso,true);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
            vv.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        //lista para mostrar todos los estudiantes
        if (evt.getSource()==jButtonMostrar){
            if(curso.estaCursoVacio()){
                JOptionPane.showMessageDialog(this, "No hay ningún estudiante en el curso", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            else{
                ListaEstudiantes vv = new ListaEstudiantes(colegio,curso);
                vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
                vv.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButtonMostrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        //modificar estudiante
        if (evt.getSource()==jButtonModificar){
            //ventana de modificar que primero pasa por la de buscar
            JOptionPane.showMessageDialog(this, "Necesitas primero buscar al estudiante para modificar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            Buscar vv = new Buscar(colegio,curso,false);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setExtendedState(JFrame.MAXIMIZED_BOTH);
            vv.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCurso;
    // End of variables declaration//GEN-END:variables
}
