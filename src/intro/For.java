package intro;

import java.util.Scanner;

public class For { 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		int suma = 0;	
		
		for (int i=0; i<5; i++) {
			System.out.printf("Introduce un n�mero\n"); 
			int numero = leer.nextInt(); 	
			suma = suma + numero;
		}
		
		System.out.printf("La suma total de los n�mero es %d\n", suma); 
			
		leer.close();
	}
}




