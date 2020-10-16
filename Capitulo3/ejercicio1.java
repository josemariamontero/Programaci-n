/* Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.*/ 

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args ) {

	Scanner x = new Scanner(System.in); 

	System.out.print("Introduce un número: ");
	int numero1 = x.nextInt();

	System.out.print("Introduce otro número: ");
	int numero2 = x.nextInt();

	int multiplicación = (numero1 * numero2);

	System.out.println("El resultado de la multiplicación de ambos números es: " + multiplicación);

	}
}