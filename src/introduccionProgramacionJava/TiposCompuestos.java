package introduccionProgramacionJava;

public class TiposCompuestos { 
	public static void main(String[] args) throws InterruptedException {
		System.out.printf("ALGUNAS PRUEBAS CON MATH\n");
		System.out.printf("log(8) = %f\n", Math.log(8));
		System.out.printf("abs(-1.53) = %f\n", Math.abs(-1.53));
		System.out.printf("random = %f\n", Math.random());
		System.out.printf("round(1.53) = %d\n", Math.round(1.53));
		System.out.printf("round(1.43) = %d\n", Math.round(1.43));
		System.out.printf("max(10, 7) = %d\n", Math.max(10, 7));
		
		System.out.printf("\nAHORA PARELIZAREMOS EL PROGRAMA 3 SEGUNDOS\n");
		Thread.sleep(3000);
		System.out.printf("FIN\n");
	}
}




