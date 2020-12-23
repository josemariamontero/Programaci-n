package ejerciciosnavidad;
/*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados.*/

import java.util.Scanner;

public class ejercicio7Vectores {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		// TODO Apéndice de método generado automáticamente

		//defino un array de 100 espacios
		int numeros[] = new int[10];
		
		//relleno el array con números aleatorios entre 0 y 20
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*21);
		}
		
		//recorro el array y lo muestro 
		System.out.println("ARRAY ORIGINAL");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		//salto de línea
		System.out.println();
		
		//pido 2 números por teclado 
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();
		
		System.out.print("Introduce un número que desea cambiar el array: ");
		int numeroTeclado2 = x.nextInt();
		
		
		
		//recorro el array
		System.out.println("ARRAY MODIFICADO");
		for (int i = 0; i < numeros.length; i++) {
			//sustituyo el primer número por el segundo
			if (numeroTeclado == numeros[i]) {
				numeros[i] = numeroTeclado2;
				System.out.print("\"" + numeros[i] + "\"" + " ");
			} else {
				System.out.print(numeros[i] + " ");
			}
		}
	}

}
