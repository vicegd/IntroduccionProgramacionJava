package intro;

public class Coche { 
	static float velocidad(float km, float horas) {
		float resultado = 0;
		
		resultado = km / horas;
		
		return resultado;
	}
	
	public static void main(String[] args) {
		float v = velocidad(100f, 2.5f);
		System.out.printf("Recorriendo %f kilómetros en %f horas, la velocidad es %f km/h", 100f, 2.5f, v);
	}
}




