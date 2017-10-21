package intro.sol;

import java.util.Scanner;

public class RetoCondicionalIf {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduce dos edades\n"); 
		int edad1 = leer.nextInt(); 
		int edad2 = leer.nextInt();
		System.out.printf("Las edades que has introducido son %d y %d\n", edad1, edad2); 

		if (edad1 <= edad2) {
			System.out.printf("La primera edad introducida es menor que la segunda");
		}
		
		leer.close();
	}
}




