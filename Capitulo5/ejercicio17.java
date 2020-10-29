/* Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo). */

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un numero: ");
		int numero = x.nextInt();

		int contador = 0;
		int suma = 0;

		while (numero < 0) {
			System.out.print("Por favor, introduce un número positivo: ");
			numero = x.nextInt();
		}

		for (int y = numero; y < numero + 100; y++) {
			suma += y;
		}
		System.out.println(suma);
		
	}
}