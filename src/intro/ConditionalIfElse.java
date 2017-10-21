package intro;

public class ConditionalIfElse { 
	public static void main(String[] args) {
		int edad = 20;
		
		System.out.printf("Inicio del programa\n");
		if (edad >= 18) {
			System.out.printf("Tienes %d años. Eres mayor de edad \n", edad);
		}
		else {
			System.out.printf("Tienes %d años. Aún no eres mayor de edad \n", edad);
		}
		System.out.printf("Fin del programa\n");
	}
}




