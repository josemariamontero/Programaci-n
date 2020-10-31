/* Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no. */

import java.util.Scanner;

public class ejercicio42 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		boolean primo;

		System.out.print("Introduce un número positivo: ");
		int numero = x.nextInt();

		for (int numero2 = numero; numero2 < numero + 5; numero2++) {
			primo = true;

			for (int contador = 2; contador < numero2; contador++) {
				if (numero2 % contador == 0) {
					primo = false;
				}
			}

			if (primo) {
				System.out.println(numero2 + " es primo");
			} else {
				System.out.println(numero2 + " no es primo");
			}
		}

	}
}

