package intro;

import java.util.Scanner;

public class Cadenas { 
	public static void main(String[] args) {
		String aficion = "informática";
		
		Scanner leer = new Scanner(System.in); //para poder leer cosas por teclado
		
		System.out.printf("Introduce tu nombre\n"); 
		String nombre = leer.next(); //una cadena de texto

		System.out.printf("Tu nombres es %s y te gusta la %s", nombre, aficion);
		
		leer.close(); //para finalizar de leer cosas por teclado
		
	}
}




