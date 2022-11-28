package es.daw.poo.model;

import java.time.LocalDate;

/**
 * TARJETA PREPAGO
 * @author melola
 */
public class Tarjeta {
    
    // ATRIBUTOS
    private static final String ENTIDAD = "DAW_BANK";    
    private static final float LIMITE_DEFECTO = 1000;
    
    // Común para todas las tarjetas y vamos a incrementarlo
    // Siempre sabré cuantas tarjetas se han emitido
    private static int contador; 
    private String numero;
    private String titular;
    private LocalDate fechaCaducidad;
    private int CVV;  //generar aleatoriamente un CVV desde 100 a 999
    private boolean activa; //en el momento de dar de alta la tarjeta queda activada
    private float saldo;
    private float limite;
    
    
    
    // CONSTRUCTORES
    public Tarjeta(String numero, String titular, float saldo) {
        /*
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = LIMITE_DEFECTO;
        */
        this(numero,titular,saldo,LIMITE_DEFECTO);
    }

    public Tarjeta(String numero, String titular, float saldo, float limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
        
        //
    }
    
    
    
    
}
