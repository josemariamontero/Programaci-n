/* Realiza un programa en java que pinte un reloj de arena
representado por asteriscos (*) y un llenado de ese reloj representado por
guiones (-). Para ello pedirá dos valores: altura del reloj de arena y el nivel de
llenado. */

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce la altura: ");
		int alturaTeclado = x.nextInt();

		System.out.print("Introduce el nivel de llenado: ");
		int llenado = x.nextInt();
		


		// parte de abajo

		int filas = alturaTeclado / 2;
		int espacios = filas - 1;
		int caracteres = 3;
		int i = 0;
		int j = 0;
		
		for (i = 0; i < filas; i++) {
			for (j = 0; j < espacios; j++) {
				System.out.print(" ");
			}

			for (j = 0; j < caracteres; j++) {
				if ((i == filas - 1) || (j == 0) || (j == caracteres - 1)) {
					System.out.print("*");
				} else {
					if (filas - i - 1 > llenado) {
						System.out.print(" ");
					} else {
						System.out.print("-");
					}
				}
			}

			caracteres += 2;
			espacios--;
			System.out.println();
		} 


	}
}