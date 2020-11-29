/* potencia: Dada una base y un exponente devuelve la potencia. */

import java.util.Scanner;

public class ejercicio4 {
	//funcion que calcula la potencia de una base y un exponente
	public static int potencia(int base, int exponente) {
		int potencia = 0;
		potencia = (int)(Math.pow(base,exponente));
		return potencia;
	}

	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);
		//pido la base
		System.out.print("Introduce la base: ");
		int base = x.nextInt();

		//pido el exponente
		System.out.print("Introduce el exponente: ");
		int exponente = x.nextInt();

		//llamo a la función y muestro el resultado
		System.out.println(base + " * " + exponente + " = " + potencia(base,exponente));
	}
}