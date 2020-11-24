//importo las funciones que se encuentran en el paquete matemáticas
import matematicas.ejercicio37;

import java.util.Scanner;

//probamos las funciones
public class ejercicio38 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//pedimos un número por teclado 
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//prueba de la funcion primo
		if (matematicas.ejercicio37.primo(numeroTeclado)) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}

		//prueba de la funcion para calcular dígitos
		System.out.println("Introduce un número: ");
		int numeroTeclado2 = x.nextInt();

		System.out.println("El numero " + numeroTeclado2 + " tiene " + matematicas.ejercicio37.digitos(numeroTeclado));
	}
}