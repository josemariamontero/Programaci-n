// lectura de datos desde teclado usando la clase Scanner

import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Indica tu nombre y tu edad separados por un espacio: ");

		String nombre = x.next();
		int edad = x.nextInt();

		System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");

	}
}