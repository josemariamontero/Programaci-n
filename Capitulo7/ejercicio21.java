/* Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una
posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él. */

public class ejercicio21 {
	public static void main(String[] args ) {
		//declaro un array y reservo 15 espacios 
		int []numeros = new int[15];

		//relleno el array con números aleatorios comprendidos entre 0 y 500
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*501);
		}

		//muestro el array original
		System.out.println("ARRAY ORIGINAL");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//salto de línea
		System.out.println();

		//compruebo los múltiplos de 5
		for (int i = 0; i < numeros.length; i++) {
			while (numeros[i] % 5 != 0) {
				numeros[i]++;
			}
		}

		//Muestro el resultado del array
		System.out.println("ARRAY CINCUERIZADO");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//salto de línea
		System.out.println();
	}
}