/* Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla. */

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		//defino un array reservando 10 espacios
		int []numeros = new int[10];

		//relleno el array de números aleatorios
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*101);
		}

		//Muestro el array
		System.out.println("ARRAY ORIGINAL");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//salto de línea
		System.out.println();

		boolean existe = false;
		int numeroTeclado;

		do {
			//pido un número a un usuario entre 0 y 100
			System.out.print("Introduce un número entre 0 y 100: ");
			numeroTeclado = x.nextInt();

			//comprobamos que el número está dentro del array
			for (int i = 0; i < numeros.length; i++) {
				if (i == numeroTeclado) {
					existe = true;
				}
			}

			if (!existe) {
				System.out.println("No se encuentra ese número en el array");
			}
		} while (!existe);

		//rotamos el array para poner el número introducido en la primera posicion
		while (numeros[0] != numeroTeclado) {
			int auxiliar = numeros[9];

			for (int i = 14; i > 0; i--) {
				numeros[i] = numeros[i - 1];
			}	

			numeros[0] = auxiliar;
		} 

		//recorro el array rotado para mostrar el resultado
		System.out.println("ARRAY ROTADO");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//salto de línea
		System.out.println();

	}
}