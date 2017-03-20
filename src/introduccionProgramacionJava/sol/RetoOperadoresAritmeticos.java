package introduccionProgramacionJava.sol;

import java.util.Scanner;

public class RetoOperadoresAritmeticos { 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduce dos números\n"); 
		int numero1 = leer.nextInt(); 
		int numero2 = leer.nextInt();
		System.out.printf("Los números que has introducido son %d y %d\n", numero1, numero2); 

		System.out.printf("%d + %d = %d \n", numero1, numero2, numero1 + numero2);
		System.out.printf("%d - %d = %d \n", numero1, numero2, numero1 - numero2);
		System.out.printf("%d * %d = %d \n", numero1, numero2, numero1 * numero2);
		System.out.printf("%d / %d = %d \n", numero1, numero2, numero1 / numero2);
		System.out.printf("%d %% %d = %d \n", numero1, numero2, numero1 % numero2);
		
		leer.close();
	}
}




