package introduccionProgramacionJava.sol;

import java.util.Scanner;

public class RetoCondicionalIfElse3 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduce un numero\n"); 
		int numero = leer.nextInt(); 
		
		if (numero%10 == 0 && numero%6 == 0) {
			System.out.println("El numero introducido es multiplo de 10 y de 6");
		}
		else {
			System.out.println("El numero introducido no es multiplo de 10 y de 6");
		}
		
		leer.close();
	}
}




