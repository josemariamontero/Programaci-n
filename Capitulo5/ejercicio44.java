/* Escribe un programa que sea capaz de insertar un dígito dentro de un número
indicando la posición. El nuevo dígito se colocará en la posición indicada y el
resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
correctamente los datos. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. */

import java.util.Scanner;

public class ejercicio44 {
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

		long derecha = numero / (long)(Math.pow(10, longitud - posicion + 1));
		derecha = derecha * 10 + digito;

		long izquierda = numero % (long)(Math.pow(10, longitud - posicion + 1));
	
		numero2 = derecha * (long)(Math.pow(10, longitud - posicion + 1)) + izquierda;
		System.out.println(numero2);
	}
}	