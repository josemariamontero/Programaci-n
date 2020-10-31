/* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.*/

import java.util.Scanner;

public class ejercicio31 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce la altura de la L: ");
		int altura = x.nextInt();

		for (int contador = 0; contador < altura; contador++){
			System.out.println("*");
		}

		for (int contador2 = 0; contador2 < (altura / 2) + 1; contador2++) {
			System.out.print("* ");

		}


	}
}