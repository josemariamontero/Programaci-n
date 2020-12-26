package ejerciciosnavidad.matrices;

/*Realiza un programa que muestre por pantalla un array de 10 filas por 10
columnas relleno con números aleatorios entre 200 y 300. A continuación, el
programa debe mostrar los números de la diagonal que va desde la esquina
superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
y la media de los números que hay en esa diagonal.*/

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		//defino una matriz de 10x10
		int tabla[][] = new int[10][10];
		
		//recorro la matriz y la relleno de números aleatorios comprendido entre 200 y 300
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				tabla[i][j] = (int)(Math.random() * (301 - 200) + 200);
			}
		}
		
		//muestro la matriz
		System.out.print("MATRIZ");
		for (int i = 0; i < 10; i++) {
			System.out.print("\nFila " + i + ": ");
			for (int j = 0; j < 10; j++) {
				System.out.printf(tabla[i][j] + " ");
			}
		}
		
		//salto de línea
		System.out.println();
		
		//recorro la matriz y muestro la diagonal principal
		System.out.print("Diagonal: ");
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i][i] + " ");
		}
		
	}

}
