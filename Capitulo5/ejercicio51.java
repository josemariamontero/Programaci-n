/* El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo. */

import java.util.Scanner;

public class ejercicio51 {
	public static void main(String[] args ){
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero = x.nextInt();

		int auxiliar = numero;
		int numInvertido = 0;
		boolean bandera = false;
		int gusano = 0;

		//damos la vuelta al número y quitamos 0 y 8

		while (auxiliar > 0) {
			if ((auxiliar % 10 != 0) && (auxiliar % 10 != 8)) {
				numInvertido = (numInvertido * 10) + (auxiliar % 10);
			} else {
				bandera = true;
			}

			auxiliar /= 10;
		}

		auxiliar = numInvertido;
		numInvertido = 0;

		while (auxiliar > 0) {
			numInvertido = (numInvertido * 10) + (auxiliar % 10);
			auxiliar /= 10;
		}

		if (bandera) {
			System.out.println("Después de haber sido comido por el gusano numérico se queda en: " + numInvertido);
		} else {
			System.out.println("El gusano numérico no se ha comido ningún dígito.");
		}
	}
}