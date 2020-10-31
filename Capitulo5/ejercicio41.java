/* Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. */

import java.util.Scanner;

public class ejercicio41 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		long numero = x.nextLong();
		
		long pares = 0;
		long impares = 0;

		while (numero > 0) {
			if (numero % 2 == 0)  {
				pares++;
			} else {
				impares++;
			}

			numero /= 10;
		}

		System.out.println("Cantidad de numeros pares: " + pares);
		System.out.println("Cantidad de numeros impares: " + impares);
	}
}