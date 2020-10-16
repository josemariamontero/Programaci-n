/* Realiza un conversor de Mb a Kb.*/

import java.util.Scanner;

public class ejercicio10 { 
	public static void main(String[] args ) {

	Scanner x = new Scanner(System.in);

	System.out.print("Introduce un número: ");
	int numero = x.nextInt();

	int conversión = numero * 1024;

	System.out.println("El número " + numero + " equivale a " + conversión + " Kb");


	}

	}