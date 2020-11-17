/* Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. */

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//defino el array reservando 100 espacios

		int []numeros = new int[100];

		//guardo los números aleatorios en el array

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*21);
			System.out.println(numeros[i]);
		}

		//pido 2 números

		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		System.out.print("Introduce otro número: ");
		int numeroTeclado2 = x.nextInt();

		// cambio el primer valor por el segundo en el array

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numeroTeclado) {
				numeros[i] = numeroTeclado2;
				System.out.println("\"" + numeros[i] + "\"");
			} else {
				System.out.println(numeros[i]);
			}
		}		

	}
}