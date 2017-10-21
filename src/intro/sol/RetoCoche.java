package intro.sol;

public class RetoCoche { 
	static float velocidad(float km, float horas) {
		return km / horas;
	}
	
	public static void main(String[] args) {
		System.out.printf("Recorriendo %f kilómetros en %f horas, la velocidad es %f km/h\n", 100f, 2.5f, velocidad(100f, 2.5f));
		System.out.printf("Recorriendo %f kilómetros en %f horas, la velocidad es %f km/h", 1f, 0.02f, velocidad(1f, 0.02f));
	}
}




