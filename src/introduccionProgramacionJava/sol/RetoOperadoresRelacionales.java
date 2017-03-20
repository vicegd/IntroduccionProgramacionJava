package introduccionProgramacionJava.sol;

import java.util.Scanner;

public class RetoOperadoresRelacionales { 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduzca dos números\n"); 
		int a = leer.nextInt(); 
		int b = leer.nextInt();
		System.out.printf("Los números que has introducido son %d y %d\n", a, b); 

	    System.out.printf("a == b = %b\n", a == b);
	    System.out.printf("a != b = %b\n", a != b);
	    System.out.printf("a > b = %b\n", a > b);
	    System.out.printf("a < b = %b\n", a < b);
	    System.out.printf("b >= a = %b\n", b >= a);
	    System.out.printf("b <= a = %b\n", b <= a);
		
		leer.close();
	}
}




