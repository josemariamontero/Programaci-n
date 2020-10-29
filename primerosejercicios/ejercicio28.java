// bucle while que termina cuando se introduce por teclado un numero negativo

import java.util.Scanner;

public class ejercicio28 {
	public static void main(String[] args ){
		
		Scanner x = new Scanner(System.in);

		System.out.println("Introduzca numeros: ");
		System.out.print("Introduzca un numero negativo para terminar: ");

		int numerosIntroducidos = 0;
		int contador = 0;
		int suma = 0;

		while (numerosIntroducidos >= 0) {
			numerosIntroducidos = x.nextInt();
			contador++;
			suma += numerosIntroducidos;
		}

		System.out.println("Has introducido: "+ contador + " numeros.");
		System.out.println("La suma de los números introducidos es: "+ suma);

	}
}