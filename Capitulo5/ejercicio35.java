/* Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error. */

import java.util.Scanner;

public class ejercicio35 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		int altura = 0;

		System.out.print("Introduce la altura: ");
		altura = x.nextInt();

		for (int contador = 1; contador < altura; contador++) {
			System.out.print("x ");
			
			for (int contador2 = 2; contador2  < altura; contador2++) {
				System.out.print("  ");
			}

			System.out.println("x");
			
		}

	}
}