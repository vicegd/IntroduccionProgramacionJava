package intro;

import java.util.Scanner;

public class While { 
	public static void main(String[] args) {
		int adivinar = (int) (Math.random()*10 + 1); //número aleatorio entre 1 y 10
		
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduce un número del 1 al 10\n"); 
		int numero = leer.nextInt(); 
		
		while (adivinar != numero) {
			System.out.printf("Has fallado. Introduce otra vez un número\n"); 
			numero = leer.nextInt(); 
		}
		
		System.out.printf("Felicidades. Has adivinado el número %d\n", adivinar); 
			
		leer.close();
	}
}




