/* posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
dentro de un número entero. Si no se encuentra, devuelve -1. */

import java.util.Scanner;

public class ejercicio8 {
	//funcion para comprobar en qué posición se encuentra un dígito
	public static int posicionDeDigito(int numero, int numeroEncontrar) {
		int posiciones = -1;

		numero = ejercicio6.voltea(numero);
		int digitos = ejercicio5.digitos(numero);
		
		
		boolean encontrado = false;

		for (int i = 0; i < digitos && !encontrado; i++) {
			int digito = numero % 10;
			if (digito == numeroEncontrar) {
				encontrado = true;
				posiciones = i;
			}
			numero /= 10;
		}
		return posiciones;		
	}

	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//pido un número
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//pido una posicion
		System.out.print("Introduce una numero a buscar: ");
		int numeroBuscar = x.nextInt();

		//llamo a la función y muestro el resultado
		System.out.println("La posición del número a buscar es: " + posicionDeDigito(numeroTeclado, numeroBuscar));
	}
}