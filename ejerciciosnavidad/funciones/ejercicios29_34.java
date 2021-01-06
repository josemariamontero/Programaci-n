package ejerciciosnavidad.funciones;

import java.util.Scanner;

public class ejercicios29_34 {
	/*1. generaArrayBiInt: Genera un array de tamaño n x m con números
	aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.*/
	public static int[][] generaArrayBiInt (int filas, int columnas, int minimo, int maximo){
		//generamos el array según los parámetros 
		int [][]tabla = new int[filas][columnas];
		
		//recorro el array y lo relleno con números aleatorios entre el rango dado por parámetros
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				tabla[i][j] = (int)(Math.random() * (maximo + 1  - minimo) + minimo);
			}
		}
		
		//devuelvo la matriz
		return tabla;
	}
	
	/*2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
	parámetro.*/
	public static int[] filaDeArrayBiInt(int tabla[][], int fila) {
	    int []filaArray = new int[tabla[0].length];
	    
	    for (int i = 0; i < tabla[0].length; i++) {
	      filaArray[i] = tabla[fila][i];
	    }
	          
	    return filaArray;
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner x = new Scanner(System.in);

		//pido el numero de las filas
		System.out.print("Introduce el numero de filas: ");
		int filas = x.nextInt();
		
		//pido el numero de las columnas
		System.out.print("Introduce el numero de columnas: ");
		int columnas = x.nextInt();
		
		//pido un número máximo
		System.out.print("Introduce un número para que sea límite máximo: ");
		int numeroMaximo = x.nextInt();
		
		//pido un número mínimo
		System.out.print("Introduce un número para que sea límite mínimo: " );
		int numeroMinimo = x.nextInt();
		
		//defino una variable y guardo la matriz
		int	[][]tabla = generaArrayBiInt(filas,columnas,numeroMaximo,numeroMinimo);

		//recorro la matriz y muestro el resultado
		for (int i = 0; i < filas; i++) {
			System.out.print("Fila " + i + ": ");
			for (int j = 0; j < columnas; j++) {
				System.out.printf(tabla[i][j] + " ");
			}
			System.out.println();
		}
		
		//creo una matriz estatica
		//int tabla[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		//pido la fila que desea ver
		System.out.print("Introduce la fila de la matriz que desea ver: ");
		int filaMatriz = x.nextInt();
		
		//Muestro el resultado
		System.out.println("La fila " + filaMatriz + " es: " + filaDeArrayBiInt(tabla,filaMatriz));
	}

}
