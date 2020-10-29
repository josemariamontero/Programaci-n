/* Escribe un programa que muestre en tres columnas, 
el cuadrado y el cubo delos 5 primeros números enteros a partir de uno que se introduce por teclado. */


import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce números para calcular su cuadrado y su cubo: ");
		int numero = x.nextInt();
		
		int contador = 0;


		for (contador = numero; contador < numero + 5; contador++) {
			System.out.println("Número " + contador + " => Cuadrado " + (Math.pow(contador, 2)) + " => Cubo " + (Math.pow(contador, 3)));
		}

	}
}