// bucle do-while que termina cuando se introduce un número impar

import java.util.Scanner;

public class ejercicio30 {
	public static void main(String[] args ) {
		int numero;

		Scanner x = new Scanner(System.in);

		do {
			System.out.print("Introduce un número: ");
			numero = x.nextInt();

			if (numero % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar, saliendo del programa");
			}
		} while (numero % 2 == 0);
	}
}