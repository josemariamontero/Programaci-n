/* Escribe un programa que pase de decimal a binario. */

import java.util.Scanner;

public class ejercicio18 {
	//defino la función para pasar el número decimal a binario
	public static int decimalBinario (int numero) {
		//defino 2 variables para par e impar
		int binario = 0;
		int i = 0;
		while (numero != 0) {
			int resto = numero % 2;
			binario = binario + resto * (int)(Math.pow(10,i));
			i++;
			numero /= 2;
			
		}
		return binario;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		//pido un numero decimal
		System.out.print("Introduce un número decimal: ");
		int numeroTeclado = x.nextInt();

		//llamo a la función y calculo el numero en binario
		System.out.println("El numero " + numeroTeclado + " es igual a " + decimalBinario(numeroTeclado) + " en binario.");
	} 
}