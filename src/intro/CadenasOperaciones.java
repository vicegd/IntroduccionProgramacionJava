package intro;

public class CadenasOperaciones { 
	public static void main(String[] args) {
		String gijon = "Gijón";
		String oviedo = "Oviedo";
		String mieres = "Mieres";
		
		System.out.printf("Tamaño de la cadena %s = %d\n", gijon, gijon.length());
		System.out.printf("El primer caracter de la cadena %s = %c\n", oviedo, oviedo.charAt(0));
		System.out.printf("Una subcadena [2, 5) de la cadena %s = %s\n", mieres, mieres.substring(2, 5));
		
		String juntas = gijon + " " + oviedo + " " + mieres;
		System.out.printf("Todas las ciudades juntas: %s\n", juntas);
		
		System.out.printf("Gijón y Oviedo son iguales: %b\n", gijon.equals(oviedo));
		System.out.printf("Gijón y Gijón son iguales: %b\n", gijon.equals("Gijón"));
		System.out.printf("Gijón y Gijon son iguales: %b\n", gijon.equals("Gijon"));
	}
}




