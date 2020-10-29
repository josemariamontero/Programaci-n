/* Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia */

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Dime una base: ");
		int base = x.nextInt();

		System.out.print("Dime un exponente: ");
		int exponente = x.nextInt();

		
		double resultado = Math.pow(base, exponente);

		System.out.println("La potencia es: " + resultado);
	}
}