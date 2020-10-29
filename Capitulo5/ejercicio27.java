/* Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado. */

import java.util.Scanner;

public class ejercicio27 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		int contador = 0;
		int suma = 0;
		int numero = 0;
		int contadorTotal = 0;

		do {

			System.out.print("Introduce un número: ");
			numero = x.nextInt();

			if (numero % 3 == 0) {
				suma += numero;
				contador++;
			}			

			contadorTotal++;

		
		} while (contador < numero);
		
		System.out.println("Suma de los múltiplos de 3: " + suma);
		System.out.println("Cantidad de números múltiplos de 3: " + contador);
		System.out.println("Cantidad de números: " + contadorTotal);

	}
}



