/* Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. 
El primer término de la serie de Fibonacci es 0, 
el segundo es 1 y el resto se calcula sumando los dos anteriores, 
por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... 
El número n se debe introducir por teclado. */

import java.util.Scanner;

public class ejercicio12 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero = x.nextInt();

		int primerElemento = 0;
		int segundoElemento = 1;

	for (int i = 3; i <= numero; i++) {
		int suma = primerElemento + segundoElemento;
		System.out.println(suma);
		primerElemento = segundoElemento;
		segundoElemento = suma;
	}

	}
}