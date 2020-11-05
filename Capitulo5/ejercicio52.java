/* Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
queda igual. */

import java.util.Scanner;

public class ejercicio52 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		long numero = x.nextInt();

		long auxiliar = numero;
		int contador = 0;
		long resultado = 0;

		//longitud del número
		while (auxiliar > 0) {
			auxiliar /= 10;
			contador ++;
		}

		int primero =  (int)(numero / Math.pow(10, contador - 1));
    	auxiliar = (long)(primero * Math.pow(10, contador - 1));
    	resultado = (numero - auxiliar) * 10 + primero;
    	
		System.out.println("El resultado es: " + resultado);

	}
}