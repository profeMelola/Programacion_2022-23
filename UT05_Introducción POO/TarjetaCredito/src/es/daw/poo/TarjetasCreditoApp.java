/*
 * https://github.com/profeMelola/Programacion_2022-23/tree/main/UT05_Introducci%C3%B3n%20POO/TarjetaCredito
 */
package es.daw.poo;

import es.daw.poo.model.Tarjeta;

/**
 *
 * @author melola
 */
public class TarjetasCreditoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Provocar fallo: al comprar no tengo saldo
        Tarjeta t1 = new Tarjeta("666", "Mari", 500);
        
        Tarjeta t2 = new Tarjeta("11111","Paula",1000);
        
        //Provocar fallo de compra por límite
        Tarjeta t3 = new Tarjeta("222222","Iván G",5000,10);

        //Da error estos dos casos
        t1.pagar(550);
        
        t3.pagar(11);

        
        // SIMULAMOS QUE SE DAN DE ALTA 3 TARJETAS
        // ESTO SE HA PEDIDO POR SCANNER
        Tarjeta[] tarjetas = new Tarjeta[3];
        tarjetas[0] = t1;
        tarjetas[1] = t2;
        tarjetas[2] = t3;
        
        imprimeTarjetas(tarjetas);
        
        //compra correcta de 250 euros
        t2.pagar(250);
        
        imprimeTarjetas(tarjetas);
        
        
    }
    
    public static void imprimeTarjetas(Tarjeta[] tarjetas){
        // INFORME DE TARJETAS DADAS DE ALTA EN EL SISTEMA
        System.out.println("* INFORME DE TARJETAS DADAS DE ALTA EN EL SISTEMA");
        for(Tarjeta t: tarjetas)
            System.out.println(t);
        
    }
    
}
