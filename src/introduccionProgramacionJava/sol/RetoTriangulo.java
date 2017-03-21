package introduccionProgramacionJava.sol;

import java.util.Scanner;

public class RetoTriangulo { 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduzca el tamaño del triángulo\n"); 
		int num = leer.nextInt(); 	
		leer.close();
		
		for (int filas = 1; filas <= num; filas++) {
			for (int espacios = 1; espacios <= num - filas; espacios++) {
				System.out.printf("  ");                         
			}
			
			for (int valor = 1; valor <= 2 * filas - 1; valor++) {
			    System.out.printf(" %d", valor);
			}
			
			System.out.print("\n");
		}
	}
}




