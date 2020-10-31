/* Escribe un programa que cambie un dígito dentro de un número dando la
posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
empezando por el 1. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos. */

import java.util.Scanner;

public class ejercicio45 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un numero: ");
		long numero = x.nextInt();

		System.out.print("Introduce la posicion donde quiere insertar el número: ");
		long posicion = x.nextInt();

		System.out.print("Introduce el dígito que quiere insertar: ");
		long digito = x.nextInt();

		int longitud = 0;

		long numero2 = numero;

		do {
			numero2 /= 10;
			longitud++;
		} while (numero2 > 0);

		long derecha = numero % (long)(Math.pow(10, longitud - posicion + 1));

		long izquierda = numero / (long)(Math.pow(10, longitud - posicion + 1));
		izquierda = izquierda * 10 + digito;

		numero2 = izquierda * (long)(Math.pow(10, longitud - posicion + 1)) + derecha;
		System.out.println(numero2);
	}
}