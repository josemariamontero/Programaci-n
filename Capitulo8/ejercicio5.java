/* digitos: Cuenta el número de dígitos de un número entero. */

import java.util.Scanner;

public class ejercicio5 {
	//funcion para calcular los dígitos que tiene un entero
	public static int digitos(int x) {
		int numero = 0;
		if (x == 0) {
			return 1;
		} else {
			while (x > 0) {
				x /= 10;
				numero++;
			}
		}
		return numero;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		//pido el número por teclado
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//Muestro los dígitos que tiene un número
		System.out.println(numeroTeclado + " tiene " + digitos(numeroTeclado) + " digitos");
	}
}