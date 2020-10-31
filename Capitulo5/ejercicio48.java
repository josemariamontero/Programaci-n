/* Realiza un programa que diga los dígitos que aparecen y los que no aparecen
en un número entero introducido por teclado. El orden es el que se muestra en
los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
largos. */

import java.util.Scanner;

public class ejercicio48 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		long numero = x.nextLong();

		long auxiliar;
		boolean bandera = false;
		long contador = 0;

		System.out.print("Dígitos que aparecen en el número: ");
		
    
   		for (int i = 0; i < 10; i++) {
     		bandera = false;
      		auxiliar = numero;
     	 	while (auxiliar > 0) {
        		if (auxiliar % 10 == i) {
          			bandera = true;
        		}
        	auxiliar /= 10;
      		}
      		if (bandera) {
        		System.out.print(i + " ");
      			}
    		} 

    		System.out.println();

    	System.out.print("Dígitos que no aparecen: ");

    		for (int i = 0; i < 10; i++) {
    		bandera = false;
      		auxiliar = numero;
     	 	while (auxiliar > 0) {
        		if (auxiliar % 10 == i) {
          			bandera = true;
        		}
        	auxiliar /= 10;
      		}
      		if (!bandera) {
        		System.out.print(i + " ");
      			}
    		} 

    		System.out.println();
    	}
	
}