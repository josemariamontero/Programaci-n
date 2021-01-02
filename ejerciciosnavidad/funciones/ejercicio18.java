package ejerciciosnavidad.funciones;

/*Escribe un programa que pase de decimal a binario.*/

import java.util.Scanner;

public class ejercicio18 {
	
	public static int decimalBinario (int numero) {
		//defino variables
		int contador = 0;
		int numeroBinario = 0;
		while (numero != 0) {
			int resto = numero % 2;
			numeroBinario = numeroBinario + resto * (int)(Math.pow(10, contador));
			contador++;
			numero /= 2;
		}
		return numeroBinario;
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner x = new Scanner(System.in);
		
		//pido un número por teclado
		System.out.print("Introduce un número decimal: ");
		int numeroTeclado = x.nextInt();
		
		//llamo a la función y muestro el resultado
		System.out.println("El número " + numeroTeclado + " en valor binario es " + decimalBinario(numeroTeclado));

	}

}
