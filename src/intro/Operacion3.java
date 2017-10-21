package intro;

public class Operacion3 {
	static void calculo(int numero, int numero2) {
		System.out.printf("Hola!");
		System.out.printf("Tenemos dos números: %d y %d\n", numero, numero2);
		int suma = numero + numero2;
		System.out.printf("Su suma es: %d\n", suma);
	}

	public static void main(String[] args) {
		calculo(1, 3);
		calculo(3, 2);
		calculo(5, 10);
		calculo(4, 340);
	}
}
