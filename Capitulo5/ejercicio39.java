/*Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial.*/ 

import java.util.Scanner;

public class ejercicio39 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero = x.nextInt();

		int factorial = 1;

		for (int contador = 1; contador <= numero; contador++) {
			factorial *= contador;
		
			System.out.println(contador + "! = " + factorial);
		}
		
	} 

}