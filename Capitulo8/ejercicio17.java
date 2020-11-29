/* Escribe un programa que pase de binario a decimal. */

import java.util.Scanner;

public class ejercicio17 {
	//funcion para convertir el numero binario a decimal
	public static int binarioDecimal(int numero) {
		int i = 0;
		int decimal = 0;
		while (numero != 0) {
			int resto = numero % 10;
			decimal = decimal + resto * (int)(Math.pow(2,i));
			i++;
			numero /= 10;
		}
		return decimal;
	

	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);
		//pido un número en binario
		System.out.print("Introduce un número binario (0-1): ");
		int binario = x.nextInt();

		//muestro el número decimal
		System.out.println("El número " + binario + " es " + binarioDecimal(binario));
	}
}