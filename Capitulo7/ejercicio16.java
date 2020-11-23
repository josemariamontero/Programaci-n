/* Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes. */

import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		//defino un array y reservo 20 espacios
		int []numeros = new int[20];

		//relleno el array de números aleatorios
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*401);
		}

		//Muestro el array original
		System.out.println("ARRAY ORIGINAL");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//salto de línea
		System.out.println();

		//pregunto si se quiere resaltar los números múltiplos de 5 o de 7
		System.out.print("Qué múltiplos quiere resaltar? (5 o 7): ");
		int opcion = x.nextInt();

		//recorro de numero el array y muestro entre corchetes los números que son múltiplos de 5 o 7
		System.out.println("RESALTANDO MÚLTIPLOS DE " + opcion);
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % opcion == 0) {
				System.out.print("[" + numeros[i] + "]" + " ");
			} else {
				System.out.print(numeros[i] + " ");
			}
		}

		//salto de línea
		System.out.println();
	}
}