/* Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados? */

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args ) { 

	Scanner x = new Scanner(System.in);

	//defino el array y reservo 10 espacios

	char []simbolo = new char[10];

	//asigno valores a cada espacio reservado

	simbolo[0] = 'a';
	simbolo[1] = 'x';
	simbolo[4] = '@';
	simbolo[6] = ' ';
	simbolo[7] = '+';
	simbolo[8] = 'Q';

	//recorro el array para mostrar los elementos que contiene

	for (int i = 0; i < simbolo.length; i++) {
		System.out.println("Valor de " + i + " = " + simbolo[i]);
	}

	}
}