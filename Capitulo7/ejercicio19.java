/* Realiza un programa que sea capaz de insertar un número en una posición
concreta de un array. En primer lugar, el programa generará un array de 12
números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
el programa preguntará por el número que se quiere insertar y por la posición
donde será insertado. Los números del array se desplazan a la derecha para
dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
siempre se perderá. */

import java.util.Scanner;

public class ejercicio19 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//defino el array y reservo 12 espacios
		int []numeros = new int[12];

		//relleno el array con números random
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*201);
		}

		//Muestro el array original
		System.out.println("ARRAY ORIGINAL");
		System.out.print("Índice: " + " ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(i + " ");
		}

		//salto de línea
		System.out.println();

		System.out.print("Valor: " + " ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//salto de línea
		System.out.println();

		//pregunto el número y la posición en la que queremos meter el número introducido
		System.out.print("Introduzca el número que quiere insertar: ");
		int numeroTeclado = x.nextInt();

		System.out.print("Introduce la posición donde lo quiere insertar (0-11): ");
		int posicion = x.nextInt();

		//recorro el array y cambio en la posición indicada el número introducido por teclado
		System.out.println("ARRAY RESULTADO");
		for (int i = 0; i < numeros.length; i++) {
			if (i == posicion) {
				numeros[i] = numeroTeclado;
			}
		}	

		System.out.print("Índice: " + " ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(i + " ");
		}

		//salto de línea
		System.out.println();

		System.out.print("Valor: " + " ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//salto de línea
		System.out.println();

	}
}