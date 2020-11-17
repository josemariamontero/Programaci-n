/* Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda. */

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//defino el array y reservo 8 espacios
		int []numeros = new int[8];

		//pido números por teclado y los guardo en el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce un número: ");
			numeros[i] = x.nextInt();
		}

		//recorro el array para comprobar si el número es par o impar

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " par");
			} else {
				System.out.println(numeros[i] + " impar");
			}
		}
	}
}