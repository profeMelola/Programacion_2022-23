/**
 *
 * @author melola
 * Nuestro objetivo es crear una aplicación que genere un
 * puzzle de letras partiendo de una lista de palabras. 
 * La condición es que todas las palabras de la lista tengan el mismo número 
 * de letras en forma de una tabla (como aparece en la figura).
 * Después la aplicación deberá "desordenar" algunas letras de la siguiente 
 * forma:
 * Para cada una de las columnas de la matriz, que es nuestro puzzle,
 * intercambiará dos posiciones (solo 2) de forma aleatoria. 
 * Después daremos al usuario la oportunidad de volver a colocar el puzzle 
 * para que acierte las palabras originales, de forma que le preguntaremos 
 * la columna sobre la que va a realizar el intercambio y las dos posiciones
 * que quiere intercambiar en esa columna. 
 * Cada vez que el usuario haga un cambio, la apliación comprobará 
 * si la solución es correcta.
 *
 * El número de oportunidades que le damos al usuario es infinito.
 * Hasta que encuentre la solución
 */
package es.daw.puzzle;

import es.daw.puzzle.util.Utilidades;

public class Puzzle {

    //public static int posicionColumna = 0;
    //public static int posicionFila1 = 0;
    //public static int posicionFila2 = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] palabras = {"AEREO", "CLAVE", "FINCA", "GALLO", "GARRA"};
        char[][] puzzleOriginal;
        char[][] puzzleModificado;

        /*
         * array para guardar en:
         * [0]: posición columna
         * [1]: posición primera fila
         * [2]: posición segunda fila
         *
        */
        int posiciones[]; 
        //Otra opción para guardar las posiciones de la columna y filas sería con variables globales estáticas
        //declaradas en una clase 
               
        
        //cargar los dos puzzles
        puzzleOriginal = Utilidades.devuelveTabla(palabras);
        puzzleModificado = Utilidades.devuelveTablaModificada(puzzleOriginal);

        //método que devuelve los dos puzzles por consola
        mostrarPuzzles(puzzleOriginal,puzzleModificado);
        

        // pedirmos al usuario las posiciones a cambiar    

        do {
            //posiciones = Utilidades.pedirPosiciones(puzzleModificado[0].length-1, puzzleModificado.length-1 );
            //dos argumentos: num columnas, num filas
            posiciones = Utilidades.pedirPosiciones(puzzleModificado[0].length, puzzleModificado.length );
           
            // utilizo el método  public static void intercambiaPosiciones(char tabla[][], int col, int pos1, int pos2) {
            Utilidades.intercambiaPosiciones(puzzleModificado, posiciones[0], posiciones[1], posiciones[2]);

            //Metodos.mostrarTabla(puzzleModificado);
            mostrarPuzzles(puzzleOriginal,puzzleModificado);
            
            
        } while (!Utilidades.compararTablas(puzzleOriginal, puzzleModificado));

        
        System.out.println("FELICIDADES!!! HAS GANADO ");
    }
    
    /**
     * mostrarPuzzles
     * @param puzzleOriginal
     * @param puzzleModificado 
     */
    public static void mostrarPuzzles(char[][] puzzleOriginal, char[][] puzzleModificado){
        System.out.println("*****************************");
        System.out.println("* PUZZLE ORIGINAL *");
        Utilidades.mostrarTabla(puzzleOriginal);
        System.out.println("*****************************");
        System.out.println("* PUZZLE MODIFICADO *");
        Utilidades.mostrarTabla(puzzleModificado);
        System.out.println("*****************************");        
    }

}
