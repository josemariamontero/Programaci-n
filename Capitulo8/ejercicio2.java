/* esPrimo: Devuelve verdadero si el número que se pasa como parámetro
es primo y falso en caso contrario. */

import java.util.Scanner;

public class ejercicio2 {
	//funcion numeros primos
	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if (x % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//llamo a la función y compruebo que es primo
		if (esPrimo(numeroTeclado)) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El numero no es primo");
		}
	}
}