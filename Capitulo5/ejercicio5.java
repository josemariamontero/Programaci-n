/* Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un buclewhile. */

public class ejercicio5{
	public static void main(String[] args ) {
		int i = 320;

		while (i >= 160) {
			System.out.println("Números de 320 al 160: " + i);
			i -= 20;
		}
	}
}