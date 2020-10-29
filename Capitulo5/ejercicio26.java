/* Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido. */

import java.util.Scanner;

public class ejercicio26 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero = x.nextInt();

		System.out.print("Introduce un dígito: ");
		int digito = x.nextInt();

		int posicion = 1;

		for (int contador = 1; contador < digito; contador++) {
			if (contador < digito) {
				posicion = contador++;
			}
		} 
		
		System.out.println("El dígito introducido está en la " + posicion + " posición");


	}
}

