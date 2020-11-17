/* Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa. */ 

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args ) {

	Scanner x = new Scanner(System.in);

	//defino el array y reservo 10 espacios

	int []numeros = new int[10];

	//pido 10 números por teclado y los añado al array

	for (int i = 0; i < 10; i++) {
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();
		numeros[i] = numeroTeclado;
		/*También podría hacerse así
		numeros[i] = x.nextInt();*/
	}

	// muestro el array de forma invertida
	for (int i = numeros.length - 1; i >= 0; i--) {
		System.out.println(i + " = " + numeros[i]);
	}

	}
}