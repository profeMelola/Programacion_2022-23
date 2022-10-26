package es.daw;

//import es.daw.util.Utilidades;
//import es.daw.util.Operaciones;
import es.daw.model.Calculadora;
import es.daw.util.*;
import java.util.Scanner;
//import java.util.*;

/**
 *
 * @author melola
 */
public class calculadoraPOO {
    
    // Declaro el scanner a nivel global de la clase para poder utilizarlo
    // en todos los métodos de la clase
    static Scanner sc = new Scanner(System.in);
    
    static float operando1, operando2;
    
    /**
     * @param args
     */
    public static void main(String[] args) {

        //Variable donde almacenamos el valor seleccionado
        //del menú
        int opcion = 0;
        
        // Crear el objeto calculadora
        Calculadora calculadora1 = new Calculadora();
        //calculadora1.setTipo("Estándar");
        System.out.println("Tipo calc1: "+calculadora1.getTipo());
        
        Calculadora calc2 = new Calculadora("Científica");
        System.out.println("Tipo calc2: "+calc2.getTipo());
        
        
        do {
            //1. Pintar el menú por consola
            Utilidades.pintaMenu();
            
            
            //2. Leer opción elegida por el usuario
            
            opcion = sc.nextInt();

            //Si la opcion es menor que 0 o mayor que 5, no es una
            if (opcion > 0) {

                System.out.println("\n");

                // Leer operandos
                leerOperandos();

                System.out.println("\n");
                switch (opcion) {
                    case 1: //Suma
                        System.out.println("El resultado de la suma es " + calc2.sumar());
                        break;
                    case 2: //Resta
                        System.out.println("El resultado de la resta es " + calc2.restar());
                        break;
                    case 3: //Multiplicación
                        System.out.println("El resultado de la multiplicación es " + calc2.multiplicar());
                        break;
                    case 4: //División
                        System.out.println("El resultado de la división es " + calc2.dividir());
                        break;
                    case 5: //Resto
                        System.out.println("El resto de dividir " + operando1 + " entre " + operando2 + " es " + calc2.resto());
                        break;
                    default:
                        System.out.println("Opción no válida. Vuelva a escoger");

                }

            }

        } while (opcion != 0); //opcion == 0 implicar salir del programa

        //Indicamos que no vamos a leer ningún valor más por teclado.
        sc.close();

        System.out.println("Finalizando la ejecución de la calculadora");

    }// end main
    
    
    // DECLARACIÓN DE NUEVOS MÉTODOS ESTÁTICOS (FUNCIONES)
    
    /**
     * Método estático que lee e inicializa los dos operandos
     */
    public static void leerOperandos(){

        System.out.print("Introduzca el primer operando: ");
        //operando1 = Float.parseFloat(sc.nextLine());
        operando1 = sc.nextFloat();

        System.out.print("Introduzca el segundo operando: ");
        //operando2 = Float.parseFloat(sc.nextLine());
        operando2 = sc.nextFloat();
        
    }
    
    
}
