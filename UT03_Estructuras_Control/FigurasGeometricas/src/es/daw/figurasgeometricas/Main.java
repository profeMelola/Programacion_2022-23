/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/UT03_Estructuras_Control/FigurasGeometricas/readme.md
 */
package es.daw.figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class Main {

    //Declaración del scanner a nivel global de la clase
    static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Inicialización del scanner
        sc = new Scanner(System.in);
        int opcion = 0;

        do{
            opcion = elegirOpcionMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Indica la base y la altura");
                    int base = sc.nextInt();
                    int altura = sc.nextInt();
                    pintaRectangulo(base, altura);
                    break;
                case 2:
                    System.out.println("Indica el valor entero del lado del triángulo rectángulo:");
                    int lado = sc.nextInt();
                    pintaTriangulo(lado);
                    break;
                case 3:
                    System.out.println("Indica el número de filas de la pirámide");
                    int filas = sc.nextInt();
                    pintaPiramide(filas);
                    break;
                case 0:
                    System.out.println("El programa se va a cerrar!");
                    break;
                default:
                    System.out.println("Elige una opción válida!");
            }
        }while(opcion != 0);

    }

    /**
     * Método que pinta el menú por consola
     *
     * @return devuelve la opción del menú
     */
    public static int elegirOpcionMenu() {
        System.out.println("*********************************************");
        System.out.println("********** FIGURAS GEOMÉTRICAS **************");
        System.out.println("*********************************************");
        System.out.println("1. RECTÁNGULO");
        System.out.println("2. TRIÁNGULO");
        System.out.println("3. PIRÁMIDE");
        System.out.println("0. SALIR");
        System.out.println("-------------------");
        System.out.print("Elige una opción: ");

        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            return 4; //devuelve una opción no válida cualquiera
        }
    }

    /**
     * Método que pinta un rectángulo
     *
     * @param base
     * @param altura
     */
    public static void pintaRectangulo(int base, int altura) {
        System.out.println("RECTÁNGULO de base " + base + " y altura " + altura);
        //System.out.println("Solución 1:");
        /*
        for (int i = 0; i < altura; i++) {
            String fila = "";

            for (int j = 0; j < base; j++) {
                fila += "* ";
            }
            System.out.println(fila);
        }

        System.out.println("Solución 2:");*/
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    /**
     * Método que pinta un triangulo rectángulo de dos formas
     * @param lado 
     */
    public static void pintaTriangulo(int lado) {
        System.out.println("TRIÁNGULO de lado " + lado + " : primera forma");
        for (int x = 1; x <= lado; x++) {
            for (int i = 1; i <= x; i++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
        
        String fila="";
        for (int x = 1; x <= lado; x++) {
            fila += "* ";
            System.out.println(fila);
        }
        

        System.out.println("TRIÁNGULO de lado " + lado + " : segunda forma");
        for (int x = 1; x <= lado; x++) {
            for (int i = x; i <= lado; i++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
    
    /**
     * Método que pinta una pirámide de n filas de dos formas
     * @param numFilas 
     */
    public static void pintaPiramide(int numFilas){
        String blancos;
        System.out.println("PIRÁMIDE NORMAL");
        for ( int i=numFilas; i>=1; i--){
            // TRIÁNGULO NORMAL
            blancos = "";
            for(int j=1; j<i; j++){
                blancos +=" ";
            }
            
            System.out.print(blancos);
            for ( int k = (i*2)-1; k < (numFilas*2); k++)
                System.out.print("*");
            System.out.println(blancos);
        }        
        
        System.out.println("\nPIRÁMIDE INVERTIDA:");
        for ( int i=numFilas; i>=0; i--){
            // TRIÁNGULO INVERTIDO
            //calcular blancos
            blancos = "";
            for (int j=0; j<(numFilas-i); j++)
                blancos += " ";
            
            System.out.print(blancos);
            for ( int k = 0; k < (i*2)-1; k++)
                System.out.print("*");
            System.out.println(blancos);
        }
        
        
    }
}
