/* Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca. */

import java.util.Scanner;

public class ejercicio20 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

	int altura;
	char caracter;

	System.out.print("Introduce la altura: ");
	altura = x.nextInt();

	System.out.print("Introduce un carácter: ");
	caracter = x.next().charAt(0);
	
	int espacios;
	espacios = altura - 1;

	}
}