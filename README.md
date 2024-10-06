# Gestión de Asistencia de Alumnos

## Descripción del Programa

Este programa está centrado principalmente en el registro de los diferentes casos de asistencia en los distintos cursos, asegurando que la asistencia de un curso no afecte a los demás y que ningún estudiante esté duplicado, ya sea en el mismo o en diferentes cursos.

## Instrucciones de Ejecución del Programa

Al iniciar el programa, se mostrará un menú con varias opciones dirigidas a los usuarios, haciendo el programa los más intuitivo posible. Los usuarios podrán registrar la asistencia de cualquier curso previamente creado y que cuente con al menos un estudiante inscrito. Se tiene la posibilidad de crear nuevos cursos y registrar nuevos estudiantes,el programa tiene visto posibles errores y los reporta al usuario en pantalla. Para utilizar el sistema, solo es necesario presionar botones de la interfaz gráfica y escribir en las casillas necesarias.

## Opciones desde el Menú Principal

#### Menú de Cursos

1. **Agregar curso**: El usuario deberá asignar el nivel y la letra del curso (paralelo) en el formato:
    - Nivel (ej. "1ro Básico", "4to Medio")
    - Letra (ej. "A") en mayúscula.

2. **Buscar curso**: El usuario deberá ingresar el nivel y la letra del curso que desea buscar. El programa indicará si el curso está registrado.

3. **Mostrar cursos**: te muestra por pantalla todos los cursos registrados del sistema.

4. **Eliminar curso**: El usuario ingresará el nivel y la letra del curso que desea eliminar. El sistema confirmará si el curso fue eliminado con éxito o si no se encuentra en el registro.

5. **Regresar al menú principal**: Esta opción regresa al menú principal.

#### Menú de Estudiantes

El usuario deberá seleccionar el nivel y la letra del curso (ej. "1ro Básico", "A") antes para realizar operaciones con los estudiantes de dicho curso.

1. **Agregar estudiante**: Se solicitará al usuario ingresar el nombre, apellido y el RUT del estudiante.

2. **Buscar estudiante**: El usuario ingresará el RUT del estudiante a buscar. Si el estudiante está registrado en el curso, se mostrarán su nombre y RUT. Si no está registrado, se informará que no se encuentra.

3. **Modificar estudiante**: El usuario previamente tendré que buscar usando el RUT del estudiante, confirmando que esté registrado, una vez pasado esto, se podrá modificar el nombre completo del estudiante, pero no el RUT, dado que es su identificador.

4. **Mostrar estudiantes**: Mostrará todos los estudiantes del curso elegido.

5. **Eliminar estudiante**: El usuario ingresará el RUT del estudiante que desea eliminar. El sistema confirmará si fue eliminado con éxito o si no se encuentra registrado.

6. **Regresar al menú principal**: Esta opción regresa al menú principal.

#### Realizar Asistencia

El usuario seleccionará el nivel y la letra del curso,el curso tiene que tener mínimo un estudiante para poder realizar una asistencia,en caso contrario, no dejará realizarla. Al ingresar un curso válido hará que se abra un submenú con las siguientes opciones:

1. **Realizar asistencia**: El usuario ingresará la fecha (DD/MM/AAAA) y la hora (00:00),el sistema verificará que no se haya hecho ya una asistencia a esa misma hora y fecha en ese mismo curso,la verificación depende del curso principalmente, y luego deberá registrar la asistencia de cada estudiante, marcándolos como presente, ausente, falta extraordinaria o retiro anticipado. También tendrá la opción de cancelar la toma de asistencia.

2. **Buscar asistencia**: El usuario ingresará la fecha y hora de una toma de asistencia previa, y el sistema mostrará la situación de los estudiantes y la cantidad de presentes de ese pase de asistencia en específico.

3. **Generar gráfico de porcentaje**: El usuario al presionar esta opción, se le generará un gráfico de barras mostrando los porcentajes de asistencia de cada estudiante registrado en el curso, en el caso donde no se haya registrado ninguna asistencia,el sistema no te permitirá

4. **Crear reportaje**: El usuario al elegir esta opción, se le generará un archivo estilo CSV donde se reporta los porcentaje de asistencia de los estudiantes.

5. **Eliminar asistencia**: El usuario ingresará la fecha y la hora, y el sistema confirmará si la asistencia fue eliminada correctamente o no.

6. **Regresar al menú principal**: Esta opción regresa al menú principal.

## Requisitos del Sistema
- Java
- IDE de preferencia (Recomendados IntelliJ, NetBeans)
- Programa para descrimir archivos tipo ZIP (Recomendado Winrar)

## Compatible con
- Windows
- Mac
