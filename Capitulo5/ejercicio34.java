/* Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos. */

/*Por favor, introduzca un número: 9402
Introduzca otro número: 6782
El número formado por los dígitos pares es 640822
El número formado por los dígitos impares es 97*/

import java.util.Scanner;

public class ejercicio34 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		long numero = x.nextLong();

		System.out.print("Introduce otro número: ");
		long numero2 = x.nextLong();

		long numero3 = numero;
		long vueltaNum1 = 0;
		long longitud = 0;
		
		

		if (numero == 0) {
			longitud = 1;
		}

		while (numero3 > 0) {
			vueltaNum1 = (vueltaNum1 * 10) + (numero3 % 10);
			numero3 /= 10;
			longitud++;
		}

		numero3 = numero2;
		long vueltaNum2 = 0;


		while (numero3 > 0) {
			vueltaNum2 = (vueltaNum2 * 10) + (numero3 % 10);
			numero3 /= 10;
			
		}

		long pares = 0;
		long impares = 0;
		long numero5 = 0; 

		for (int contador = 0; contador < longitud; contador++) {
			numero5 = vueltaNum1 % 10;

			if (numero5 % 2 == 0) {
				pares = (pares * 10) + numero5;
			} else { 
				impares = (impares * 10) + numero5;
			}

			numero5 = vueltaNum2 % 10;

			if (numero5 % 2 == 0) {
				pares = (pares * 10) + numero5;
			} else {
				impares = (impares * 10) + numero5;
			}

			vueltaNum1 /= 10;
			vueltaNum2 /= 10;
		}

		System.out.println("El número formado por dígitos pares: " + pares);
		System.out.println("El número formado por dígitos impares: " + impares);


	}
}