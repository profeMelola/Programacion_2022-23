package es.daw.poo.model;

import java.time.LocalDate;
import java.util.Random;

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
    private float limite; // limite diario
    
    
    
    // CONSTRUCTORES
    public Tarjeta(String numero, String titular, float saldo) {
        
        /*
        // ------------------------------------
        // Primera forma
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = LIMITE_DEFECTO;
        
        // - generar aleatoriamente un CVV desde 100 a 999
        this.CVV = generarCVV();
        // - activar la tarjeta
        this.activa = true;
        // - incrementar el contador de tarjetas emitidas
        contador++;
        // ----------------------------------------
        */
        
        // Segunda forma
        this(numero,titular,saldo,LIMITE_DEFECTO);
    }

    public Tarjeta(String numero, String titular, float saldo, float limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
        
        // Pendiente realizar las operaciones automáticas al dar de alta
        // una tarjeta en el sistema:
        // - generar aleatoriamente un CVV desde 100 a 999
        this.CVV = generarCVV();
        // - activar la tarjeta
        this.activa = true;
        // - incrementar el contador de tarjetas emitidas
        contador++;
        // - automáticamente la fecha de caducidad será 1 año después de la fecha de alta
        this.fechaCaducidad = generarFechaCaducidad();
    }
    
    // GETTERS AND SETTERS

    public static String getENTIDAD() {
        return ENTIDAD;
    }

    public static float getLIMITE_DEFECTO() {
        return LIMITE_DEFECTO;
    }

    public static int getContador() {
        return contador;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getCVV() {
        return CVV;
    }

    public boolean isActiva() {
        return activa;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }
    
    // setters..

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    
    
    // MÉTODOS PROPIOS
    
    /**
     * Método para realizar el pago con la tarjeta
     * @param importe
     * @return 
     */
    public boolean pagar(float importe){
        
        boolean error;
        
        if (importe > saldo || importe > limite){
            System.out.println("[ERROR] No se ha podido realizar el pago");
            error = true;
        }else{
            saldo -= importe;
            error = false;
        }
        
        return error;
        
    }
    
    /**
     * Método que genera un número aleatorio entre 100 y 999
     * @return 
     */
    private int generarCVV(){
        Random r = new Random();
        //limiteInferior + r.nextInt((limiteSuperior +1) - limiteInferior)
                
        return 100+r.nextInt(900);
    }
    
    /**
     * Método que suma un año a la fecha actual
     * @return 
     */
    private LocalDate generarFechaCaducidad(){
        return LocalDate.now().plusYears(1);
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + numero + ", titular=" + titular + ", fechaCaducidad=" 
                + fechaCaducidad + ", activa=" + activa + ", saldo=" + saldo 
                + ", limite=" + limite + '}';
    }
    
    
    
    
}
