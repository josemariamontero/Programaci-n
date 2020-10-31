/* Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos. */

import java.util.Scanner;

public class ejercicio32 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número entero positivo: ");
		long numero = x.nextInt();

		long numero2 = numero;
		int digitos = 0;
		long vuelta = 0;

		if (numero2 == 0) {
			digitos = 1;
		}

		while (numero2 > 0) {
			vuelta = (vuelta * 10) + (numero2 % 10);
			numero2 /= 10;
			digitos++;
		}

		System.out.print("Digitos pares: ");

		int numPares = 0;
		int suma = 0;

		for (int contador = 0; contador < digitos; contador++) {
			numPares = (int)(vuelta % 10);

			if (numPares % 2 == 0) {
				System.out.print(numPares + ", ");
				suma += numPares;
			}
			vuelta /= 10;

		}

		System.out.println("Suma de los dígitos pares: " + suma);
	}
}