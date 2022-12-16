package es.daw.pasapalabra;

import java.util.Scanner;
import es.daw.pasapalabra.util.Palabras;
import es.daw.pasapalabra.util.Utilidades;

/**
 *
 * @author melol
 */
public class Pasapalabra {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // DECLARACIÓN DE VARIABLES
        
        //Contadores de aciertos, errores y rondas
        int aciertos = 0, errores = 0, ronda = 0;
        
        //Constante con el número máximo de errores
        final int MAX_ERRORES = 5;
        
        //Constante con el número máximo de rondas
        final int MAX_RONDAS = 3;
        
        //Variable para controlar la continuidad del juego
        boolean continuar = true;
        
        // Arrays con las letras, palabras, definiciones del panel
        String[] letras = Palabras.devuelveLetras();
        
        String[] palabras= Palabras.devuelveSoluciones();

        String[] definiciones = Palabras.devuelveDefiniciones();
        
        // Variable con la palabra escrita por el usuario
        String intento; 
        
        // Variable con la puntuación obtenida por el jugador
        int puntuacion = 0;
        // ---------------------------------------------------------
        
        // EMPIEZA EL JUEGO: PRIMER MENSAJE
        System.out.println("* LETRAS DEL JUEGO:");
        Utilidades.pintarLetras(letras);
        
        // BUCLE DO-WHILE PARA GESIONAR LAS RONDAS
        // empezamos por la primera letra
        do {
            // recorremos todas las letras por cada ronda

            ronda++;
            System.out.println("\n\t***************************");
            System.out.println("\t  COMENZAMOS LA RONDA : " + ronda);
            System.out.println("\t***************************\n");

            // recorro el panel de letras
            for (int i = 0; i < letras.length; i++) {

                // si la letra no se ha acertado previamente
                if (!letras[i].equals("*")) {
                    
                    // i es la posición de la letra 
                    
                    System.out.println("\n* " + definiciones[i] + " que empieza por la letra " + letras[i] + " : ");

                    intento = sc.nextLine();
                    
                    // En el caso de que el jugador escriba "pasapalabra" no se hará nada
                    if (!intento.equalsIgnoreCase("PASAPALABRA")) {

                        if (Utilidades.aceptarPalabra(intento, palabras, i)) {
                            
                            // Incremento los aciertos
                            aciertos++;
                            
                            // Muestro mensaje al usuario
                            System.out.println("\nHAS ACERTADO!!! LLEVAS ACUMULADOS " + aciertos + " ACIERTOS");
                            System.out.println("Y " + errores + " ERRORES");
                            
                            // Cambio la letra a * (indico que ha acertado)
                            letras[i] = "*";
                            
                        } else {
                            
                            // Incremento los errores
                            errores++;
                            
                            // Controlo si se ha sobrepasado el número máximo de errores permitidos
                            if (errores >= MAX_ERRORES) {
                                //i += letras.length; //Para que pare el bucle for
                                
                                System.out.println("\nNO HAS ACERTADO!!! HAS ALCANZADO EL MÁXIMO DE ERRORES");
                                continuar = false; //finaliza el juego
                                
                            } else {
                                // No ha acertado pero continúa el juego
                                System.out.println("\nNO HAS ACERTADO!!! LLEVAS ACUMULADOS " + errores + " ERRORES ");
                                System.out.println("Y " + aciertos + " ACIERTOS");
                            }

                        }
                    }
                    // Se muestra el panel 
                    System.out.println("\nSITUACIÓN DEL PANEL:  ");
                    Utilidades.pintarLetras(letras);
                }
            }

            System.out.println("FINALIZADA LA RONDA NÚMERO : " + ronda);
            System.out.println("Número de aciertos " + aciertos + ".\nNúmero de errores " + errores);
            if ((aciertos == letras.length)) {
                System.out.println(" ENHORABUENA!!!! HAS ACERTADO TODAS LAS PALABRAS.");
                // Termina el juego
                continuar = false;
            } else if (errores == MAX_ERRORES) {
                // Termina el juego
                continuar = false;
                ronda=0; // Pongo la ronda a 0 para que al calcular los puntos no me de puntuación extra
                System.out.println("HAS ALCANZADO EL NÚMERO MÁXIMO DE ERRORES");

            } else if (ronda == MAX_RONDAS) {
                System.out.println("HA TERMINADO LA RONDA 3. EL JUEGO HA ACABADO.");
                continuar = false;     
                
                ronda = 0;
                //puntuacion = Utilidades.calcularPuntuacion(aciertos, errores, 0);
            }
           
        } while (continuar);
        System.out.println("HAS OBTENIDO " + Utilidades.calcularPuntuacion(aciertos, errores, ronda) + " PUNTOS ");
        // calcular puntuación y mostrar
    }

}
