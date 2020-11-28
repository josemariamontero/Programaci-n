/* Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha. */

import java.util.Scanner;

public class ejercicio23 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		//defino un array bidimensional
		int [][]tabla = new int[4][5];

		//creo 2 variables para filas y columnas
		int filas, columnas;

		//pido por teclado para rellenar las filas y las columnas
		System.out.print("Introduce números por teclado: ");
		for (filas = 0; filas < 4; filas++) {
			for (columnas = 0; columnas < 5; columnas++) {
				tabla[filas][columnas] = x.nextInt();
			} 
		}

		//muestro el array bidimensional 
		for (filas = 0; filas < 4; filas++) {
			System.out.print("\nFila " + filas + ": ");
			for (columnas = 0; columnas < 5; columnas++) {
				System.out.printf(tabla[filas][columnas] + " ");
			}
		}

		//salto de línea
		System.out.println();

		//sumar filas
		int sumarFilas = 0;
		int sumaTotal = 0;
		for (filas = 0; filas < 4; filas++) {
			sumarFilas = 0;
			for (columnas = 0; columnas < 5; columnas++) {
				sumarFilas += tabla[filas][columnas];
				//sumaTotal += sumarFilas;
			}
			//muestro la suma total de las filas
			System.out.println("Suma Fila " + filas + ": " + sumarFilas);
		}

		//sumar columnas
		int sumarColumnas = 0;
		for (columnas = 0; columnas < 5; columnas++) {
			sumarColumnas = 0;
			for (filas = 0; filas < 4; filas++) {
				sumarColumnas += tabla[filas][columnas];
			}
			//muestra la suma total de las columnas
			System.out.println("Suma Columna " + columnas + ": " + sumarColumnas);
			sumaTotal += sumarColumnas;
		}

		//muestro el resultado total de la tabla
		System.out.println("La suma total de la tabla es: " + sumaTotal);
		
	}
}