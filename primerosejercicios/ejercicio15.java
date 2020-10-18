/ Lectura de datos desde el teclado

public class ejercicio15 {
	public static void main(String[] args ) {

		String cadena = "";

		System.out.print("Introduce un número: ");

		cadena = System.console().readLine();

		int numero;

		numero = Integer.parseInt(cadena);


		System.out.print("Introduce otro número: ");
		cadena = System.console().readLine();
		int numero2;
		numero2 = Integer.parseInt(cadena);

		int total;

		total = (2 * numero) + numero2;

		System.out.println("El número introducido es: " + numero);
		System.out.println("El 2º número introducido es: " + numero2);
		System.out.println("El doble del primero número mas el segundo numero es: " + total);
		
	}
}