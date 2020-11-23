/* Escribe un programa que rellene un array de 100 elementos con números en-
teros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos. */

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args ) { 
		Scanner x = new Scanner(System.in);


		//defino un array y reservo 100 espacios
		int []numeros = new int[100];

		//declaro variables maximo y minimo
		int maximo = 0;
		int minimo = 0;

		//relleno el array con números aleatorios y calculo máximo y mínimo
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*501);

			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}

			if (numeros[i] < minimo) {
				minimo = numeros[i];
			}
		}

		//Muestro array original
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//salto de línea
		System.out.println();

		//Pregunto si el usuario quiere destacar el máximo o el mínimo
		System.out.println("¿Quiere destacar el máximo (2)?");
		System.out.println("¿Quiere destacar el mínimo (1)?");
		System.out.println("Elige una opción (1 - 2): ");
		int opcion = x.nextInt();

		int auxiliar;

		if (opcion == 1) {
			auxiliar = minimo;
		} else {
			auxiliar = maximo;
		}
		
		//recorro el bucle y muestro entre comillas cuál es el número máximo
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == auxiliar) {
				System.out.print("\"" + numeros[i] + "\"" + " ");
			} else {
				System.out.print(numeros[i] + " ");
			}
		}

		//salto de línea
		System.out.println();
	}
}
