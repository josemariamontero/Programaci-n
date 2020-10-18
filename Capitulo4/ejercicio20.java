/* Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras. */

public class ejercicio20 {
	public static void main(String[] args ) {
		System.out.println("Introduce un número entero positivo hasta de 5 cifras: ");
		int numero = Integer.parseInt(System.console().readLine());

		boolean numeroCapicua = false;

		if (numero < 10) {
				numeroCapicua = true;
		}
		
		if ((numero >= 10) && (numero <= 100)) {
			if ((numero / 10) == (numero % 10)) {
				numeroCapicua = true;
			} 
		}

		if ((numero >= 1000) && (numero <= 10000)) {
			if ((numero / 100) == (numero % 10)) {
				numeroCapicua = true;
			}
		}

		if ((numero >= 10000) && (numero < 100000)) {
			if ((numero / 1000) == (numero % 10)) {
				numeroCapicua = true;
			}
		}

		if (numeroCapicua) {
			System.out.println("El numero introducido es capicua");
		} else {
			System.out.println("El numero introducido no es capicua");
		}

	}
}