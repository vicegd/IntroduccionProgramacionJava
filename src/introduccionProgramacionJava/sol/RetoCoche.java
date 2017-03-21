package introduccionProgramacionJava.sol;

public class RetoCoche { 
	static float velocidad(float km, float horas) {
		return km / horas;
	}
	
	public static void main(String[] args) {
		float e = 100f;
		float t = 2.5f;
		float v = velocidad(e, t);
		System.out.printf("Recorriendo %f kilómetros en %f horas, la velocidad es %f km/h\n", e, t, v);
		
		System.out.printf("Recorriendo %f kilómetros en %f horas, la velocidad es %f km/h", 1f, 0.02f, velocidad(1f, 0.02f));
	}
}




