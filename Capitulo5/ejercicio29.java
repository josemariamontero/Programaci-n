/* Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma. */

import java.util.Scanner;

public class ejercicio29 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero = x.nextInt();


		System.out.print("Introduce otro número: ");
		int numero2 = x.nextInt();

		int contador = 1;

		for (contador = 1; contador < numero; contador++) {
			if (contador % numero2 != 0) {
				System.out.println(contador);
			}

		}

	}
}