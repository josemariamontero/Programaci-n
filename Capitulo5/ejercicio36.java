/* Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos. */

import java.util.Scanner;

public class ejercicio36 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		long numero = x.nextInt();

		long invertido = 0;
		long numero2 = numero;

		while (numero2 > 0) {
			invertido = (invertido * 10) + (numero2 % 10);
			numero2 /= 10;
		}

		if (invertido == numero) {
			System.out.println("El número es capicúa");
		} else {
			System.out.println("No es capicúa");
		}
	}
}