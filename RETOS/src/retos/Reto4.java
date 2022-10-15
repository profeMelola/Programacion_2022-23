/*
 * https://github.com/profeMelola/Programacion_2022-23/blob/main/RETOS/readme.md#reto-4
 */
package retos;

/**
 *
 * @author melol
 */
public class Reto4 {

    public static void main(String[] args) {
        System.out.println(operate(5,0,"/"));
        System.out.println(operate(7,10,"-"));
    }

    public static int operate(int num1, int num2, String operator) {
        int resultado = 0;

        switch (operator) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0)
                    resultado = num1 / num2;
                break;
            case "%":
                resultado = num1 % num2;
                break;
        }
        return resultado;
    }

}
