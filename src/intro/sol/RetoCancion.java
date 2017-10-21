package intro.sol;

public class RetoCancion { 
	public static void main(String[] args) {
		final int NUMERO_BOTELLAS = 99;
		
		for (int i=NUMERO_BOTELLAS; i>=0; i--) {
			if (i > 0) {
				System.out.printf("%d bottles of milk on the wall, %d bottles of milk.\n", i, i);
				System.out.printf("Take one down and pass it around, %d bottles of milk on the wall.\n", i-1);
			}
			else {
				System.out.printf("No more bottles of milk on the wall, no more bottles of milk.\n");
				System.out.printf("Go to the store and buy some more, %d botlles of milk on the walk.\n", NUMERO_BOTELLAS);
			}
		}
		
	}
}




