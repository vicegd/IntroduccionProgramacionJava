package introduccionProgramacionJava.sol;

public class RetoCadenasOperaciones { 
	public static void main(String[] args) {
		String gijon = "Gijón";
		
		int i = 0;
		while (i < gijon.length()) {
			System.out.printf("%c", gijon.charAt(i));
			i++;
		}
		
		//for (int i=0; i<gijon.length(); i++) {
		//	System.out.printf("%c", gijon.charAt(i));
		//}
	}
}




