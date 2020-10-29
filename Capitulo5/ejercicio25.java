/* Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés. */

import java.util.Scanner;

public class ejercicio25 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero = x.nextInt();

		int aux = numero;
		int numero2 = 0;

		while (aux > 0) {
			numero2 = (aux % 10) + (numero2 * 10);
			aux /= 10;
		}
		System.out.println("El número " + numero + " dado la vuelta es " + numero2);
	}
}