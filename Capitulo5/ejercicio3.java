/* Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucledo-while. */

public class ejercicio3 {
	public static void main(String[] args ) {
		int i = 0;

		do {
			System.out.println("Múltiplos de 5: " + i);
			i += 5;
		} while (i <= 100);
	}
}