/* Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7. */

import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		int numero = 0;
		int numero2 = 0;	

		do {
			System.out.print("Introduce un número: ");
			numero = x.nextInt();

			System.out.print("Introduce otro número: ");
			numero2 = x.nextInt();
		} while (numero == numero2);
	
		for (int y = numero; y <= numero2; y += 7) {
			System.out.println(y);
		}
	}

}