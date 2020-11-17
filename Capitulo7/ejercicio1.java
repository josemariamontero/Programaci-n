/* Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados? */

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args ) { 

	Scanner x = new Scanner(System.in);

	//defino el array y reservo 12 espacios

	int []num = new int[12];

	//asigno valores a cada uno de los espacios reservados

	num[0] = 39;
	num[1] = -2;
	num[4] = 0;
	num[6] = 14;
	num[8] = 5;
	num[9] = 120;	
 
 	//recorro el array para mostrar los elementos que contiene

 	for (int i = 0; i < num.length; i++) {
 		System.out.println("Valor de " + i + " = " + num[i]);
 	}

	}
}