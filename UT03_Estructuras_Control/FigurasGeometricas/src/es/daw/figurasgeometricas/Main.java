/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/UT03_Estructuras_Control/FigurasGeometricas/readme.md
 */
package es.daw.figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class FigurasGeometricas {

    static Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        
        String paBorrar= "hola";
        
        int opcion = 0;
        
        do{
            
            opcion = elegirOpcionMenu();
            
            switch (opcion){
                case 1:
                    // PINTAR RECTÁNGULO
                    System.out.println("Indica la base y la altura");
                    int base = sc.nextInt();
                    int altura = sc.nextInt();
                    pintaRectangulo(base,altura);
                    
                    break;
                case 2:
                    System.out.println("Indica el lado: ");
                    pintaTriangulo(sc.nextInt());
                    break;
                case 3:
                    //pendiente
                    break;
                default:
                    System.out.println("Elige una opción válida!");
                
            }
            
            
        }while (opcion != 0);
        
    }
    
    /**
     * Método estático (o función) que muestra el menú y devuelve
     * la opción elegida por el usuario
     * @return 
     */
    public static int elegirOpcionMenu(){
        System.out.println("*********************************************");
        System.out.println("********** FIGURAS GEOMÉTRICAS **************");
        System.out.println("*********************************************");
        System.out.println("1. RECTÁNGULO");
        System.out.println("2. TRIÁNGULO");
        System.out.println("3. PIRÁMIDE");
        System.out.println("0. SALIR");
        System.out.println("-------------------");
        System.out.print("Elige una opción: ");

        if(sc.hasNextInt())
            return sc.nextInt();
        else
            return 4; // devuelvo una opción no válida cualquiera
        
    }
    
    /**
     * Método estático que pinta con asteriscos un rectángulo por consola
     * @param base
     * @param altura 
     */
    public static void pintaRectangulo(int base, int altura){
        
        for (int i=1; i <= altura; i++){
            for (int j=1; j <= base; j++)
                System.out.print("* ");
            System.out.println(" ");
        }
        
    }
    
    /**
     * pintaTriangulo
     * @param lado 
     */
    public static void pintaTriangulo(int lado){
        
        for (int i=1; i<= lado; i++){
            for(int j=1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
