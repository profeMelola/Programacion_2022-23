/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT03_Estructuras_Control/Calculadora
 */
package es.daw.calculadora;

import java.util.Scanner;

/**
 *
 * @author melol
 */
public class CalculaConFunciones {

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
        
        do {
            //1. Pintar el menú por consola
            pintaMenu();
            
            
            //2. Leer opción elegida por el usuario
            
            //(Más adelante) Estas líneas de código nos permiten leer del teclado
            //y transformar el valor leído de String a int
            // 1) Recoger el valor escrito en el teclado
            // 2) Transformar esa cadena de caracteres en un valor entero
            //opcion = Integer.parseInt(sc.nextLine());
            
            opcion = sc.nextInt();

            //Si la opcion es menor que 0 o mayor que 5, no es una
            //opción válida
            if (opcion < 0 || opcion > 5) {
                System.out.println("Opción no válida. Vuelva a escoger");
                //Si la opcion es diferente a cero, solicitamos los 
                //dos operandos
            } else if (opcion != 0) {

                System.out.println("\n");

                // Leer operandos
                leerOperandos();

                System.out.println("\n");
                switch (opcion) {
                    case 1: //Suma
                        System.out.println("El resultado de la suma es " + sumar(operando1,operando2));
                        break;
                    case 2: //Resta
                        System.out.println("El resultado de la resta es " + restar( operando1, operando2));
                        break;
                    case 3: //Multiplicación
                        System.out.println("El resultado de la multiplicación es " + multiplicar(operando1, operando2));
                        break;
                    case 4: //División
                        System.out.println("El resultado de la división es " + dividir(operando1, operando2));
                        break;
                    case 5: //Resto
                        System.out.println("El resto de dividir " + operando1 + " entre " + operando2 + " es " + resto(operando1, operando2));
                        break;

                }

            }

        } while (opcion != 0); //opcion == 0 implicar salir del programa

        //Indicamos que no vamos a leer ningún valor más por teclado.
        sc.close();

        System.out.println("Finalizando la ejecución de la calculadora");

    }// end main
    
    
    // DECLARACIÓN DE NUEVOS MÉTODOS ESTÁTICOS (FUNCIONES)
    
    /**
     * Método estático que pinta el menú de la calculadora por consola
     */
    public static void pintaMenu(){
        //Imprimimos por consola el menú
        System.out.println("\n"); //Este caracter especial nos permite imprimir una línea en blanco
        System.out.println("***** MENÚ DE LA CALCULADORA *****");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resto de la división (operador %)");
        System.out.println("0. Salir del programa");
        System.out.println("--------------------------------------");
        System.out.print("Introduzca una opción válida: ");
    }

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
    
    /**
     * Método estático que realiza la suma de dos operadores y devuelve el resultado
     * @param op1
     * @param op2
     * @return 
     */
    public static float sumar(float op1, float op2){
        //float resultado = op1 + op2;
        //return resultado;
        return op1 + op2; 
        
    }
    
    public static float restar(float op1, float op2){
        return op1 - op2; 
    }

    public static float multiplicar(float op1, float op2){
        return op1 * op2; 
    }

    public static float dividir(float op1, float op2){
        return op1 / op2; 
    }

    public static float resto(float op1, float op2){
        return op1 % op2; 
    }
    
}
