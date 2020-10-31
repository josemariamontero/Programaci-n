/* Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.*/

import java.util.Scanner;

public class ejercicio40 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce la altura: ");
		int altura = x.nextInt();

		int espaciosInternos = 0;
		int espaciosExternos = altura / 2;
		int altura2 = 1;

		while (altura2 < altura / 2 + 1) {
			for (int i = 1; i <= espaciosExternos; i++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int i = 1; i < espaciosInternos; i++) {
				System.out.print(" ");
			}

			if (altura2 > 1) {
				System.out.print("*");
			}

			System.out.println();
			altura2++;
			espaciosExternos--;
			espaciosInternos+=2;
		}

		espaciosInternos = altura - 3;
		espaciosExternos = 1;
		altura2 = 0;

		while (altura2 < altura / 2){
			for (int i = 1; i <= espaciosExternos; i++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int i = 1; i < espaciosInternos; i++) {
				System.out.print(" ");

			}

			if (altura < altura / 2 - 1) {
				System.out.print("*");
			}

			System.out.println();
			altura2++;
			espaciosExternos--;
			espaciosInternos -= 2;
		}

	}
}