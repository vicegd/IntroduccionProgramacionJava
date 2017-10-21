package intro.sol;

import java.util.Scanner;

public class RetoCondicionalIfElseIfSwitch {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduce el día de la semana (del 1 al 7)\n");
		int dia = leer.nextInt(); 
		
		switch (dia) {
		case 1:
		case 2:
			System.out.printf("Aún estamos comenzando la semana \n");
			break;
		case 3:
		case 4:
			System.out.printf("Ya estamos a mitad de semana \n");
			break;
		case 5:
			System.out.printf("Estamos a punto de terminar la semana \n");
			break;
		default:
			System.out.printf("Ya es fin de semana \n");
			break;
		}
		
		leer.close();
	}
}




