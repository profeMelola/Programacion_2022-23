package mayminnum;

/**
 *
 * @author melol
 */
public class MayMinNum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char mayuscula = 'A';

        char minuscula = 'a';

        char numero = '1';

        System.out.println("mayuscula ascii:" + (int) mayuscula);
        System.out.println("minúscula ascii:" + (int) minuscula);
        System.out.println("numero ascii:" + (int) numero);

        boolean comprobacion;

        // ------------------------ MAYÚSCULAS ------------------------------------
        comprobacion = mayuscula >= 65 && mayuscula <= 90;

        System.out.println("¿ES MAYÚSCULA  ?" + mayuscula + " " + comprobacion);

        comprobacion = minuscula >= 65 && minuscula <= 90;

        System.out.println("¿ES MAYÚSCULA  ?  " + minuscula + " " + comprobacion);

        comprobacion = minuscula >= 65 && minuscula <= 90;

        System.out.println("¿ES MAYÚSCULA  ?  " + numero + " " + comprobacion + "\n");
        
        
        // ------------------------- MINÚSCULAS -------------------------------------
        comprobacion = mayuscula >= 97 && mayuscula <= 122; //// 97  al 122

        System.out.println("¿ES MINÚSCULA?  " + mayuscula + " " + comprobacion);

        comprobacion = minuscula >= 97 && minuscula <= 122; //// 97  al 122

        System.out.println("¿ES MINÚSCULA?  " + minuscula + " " + comprobacion);

        comprobacion = numero >= 97 && numero <= 122; //// 97  al 122

        System.out.println("¿ES MINÚSCULA?  " + numero + " " + comprobacion + "\n");

        comprobacion = mayuscula >= 48 && mayuscula <= 57; //48 al 57
        
        
        //---------------------------- NÚMEROS -------------------------------------

        System.out.println("¿ES NÚMERO?  " + mayuscula + " " + comprobacion);

        comprobacion = minuscula >= 48 && minuscula <= 57; //48 al 57

        System.out.println("¿ES NÚMERO?  " + minuscula + " " + comprobacion);

        comprobacion = numero >= 48 && numero <= 57; //48 al 57

        System.out.println("¿ES NÚMERO?  " + numero + " " + comprobacion);
    }

}
