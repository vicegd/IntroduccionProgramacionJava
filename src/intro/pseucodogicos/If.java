package intro.pseucodogicos;

public class If {
	public static void main(String[] args) {
		boolean condicion = true;
		boolean condicion2 = true;
		boolean condicion3 = true;
		
		if (condicion) {
			//se ejecutan instrucciones aqu� 
			//si se cumple la condici�n
		}
		
		
		if (condicion) {
			//hacemos algo
		}
		else {
			//hacemos otra cosa
		}
		
		
		if (condicion) {
			//hacemos algo
		}
		else if (condicion2) {
			//o hacemos otra cosa
		}
		else if (condicion3) {
			//o puede que alguna otra cosa
		}
		else {
			//si no se cumple ninguna de las
			//condiciones previas, hacemos
			//lo que ponemos aqu�
		}
		
//		switch (variable) {
//		case valor1:
//			//hacemos algo
//			break;
//		case valor2:
//			//hacemos otra cosa
//			break;
//		case valor3:
//			//hacemos otra cosa diferente
//			break;
//		default:
//			//si no se cumple ninguna otra opci�n
//			//por defecto se hace esto
//			break;
//		}
	}
}
