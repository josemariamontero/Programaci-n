/* Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado.*/

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//defino un array y reservo 8 espacios. 
		//Defino un array para colores
		//defino 2 arrays para guardar las palabras que son colores y las que no lo son
		String []palabras = new String[8];
		String []colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
		String []palabrasColores = new String[8];
		String []palabrasSinColores = new String[8];

		//pido las palabras por teclado y las almaceno en el array
		for (int i = 0; i < palabras.length; i++) {
			palabras[i] = x.nextLine();
		}

		//muestro el array original
		System.out.println("ARRAY ORIGINAL");
		for (int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i] + " ");
		}

		//recorro el array palabras y almaceno las palabras que son colores o no
		for (int i = 0; i < colores.length; i++) {
			for (int j = 0; j < palabras.length; j++) {
				if (palabras[j].equals(colores[i])) {
					palabrasColores[j] = palabras[i];
				} else {
					palabrasSinColores[j] = palabras[i];
				}

			}
		}


		System.out.println("ARRAY MODIFICADO");

		//recorro el array palabrasColores para mostrar en primera posicion los colores
		for (int i = 0; i < palabrasColores.length; i++) {
			System.out.print(palabrasColores[i] + " ");
		}

		//recorro el array palabrassicolores para mostrar las últimas palabras
		for (int i = 0; i < palabrasSinColores.length; i++) {
			System.out.print(palabrasSinColores[i] + " ");
		}

		//salto de línea
		System.out.println();
	}
}