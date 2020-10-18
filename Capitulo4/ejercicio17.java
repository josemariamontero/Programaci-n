/* Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado. */

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args ) { 

	Scanner x = new Scanner(System.in);

	int numero;

	System.out.print("Introduce un número: ");
	numero = x.nextInt();

	int resultado = numero % 10;

	System.out.println("El último dígito introducido es: " + resultado);

	}
}