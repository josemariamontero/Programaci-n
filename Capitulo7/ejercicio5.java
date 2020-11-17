/* Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente. */

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//defino un array reservando 10 espacios
		int []numero = new int[10];

		//declaro las variables máximo y mínimo
		int maximo = 0;
		int minimo = 0;

		//Pido los números por teclado y los añado al array

		for (int i = 0; i < numero.length; i++) {
			System.out.print("Introduce un número: ");
			numero[i] = x.nextInt();

			//compruebo cuál es el número máximo

			if (numero[i] > maximo) {
				maximo = numero[i];
			} 

			//compruebo cuál es el número mínimo

			if (numero[i] < minimo) {
				minimo = numero[i];
			}
		}

		// muestro por pantalla los números máximos y mínimos
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == maximo) {
				System.out.println(i + " maximo");
			} else {
				System.out.println(i + " minimo");
			}	
		}
 	}
}