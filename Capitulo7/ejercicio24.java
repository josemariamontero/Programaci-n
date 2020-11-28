/* Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999). */

public class ejercicio24 {
	public static void main(String[] args) {
		//defino un array bidimensional
		int [][]tabla = new int[4][5];

		//creo 2 variables para filas y columnas
		int filas, columnas;

		//para rellenar las filas y las columnas con numeros aleatorios
		System.out.print("Introduce números por teclado: ");
		for (filas = 0; filas < 4; filas++) {
			for (columnas = 0; columnas < 5; columnas++) {
				tabla[filas][columnas] = (int)(Math.random()*1001);
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