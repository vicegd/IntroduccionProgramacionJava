package intro.sol;

import java.util.Scanner;

public class RetoDoWhile { 
	public static void main(String[] args) {
		int adivinar = (int) (Math.random()*10 + 1); //número aleatorio entre 1 y 10
		
		Scanner leer = new Scanner(System.in); 
		int numero; 
		
		do {
			System.out.printf("Introduce un número del 1 al 10\n"); 
			numero = leer.nextInt(); 
		} while (adivinar != numero);
		
		System.out.printf("Felicidades. Has adivinado el número %d\n", adivinar); 
			
		leer.close();
	}
}




