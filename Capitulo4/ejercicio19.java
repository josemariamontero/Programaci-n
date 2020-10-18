/* Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.*/

public class ejercicio19 {
	public static void main(String[] args ) { 

	System.out.print("Introduce un número máximo de 5: ");
	int numero = Integer.parseInt(System.console().readLine());

	int resultado = 0;

	if (numero < 10) {
		resultado = 1;
	}

	if ((numero >= 10) && (numero <= 100)) {
		resultado = 2;
	}

	if ((numero >= 100) && (numero <= 1000)) {
		resultado = 3;
	}

	if ((numero >= 1000) && (numero <= 10000)) {
		resultado = 4;
	}

	if (numero >= 10000) {
		resultado = 5;
	}

	System.out.println("El número introducido tiene: " + resultado + " dígitos");

	}
}