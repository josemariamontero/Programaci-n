/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante. */

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//defino el array y reservo 10 espacios
		int []numeros = new int[10];

		//pido números por teclado y los almaceno en el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce un número: ");
			numeros[i] = x.nextInt();
		}

		//Muestro el array original
		System.out.println("ARRAY ORIGINAL");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//salto de linea
		System.out.println();

		//defino 2 arrays para guardar los números primos y los no primos 
		int []primos = new int[10];
		int []noPrimos = new int[10];

		//recorro el array y guardo los primos y no primos en un array
		for (int i = 0; i < numeros.length; i++) {
			boolean primo = true;
			if (numeros[i] % 2 == 0) {
				primo = false;
			}

			if (primo) {
				primos[i] = numeros[i];
			} else {
				noPrimos[i] = numeros[i];
			}
		}

		System.out.println("ARRAY MODIFICADO");

		//meto los primos en las primeras posiciones 
		for (int i = 0; i < numeros.length; i++) {
			if (primos[i] != 0) {
				System.out.print(primos[i] + " ");
			}
		}

		//meto los no primos en las posiciones restantes
		for (int i = 0; i < numeros.length; i++) {
			if (noPrimos[i] != 0) {
				System.out.print(noPrimos[i] + " ");
			}
		}

		System.out.println();
	}
}

