package es.daw.strings;

public class Ejercicio5 {
	public static void main(String[] args) {
		String txt = "Java Java Java";
		int vowels = 0, consonants = 0;
		//With for traditional
		for (int i = 0; i < txt.length(); i++) {
			txt = txt.replace(" ","");
			if(txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i'
                    || txt.charAt(i) == 'o' || txt.charAt(i) == 'u') {
				vowels+=1;
			} else {
				consonants++;
			}
		}
		System.out.println(txt + " tiene " + vowels + " vocales y " + consonants + " consonantes");
		
                //With forEach traditional - Avanzado, ya veremos los bucles forEach cuando demos los arrays
		/*
                vowels = 0;
		consonants = 0;
		for (char character : txt.toCharArray()) {
			txt = txt.replace(" ","");
			if(character == 'a' || character == 'e' || character == 'i'
                    || character == 'o' || character == 'u') {
				vowels+=1;
			} else {
				consonants++;
			}
		}
		System.out.println(txt + " tiene " + vowels + " vocales y " + consonants + " consonantes");
                */
	}
}