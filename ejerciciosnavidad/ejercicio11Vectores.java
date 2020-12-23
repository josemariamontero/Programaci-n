package ejerciciosnavidad;
/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante.*/

import java.util.Scanner;

public class ejercicio11Vectores {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner x = new Scanner(System.in);
		
		//defino un array de 10 espacios
		int numeros[] = new int[10];
		
		//pido números por teclado y los almaceno en el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el número " + i + " : ");
			numeros[i] = x.nextInt();
		}
		
		//muestro el índice y el array
		System.out.print("Índice: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print( i + " ");
		}
		
		//salto de línea
		System.out.println();
		
		System.out.print("Valor: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		//salto de línea
		System.out.println();
		
		//defino una variable para los primos
		//boolean esPrimo = true;
		
		//defino 2 arrays nuevos para los números que sean primos y los que no
		int primos[] = new int[10];
		int noPrimos[] = new int[10];
		
		//recorro el array
		for (int i = 0; i < numeros.length; i++) {
			boolean esPrimo = true;
			//compruebo si los numeros son primos
			if (numeros[i] % 2 == 0) {
				esPrimo = false;
			}
			
			if (esPrimo) {
				primos[i] = numeros[i];
			} else {
				noPrimos[i] = numeros[i];
			}
		}
		
		System.out.println("ARRAY CAMBIADO");
		//meto los números primos en las primeras posiciones
		for (int i = 0; i < numeros.length; i++) {
			if (primos[i] != 0) {
				System.out.print(primos[i] + " ");
			}
		}
		
		//meto los numeros no primos en las posiciones restantes
		for (int i = 0; i < numeros.length; i++) {
			if (noPrimos[i] != 0) {
				System.out.print(noPrimos[i] + " ");
			}
		}
	
	}
		
		
	}


