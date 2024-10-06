/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prueba_1_netbeans;

import java.awt.Color;
import java.util.HashMap;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoAsistencia extends VentanaPadre {
    //Atributo de instancia
    private HashMap<String, Double> mapaPorcentaje;
    //Constructor de la clase GraficoAsistencia
    public GraficoAsistencia(HashMap<String, Double> mapaPorcentaje,Colegio colegio,Curso curso) {
        super(colegio,curso);
        this.mapaPorcentaje = mapaPorcentaje;
        mostrarGraficoAsistencia(this.mapaPorcentaje);
        initComponents();
        visual();
    }
    //Método para visualizar la interfaz gráfica y configurarla al gusto
    @Override
    public void visual(){
        //Botón volver
        jButtonVolver.setBackground(new Color(150,43,69));
        jButtonVolver.setForeground(Color.white);
        barChartGrafico.setBackgroundPaint(Color.gray);
        barChartGrafico.getTitle().setBackgroundPaint(Color.gray);
        plotGrafico.setBackgroundPaint(Color.darkGray);
        plotGrafico.getDomainAxis().setLabelPaint(Color.BLACK);
        plotGrafico.getRangeAxis().setLabelPaint(Color.BLACK);
        plotGrafico.getRenderer().setSeriesPaint(0, Color.black);
        rendererGrafico.setShadowVisible(false);
        rendererGrafico.setDrawBarOutline(false);
    }


    //Método para mostrar el gráfico de asistencia de los estudiantes
    private void mostrarGraficoAsistencia(HashMap<String, Double> porcentajesAsistencia) {
        // Crear el dataset con los datos de asistencia
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        // Rellenar el dataset con los porcentajes de asistencia de cada estudiante
        Estudiante e;
        for (HashMap.Entry<String, Double> entry : porcentajesAsistencia.entrySet()) {
            e = curso.getEstudiante(entry.getKey());
            dataset.addValue(entry.getValue(), "Asistencia",e.getNombre()+" "+e.getApellido()+" "+e.getRut());
        }
        //barra
        barChartGrafico = ChartFactory.createBarChart(
            "Porcentaje de Asistencia por Estudiante",
            "Estudiante", // Etiqueta del eje X
            "Porcentaje", // Etiqueta del eje Y
            dataset // Los datos
        );
        plotGrafico = (CategoryPlot) barChartGrafico.getPlot();
        rendererGrafico = (BarRenderer) plotGrafico.getRenderer();        
        // Crear un panel que contenga el gráfico
        chartPanelGrafico = new ChartPanel(barChartGrafico);

        this.setContentPane(chartPanelGrafico);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(840, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButtonVolver.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Método para volver al menú de asistencia
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        if (evt.getSource()==jButtonVolver){
            MenuAsistencia vv = new MenuAsistencia(colegio,curso);
            vv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            vv.setSize(this.getSize());
            vv.setLocation(this.getLocation());
            vv.setVisible(true);
            this.dispose();                
        }
    }//GEN-LAST:event_jButtonVolverActionPerformed
    //Para actualizar los CSV de los estudiantes, cursos y asistencias
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPrincipal vv = new MenuPrincipal(colegio);
        vv.catchException(this);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing
    
    private ChartPanel chartPanelGrafico;
    private JFreeChart barChartGrafico;
    private CategoryPlot plotGrafico;
    private BarRenderer rendererGrafico;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVolver;
    // End of variables declaration//GEN-END:variables
}
