package com.mycompany.prueba_1_netbeans;

import au.com.bytecode.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Colegio {
    //Colecciones de primer nivel de anidación
    private ArrayList<Curso> cursos;
    private ArrayList<Asistencia> asistencias;

    //Constructor que inicializa las colecciones
    public Colegio() {
        this.cursos = new ArrayList<>();
        this.asistencias = new ArrayList<>();
    }

    //Métodos que acceden a los métodos isEmpty() de sus respectivos ArrayList
    public boolean cursoEstaVacio() {
        return cursos.isEmpty();
    }

    public boolean asistenciaEstaVacio() {
        return asistencias.isEmpty();
    }

    //Método que te deja eliminar un curso de la colección
    public void removerCurso(Curso c) {
        cursos.remove(c);
    }

    //Método para eliminar una asistencia de su colección
    public void removerAsistencia(Asistencia a) {
        asistencias.remove(a);
    }

    //Agregar asistencia a la colección de asistencias
    public void agregarAsistencia(Asistencia a) {
        asistencias.add(a);
    }

    //Verifica que el curso del parámetro esté en la colección de cursos
    public Curso verificarCurso(Curso c) {
        int i;
        for (i = 0; cursos.size() > i; i++) {
            if (c.getGrado() != null && c.getLetra() != null) {
                if (cursos.get(i).getGrado().equalsIgnoreCase(c.getGrado()) && cursos.get(i).getLetra().equalsIgnoreCase(c.getLetra())) {
                    return cursos.get(i);
                }
            }
        }
        return null;
    }

    //Agregar curso a la colección de cursos
    public void agregarCurso(Curso c, String path) throws IOException {
        File file = new File(path);
        cursos.add(c);

        List<String[]> datos = new ArrayList<>();

        String[] fila = new String[2];
        fila[0] = c.getGrado();
        fila[1] = c.getLetra();

        // Añadir la fila a los datos
        datos.add(fila);

        LeerYEscribirCSV csv = new LeerYEscribirCSV();
        csv.escribirCSV(file, datos);
    }

    //Método que funciona para poder crear una lista de cursos posteriormente
    public String mostrarCurso() {
        int i;
        String ret = "";
        for (i = 0; cursos.size() > i; i++) {
            ret += cursos.get(i).toString();
        }
        return ret;
    }

    //Método para mostrar la información de un curso
    public String mostrarCurso(Curso c) {
        String curso = ("Curso: \nGrado: " + c.getGrado() + "\nParalelo/Letra: " + c.getLetra() + "\nCantidad de estudiantes: " + c.sizeCurso());
        return curso;
    }

    //Verifica en toda la colección de cursos con el RUT del estudiante si es que se encuentra en alguno de estos
    public boolean verificarEstudiante(String rut) {
        int i;
        for (i = 0; cursos.size() > i; i++) {
            if (cursos.get(i).contieneEstudiante(rut)) {
                return true;
            }
        }
        return false;
    }

    // Actualiza el objeto tipo Asistencia para que tenga todos los datos necesarios para funcionar
    public Asistencia verificarAsistencia(Asistencia a) {
        int i;
        Asistencia auxAsist;
        Curso auxCurso;
        for (i = 0; asistencias.size() > i; i++) {
            auxAsist = asistencias.get(i);
            if (auxAsist.getFecha().equals(a.getFecha()) && auxAsist.getHora().equals(a.getHora())) {
                auxCurso = auxAsist.getCurso();
                if (auxCurso.getGrado().equals(a.getCurso().getGrado()) && auxCurso.getLetra().equals(a.getCurso().getLetra())) {
                    return asistencias.get(i);
                }
            }
        }
        return null;
    }

    //Verificar asistencia en un curso específico
    public boolean verificarAsistencia(Curso c) {
        int i;
        Curso aux;
        for (i = 0; asistencias.size() > i; i++) {
            aux = asistencias.get(i).getCurso();
            if ((aux.getGrado().equals(c.getGrado())) && (aux.getLetra().equals(c.getLetra()))) {
                return true;
            }
        }
        return false;
    }

    //Sirve para el posterior uso de crear una lista de todas las asistencias realizadas por curso
    public String mostrarAsistencia(Curso c) {
        int i;
        String ret = "";
        for (i = 0; asistencias.size() > i; i++) {
            if (asistencias.get(i).getCurso().getGrado().equals(c.getGrado()) && asistencias.get(i).getCurso().getLetra().equals(c.getLetra())) {
                ret += asistencias.get(i).toString();
            }
        }
        return ret;
    }

    //Crea un HashMap para guardar un objeto de tipo Estudiante y el porcentaje de asistencia que tiene
    public HashMap<String, Double> calcularPorcentaje(Curso c) {
        double totalAsistenciasValidas;
        double asistenciasActuales;
        double porcentajeAsistencia;
        HashMap<String, Double> mapaDePorcenAsistencias = new HashMap<>();
        Curso cursoAsist;

        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // Agregar estudiantes al mapa con porcentaje inicial de 0.0
        for (int i = 0; c.sizeCurso() > i; i++) {
            estudiantes.add(c.getEstudiante(i));
            mapaDePorcenAsistencias.put(c.getEstudiante(i).getRut(), 0.0);
        }

        totalAsistenciasValidas = 0.0;

        // Calcular asistencias válidas y actualizar el mapa
        for (int j = 0; asistencias.size() > j; j++) {
            cursoAsist = asistencias.get(j).getCurso();
            if ((c.getGrado().equalsIgnoreCase(cursoAsist.getGrado())) && (c.getLetra().equalsIgnoreCase(cursoAsist.getLetra()))) {
                totalAsistenciasValidas++;

                for (int k = 0; cursoAsist.sizeCurso() > k; k++) {
                    String rut = cursoAsist.getEstudiante(k).getRut();
                    if (mapaDePorcenAsistencias.containsKey(rut)) {
                        if (cursoAsist.getEstudiante(k).getEstado() == 1) {
                            asistenciasActuales = mapaDePorcenAsistencias.get(rut);
                            mapaDePorcenAsistencias.put(rut, asistenciasActuales + 1);
                        }
                    }
                }
            }
        }

        // Calcular el porcentaje de asistencia para cada estudiante
        for (int l = 0; estudiantes.size() > l; l++) {
            double asistenciasEstudiante = mapaDePorcenAsistencias.get(estudiantes.get(l).getRut());
            if (totalAsistenciasValidas > 0) {
                porcentajeAsistencia = (asistenciasEstudiante / totalAsistenciasValidas) * 100;
            } else {
                // para no dividir por 0 se hace esta condición
                porcentajeAsistencia = 0;
            }
            // actualiza el valor al porcentaje final para el estudiante
            mapaDePorcenAsistencias.put(estudiantes.get(l).getRut(), porcentajeAsistencia);
        }

        return mapaDePorcenAsistencias;
    }

    //Muestra la asistencia de un curso en un panel
    public void mostrarAsistencia(Asistencia asist, JFrame panel) {
        int i;
        String[] opciones = {"Revisar lista", "Volver"};
        String[] opcionesVista = {"Continuar", "Volver"};
        int selectionOpcion;
        Curso c = asist.getCurso();
        Estudiante e;
        String estado = "";
        selectionOpcion = JOptionPane.showOptionDialog(panel, "Asistencia fecha: " + asist.getFecha() + "\nhora: " + asist.getHora(), "Encontrado", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        switch (selectionOpcion + 1) {
            case 0:
                return;
            case 1:
                for (i = 0; c.sizeCurso() > i; i++) {
                    e = asist.getEstudiante(i);
                    if (e.getEstado() <= 0) {
                        estado = "no valido";
                    } else if (e.getEstado() == 1) {
                        estado = "Presente";
                    } else if (e.getEstado() == 2) {
                        estado = "Faltó";
                    } else if (e.getEstado() == 3) {
                        estado = "Falta extraordinaria";
                    } else if (e.getEstado() == 4) {
                        estado = "Sale antes del horario";
                    }
                    selectionOpcion = JOptionPane.showOptionDialog(panel, "Nombre: " + e.getNombre() + "\nApellido: " + e.getApellido() + "\nRUT: " + e.getRut() + "\n" + estado, "Asistencia Fecha :" + asist.getFecha() + " Hora :" + asist.getHora(), JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesVista, opcionesVista[0]);
                    switch (selectionOpcion + 1) {
                        case 0:
                            return;
                        case 1:
                            continue;
                        case 2:
                            return;
                    }
                }
                return;
            case 2:
                break;
        }
    }

    //Método compartido por varias clases para acortar el máximo de líneas de error del StackTrace
    public String shortStackTrace(Exception e, int maxLineas) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        String[] stackTraceString = sw.toString().split("\n");
        StringBuilder shortStackTrace = new StringBuilder();
        for (int i = 0; i < Math.min((stackTraceString.length), maxLineas); i++) {
            shortStackTrace.append(stackTraceString[i]).append("\n");
        }
        return shortStackTrace.toString();
    }

    //Actualiza el archivo CSV de cursos
    public void actualizarCSVCursos(String path) throws IOException {
        File file = new File(path);
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file, true))) {
            for (Curso rec : cursos) {
                String[] fila = new String[2];
                fila[0] = rec.getGrado();
                fila[1] = rec.getLetra();
                csvWriter.writeNext(fila);
            }
        }
    }

    //Carga estudiantes desde un archivo CSV
    public void cargarEstudiantesDesdeCSV(String path) throws Exception {
        File file = new File(path);
        LeerYEscribirCSV lectorCSV = new LeerYEscribirCSV();
        List<String[]> datosCSV = lectorCSV.leerCSV(file);
        for (Curso curso : cursos) {
            curso.cargarEstudiantes(datosCSV);
        }
    }

    //Carga asistencias desde un archivo CSV
    public void cargarAsistenciaDesdeCSV(String path) throws Exception {
        File file = new File(path);
        LeerYEscribirCSV lectorCSV = new LeerYEscribirCSV();
        List<String[]> datosCSV = lectorCSV.leerCSV(file);
        if (datosCSV != null) {
            String grado = "", letra = "", fecha = "", hora = "";
            Curso curso = null;
            int dif = 0;
            int cont = 0;
            Estudiante e;
            for (String[] aux : datosCSV) {
                if (aux.length >= 5) {
                    String nuevoGrado = aux[0];
                    String nuevaLetra = aux[1];
                    String nuevaFecha = aux[2];
                    String nuevaHora = aux[3];
                    if (dif == 0 || !grado.equals(nuevoGrado) || !letra.equals(nuevaLetra) || !fecha.equals(nuevaFecha) || !hora.equals(nuevaHora)) {
                        if (dif > 0 && curso != null) {
                            Asistencia asist = new Asistencia(fecha, hora, curso);
                            asist.setCantidadPresentes(cont);
                            asistencias.add(asist);
                            cont = 0;
                        }

                        grado = nuevoGrado;
                        letra = nuevaLetra;
                        fecha = nuevaFecha;
                        hora = nuevaHora;
                        curso = new Curso(grado, letra);
                        dif++;
                    }
                    e = new Estudiante(aux[5], aux[6], aux[4]);
                    int estado = Integer.parseInt(aux[7]);
                    if (estado == 1) {
                        cont++;
                    }
                    e.setEstado(estado);
                    curso.agregarEstudiante(aux[4], e);
                    curso.agregarEstudiante(e);
                }
            }

            //Agregar la última asistencia después del último cambio
            if (dif > 0) {
                Asistencia asist = new Asistencia(fecha, hora, curso);
                asistencias.add(asist);
            }
        }
    }

    //Actualiza los datos en el archivo CSV según el tipo de datos (1: estudiantes, 2: cursos, otro: asistencias)
    public void actualizar(String path, int numero) throws Exception {
        File file = new File(path);
        LeerYEscribirCSV p = new LeerYEscribirCSV();

        if (numero == 1) {
            p.encabezadoEstudiantes(file);
            for (Curso curso : cursos) {
                curso.actualizarCSVEstudiantes(path);
            }
        } else if (numero == 2) {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file, false))) {
                actualizarCSVCursos(path);
            }
        } else {
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file, false))) {
                actualizarCSVAsistencias(path);
            }
        }
    }

   

    //Carga cursos desde un archivo CSV
    public void cargarCursosDesdeCSV(String path) throws Exception {
        File file = new File(path);

        LeerYEscribirCSV lectorCSV = new LeerYEscribirCSV();
        List<String[]> datosCSV = lectorCSV.leerCSV(file);
        if (datosCSV != null) {
            for (String[] fila : datosCSV) {
                if (fila.length >= 2) {
                    String grado = fila[0];
                    String letra = fila[1];

                    Curso curso = new Curso(grado, letra);
                    cursos.add(curso);
                }
            }
        }
    }
    
     //Actualiza el archivo CSV de asistencias
    public void actualizarCSVAsistencias(String path) throws IOException {
        File file = new File(path);
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file, true))) {
            for (int i = 0; i < asistencias.size(); i++) {
                Curso c = asistencias.get(i).getCurso();

                for (int j = 0; j < c.sizeCurso(); j++) {
                    Estudiante e = c.getEstudiante(j);
                    String[] fila = new String[8];
                    fila[0] = c.getGrado();
                    fila[1] = c.getLetra();
                    fila[2] = asistencias.get(i).getFecha();
                    fila[3] = asistencias.get(i).getHora();
                    fila[4] = e.getRut();
                    fila[5] = e.getNombre();
                    fila[6] = e.getApellido();
                    fila[7] = Integer.toString(e.getEstado());
                    csvWriter.writeNext(fila);
                }
            }
        }
    }
    
    public void generarReporte(HashMap<String, Double> porcentajesAsistencia,Curso c)throws IOException
    {
        //String path = "src/main/java/"+c.getGrado()+c.getLetra()+".csv";
        
        //Mac OS
        String rutaEscritorio = System.getProperty("user.home") + "/Desktop/";
        String rutaArchivo = rutaEscritorio +c.getGrado()+c.getLetra()+".csv";
        
        //Windows
        
        /*
        String rutaEscritorio = System.getProperty("user.home") + "\\Desktop\\";
        String rutaArchivo = rutaEscritorio +c.getGrado()+c.getLetra()+".csv";
        
        */
        
        File file = new File(rutaArchivo);
        
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(file, false))) {
            Estudiante e;
            for (HashMap.Entry<String, Double> entry : porcentajesAsistencia.entrySet()) {
               
                e = c.getEstudiante(entry.getKey());
                
                double truncado = Math.floor(entry.getValue() * 10) / 10;
                String[] fila = new String[3];
                fila[0] = "Rut = " + e.getRut();
                fila[1] = "Nombre = " + e.getNombre()+" "+ e.getApellido();
                fila[2] = "Porcentaje de Asistencia = " + String.valueOf(truncado)+"%";
                csvWriter.writeNext(fila);
            }
        }
        
    }
}