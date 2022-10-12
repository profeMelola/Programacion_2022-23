/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmodiagrama;

/**
 *
 * @author melola
 */
public class AlgoritmoDiagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        // PRIMERA FORMA:
        //Declaro la variable a y le asigno el valor 2 (tipo entero)
        int a;
        a = 4;

        // SEGUNDA FORMA de declarar y asignar valores
        int b = 3;

        System.out.println("¿Es a mayor que b? "+( a > b ));
        
        System.out.println("**********************");
        
        if (a == b) {
            System.out.println("SON IGUALES!!!!");
        }else if (a > b) {
            System.out.println("EL MAYOR ES A: "+a);
            //System.out.println(a);
            System.out.println("El valor de a es [ "+ a +" ] fin!!!");
        }else{
            System.out.println("EL MAYOR ES B: "+b);
        }

    }// end main
}

// end class
