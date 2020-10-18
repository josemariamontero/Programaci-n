/* Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5. */

public class ejercicio14 {
	public static void main(String[] args ) {
		System.out.print("Introduce un número: ");
		int numero = Integer.parseInt(System.console().readLine());

		if (numero % 2 == 0) {
			System.out.println("El número introducido es par.");
		} else {
			System.out.println("El número introducido es impar.");

		if (numero % 5 == 0) {
			System.out.println("El número introducido es divisible entre 5.");
		} else {
			System.out.println("El número introducido no es divisible entre 5.");
		}

		}
	}
}