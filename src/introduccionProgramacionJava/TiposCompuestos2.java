package introduccionProgramacionJava;

import java.util.Date; //para trabajar con fechas tenemos que importar esta funcionalidad

public class TiposCompuestos2 { 
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date fecha = new Date(); //se crea un nuevo "objeto" para trabajar con fechas
		//ahora ya podemos usar ese "objeto" a nuestro gusto...
		System.out.printf("Son las %d:%d horas\n", fecha.getHours(), fecha.getMinutes());
	}
}




