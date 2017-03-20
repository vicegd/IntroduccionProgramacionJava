package introduccionProgramacionJava;

import java.util.Scanner;

public class OperadoresAritmeticos { 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduce dos números\n"); 
		int numero1 = leer.nextInt(); 
		int numero2 = leer.nextInt();
		System.out.printf("Los números que has introducido son %d y %d\n", numero1, numero2); 

		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int mult = numero1 * numero2;
		int cociente = numero1 / numero2;
		int resto = numero1 % numero2;

		System.out.printf("%d + %d = %d \n", numero1, numero2, suma);
		System.out.printf("%d - %d = %d \n", numero1, numero2, resta);
		System.out.printf("%d * %d = %d \n", numero1, numero2, mult);
		System.out.printf("%d / %d = %d \n", numero1, numero2, cociente);
		System.out.printf("%d %% %d = %d \n", numero1, numero2, resto);
		
		leer.close();
	}
}




