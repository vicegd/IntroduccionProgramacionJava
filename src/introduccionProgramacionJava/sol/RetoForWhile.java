package introduccionProgramacionJava.sol;

import java.util.Scanner;

public class RetoForWhile { 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		int suma = 0;	
		int i = 0;
		
		while (i<5) {
			System.out.printf("Introduce un número\n"); 
			int numero = leer.nextInt(); 	
			suma = suma + numero;
			i = i + 1; //i++
		}
		
		System.out.printf("La suma total de los números es %d\n", suma); 
			
		leer.close();
	}
}




