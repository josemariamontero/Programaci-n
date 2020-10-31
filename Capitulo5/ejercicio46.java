/* Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
que tanto la anchura como la altura sean mayores o iguales que 2, en caso
contrario se debe mostrar un mensaje de error. */

import java.util.Scanner;

public class ejercicio46 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		int altura = 0;
		int anchura = 0;

		System.out.print("Introduce la anchura del rectángulo: ");
		anchura = x.nextInt();

		System.out.print("Introduce la altura del rectángulo: ");
		altura = x.nextInt();
		
		if ((altura <= 2) || (anchura <= 2)) {
			System.out.println("Error, datos incorrectos");
		} else {
		
		
			for (int i = 1; i < altura; i++) {
				System.out.println("*");
			}


			for (int y = 0; y < anchura; y++) {
				System.out.print("* ");
			}

			System.out.println();
	}


	}
}