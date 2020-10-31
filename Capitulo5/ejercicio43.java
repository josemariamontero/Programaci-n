/* Escribe un programa que permita partir un número introducido por teclado en
dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
el número introducido tiene dos dígitos como mínimo y la posición en la que
se parte el número está entre 2 y la longitud del número. No se permite en
este ejercicio el uso de funciones de manejo de String (por ej. para extraer
subcadenas dentro de una cadena). */

import java.util.Scanner;

public class ejercicio43 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		long numero = x.nextInt();

		System.out.print("Introduce la posición: ");
		long posicion = x.nextInt();

		int longitud = 0;
		long numero2 = numero;

		do {
			numero2 /= 10;
			longitud++;
		} while (numero2 > 0);

		long derecha = numero / (long)(Math.pow(10, longitud - posicion + 1));
		long izquierda = numero % (long)(Math.pow(10, longitud - posicion + 1));

		System.out.println("Parte derecha: " + derecha);
		System.out.println("Parte izquierda: " + izquierda);
		
}
}