package introduccionProgramacionJava;

public class Operacion4 {
	static int calculo(int numero, int numero2) {
		System.out.printf("Hola!");
		System.out.printf("Tenemos dos números: %d y %d\n", numero, numero2);
		int suma = numero + numero2;
		System.out.printf("Su suma es: %d\n", suma);
		return suma;
	}

	public static void main(String[] args) {
		int resultado1 = calculo(1, 3);
		int resultado2 = calculo(3, 2);
		int resultado3 = calculo(5, 10);
		int resultado4 = calculo(4, 340);
		System.out.printf("Ahora podemos hacer lo que queramos con los resultados: %d, %d, %d y %d", 
				resultado1, resultado2, resultado3, resultado4);
	}
}
