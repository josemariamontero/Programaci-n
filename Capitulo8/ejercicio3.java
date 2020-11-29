/* siguientePrimo: Devuelve el menor primo que es mayor al número que
se pasa como parámetro */ 
import java.util.Scanner;

public class ejercicio3 {
	//funcion numeros primos
	public static int siguientePrimo(int x) {
		x = x + 1;
		while (!ejercicio2.esPrimo(x)){
			x++;
		} 
		return x;
	}

	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//muestro por teclado el siguiente primo 
		System.out.println("El siguiente primo al introducido por teclado es: " + siguientePrimo(numeroTeclado));
	}
}