/* voltea: Le da la vuelta a un número. */

import java.util.Scanner;

public class ejercicio6 {
	public static int voltea(int x) {
		int numeroVolteado = 0;

		//volteo el número 
		while (x != 0) {
			numeroVolteado = (x % 10) + (numeroVolteado * 10);
			x /= 10;
		}

		return numeroVolteado;
	}

	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);	

		//pido un número por teclado
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//llamo a la función para que voltee el número
		System.out.println(numeroTeclado + " volteado es igual a " + voltea(numeroTeclado));

	}
}