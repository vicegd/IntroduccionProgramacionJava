package intro;

import java.util.Scanner; //importamos el código que nos permite leer del teclado

public class ObtencionValores { 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); //para poder leer cosas por teclado
		
		System.out.printf("Introduce dos números\n"); 
		int num1 = leer.nextInt(); //un número entero
		int num2 = leer.nextInt(); //otro número entero
		System.out.printf("Los números que has introducido son %d y %d\n", num1, num2); 
		
		leer.close(); //para finalizar de leer cosas por teclado
	}
}




