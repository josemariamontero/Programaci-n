/* Muestra la tabla de multiplicar de un número introducido por teclado. */

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args ){
		Scanner x = new Scanner(System.in);

		int numero;
		int contador = 0;

		System.out.print("Dime el número del que deseas saber su tabla de multiplicar: ");

		for (numero = x.nextInt(); contador <= 10; contador++) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador)); 
		}
	}
}