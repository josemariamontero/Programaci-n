/* Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura. */

public class ejercicio22 {
	public static void main(String[] args ) {
		//defino el array para guardar las filas y las columnas
		int [][]tabla = new int[3][6];

		//añado valores a cada fila y columna del array de forma manual
		tabla[0][0] = 0;
		tabla[0][1] = 30;
		tabla[0][2] = 2;
		tabla[0][5] = 5;
		tabla[1][0] = 75;
		tabla[1][4] = 0;
		tabla[2][2] = -2;
		tabla[2][3] = 9;
		tabla[2][5] = 11;

		//defino 2 variables para filas y columnas
		int fila, columna;

		//recorro los arrays y muestro el resultado de la tabla
		for (fila = 0; fila < 3; fila++) {
			System.out.print("\nFila " + fila + ": ");
			
			for (columna = 0; columna < 6; columna++) {
				System.out.printf(tabla[fila][columna] + " ");

			}
		}

		//salto de línea
		System.out.println();
 	}
}
