/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT05_Introducci%C3%B3n%20POO/Concesionario
 */
package es.daw.concesionario;

import es.daw.concesionario.model.Coche;
import java.util.Arrays;

/**
 *
 * @author melola
 */
public class ConcesionarioApp {
    
    public static void main(String[] args) {
        
        //1. Creamos el concesionario (array de objetos coche)
        // 10 plazas de coches en el local
        
        /*Coche[] coches = {
           new Coche("1111BVJ",3,"BMW"),
           new Coche("2222BVK",5,"BMW"),
           new Coche("3333BVL",3,"BMW")
        };
        coches[3] = new Coche("4444AAA", 5, "Audi", 1500);
        
        //Va a dar una excepción ArrayIndexOutBoundsException
        System.out.println(Arrays.toString(coches));
        */
        
        Coche[] coches = new Coche[10];
        coches[0] = new Coche("1111BVJ",3,"BMW");
        coches[1] = new Coche("2222BVK",5,"BMW");
        coches[2] = new Coche("4444AAA", 5, "Audi", 1500);
        coches[3] = new Coche("3333BVL",3,"BMW");
        coches[4] = new Coche("5555KKK", 5, "Audi", 3000, 25500);
        
        Coche miBMW = new Coche("5555LLL",5,"BMW");
        coches[5] = miBMW;
        
        
        // Voy a poner el precio a los BMW
        //miBMW.setPrecio(30000);
        coches[5].setPrecio(30000); // uso la referencia
        miBMW.aplicarDescuento(800);
        System.out.println("Información del coche una vez aplicado el descuento:\n"+coches[5].toString());
        
        
        
        // Pendiente hacer un método para devolver el número de plazas libres que 
        // hay en el local del concesionario
        
        // Pendiente: poner el precio 50000 al coche con matrícula 1111BVJ
        
        //System.out.println("** INFORMACIÓN DE LOS COCHES DEL CONCESIONARIO **");
        //System.out.println(Arrays.toString(coches));
        
        
    }
    
    
}
