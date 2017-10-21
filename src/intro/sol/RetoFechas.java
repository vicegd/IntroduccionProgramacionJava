package intro.sol;

import java.util.Scanner;

public class RetoFechas { 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 
		
		System.out.printf("Introduce el día (de 1 a 31)\n"); 
		int dia = leer.nextInt(); 
		System.out.printf("Introduce el mes (de 1 a 12)\n"); 
		int mes = leer.nextInt(); 
		System.out.printf("Introduce el año\n"); 
		int año = leer.nextInt(); 
		leer.close();
		
		String mesTexto = "";
		switch (mes) {
		case 1: 
			mesTexto = "enero";
			break;
		case 2: 
			mesTexto = "febrero";
			break;
		case 3: 
			mesTexto = "marzo";
			break;
		case 4: 
			mesTexto = "abril";
			break;
		case 5: 
			mesTexto = "mayo";
			break;
		case 6: 
			mesTexto = "junio";
			break;
		case 7: 
			mesTexto = "julio";
			break;
		case 8: 
			mesTexto = "agosto";
			break;
		case 9: 
			mesTexto = "septiembre";
			break;
		case 10: 
			mesTexto = "octubre";
			break;
		case 11: 
			mesTexto = "noviembre";
			break;
		case 12: 
			mesTexto = "diciembre";
			break;
		}
		
		String cadena = "La fecha que has introducido es: " + dia + " de " + mesTexto + " de " + año;
		System.out.printf(cadena);
	}
}




