/* Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores. */

import java.util.Scanner;

public class ejercicio33 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce la altura de la U: ");
		int altura = x.nextInt();

		for (int contador = 1; contador < altura; contador++) {
			System.out.print("* ");
			
			for (int contador2 = 2; contador2  < altura; contador2++) {
				System.out.print("  ");
			}

			System.out.println("*");
		}

		System.out.print(" ");
		for (int contador = 2; contador < altura; contador++){
			System.out.print(" *");
		}

	}
}