/* Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
queda igual. */

import java.util.Scanner;

public class ejercicio55 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		long numero = x.nextLong();

		long auxiliar = numero;
		int contador = 0;

		while (auxiliar > 0) {
			auxiliar /= 10;
			contador++;
		}

		int ultimoNumero = (int)(numero % 10);
		auxiliar = numero / 10;
		long resultado = ultimoNumero * (long)Math.pow(10, contador - 1) + auxiliar;

		System.out.println("El número resultado es: " + resultado);

	}
}