
package es.daw.concesionario.util;

import es.daw.concesionario.model.Coche;
import java.util.Arrays;

/**
 *
 * @author melola
 */
public class Utilidades {
    
    /**
     * 
     * @param coches
     * @return 
     */
    public static int obtenerNumPlazasLibres(Coche[] coches){
        int contador = 0;
        for(Coche c: coches){
            if (c == null) contador++;
        }
        
        return contador;
    }
    
    /**
     * 
     * @param coches
     * @param marca
     * @param descuento 
     */
    public static void aplicarDescuentoPorMarca(Coche[] coches, String marca, int descuento){
        for(Coche c: coches){
            if (c != null){
                if (c.getMarca().equalsIgnoreCase(marca))
                    c.aplicarDescuento(descuento);
            }
        }
        
    }
    
    /**
     * 
     * @param coches
     * @param matricula
     * @param precio 
     */
    public static void ponerPrecioPorMatricula(Coche[] coches, String matricula, int precio){
        for(Coche c: coches){
            if (c != null){
                if (c.getMatricula().equalsIgnoreCase(matricula))
                    c.setPrecio(precio);
            }
        }
        
    }
    
    
    /**
     * 
     * @param coches 
     */
    public static void mostrarInfoConcesionario(Coche[] coches){
        System.out.println("** INFORMACIÓN DE LOS COCHES **");
        System.out.println(Arrays.toString(coches));
        
    }
    
    public static void mostrarInfoConcesionario(Coche[] coches, String marca){
        System.out.println("** INFORMACIÓN DE LOS COCHES DE MARCA "+marca+" **");
        //System.out.println(Arrays.toString(coches));
        for (int i = 0; i < coches.length; i++) {
            if(coches[i] != null){
                if(coches[i].getMarca().equalsIgnoreCase(marca))
                    System.out.println(coches[i]);
            }
        }
        
    }
    
    /**
     * PENDIENTE!!!!
     * Mostrar informe solo de los coches cuyo precio sea inferior a una cantidad dada.
     */
    
    
}
