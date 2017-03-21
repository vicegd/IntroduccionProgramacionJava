package introduccionProgramacionJava.sol;

import java.util.Scanner;

public class RetoMenuOperaciones { 
	static int potencias(int a, int b) {
		return (int)Math.pow(a, b);
	}
	
	static float operacion(int a, int b, int c) {
		return (float)a*b/c;
	}
	
	public static void main(String[] args) {
		System.out.printf("1- Elevar un n�mero a otro\n");
		System.out.printf("2- Multiplicaci�n de dos n�meros y divisi�n por el tercero de ellos\n");
		
		System.out.printf("Por favor, elige una opci�n\n"); 
		Scanner leer = new Scanner(System.in); 
		int opcion = leer.nextInt(); 

		switch(opcion) {
		case 1: 
			System.out.printf("Introduce un n�mero\n"); 
			int a = leer.nextInt(); 
			System.out.printf("Introduce otro n�mero\n"); 
			int b = leer.nextInt(); 
			System.out.printf("%d^%d=%d", a, b, potencias(a,b));
			break;
		case 2: 
			System.out.printf("Introduce un n�mero\n"); 
			a = leer.nextInt(); 
			System.out.printf("Introduce otro n�mero\n"); 
			b = leer.nextInt(); 
			System.out.printf("Introduce otro n�mero m�s\n"); 
			int c = leer.nextInt(); 
			System.out.printf("%d*%d/%d=%f", a, b, c, operacion(a,b,c));
			break;
		default:
			System.out.printf("Opci�n no v�lida\n");
			break;
		}
		
		leer.close();
	}
}




