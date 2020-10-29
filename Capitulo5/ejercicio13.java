/* Escribe un programa que lea una lista de diez números 
y determine cuántos son positivos, y cuántos son negativos */

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.println("Introduce números: ");
		
		int positivos = 0;
		int negativos = 0;
		
		for (int contador = 0; contador < 10; contador++) {
			int numero = x.nextInt();

			if (numero >= 0) {
				positivos++;
			} else {
				negativos++;
			}
		}
		
		System.out.println("Se han introducido " + positivos + " numeros positivos y " + negativos + " numeros negativos.");

	}

}