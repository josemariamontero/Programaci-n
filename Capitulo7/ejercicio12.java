/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. */

import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//defino un array reservando 10 espacios
		int []numeros = new int[10];
		//int []numeros = {20, 5, 7, 4, 32, 9, 2, 14, 11, 6};

		//pido por teclado números y los almaceno en el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce números: ");
			numeros[i] = x.nextInt();
		}

		//muestro el array original
		System.out.println("ARRAY ORIGINAL");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//salto de línea
		System.out.println();

		//declaro las variables inicial y final
		int valorInicial = 0;
		int valorFinal = 0;

		//pido ambos valores por teclado y realizo las comprobaciones
		do {
			System.out.print("Introduce un valor inicial (0-9): ");
			valorInicial = x.nextInt();
			System.out.print("Introduce un valor final (0-9): ");
			valorFinal = x.nextInt();
		} while ((valorInicial > valorFinal) && (valorInicial >= 0 && valorInicial <= 9) && (valorFinal >= 0 && valorFinal <= 9));
		

		//utilizo un auxiliar para coger el último número
		int auxiliar = numeros[valorInicial];

		//recorro el array de manera invertida desde el valorInicial
		for (int i = valorInicial; i > 0; i--) {
			numeros[i] = numeros[i - 1];
		}

		//cojo el último dígito
		numeros[0] = numeros[numeros.length - 1];

		//cambio el valorInicial por el valorFinal en el array
		for (int i = numeros.length - 2; i >= valorFinal; i--) {
			numeros[i + 1] = numeros[i];
		}

		numeros[valorFinal] = auxiliar;

		System.out.println("ARRAY ROTADO");
		//Recorro el array rotado 
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		} 

		//salto de línea
		System.out.println();

	}
}