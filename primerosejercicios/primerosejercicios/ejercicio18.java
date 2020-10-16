// Lectura de datos desde teclado usando la clase Scanner

import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args ) { 

	Scanner x = new Scanner(System.in);

	System.out.print("Introduce tres números enteros o decimales separados por un espacio: ");

	double numero1 = x.nextDouble();
	double numero2 = x.nextDouble();
	double numero3 = x.nextDouble();

	double media = (numero1 + numero2 + numero3) / 3;

	System.out.println("La media de los números introducidos es: " + media);

	}
}