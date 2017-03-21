package introduccionProgramacionJava.sol;

public class RetoCoche3 { 
	static float velocidad(float km, float horas) {
		return km / horas;
	}
	
	static float aceleracion(float velocidad_final, float velocidad_inicial, float tiempo) {
		return (velocidad_final - velocidad_inicial)/tiempo;
	}
	
	static String modelo() {
		return "Seat León TDI";
	}
	
	public static void main(String[] args) {
		float e = 100f;
		float t = 2.5f;
		float v = velocidad(e, t);
		System.out.printf("Recorriendo %f kilómetros en %f horas, la velocidad es %f km/h\n", e, t, v);
		
		System.out.printf("Recorriendo %f kilómetros en %f horas, la velocidad es %f km/h\n", 1f, 0.02f, velocidad(1f, 0.02f));
		
		System.out.printf("Aceleración (caso 1) %f m/s^2\n", aceleracion(46.1f, 18.5f, 2.47f));
		System.out.printf("Aceleración (caso 2) %f m/s^2\n", aceleracion(0f, 22.4f, 2.55f));
		
		System.out.printf("El modelo del doche es un %s", modelo());
		
	}
}




