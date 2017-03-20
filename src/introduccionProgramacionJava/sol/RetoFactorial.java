package introduccionProgramacionJava.sol;

public class RetoFactorial { 
	static int factorial(int n) {
		if (n==0)
			return 1;
		else 
			return factorial(n-1) * n;
	}
	
	public static void main(String[] args) {
		System.out.printf("El factorial de %d es %d", 5, factorial(5));
	}
}




