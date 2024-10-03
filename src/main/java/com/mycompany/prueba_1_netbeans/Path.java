package com.mycompany.prueba_1_netbeans;

public class Path {
    private String pathEstudiantes;
    private String pathCursos;
    private String pathAsistencia;

    public Path(){
        this.pathEstudiantes = "src/main/java/Estudiantes.csv";
        this.pathCursos = "src/main/java/Cursos.csv";
        this.pathAsistencia = "src/main/java/Asistencias.csv";
    }

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
