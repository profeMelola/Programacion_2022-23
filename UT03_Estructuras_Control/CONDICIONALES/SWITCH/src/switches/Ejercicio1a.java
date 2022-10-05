package switches;

import java.util.Scanner;

public class Ejercicio1a {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("Introduce una letra");
		char letra = lector.nextLine().charAt(0);

		lector.close();

		switch (letra) {
			case 'a':
				System.out.println("Es la vocal a");
				break;
	
			case 'e':
				System.out.println("Es la vocal e");
				break;
			case 'i':
				System.out.println("Es la vocal i");
				break;
			case 'o':
				System.out.println("Es la vocal o");
				break;
			case 'u':
				System.out.println("Es la vocal u");
				break;
			
			default:
				System.out.println("No es vocal: " + letra);
		}

		

	}
}
