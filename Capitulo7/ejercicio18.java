/* Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor... Cuando se acaben los menores o los mayores, se completará con los
números que queden. */

public class ejercicio18 {
	public static void main(String[] args ) {
		//defino un array reservando 10 espacios
		int []numeros = new int[10];

		//creo 2 arrays auxiliares para guardar los numeros menores o iguales que 100 y los mayores de 100
		int []mayores = new int[10];
		int []menores = new int[10];

		//relleno el array con números aleatorios
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*101);
		
			//añador los numeros menores o igual a 100 al array menores
			if (numeros[i] <= 100) {
				menores[i] = numeros[i];
			}

			//añado los numeros mayores de 100 al array mayores
			if (numeros[i] > 100) {
				mayores[i] = numeros[i];
			}
		}

		//muestro el array original
		System.out.println("ARRAY ORIGINAL");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//salto de línea 
		System.out.println();

		//Muestro el array cambiado
		System.out.println("ARRAY MODIFICADO");
		for (int i = 0; i < numeros.length; i++) {
				System.out.print(menores[i] + " ");
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.print(mayores[i] + " ");
		}

		//salto de línea 
		System.out.println();
	}
}