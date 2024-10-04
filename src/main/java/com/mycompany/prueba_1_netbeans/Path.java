package com.mycompany.prueba_1_netbeans;

//Clase para manejar los paths de los archivos CSV
public class Path {
    //Atributos de instancia
    private String pathEstudiantes;
    private String pathCursos;
    private String pathAsistencia;
    //Constructor de la clase Path
    public Path(){
        this.pathEstudiantes = "src/main/java/Estudiantes.csv";
        this.pathCursos = "src/main/java/Cursos.csv";
        this.pathAsistencia = "src/main/java/Asistencias.csv";
    }
    //Setters y Getters
    public void setPathEstudiantes(String pathEstudiantes){
        this.pathEstudiantes = pathEstudiantes;
    }

    public String getPathEstudiantes() {
        return pathEstudiantes;
    }

    public void setPathCursos(String pathCursos) {
        this.pathCursos = pathCursos;
    }

    public String getPathCursos() {
        return pathCursos;
    }

    public void setPathAsistencia(String pathAsistencia) {
        this.pathAsistencia = pathAsistencia;
    }

    public String getPathAsistencia() {
        return pathAsistencia;
    }
}
