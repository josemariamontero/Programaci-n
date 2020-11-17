/*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array */

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		//defino el array y reservo 15 espacios

		int []numeros = new int[5];

		//Pido números por teclado y los añado al array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce un número: ");
			numeros[i] = x.nextInt();
		}

		//invertimos el número para cambiar la posición

		



	}
}

