/* Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado. */

import java.util.Scanner;

public class ejercicio19 {
	public static void main(String[] args ) {
	Scanner x = new Scanner(System.in);

	int altura;
	char caracter;

	System.out.print("Introduce la altura: ");
	altura = x.nextInt();

	System.out.print("Introduce un carácter: ");
	caracter = x.next().charAt(0);

	int espacios;
	int base = 1;
	int linea = 1;
	
	espacios = altura - 1;

	while (base <= altura) {
		for (int contador = 1; contador <= espacios; contador++){
			System.out.print(" ");
		}

		for (int contador2 = 1; contador2 <= linea; contador2++){
			System.out.print(caracter);
		}

		System.out.println("");

		base++;
		espacios--;
		linea+=2;
	}
}
}