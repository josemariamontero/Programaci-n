package ejerciciosnavidad.funciones;

/*Escribe un programa que pase de binario a decimal.*/

import java.util.Scanner;

public class ejercicio17 {
	
	public static int binarioDecimal (int numero) {
		//defino variables
		int contador = 0;
		int numeroDecimal = 0;
		while (numero != 0) {
			int resto = numero % 10;
			numeroDecimal = numeroDecimal + resto * (int)(Math.pow(2, contador));
			contador++;
			numero /= 10;
		}
		return numeroDecimal;
	}

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner x = new Scanner(System.in);
		
		//pido un número binario por teclado
		System.out.print("Introduce un número binario (0-1): ");
		int numeroTeclado = x.nextInt();
		
		//llamo a la funcion para mostrar el resultado
		System.out.println("El número " + numeroTeclado + " en decimal es " + binarioDecimal(numeroTeclado));

	}

}
