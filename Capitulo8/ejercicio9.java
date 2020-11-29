/* quitaPorDetras: Le quita a un número n dígitos por detrás (por la
derecha). */

import java.util.Scanner;

public class ejercicio9 {
	//funcion para quitar numeros por atras
	public static int quitaPorDetras(int numero, int posicion) {
		int resultado = 0;
		resultado = (int)(Math.pow(10,posicion));
		return numero / resultado;
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
		System.out.println("El número cortado es: " + quitaPorDetras(numeroTeclado,posicion));
	}
}
