/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumasegundo;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class SumaSegundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    Scanner sc = new Scanner(System.in);
      int h, m, s;

      System.out.print("Introduzca hora: ");
      h = sc.nextInt();
      System.out.print("Introduzca minutos: ");
      m = sc.nextInt();
      System.out.print("Introduzca segundos: ");
      s = sc.nextInt();

      // Aumento los segundos introducidos en uno
      s++; 

      if (s > 59) { 
         s = 0;        
         m++; 

         if (m > 59) {  
            m = 0; 
            h++; 

            if (h > 23) { 
               h = 0; 
            }
         }
      }
      System.out.println("Hora + 1 segundo: " + h + ":" + m + ":" + s);        
    }
    
}
