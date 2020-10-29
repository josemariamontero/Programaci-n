/* Escribe un programa que calcule el factorial de un número entero leído por
teclado. */

import java.util.Scanner;
 
public class ejercicio28 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número para calcular su factorial: ");
		int numero = x.nextInt();
		int factorial = 1;


		for (int contador = 1; contador < numero; contador++){
			factorial *= contador + 1;
		}

		System.out.println("El factorial de " + numero + " es " + factorial);
	}
}