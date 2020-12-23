package ejerciciosnavidad;

/*Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla.*/

import java.util.Scanner;

public class ejercicio17Vectores {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner x = new Scanner(System.in);
		
		//defino un array de 10 números
		int numeros[] = new int[10];
		
		//defino la variable para pedir valores por teclado
		int numeroTeclado = 0;
		
		//recorro el array y lo relleno de numeros random entre 0 y 100 incluidos
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random()*101);
		}
		
		//muestro el array
		System.out.println("ARRAY");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		//salto de línea
		System.out.println();		
		
		//pido un número por teclado 
		System.out.print("Introduce un número: ");
		numeroTeclado = x.nextInt();
		
		//se debe comprobar que ese número está en el array, sino lo volverá a pedir
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] != numeroTeclado) {
				System.out.print("Introduzca un número que se encuentre en el array por favor: ");
				numeroTeclado =  x.nextInt();
			} 
		}
		
		//defino una variable para guardar el ultimo digito
		int ultimoDigito = numeros[9];
		
		//recorro el array de forma inversa
		for (int i = 8; i >= 0; i--) {
			//desplazo una posicion a la derecha los digitos
			numeros[i + 1] = numeros[i];
			
		}
		
		//pongo el último dígito como primer elemento
		numeros[0] = ultimoDigito;
		
		//recorro y muestro el array modificado
		System.out.println("ARRAY MODIFICADO");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

}
