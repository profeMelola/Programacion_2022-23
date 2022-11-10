# Programa para la gestión de notas de los alumnos

Vamos a ir desarrollando por fases un programa la gestión de notas de los alumnos de una clase. El objetivo es facilitar el trabajo al profesor a la hora de calificar.

![image](https://user-images.githubusercontent.com/91023374/196936768-b8d6363e-e408-49c8-a892-48cfd91b5be4.png)


## Versión 1

El programa gestiona las notas de un único alumno (notas con decimales) y calcula la media de esas notas.

**Requisitos:**
- El programa pedirá al profesor el nombre del alumno y las 6 notas de cada módulo. Damos por hecho que el alumno está matriculado a las 6 módulos.
- Utiliza variables primitivas (todavía no sabemos usar arrays)
- Crea un método estático en la clase principal (función) que calcule y devuelva la nota media. Recordad que la media debe ser un valor entero y se aplicará el redondeo estándar.
- El programa debe mostrar la mostrar dicha nota media y terminar: *El alumno XXXX ha obtenido una nota media de YYYY*

## Versión 2

El programa va a gestionar las notas de N alumnos por tanto pedirá al profesor introducir el número de alumnos de los que quiere calcular su nota media.
Además devolverá la nota media de todos los alumnos introducidos con el fin de que el profesor obtenga información de si el nivel medio de la clase es alto, medio o bajo:

- Nota media menor que 5 ==> bajo
- Nota media mayor o igual que 5 y menor que 7 ==> medio
- Nota media mayor o igual que 7 ==> alto

Por cada alumno el programa pedirá:

- El nombre del alumno.
- La nota final (decimal) de cada módulo.

Por cada alumno el programa mostrará la nota media:

*El alumno XXXX ha obtenido una nota media de YYYY*

Además, cuando haya mostrado todas las notas medias de cada alumno deberá informar de la nota media final:

*La nota media final de la clase es ZZZZZ. El nivel es alto/medio/bajo*

Una vez mostrado este mensaje el programa terminará.


## Versión 3: mi primer array unidimensional


Desarrolla un programa que haga lo mismo que en la **versión 1**, pero con el uso de arrays.

![image](https://user-images.githubusercontent.com/91023374/197191979-3270f866-3dd8-4eaf-8f9d-5526d325b80d.png)


- El array debe ser inicializado de tamaño 6 (el número de módulos de los que vamos a introducir la nota del único alumno).
- Debes modificar la lógica del programa para introducir las notas en el array y luego acceder a ellas.
- Modifica a función que calcula la media de las notas.
- Muestra la media por pantalla: *El alumno XXXX ha obtenido una nota media de YYYY*


## Versión 4: array de notas + clase Alumno + array de alumnos

![image](https://user-images.githubusercontent.com/91023374/200559282-a7e08ffc-3651-4d35-9ba9-95912b5f9b52.png) ![image](https://user-images.githubusercontent.com/91023374/200559283-326d00f7-6a81-447f-ace7-40324f6449c2.png) ![image](https://user-images.githubusercontent.com/91023374/200559295-220178dc-ca1f-4121-9fcc-6d528218d358.png)

### Clase Alumno

**Atributos**

Definida por:

- Nombre alumno
- Código alumno (NIA)
- Las 6 notas de los 6 módulos del alumno (array)

**Constructor**

Un alumno se dará de alta en el programa por su nombre y su NIA.

**Métodos setter/getter**

El NIA no podrá modificarse en ningún momento una vez creado el alumno.

Las notas del alumno se guardarán a través de su correspondiente método set.

**Métodos propios o de comportamiento**

Tendrá un método que calcula la nota media final del alumno.

### Clase ejecutable principal

1. El programa debe preguntar de **cuántos alumnos se van a gestionar las notas.**

2. Después **por cada alumno** debe preguntar:
 - el nombre del alumno.
 - las 6 notas y guardarlas en su correspondiente array.
 
3. Con esa información debe **dar de alta el alumno en el sistema** (instanciar la clase Alumno para crear el objeto en cuestión).

4. Cada objeto alumno debe guardarse en un **array de alumnos**.

5. Finalmente **por cada alumno se debe mostrar por consola su nota media del curso.**

##  Versión 4.1: mejoras!!!!

1. **MÉTODOS AUXILIARES:** La lógica para cargar los datos de alumnos y mostrar la media de cada uno de ellos debemos de sacarla a dos métodos estáticos en la clase Utilidades
2. **MENÚ:** En otro método debemos implementar un menú con las siguienes opciones:


1. Cargar datos de alumnos

2. INFORMES

3. Salir


Al seleccionar la opción 2 debe de salir otro menú indicando:

1. Mostrar nota media de todos los alumnos

2. Mostrar nota media de toda la clase

3. Mostrar información de todos los alumnos

4. Volver al menú principal


Por tanto debemos programar adecuadamente el menú en sus métodos correspondientes.

Además debemos:

- Añadir un atributo nuevo a la clase Alumno para guardar su notaMedia.
- Programar el método que calcule la nota media de toda la clase.

Por último, vamos a aplicar otra mejora!!!!! Vamos a usar JOptionPane para pedir al profesor el número de alumnos que va a gestionar:

![image](https://user-images.githubusercontent.com/91023374/201052528-b7278b3d-5df6-4385-a0cd-73ebc2327767.png)


Para más información de cómo usarlo https://aulavirtual3.educa.madrid.org/ies.alonsodeavellan.alcala/mod/page/view.php?id=58115


## Versión 5: con arrays multidimensionales

![image](https://user-images.githubusercontent.com/91023374/196938736-2416bf1d-bb6c-464d-96f1-8d67370e0510.png) **Próximamente arrays bidimensionales o tablas**

![image](https://user-images.githubusercontent.com/91023374/196938586-846c0dc3-f52a-4f26-ae75-fea580d30f20.png)


![image](https://user-images.githubusercontent.com/91023374/196938640-503e3909-a875-4bab-8a9b-efc62aa2407b.png)

