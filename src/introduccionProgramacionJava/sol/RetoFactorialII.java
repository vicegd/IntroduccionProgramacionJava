package introduccionProgramacionJava.sol;

import java.util.Scanner;

public class RetoFactorialII { 
	static int factorial(int n) {
		if (n==0)
			return 1;
		else 
			return factorial(n-1) * n;
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		int numero; 
		
		do {
			System.out.printf("Introduce un número positivo\n"); 
			numero = leer.nextInt(); 
		} while (numero < 0);
				
		leer.close();
		
		System.out.printf("El factorial de %d es %d", numero, factorial(numero));
		
	}
}




