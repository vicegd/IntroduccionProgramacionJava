package intro.sol;

import java.util.Scanner;

public class RetoCondicionalIfElse {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduce tu edad\n");
		int edad = leer.nextInt(); 
		
		if (edad >= 18) {
			System.out.printf("Tienes %d a�os. Eres mayor de edad \n", edad);
		}
		else {
			System.out.printf("Tienes %d a�os. A�n no eres mayor de edad. Te faltan %d a�os para serlo \n", edad, 18 - edad);
		}
		
		leer.close();
	}
}




