package gestionfacturasavellaneda;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author melola
 */
public class FacturasDptoAvellaneda {

    //public static float[][] facturas = new float[numFacturas][]; //MAL!!!! ERROR
    public static float[][] facturas;
    
    public static Scanner lector = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // -------------------------------
        //0,25 puntos 
        String numFacturas1 = JOptionPane.showInputDialog("Introduce el número de facturas");
        int numFacturas = Integer.parseInt(numFacturas1); //importante parsear el tipo String al entero primitivo
        // --------------------------------
        
        // ----------------------------------------------------------------
        // 1,5 puntos
        // Si hacen matriz bidimensional rellenada dinámicamente: 0,75 puntos
        // Si meten a mano datos de prueba: 0,25 puntos (por espabilados)
        
        // Está clarinete que es una matriz donde tengo que guardar los datos
        //float[][] facturas = new float[numFacturas][];
        facturas = new float[numFacturas][];
        
        // A mano: primera forma
        //float[][] facturas = {{1,2,3},{4,5}};
        
        // A mano: segunda forma
        /*float[][] facturas = new float[2][3];
        facturas[0][0] = 1;
        facturas[0][1] = 2;
        facturas[0][2] = 3;
        facturas[1][0] = 4;
        facturas[1][1] = 5;
        facturas[1][2] = 6;*/
        
        // Inicializar y rellenar datos por separado
        //Utilidades.inicializaFacturas(facturas, lector); //se crea el array de arrays
        //Utilidades.pedirGastosFacturas(facturas, lector); //se rellena el array de arrays
        
        Utilidades.inicializaFacturas(); //se crea el array de arrays
        
        Utilidades.pedirGastosFacturas(); //se rellena el array de arrays        
        // ----------------------------------------------------------------
        // ---------------------------------------
        // MENÚ: 0,75 puntos
        int opcion = 0;
        while(opcion != 4){
            
            Utilidades.pintaMenu();
            opcion = lector.nextInt();
            
            switch (opcion){
                case 1:
                    Utilidades.obtenerImportesFacturas();
                    break;
                case 2:
                    System.out.println("\tIndica el número de factura:");
                    Utilidades.desgloseFactura(lector.nextInt());
                    break;
                case 3:
                    System.out.println("\tIndica el importe del gasto que quieres buscar:");
                    // Primera forma
                    Utilidades.buscarGasto(lector.nextFloat());
                    
                    // Segunda forma
                    //Utilidades.buscarGasto2(lector.nextFloat());
                    break;
                case 4:
                    System.out.println("Vas a salir del programa");
                    break;
                default:
                    System.out.println("Has elegido una opción incorrecta. Prueba de nuevo.");
            }
        }
        
        // ---------------------------------------
        
    }
    
}
