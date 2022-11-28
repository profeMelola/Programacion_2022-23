package gestionfacturasavellaneda;

import static gestionfacturasavellaneda.FacturasDptoAvellaneda.facturas;
import static gestionfacturasavellaneda.FacturasDptoAvellaneda.lector;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class Utilidades {
    
    // ---------------------------------------------------------------
    // 1,5 puntos
    //public static void inicializaFacturas(float[][] facturas, Scanner lector){
    public static void inicializaFacturas(){
        
        for( int i= 0; i < facturas.length; i++){
            System.out.println("* Indica el número de gastos de la factura <"+(i+1)+">");
            int numGastos = lector.nextInt();
            //Cada posición
            facturas[i] = new float[numGastos];
        }
    }
    
    //public static void pedirGastosFacturas(float[][] facturas, Scanner lector){
    public static void pedirGastosFacturas(){
        for( int i= 0; i < facturas.length; i++){
            System.out.println("* Introduce los gastos de la factura <"+(i+1)+">");
            for( int j = 0; j < facturas[i].length; j++){
                System.out.println("\t* Gasto <"+(j+1)+"> :");
                facturas[i][j] = lector.nextFloat();
            }
        }
    }
    
    // ---------------------------------
    
    public static void inicializarPedirGastosFacturas(float[][] facturas, Scanner lector){
        
        for( int i= 0; i < facturas.length; i++){
            System.out.println("* Indica el número de gastos de la factura <"+(i+1)+">");
            int numGastos = lector.nextInt();
            facturas[i] = new float[numGastos];
            System.out.println("* Introduce los gastos de la factura <"+(i+1)+">");
            for( int j = 0; j < facturas[i].length; j++){
                System.out.println("\t* Gasto <"+(j+1)+"> :");
                facturas[i][j] = lector.nextFloat();
            }
        }
        
    }
    
    // --------------------------------------------------------------------
    
    public static void pintaMenu(){
        System.out.println("**** MENÚ ****");
        System.out.println("1. Informe completo");
        System.out.println("2. Informe factura");
        System.out.println("3. Buscar gasto");
        
        System.out.println("4. Salir");
        System.out.println("Elige una opción: ");
    }
    
    // ----------------------------------------------------------------------
    // IMPORTE TOTAL: 1,5 puntos
    // Sólo salen los gastos, ni sumatorio parciales, ni sumatorios totales. 0,5 puntos
    public static void obtenerImportesFacturas(){
        float sumaTotalFacturas = 0;
        float sumaTotalFactura = 0;
        
        for (int i = 0; i < facturas.length; i++){
            System.out.println("\tFactura ("+(i+1)+"): ");
            for (int j = 0; j < facturas[i].length; j++){
                System.out.println("\tGasto ("+(j+1)+"): "+facturas[i][j]);
                sumaTotalFactura += facturas[i][j];
            }
            sumaTotalFacturas += sumaTotalFactura;
            System.out.println("Factura "+(i+1)+", total importe: "+sumaTotalFactura+" euros.");
            sumaTotalFactura = 0;
        }
        System.out.println("Importe total: "+sumaTotalFacturas+" euros.");
    }
    
    // ----------------------------------------------------------------------
    // IMPORTE FACTURA: 1,5 puntos
    // Si no ordenan: 1 punto
    // Si ordenan asc: 1,25
    public static void desgloseFactura(int numFactura){
        
        if ( numFactura > 0 && numFactura <= facturas.length){
            // Hago copia del array de gastos original para que al ordenarlo no fatidiar el original
            float[] gastos = facturas[numFactura - 1].clone();// Primer caso: ordeno los gastos sin fastidiar el original...
            //float[] gastos = facturas[numFactura - 1]; // Segundo caso: ordeno los gastos fastidiando el original...
            int sumaGastos = 0;
            
            Arrays.sort(gastos); //ordena por defecto ascendente

            System.out.println("Gastos ordenados de mayor a menor:");
            // Lo recorro al revés
            for (int i = gastos.length -1; i >= 0 ; i--){
                System.out.println(gastos[i]+" euros.");
                sumaGastos += gastos[i];
            }
           
            System.out.println("Factura "+numFactura+": número totales de gastos <"+gastos.length+">. Importe total de la factura <"+sumaGastos+" euros>");
        }
        else{
            System.out.println("El número de la factura es incorrecto");
        }
        
    }
    // ---------------------------------------------------------
    
    // ---------------------------------------------------------
    // BUSCAR GASTO: 1 punto
    // Primera forma
    public static void buscarGasto(float importeGasto){
        String facturasAux = "";
        int contador = 0;
        
        // Esta forma no es óptima porque cuando encuentra el gasto no para el bucle y si hay dos gastos con el
        // mismo importe sale la factura dos veces ==> con el break se soluciona
        for (int i = 0; i < facturas.length; i++){
            for (int j = 0; j < facturas[i].length; j++){
                if ( facturas[i][j] == importeGasto){
                    facturasAux = facturasAux + (i+1)+" ";
                    contador++;
                    break;
                }
            }
        }
        
        if (contador == 0)
            System.out.println("No se encuentra ningún gasto con importe de "+importeGasto+ " euros.");
        else {
            if (contador == 1)
                System.out.println("El gasto con importe de "+importeGasto+" euros se encuentra en la Factura < "+ facturasAux+">");
            else
                System.out.println("El gasto con importe de "+importeGasto+" euros se encuentra en las Facturas < "+ facturasAux+">");
        }
    }
    // Segunda forma
    public static void buscarGasto2(float importeGasto){
        String facturasAux = "";
        int contador = 0;
        
        for (int i = 0; i < facturas.length; i++){
            //1. copio el array de gastos en uno auxiliar
            float[] gastos = Arrays.copyOf(facturas[i],facturas[i].length);
            //2. lo ordeno
            Arrays.sort(gastos);
            //3. busco
            if (Arrays.binarySearch(gastos, importeGasto) >= 0 ){
                facturasAux = facturasAux + (i+1)+" ";
                contador++;
            }
        }
        
        if (contador == 0)
            System.out.println("No se encuentra ningún gasto con importe de "+importeGasto+ " euros.");
        else {
            if (contador == 1)
                System.out.println("El gasto con importe de "+importeGasto+" euros se encuentra en la Factura < "+ facturasAux+">");
            else
                System.out.println("El gasto con importe de "+importeGasto+" euros se encuentra en las Facturas < "+ facturasAux+">");
        }
    }
    
}
