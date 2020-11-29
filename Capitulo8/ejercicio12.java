/* pegaPorDelante: Añade un dígito a un número por delante. */

import java.util.Scanner;

public class ejercicio12 {
	//funcion para añadir dígitos delante
	public static int pegaPorDelante(int numero, int numero2) {
		return (int)(numero2 * (int)(Math.pow(10, ejercicio5.digitos(numero)))) + numero;
	}

	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//pido un número por teclado
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//pido otro número para añadirlo al final
		System.out.print("Introduce otro número para añadirlo al número: ");
		int numeroTeclado2 = x.nextInt();

		//llamo a la funcion y muestro el resultado
		System.out.println("EL resultado es: " + pegaPorDelante(numeroTeclado, numeroTeclado2));
	}
}