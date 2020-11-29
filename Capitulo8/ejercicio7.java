/* digitoN: Devuelve el dígito que está en la posición n de un número entero.
Se empieza contando por el 0 y de izquierda a derecha */

import java.util.Scanner;

public class ejercicio7 {
	//funcion para calcular el dígito
	public static int digitoN(int numero, int posicion) {
		numero = ejercicio6.voltea(numero);

		int digitos = ejercicio5.digitos(numero);
		int posiciones = -1;

		while (!(posiciones == posicion)) {
			digitos = numero % 10;
			numero /= 10;
			posiciones++;
		}

		return digitos;
	}

	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//pido un número por teclado y la posicion
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//pido la posicion
		System.out.print("Introduce la posicion: ");
		int posicion = x.nextInt();

		//llamo a la función y muestro el resultado
		System.out.println(digitoN(numeroTeclado,posicion));
	}	
}



