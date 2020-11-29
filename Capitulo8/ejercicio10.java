/* quitaPorDelante: Le quita a un número n dígitos por delante (por la
izquierda). */

import java.util.Scanner;

public class ejercicio10 {
	//creo la función para quitar números por delante
	public static int quitaPorDelante(int numero, int quita) {
		numero = ejercicio6.voltea(numero);

		for (int i = 0; i < quita; i++) {
			numero /= 10;
		}

		numero = ejercicio6.voltea(numero);
		return numero;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		//pido por teclado que introduzca un numero
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//pido la posicion a partir de la cual queremos quitar los números por detrás
		System.out.print("Introduce la posición: ");
		int posicion = x.nextInt();
		
		//Muestro el número cortado
		System.out.println("El número cortado es: " + quitaPorDelante(numeroTeclado,posicion));
	}
}