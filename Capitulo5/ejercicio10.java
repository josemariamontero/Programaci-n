/* Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. 
A priori, el programa no sabe cuántos números se introducirán. 
El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo */

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args ) {

		Scanner x = new Scanner(System.in);

		System.out.print("Introduce números: ");
		
		int numero = 0;
		int suma = 0;
		int contador = 0;
		int media = 0;

		while (numero >= 0) {
			numero = x.nextInt();
			if (numero > 0) {
				suma += numero;
				contador++;
			}

		}
		
		media = suma / contador;

		System.out.println("La media de los números introducidos es: "+ media);

	}
}