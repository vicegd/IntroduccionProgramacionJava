package introduccionProgramacionJava.sol;

import java.util.Scanner;

public class RetoOperadoresRelacionales { 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduzca dos n�meros\n"); 
		float a = leer.nextFloat(); 
		float b = leer.nextFloat();
		System.out.printf("Los n�meros que has introducido son %f y %f\n", a, b); 

	    System.out.printf("a == b = %b\n", a == b);
	    System.out.printf("a != b = %b\n", a != b);
	    System.out.printf("a > b = %b\n", a > b);
	    System.out.printf("a < b = %b\n", a < b);
	    System.out.printf("b >= a = %b\n", b >= a);
	    System.out.printf("b <= a = %b\n", b <= a);
		
		leer.close();
	}
}




