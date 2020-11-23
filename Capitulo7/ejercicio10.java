/* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. */

public class ejercicio10 { 
	public static void main(String[] args ) {

	//defino arrays y reservo 20 espacios
	int []numeros = new int[20];
	int []pares = new int[20];
	int []impares = new int[20];

	//genero números aleatorios y los guardo en el array
	for (int i = 0; i < numeros.length; i++) {
		numeros[i] = (int)(Math.random()*21);
	}

	// muestro el array
	System.out.println("ARRAY ORIGINAL");
	for (int i = 0; i < numeros.length; i++) {
		System.out.print(numeros[i] + " ");
	}

	System.out.println();

	//compruebo los números pares e impares y los añado a un array
	for (int i = 0; i < numeros.length; i++) {
		if (numeros[i] % 2 == 0) {
			pares[i] = numeros[i];
		} else {
			impares[i] = numeros[i];
		}
	}

	System.out.println("ARRAY MODIFICADO");

	//meto los pares en las primeras posiciones 
	for (int i = 0; i < numeros.length; i++) {
		if (pares[i] != 0) {
			System.out.print(pares[i] + " ");
		}
	}

	//meto los impares en las posiciones restantes
	for (int i = 0; i < numeros.length; i++) {
		if (impares[i] != 0) {
			System.out.print(impares[i] + " ");
		}
	}

	System.out.println();
	
	}
}