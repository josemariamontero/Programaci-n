package ejerciciosnavidad;

import java.util.Scanner;

/*Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.*/


public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner x = new Scanner(System.in);
		
		//Defino un array de 10 espacios
		int numeros[] = new int[10];
		
		//pido por teclado números y los introduzco en el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el número " + i + " : ");
			numeros[i] = x.nextInt();
		}
		
		//defino las variables máximo y mínimo
		int maximo = 0; 
		int minimo = 0;
		
		//recorro el array 
		for (int i = 0; i < numeros.length; i++) {
			//compruebo los números maximos
			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}
			
			//compruebo los números mínimos
			if (numeros[i] < minimo) {
				minimo = numeros[i];
			}
		}
		
		//muestro el array y los números máximos y mínimo
		System.out.println("ARRAY");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+ " ");
		}
		
		//salto de línea
		System.out.println();
		
		System.out.println("El número máximo es: " + maximo);
		System.out.println("El número mínimo es: " + minimo);
	
	}
}
