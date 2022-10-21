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
- Nota media mayor que 7 ==> alto

Por cada alumno el programa pedirá:

- El nombre del alumno.
- La nota final (decimal) de cada módulo.

Por cada alumno el programa mostrará la nota media:

*El alumno XXXX ha obtenido una nota media de YYYY*

Además, cuando haya mostrado todas las notas medias de cada alumno deberá informar de la nota media final:

*La nota media final de la clase es ZZZZZ. El nivel es alto/medio/bajo*

Una vez mostrado este mensaje el programa terminará.


## Versión 3: mi primer array


Desarrolla un programa que haga lo mismo que en la **versión 1**, pero con el uso de arrays.

- El array debe ser inicializado de tamaño 6 (el número de módulos de los que vamos a introducir la nota del único alumno).
- Debes modificar la lógica del programa para introducir las notas en el array y luego acceder a ellas.
- Modifica a función que calcula la media de las notas.
- Muestra la media por pantalla: *El alumno XXXX ha obtenido una nota media de YYYY*


### Apoyo gráfico

![image](https://user-images.githubusercontent.com/91023374/196938736-2416bf1d-bb6c-464d-96f1-8d67370e0510.png) **Próximamente arrays bidimensionales**

![image](https://user-images.githubusercontent.com/91023374/196938586-846c0dc3-f52a-4f26-ae75-fea580d30f20.png)


![image](https://user-images.githubusercontent.com/91023374/196938640-503e3909-a875-4bab-8a9b-efc62aa2407b.png)

