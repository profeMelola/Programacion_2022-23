package operadorternario;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero =  -763;
		
		System.out.println( numero % 2 == 1 ? "impar" : "par");
		System.out.println( numero % 2 == 0 && numero % 3 == 0 ? "es multiplo de 2 y de 3" : "No lo es" );
	}

}
