package switches;

import java.util.Scanner;

public class Ejercicio1b {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Introduce una letra");
		char letra = lector.nextLine().charAt(0);

		lector.close();

		switch (letra) {
			case 'a':
				System.out.println("Es la vocal a");
					
			case 'e':
				System.out.println("Es la vocal e");
				
			case 'i':
				System.out.println("Es la vocal i");
				
			case 'o':
				System.out.println("Es la vocal o");
				
			case 'u':
				System.out.println("Es la vocal u");
				
			default:
				System.out.println("No es vocal: " + letra);
		}
		
		System.out.println("Cuando se entra en un bloque switch"
				+ "y la variable coincide con el valor de un caso"
				+ "se van a ejecutar todos los casos a partir de ese"
				+ "hasta encontrar una sentencia break");
		
		
	}
}
