/*
 https://github.com/profeMelola/Programacion_2022-23/tree/main/Primeros%20Programas/REPASO#ejercicio-2-distanciapuntos
 */
package distanciapuntos;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class DistanciaPuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x1,y1,x2,y2;
        //int distanciaX, distanciaY;
        
        System.out.println("* CÁLCULO DE DISTANCIA ENTRE DOS PUNTOS *");
        System.out.println("Introduce X1: ");
        x1 = sc.nextInt();
        
        System.out.println("Introduce Y1: ");
        y1 = sc.nextInt();
        
        System.out.println("Introduce X2: ");
        x2 = sc.nextInt();
        
        System.out.println("Introduce Y2: ");
        y2 = sc.nextInt();
        
        //1. PARTE I
        //System.out.println("Distancia en el ejec x = "+(x2 - x1)+"\n"
        //        + "Distancia en el eje y = "+(y2 - y1));
        
        //System.out.println("Distancia en el ejec x = "+(x2 - x1)+"\n Distancia en el eje y = "+(y2 - y1));
        
        //System.out.print("Distancia en el ejec x = "+(x2 - x1));
        //System.out.print("Distancia en el eje y = "+(y2 - y1));
        
        System.out.println("Distancia en el ejec x = "+(x2 - x1));
        System.out.println("Distancia en el eje y = "+(y2 - y1));
        
        //2. PARTE II: APLICANDO PITÁGORAS (siguiendo la fórmula)
        // Paso a paso
        int distX = x2 - x1;
        int distY = y2 - y1;
        
        System.out.println("distX: "+distX);
        System.out.println("distY: "+distY);
        
        double cuadradoX = Math.pow(distX,2);
        double cuadradoY = Math.pow(distY,2);
        
        // Si se eleva un número negativo a segunda potencia, el resultado será positivo
        System.out.println("cuadrado X: "+cuadradoX);
        System.out.println("cuadrado Y: "+cuadradoY);
        System.out.println("sumatorio de cuadrados: "+(cuadradoX + cuadradoY));
        
        //double distancia = Math.sqrt(Math.pow(distX,2) + Math.pow(distY, 2));
        double distancia = Math.sqrt(cuadradoX + cuadradoY);
        
        System.out.println("[Pitágoras] distancia entre dos puntos: "+distancia);
        
        
    }
    
}