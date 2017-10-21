package intro.sol;

import java.util.Scanner;

public class RetoCondicionalIfElseIf {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduce el día de la semana (del 1 al 7)\n");
		int dia = leer.nextInt(); 
		
		if (dia == 1 || dia == 2) {
			System.out.printf("Aún estamos comenzando la semana \n");
		}
		else if (dia == 3 || dia == 4) {
			System.out.printf("Ya estamos a mitad de semana \n");
		}
		else if (dia == 5) {
			System.out.printf("Estamos a punto de terminar la semana \n");
		}
		else {
			System.out.printf("Ya es fin de semana \n");
		}
		
		leer.close();
	}
}




