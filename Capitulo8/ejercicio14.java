/*juntaNumeros: Pega dos números para formar uno.*/

import java.util.Scanner;

public class ejercicio14 {
	//funcion para juntar numeros
	public static int juntaNumeros(int numero1, int numero2) {
		return (int)(numero1 * (int)(Math.pow(10, ejercicio5.digitos(numero2)))) + numero2;
	}	
	
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//pido un número por teclado
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//pido otro número para añadirlo al final
		System.out.print("Introduce otro número para añadirlo al número: ");
		int numeroTeclado2 = x.nextInt();

		//llamo a la funcion y muestro el resultado
		System.out.println("EL resultado es: " + juntaNumeros(numeroTeclado, numeroTeclado2));
	}
}