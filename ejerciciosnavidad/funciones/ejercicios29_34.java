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
	    
	    for (int i = 0; i < tabla.length; i++) {
	      filaArray[i] = tabla[fila][i];
	    }
	          
	    return filaArray;
	}
	
	/*3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
	pasa como parámetro.*/
	public static int[] columnaDeArrayBiInt (int tabla[][], int columna) {
		//defino un array para guardar las columnas
		int []columnaArray = new int [tabla.length];
		
		//recorro la matriz pasada por parámetros
		for (int i = 0; i < tabla.length; i++) {
			columnaArray[i] = tabla[i][columna];
		}
		
		//devuelvo el array con la columna
		return columnaArray;
	}
	
	/*4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
	con dos elementos) de la primera ocurrencia de un número dentro de un
	array bidimensional. Si el número no se encuentra en el array, la función
	devuelve el array {-1, -1}.*/
	public static int[] coordenadasEnArrayBiInt (int tabla[][], int numero) {
		//recorro la matriz
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				//compruebo si el número que pasamos por parámetro se encuentra en la matriz
				if (tabla[i][j] == numero) {
					//creo una variable para guardar las coordenadas
					int []coordenadas = {i,j};
					//devulevo las coordenadas;
					return coordenadas;
				}
			}
		}
		//sino encuentra el número
		int []coordenadas = {1,1};
		return coordenadas;
	}
	
	/*5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
	mínimo en su fila y máximo en su columna.*/
	public static boolean esPuntoDeSilla (int tabla[][], int numero) {
		//defino una bandera para comprobar si es punto de silla 
		boolean bandera = false;
		
		//defino 2 variables para guardar los números máximo y minimo
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MIN_VALUE;
		
		//recorro la matriz y obtengo los números máximos y mínimos
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				if (tabla[i][j] > maximo) {
					maximo = tabla[i][j];
				}
				if (tabla[i][j] < minimo) {
					minimo = tabla[i][j];
				}
			}
		}
		
		//recorro la matriz y compruebo si el número pasado por parámetro es punto de silla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				if (numero == minimo && numero == maximo) {
					bandera = true;
				}
			}
		}
		
		return bandera;
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
		
		//pido la columna que desea ver
		System.out.print("Introduce la columna de la matriz que desea ver: ");
		int columnaMatriz = x.nextInt();
				
		//Muestro el resultado
		System.out.println("La columna " + columnaMatriz + " es: " + columnaDeArrayBiInt(tabla,columnaMatriz));
		
		//pido el número del que se desea conocer las coordenadas
		System.out.print("Introduce el número del que desea conocer las coordenadas: ");
		int numeroCoordenadas = x.nextInt();
		
		//llamo a la función y muestro el resultado
		System.out.println("El numero " + numeroCoordenadas + " se encuentra en las coordenadas: " + coordenadasEnArrayBiInt(tabla,numeroCoordenadas));
	
		//pido un numero para saber si es punto de silla
		System.out.print("Introduce un número para saber si es punto de silla: ");
		int numeroPuntoSilla = x.nextInt();
		
		//llamo a la función y muestro resultados
		if (esPuntoDeSilla(tabla,numeroPuntoSilla)) {
			System.out.println("El numero " + numeroPuntoSilla + " es punto de silla");
		} else {
			System.out.println("El numero " + numeroPuntoSilla + " no es punto de silla");
		}
	 
	}

}
