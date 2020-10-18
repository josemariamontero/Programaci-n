/* Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras. */

public class ejercicio18 {
	public static void main(String[] args ) { 

	System.out.print("Introduce un número máximo de 5: ");
	int numero = Integer.parseInt(System.console().readLine());

	int resultado = 0;

	if (numero < 10) {
		resultado = numero;
	}

	if ((numero >= 10) && (numero <= 100)) {
		resultado = numero / 10;
	}

	if ((numero >= 100) && (numero <= 1000)) {
		resultado = numero / 100;
	}

	if ((numero >= 1000) && (numero <= 10000)) {
		resultado = numero / 1000;
	}

	if (numero >= 10000) {
		resultado = numero / 10000;
	}

	System.out.println("La primera cifra del número introducido es: " + resultado);

	}
}