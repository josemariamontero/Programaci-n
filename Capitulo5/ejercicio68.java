/* Escribe un programa que pida un número por teclado y que luego lo “dislo-
que” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
es impar. Usa long en lugar de int donde sea necesario para admitir números
largos. */

import java.util.Scanner;

public class ejercicio68 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		long numeroTeclado = x.nextLong();

		long digito = 0;

		long numero = numeroTeclado;

		long resultado = 0;
		long numeroInvertido = 0;
		long numeroInvertido2 = 0;

		while (numeroTeclado > 0) {
			digito = numeroTeclado % 10;

			if ((digito % 2 == 0)) {
				digito++;
			} else {
				digito--;
			}

			numeroTeclado /= 10;

			resultado = (resultado * 10) + digito;
		}

		while (resultado > 0) {
			numeroInvertido = resultado % 10;
			
			numeroInvertido2 = (numeroInvertido2 * 10) + numeroInvertido;

			resultado /= 10;	
		}

		System.out.println("Dislocando el " + numero + " sale el " + numeroInvertido2);
	}
}