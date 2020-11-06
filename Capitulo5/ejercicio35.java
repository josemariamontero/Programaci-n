/* Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error. */

import java.util.Scanner;

public class ejercicio35 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce la altura: ");
		int alturaTeclado = x.nextInt();

		int altura2 = 1;
		int espaciosExteriores = 0;
		int espaciosInteriores = alturaTeclado - 1;

		if ((alturaTeclado < 3) || (alturaTeclado % 2 == 0)) {
			System.out.println("Error");
		} else {

		while (altura2 < alturaTeclado / 2 + 1) {
			for (int i = 1; i <= espaciosExteriores; i++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int i = 1; i < espaciosInteriores; i++) {
				System.out.print(" ");
			}

			System.out.print("*");

			System.out.println();	


			altura2++;
			espaciosExteriores++;
			espaciosInteriores-=2;
		}

		altura2 = 1;
		espaciosInteriores = 0;
		espaciosExteriores = alturaTeclado / 2;

		while (altura2 <= alturaTeclado / 2 + 1) {
			for (int i = 1; i <= espaciosExteriores; i++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int i = 1; i < espaciosInteriores; i++) {
				System.out.print(" ");
			}

			if (altura2 > 1) { 
				System.out.print("*");
			}

			System.out.println();

			altura2++;
			espaciosInteriores += 2;
			espaciosExteriores--;

		}
	}

	}
}