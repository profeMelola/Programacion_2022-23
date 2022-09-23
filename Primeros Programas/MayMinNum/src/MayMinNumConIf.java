/*

Este programa debe indicar al usuario que escriba un carácter, pudiendo ser:

    Una letra en mayúsculas.
    Una letra en minúsculas.
    Un número.

Una vez introducido el carácter el programa debe mostrar un mensaje 
por consola indicando si el caracter introducido es una letra en mayúsculas, 
minúsculas o un número. 

En caso de que no sea ninguna de las tres cosas anteriores que el programa 

muestre un mensaje de aviso.

 */
package MayMinNum;

import java.util.Scanner;

/**
 *
 * @author melola
 */
public class MayMinNumConIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char caracter;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("* Escribe un caracter (may, min o num): ");
        
        caracter = sc.next().charAt(0);
        
        // https://elcodigoascii.com.ar/
        // 65 -> 90 : mayúsculas
        // 97 -> 122 : minúsculas
        // 48 -> 57 : número
        
        
        
        if ( caracter >= 65 && caracter <= 90){
            System.out.println("Has introducido una letra en mayúsculas");
            System.out.println("Estupendo!");
        }else if ( caracter >= 97 && caracter <= 122){
            System.out.println("Has introducido una letra en minúsculas");
            System.out.println("Estupendo");
        }else if ( caracter >= 48 && caracter <= 57)
            System.out.println("Has introducido un dígito");
        else
            System.out.println("Majete!! que has metido mal el carácter!!!");
        
        
    }
    
}
