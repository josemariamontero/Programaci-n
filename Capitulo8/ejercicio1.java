/* esCapicua: Devuelve verdadero si el número que se pasa como paráme-
tro es capicúa y falso en caso contrario. */

import java.util.Scanner;

public class ejercicio1 {
	//funcion para comprobar que un número es capicúa
	public static boolean esCapicua(int x) {
		int numeroVolteado = 0;
		int numeroOriginal = x;
		//volteo el número para comprobar que es el mismo
		while (x != 0) {
			numeroVolteado = (x % 10) + (numeroVolteado * 10);
			x /= 10;
		}
		if (numeroVolteado == numeroOriginal) {
			return true;
		}
		return false;
	}

	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//pido por teclado un número
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//llamo a la función para comprobar si el número es capicua
		if (esCapicua(numeroTeclado)) {
			System.out.println("El número introducido es capicua");
		} else {
			System.out.println("El número introducido no es capicua");
		}
	}
}