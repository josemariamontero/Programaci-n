/* Modifica el programa anterior de tal forma que no se repita ningún número en
el array. */

public class ejercicio27 {
	public static void main(String[] args) {
		//defino el array para 6 filas y 10 columnas
		int [][]tabla = new int[6][10];

		//defino variables para calcular el máximo y el mínimo
		int maximo = 0;
		int filaMaximo = 0;
		int columnaMaximo = 0; 
		int minimo = 0;
		int filaMinimo = 0;
		int columnaMinimo = 0;

		//relleno el array con números aleatorios entre 0 y 1000
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 10; j++) {
				tabla[i][j] = (int)(Math.random()*1001);

				//calculo el mínimo 
				if (tabla[i][j] < minimo) {
					minimo = tabla[i][j];
					filaMinimo = i;
					columnaMinimo = j;
				}

				//calculo el máximo
				if (tabla[i][j] > maximo) {
					maximo = tabla[i][j];
					filaMaximo = i;
					columnaMaximo = j;
				}
			}
		}

		//muestro el array
		for (int i = 0; i < 6; i++) {
			System.out.print("\nFila " + i + ": ");
			for (int j = 0; j < 10; j++) {
				System.out.printf(tabla[i][j] + " ");
			}
		}

		//salto de línea
		System.out.println();


		//Muestro el máximo y el mínimo
		System.out.println("Maximo: " + maximo);
		System.out.println("Minimo: " + minimo);

	}
}