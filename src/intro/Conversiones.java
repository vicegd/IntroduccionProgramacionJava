package intro;

public class Conversiones { 
	public static void main(String[] args) {
		float numero_decimal = 60.5f;
		int numero_entero = (int)numero_decimal;
		char caracter = (char)numero_entero; //el ASCII 60 se corresponde con el caracter <		
		int numero_entero2 = (int)caracter;
		
		System.out.printf("El valor decimal es: %f \n", numero_decimal);
		System.out.printf("El valor entero es: %d \n", numero_entero);
		System.out.printf("El valor del caracter es: %c \n", caracter);
		System.out.printf("El valor entero2 es: %d \n", numero_entero2);
	}
}




