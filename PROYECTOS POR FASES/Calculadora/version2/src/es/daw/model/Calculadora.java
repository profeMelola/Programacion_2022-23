package es.daw.model;

/**
 *
 * @author melola
 */
public class Calculadora {
    
    // PROPIEDADES O ATRIBUTOS
    private String tipo;
    private float operando1;
    private float operando2;
    
    // CONSTRUCTORES

    // Constructor por defecto
    public Calculadora(){
    }
    
    // Constructor 
    public Calculadora(String tipo) {
        this.tipo = tipo;
    }
    
    
    //GETTERS & SETTERS
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public float getOperando1() {
        return operando1;
    }

    public void setOperando1(float operando1) {
        this.operando1 = operando1;
    }

    public float getOperando2() {
        return operando2;
    }

    public void setOperando2(float operando2) {
        this.operando2 = operando2;
    }
    
    // MÉTODOS DE COMPORTAMIENTO
    
    public float sumar(){
        return operando1 + operando2; 
        
    }
    
    public float restar(){
        return operando1 - operando2; 
    }

    public float multiplicar(){
        return operando1 * operando2; 
    }

    public float dividir(){
        return operando1 / operando2; 
    }

    public  float resto(){
        return operando1 % operando2; 
    }    
    
    
    
}
