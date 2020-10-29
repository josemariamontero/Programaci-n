/* Escribe un programa que dados dos números, uno real (base) y un enteropositivo (exponente), 
saque por pantalla todas las potencias con base elnumero dado y exponentes entre uno y el exponente introducido. 
No se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,se deberán mostrar 2 elevado a 1.... */

import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número para la base: ");
		int base = x.nextInt();
		System.out.print("Introduce un número para el exponente: ");
		int exponente = x.nextInt();

		
		double resultado = Math.pow(base, exponente);
	
		for (int contador = 1; contador < (exponente + 1); contador++) {
			System.out.println("Base " + base + " exponente " + contador + " = " + base * contador);
		}
	}
}