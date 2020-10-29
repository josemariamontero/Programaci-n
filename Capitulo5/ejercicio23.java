/* Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media. */

import java.util.Scanner;

public class ejercicio23 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		int suma = 0;
		double media;
		int contador;

		for (contador = 0; suma <= 10000; contador++) {
			System.out.print("Introduce números: ");
			int numero = x.nextInt();

			suma += numero;
		}

		media = suma / contador;

		System.out.println("Total acumulado: " + suma);
		System.out.println("Números introducidos: " + contador);
		System.out.println("Media: " + media);
	}
}