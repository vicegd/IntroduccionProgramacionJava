package introduccionProgramacionJava.sol;

import java.util.Scanner;

public class RetoCuadrado2 { 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduzca el tamaño del cuadrado\n"); 
		int num = leer.nextInt(); 	
		leer.close();
		
		for (int filas = 1; filas <= num; filas++) {
			for (int columnas = 1; columnas <= num; columnas++) {
			    System.out.printf(" %d", columnas);
			}
			
			System.out.print("\n");
		}
	}
}




