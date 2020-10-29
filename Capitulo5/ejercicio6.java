/* Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucledo-while. */

public class ejercicio6 {
	public static void main(String[] args ) {
		int i = 320;

		do {
			System.out.println("Numeros de 320 al 160: " + i);
			i -= 20;
		} while(i >= 160);
	}
}