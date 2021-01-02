package ejerciciosnavidad.funciones;

import java.util.Scanner;

public class ejercicios20_28 {
	/*1. generaArrayInt: Genera un array de tamaño n con números aleatorios
	cuyo intervalo (mínimo y máximo) se indica como parámetro.*/
	public static int[] generaArrayInt (int numero, int minimo, int maximo) {
		//genero el array con el tamaño indicado por parametro
		int []numeros = new int[numero];
		
		//recorro el array y lo relleno de números aleatorios con el rango indicado por parámetros
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random() * (maximo + 1  - minimo) + minimo);
		}
		
		//devuelvo el array
		return numeros;
		
	}
	
	/*2. minimoArrayInt: Devuelve el mínimo del array que se pasa como pará-
	metro.*/
	public static int minimoArrayInt (int numeros[]) {
		//defino una variable para guardar el menor número
		int numeroMinimo = Integer.MAX_VALUE;
		
		//recorro el array 
		for (int i = 0; i < numeros.length; i++) {
			//obtengo el número minimo
			if (numeros[i] < numeroMinimo) {
				numeroMinimo = numeros[i];
			}
		}
		
		//devuelvo el número mínimo
		return numeroMinimo;
	}
	
	/*3. maximoArrayInt: Devuelve el máximo del array que se pasa como
	parámetro.*/
	public static int maximoArrayInt (int numeros[]) {
		//defino una variable para guardar el número máximo
		int numeroMaximo = 0;
		
		//recorro el array
		for (int i = 0; i < numeros.length; i++) {
			//obtengo el numero maximo
			if (numeros[i] > numeroMaximo) {
				numeroMaximo = numeros[i];
			}
		}
		//devuelvo el número maximo
		return numeroMaximo;
	}
	
	/*4. mediaArrayInt: Devuelve la media del array que se pasa como paráme-
	tro.*/
	public static int mediaArrayInt (int numeros[]) {
		//defino una variable para guardar la suma
		int suma = 0;
				
		//recorro el array
		for (int i = 0; i < numeros.length; i++) {
			//sumo todos los numeros del array
			suma += numeros[i];	
		}
		
		//devuelvo la media
		return suma / numeros.length;
		
	}
	
	/*5. estaEnArrayInt: Dice si un número está o no dentro de un array.*/
	public static boolean estaEnArrayInt (int numeros[], int numeroArray) {
		//defino una bandera
		boolean bandera = false;
		
		//recorro el array
		for (int i = 0; i < numeros.length; i++) {
			//compruebo si el número está en el array
			if (numeroArray == numeros[i]) {
				bandera = true;
			}	
		}
		return bandera;
	}
	
	/*6. posicionEnArray: Busca un número en un array y devuelve la posición
	(el índice) en la que se encuentra.*/
	public static int posicionEnArray (int numeros[], int numeroParaBuscar) {
		//defino una variable posiciones para encontrar la posción del número
		int posiciones = -1;
		
		//recorro el array
		for (int i = 0; i < numeros.length; i++) {
			//busco el numero en el array
			if (numeros[i] == numeroParaBuscar) {
				posiciones = i;
			}
		}
		return posiciones;
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner x = new Scanner(System.in);
		
		/*//pido el tamaño del array
		System.out.print("Introduce el tamaño del array: ");
		int tamañoArray = x.nextInt();
		
		//pido un número máximo
		System.out.print("Introduce un número para que sea límite máximo: ");
		int numeroMaximo = x.nextInt();
		
		//pido un número mínimo
		System.out.print("Introduce un número para que sea límite mínimo: " );
		int numeroMinimo = x.nextInt();
		
		//defino una variable y guardo el array
		int	[]numeros = generaArrayInt(tamañoArray,numeroMaximo,numeroMinimo);	
		
		//recorro el array y muestro el resultado
		System.out.println("ARRAY");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		*/
		//defino un array estatico
		int []numeros = {18,25,1,5,55,3,999};
		
		//llamo a la función para obtener el número mínimo del array anterior
		System.out.println("El número mínimo del array es: " + minimoArrayInt(numeros));
		
		//llamo a la funcion para obtener el número maximo del array
		System.out.println("El número máximo del array es: " + maximoArrayInt(numeros));
		
		//llamo a la funcion para obtener la media del arrya
		System.out.println("La media del array es: " + mediaArrayInt(numeros));
		
		//pido un número para saber si está en el array o no
		System.out.print("Introduce un número para comprobar si está en el array: ");
		int numeroArray = x.nextInt();
		
		if (estaEnArrayInt(numeros, numeroArray)) {
			System.out.println("El número " + numeroArray + " se encuentra en el array");
		} else {
			System.out.println("El número " + numeroArray + " no se encuentra en el array");
		}
		
		//pido un número para encontrar su posicion
		System.out.print("Introduce el número del cual desea conocer su posicion: ");
		int numeroParaPosicion = x.nextInt();
		
		//llamo a la función y muestro los resultados
		System.out.println("La posicion del número " + numeroParaPosicion + " es " + posicionEnArray(numeros, numeroParaPosicion));
		
	}

}
