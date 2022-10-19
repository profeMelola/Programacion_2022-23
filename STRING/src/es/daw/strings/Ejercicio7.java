package es.daw.strings;

public class Ejercicio7 {
	public static void main(String[] args) {
		String txt = "Me gusta programar en Java";
		System.out.println(txt + " en mayúsculas: " + txt.toUpperCase());
		txt = txt.toUpperCase(); //JAVEROS
		System.out.println(txt + " en minúsculas: " + txt.toLowerCase());
	}
}