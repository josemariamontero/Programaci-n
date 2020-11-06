/* Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
número es afortunado si contiene más números de la suerte que de la mala
suerte. Realiza un programa que diga si un número introducido por el usuario
es afortunado o no. */

import java.util.Scanner;

public class ejercicio62 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();
		

		int afortunado = 0;
		int noAfortunado = 0;
		int digito = 0;

		int numero = numeroTeclado;

		while (numeroTeclado > 0) {
			digito = numeroTeclado % 10;
		
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afortunado++;
			} else {
				noAfortunado++;
			}

			numeroTeclado /= 10;

		}		

		if (noAfortunado < afortunado) {
			System.out.println("El número " + numero + " es afortunado");
		} else { 
		System.out.println("El número " + numero + " no es afortunado");
		}
	}
}