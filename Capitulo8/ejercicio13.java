/* trozoDeNumero: Toma como parámetros las posiciones inicial y final
dentro de un número y devuelve el trozo correspondiente. */

import java.util.Scanner;

public class ejercicio13 {
	//funcion para devolver el trozo indicado por teclado
	public static int trozoDeNumero(int numero, int inicio, int fin) {
		int digitos = ejercicio5.digitos(numero);
		numero = ejercicio9.quitaPorDetras(numero, digitos - fin - 1);
		numero = ejercicio10.quitaPorDelante(numero, inicio);
	
		return numero;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		//pido por teclado que introduzca un numero
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//pido la posicion a partir de la cual queremos quitar los números por detrás
		System.out.print("Introduce el inicio: ");
		int inicio = x.nextInt();

		//pido la posicion a partir de la cual queremos quitar los números por detrás
		System.out.print("Introduce el final: ");
		int fin = x.nextInt();
		
		//Muestro el número cortado
		System.out.println("El trozo de número cortado es: " + trozoDeNumero(numeroTeclado,inicio,fin));
	}
}