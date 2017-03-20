package introduccionProgramacionJava.sol;

import java.util.Scanner;

public class RetoFactores { 
	static void factores(int n) {
		for (int i=1; i<n; i++) {
			if (n % i == 0) {
				System.out.printf("%d es un factor de %d\n", i, n);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		int numero; 
		
		do {
			System.out.printf("Introduce un número positivo\n"); 
			numero = leer.nextInt(); 
		} while (numero < 0);
				
		leer.close();
		
		factores(numero);
		
	}
}




