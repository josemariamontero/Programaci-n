/* Realiza un conversor del sistema decimal al sistema de “palotes”. */

import java.util.Scanner;

public class ejercicio37 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número positivo: ");
		int numero = x.nextInt();

		int aux = numero;
		int digitos = 0;
		int invertido = 0;

		while (aux > 0) {
			invertido = (invertido * 10) + (aux % 10);
			aux /= 10;
			digitos++;
		}

		int numero2 = 0;

		for (int contador = 0; contador < digitos; contador++) {
			numero2 = invertido % 10;
			invertido /= 10;

			for (int contador2 = 0; contador2 < numero2; contador2++) {
				System.out.print("|");
			}
			if (contador < digitos - 1) {
				System.out.print("-");
			}
		}
	}
}