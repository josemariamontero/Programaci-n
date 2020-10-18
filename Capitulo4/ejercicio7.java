/* Realiza un programa que calcule la media de tres notas. */

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args ) {

	System.out.print("Introduce una nota: ");
	double nota1 = Double.parseDouble(System.console().readLine());

	System.out.print("Introduce otra nota: ");
	double nota2 = Double.parseDouble(System.console().readLine());

	System.out.print("Introduce otra nota: ");
	double nota3 = Double.parseDouble(System.console().readLine());
	
	double sumaTotal = nota1 + nota2 + nota3;
	double media = sumaTotal / 3;

	System.out.println("La media total de tus notas es: " + media);
	}
}