/* Escribe un programa que diga si un número introducido por teclado es o no primo.
 Un número primo es aquel que sólo es divisible entre él mismo y la unidad */

 import java.util.Scanner;

 public class ejercicio16 {
 	public static void main(String[] args ) {
 		Scanner x = new Scanner(System.in);

 		System.out.print("Introduce un número: ");
 		int numero = x.nextInt();

 		boolean primo = true;

 		for (int i = 2; i < (numero / 2) && primo; i++) {
 			if (numero % i == 0) {
 				primo = false;
 			}
 		}
 		
 		if (primo) {
 			System.out.println("El numero es primo."); 
 		} else {
 			System.out.println("El numero no es primo");
 		}
 	}
 }