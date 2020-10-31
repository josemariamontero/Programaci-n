/* Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca. */

import java.util.Scanner;

public class ejercicio20 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

	int altura;
	char caracter;

	System.out.print("Introduce la altura: ");
	altura = x.nextInt();

	System.out.print("Introduce un carácter: ");
	caracter = x.next().charAt(0);
	
	int altura2 = 1;
	int espaciosExternos = altura - 1;
	int espaciosInternos = 0;
	int contador = 0;

	while (altura2 < altura) {
		for (contador = 1; contador < espaciosExternos; contador++) {
			System.out.print(" ");
		}

		System.out.print(caracter);
		for (contador = 1; contador < espaciosInternos; contador++) {
			System.out.print(" ");
		}

		if (altura2 > 1) {
			System.out.print(caracter);
		}

		System.out.println(" ");
		altura2++;
		espaciosExternos--;
		espaciosInternos+=2;
	
	}
	for (contador = 0; contador < altura2 + 3; contador++) {
		System.out.print(caracter);
	}
	
	System.out.println(" ");

	}
}