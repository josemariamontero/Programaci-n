/* Implementa un programa que calcule la denominación ordinal de los reyes de
una secuencia histórica. El programa solicitará la cantidad de reyes que se
van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
aparecer como Felipe 1o y el segundo como Felipe 2o. */

import java.util.Scanner;

public class ejercicio20 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//pido el número de reyes que va a introducir
		System.out.print("Introduce el número total de nombre de reyes: ");
		int numeroReyes = x.nextInt();

		//creo un array dependiendo del número de reyes que se vayan a introducir
		String []reyes = new String[numeroReyes + 1];

		//recorro el array y lo relleno
		System.out.print("Introduce el nombre de los reyes: ");
		for (int i = 0; i < reyes.length; i++) {
			reyes[i] = x.nextLine();
		}

		//muestro el array
		System.out.println("REYES INTRODUCIDOS");
		for (int i = 0; i < reyes.length; i++) {
			//creo un contador para contar si se repiten los nombres
			int contador = 1;
        	for (int j = 0; j < i; j++) {
        		//compruebo que existan los mismos nombres en el array
        		if (reyes[i].equals(reyes[j])) {
          			contador++;
        		}
      		}		
			System.out.println(reyes[i] + " " + contador + "º");	
		}
	}
}


