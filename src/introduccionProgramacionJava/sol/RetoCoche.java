package introduccionProgramacionJava.sol;

public class RetoCoche { 
	static float velocidad(float km, float horas) {
		float resultado = 0;
		
		resultado = km / horas;
		
		return resultado;
	}
	
	public static void main(String[] args) {
		float e = 100f;
		float t = 2.5f;
		float v = velocidad(e, t);
		System.out.printf("Recorriendo %f kilómetros en %f horas, la velocidad es %f km/h", e, t, v);
	}
}




