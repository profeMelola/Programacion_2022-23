# RETO: Implementa un sudoku con Java

![image](https://user-images.githubusercontent.com/91023374/146168358-c31a9f0f-9413-455d-8a80-641add94fe99.png)

## TRABAJO GRUPAL

Vamos a montar equipos. El requisito es que cada equipo esté formado como mínimo por tres miembros.

De forma consesuada, cada equipo eligirá:
- un portavoz: que hará las preguntas al profesor si fuera necesario.
- un jefe de proyecto: que organizará de forma equitativa el trabajo entre los tres miembros.

El portavoz y el jefe de proyecto no pueden ser la misma persona.

**Problema que debemos resolver**

Implementar un sudoku clásico 9x9 en java:

- Se debe mostrar al usuario el sudoku.
- El usuario debe ir diciendo la casilla y el número que quiere rellenar.
- Debemos indicar al usuario si ha acertado con la solución.

![image](https://user-images.githubusercontent.com/91023374/146061101-1154dd26-808a-47f3-8784-82c14ffa9ee1.png)

## REQUISITOS

Puedes utilizar todos los recursos Java vistos en clase el primer trimestre, única y exclusivamente (Clases, objetos, arrays... nada de colecciones dinámicas!!!!! )

Podéis buscar por internet toda la información que consideréis necesaria, pero todos los miembros del equipo deben saber lo que se va a implementar.

El trabajo debe estar repartido. Todos debéis participar.

Tenéis total libertad para diseñar el Sudoku y sus reglas de juego (desde un Sudoku sencillo a uno más complejo):
- si se va resolviendo según el usuario va introduciendo números.
- si se resuelve una vez completado
- si le damos más de una oportunidad
- el nivel de dificultad 
- etc...

**Antes de empezar, tengamos claro qué es un Sudoku**

https://aprendiendomatematicas.com/sudokus-descargables-para-ninos/


## PISTAS

El profesor irá publicando pistas semanalmente para ayudar a aquellos bloqueados en diferentes fases del programa... 

![image](https://user-images.githubusercontent.com/91023374/146194724-942f3b84-3bfc-423e-921c-34a55faa7c0b.png)

### Pista 1: array de 4 dimensiones
```
// Declaración del array de 4 dimensiones
private final int DIM0 = 3;
private final int DIM1 = 3;
private final int DIM2 = 3;
private final int DIM3 = 3;

int tablero = new int[DIM0][DIM1][DIM2][DIM3];

// Método que inicializa el array de 4 dimensiones
    private void crearTablero() {
        
        // Ejemplo con un sector con valores fijos
        int sector[][] = {{1, 5, 9}, {2, 7, 4}, {3, 8, 6}};
        tablero[0][0] = sector;
        
        // Dimensión 0
        for (int dim0 = 0; dim0 < DIM0; dim0++) {
             
            if (dim0 != 0) {
            }
            
        }
    }

```



## ENTREGA VOLUNTARIA

El programa podrá entregarse en el aula virtual (los fuentes y el jar versión jdk 11).

**Fecha límite: viernes 3 de febrero**

No es una actividad evaluable, no cuenta para el 15% de la nota pero sí es un "reto grupal" el sacar adelante el SUDOKU.

Jugaremos en clase con los Sudokus entregados y el profesor podrá preguntar a cualquier miembro del equipo por el código. 

**El objetivo es aprender unos de otros!!!!**

La entrega está en la sección principal del curso en el aula virtual:

![image](https://user-images.githubusercontent.com/91023374/211314285-757b94e0-8143-424c-adc7-fbb84c9cbc48.png)

https://aulavirtual3.educa.madrid.org/ies.alonsodeavellan.alcala/mod/assign/view.php?id=61985


