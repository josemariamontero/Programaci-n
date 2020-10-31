/* Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
encargado realizar un programa que pinte un 8 por pantalla usando la letra
M. Se pide al usuario la altura, que debe ser un número entero impar mayor
o igual que 5. Si el número introducido no es correcto, el programa deberá
mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
La anchura de la figura siempre será de 6 caracteres. */

import java.util.Scanner;

public class ejercicio47 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce la altura (impar mayor o igual a 5): ");
		int altura = x.nextInt();

		int altura2 = (altura -3) / 2;

		if (altura % 2 == 0 || altura < 5) {
			System.out.println("La altura introducida no es correcta.");
		} else {

			System.out.println("MMMMMM");

			for (int i = 0; i < altura2; i++) {
				System.out.println("M    M");
			}

			System.out.println("MMMMMM");

			for (int i = 0; i < altura2; i++) {
				System.out.println("M    M");
			}

			System.out.println("MMMMMM");
		}
	}
}