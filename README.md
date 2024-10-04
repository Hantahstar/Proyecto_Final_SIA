# Gestión de Asistencia de Alumnos

## Descripción del Programa

Este programa está centrado principalmente en el registro de los diferentes casos de asistencia en los distintos cursos, asegurando que la asistencia de un curso no afecte a los demás y que ningún estudiante esté duplicado, ya sea en el mismo o en diferentes cursos.

## Instrucciones de Ejecución del Programa

Al iniciar el programa, se mostrará un menú con varias opciones dirigidas tanto a los profesores como a los administradores. Los profesores podrán registrar la asistencia de cualquier curso previamente creado y que cuente con al menos un estudiante inscrito. Los administradores, por su parte, tendrán la posibilidad de crear nuevos cursos y registrar nuevos estudiantes. Para utilizar el sistema, solo es necesario ingresar el número correspondiente a la opción deseada.

## Opciones

### Administrador

#### Menú de Cursos

1. **Agregar curso**: El administrador deberá asignar el nivel y la letra del curso (paralelo) en el formato:
    - Nivel (ej. "1ro Básico", "4to Medio")
    - Letra (ej. "A") en mayúscula.

2. **Buscar curso**: El administrador deberá ingresar el nivel y la letra del curso que desea buscar. El programa indicará si el curso está registrado.

3. **Eliminar curso**: El administrador ingresará el nivel y la letra del curso que desea eliminar. El sistema confirmará si el curso fue eliminado con éxito o si no se encuentra en el registro.

4. **Regresar al menú principal**: Esta opción regresa al menú principal.

#### Menú de Estudiantes

El administrador deberá seleccionar el nivel y la letra del curso (ej. "1ro Básico", "A") para realizar operaciones con los estudiantes de dicho curso.

1. **Agregar estudiante**: Se solicitará al administrador ingresar el nombre, apellido paterno, apellido materno y el RUT del estudiante.

2. **Buscar estudiante**: El administrador ingresará el RUT del estudiante a buscar. Si el estudiante está registrado en el curso, se mostrarán su nombre y RUT. Si no está registrado, se informará que no se encuentra.

3. **Eliminar estudiante**: El administrador ingresará el RUT del estudiante que desea eliminar. El sistema confirmará si fue eliminado con éxito o si no se encuentra registrado.

4. **Regresar al menú principal**: Esta opción regresa al menú principal.

### Profesores

#### Realizar Asistencia

El profesor seleccionará el nivel y la letra del curso. Esto abrirá un submenú con las siguientes opciones:

1. **Tomar asistencia**: El profesor ingresará la fecha (DD/MM/AAAA) y la hora (00:00), y luego deberá registrar la asistencia de cada estudiante, marcándolos como presente, ausente, falta extraordinaria o retiro anticipado. También tendrá la opción de cancelar la toma de asistencia.

2. **Buscar asistencia**: El profesor ingresará la fecha y hora de una toma de asistencia previa, y el sistema mostrará el estado de los estudiantes y la cantidad de presentes.

3. **Eliminar asistencia**: El profesor ingresará la fecha y la hora, y el sistema confirmará si la asistencia fue eliminada correctamente o no.

4. **Regresar al menú principal**: Esta opción regresa al menú principal.

## Requisitos del Sistema
- Java
