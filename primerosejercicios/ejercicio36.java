import java.util.Scanner;

public class ejercicio36 {
// FUNCIONES 

/* Comprobamos si un numero entero positivo es primo o no
Un número es primo cuando únicamente es divisible entre él mismo y la unidad*/
	public static boolean primo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
		}

	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//pido un número por teclado
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//comprobamos que el número introducido por teclado es primo
		if (primo(numeroTeclado)) {
			System.out.println("El numero " + numeroTeclado + " es primo.");
		} else {
			System.out.println("El numero " + numeroTeclado + " no es primo.");
		}
	}
}


