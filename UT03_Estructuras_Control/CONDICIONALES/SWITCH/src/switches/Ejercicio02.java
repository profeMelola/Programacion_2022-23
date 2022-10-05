package switches;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce una cantidad de gramos");
		int gramos = input.nextInt(); 
		
		if(gramos >= 0) {
			
			System.out.println("1: Kilogramos");
			System.out.println("2: Hectogramos");
			System.out.println("3: Decagramos");
			System.out.println("4: decigramos");
			System.out.println("5: centigramos");
			System.out.println("6: miligramos");
			System.out.println("�A qu� unidad quieres convertirlos?");
			int opcion = input.nextInt();
			
			switch (opcion) {
			case 1:
				double kg = gramos / 1000.0;
				System.out.println(kg + " kg");
				break;
				
			case 2:
				double hectogramos = gramos / 100.0;
				System.out.println(hectogramos + " hectogramos");
				break;
			case 3:
				double decagramos = gramos / 10.0;
				System.out.println(decagramos + " decagramos");
				break;
			case 4:
				double decigramos = gramos * 10;
				System.out.println(decigramos + " decigramos");
				break;
			case 5:
				double centigramos = gramos * 100;
				System.out.println(centigramos + " centigramos");
				break;
			case 6:
				double miligramos = gramos * 1000;
				System.out.println(miligramos + " miligramos");
				break;
			default:
				System.out.println("Opcion no contemplada");
				break;
			}
			
		} else {
			System.out.println("Los gramos no pueden ser negativos");
		}
		
		
		input.close();
	}

}
