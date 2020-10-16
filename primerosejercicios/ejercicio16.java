// lectura de datos desde teclado usando la clase Scanner

import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args ) { 

	Scanner x = new Scanner(System.in);

	System.out.print("Indica tu nombre: ");

	String nombre = x.nextLine();

	System.out.print("Indica tu edad: ");

	int edad = Integer.parseInt(x.nextLine());

	System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");

	}
}