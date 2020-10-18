/* Una pastelería nos ha pedido realizar un programa que haga presupuestos de
tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
nombre; la nata suma 2.50 y la escritura del nombre 2.75. */

import java.util.Scanner;

public class ejercicio27 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
		String sabor = System.console().readLine();

		double precioSabor = 0;
		String tipoChoc = "";

		switch (sabor) {
			case "manzana":
				precioSabor = precioSabor + 18;
				break;
			case "fresa":
				precioSabor = precioSabor + 16;
				break;
			case "chocolate":
				System.out.print("¿Qué tipo de chocolate quiere? (negro - blanco): ");
				tipoChoc = System.console().readLine();

				if ("negro".equals(tipoChoc)) {
					precioSabor = precioSabor + 14;
				} else if ("blanco".equals(tipoChoc)) {
					precioSabor = precioSabor + 15;
				}
		}

		double precioNata = 0;
		
		System.out.print("¿Quiere nata? (si - no): ");
		boolean nata = x.nextLine().equals("si");

		double precioNombre = 0;
		System.out.print("¿Quiere ponerle un nombre? (si - no): ");
		boolean nombre = x.nextLine().equals("si");

		System.out.println("Tarta de " + sabor + " " + precioSabor);

		if (sabor.equals("chocolate")) {
			System.out.println(" " + tipoChoc + " " + precioSabor);
		}

		if (nata) {
			precioNata = precioNata + 2.50;
			System.out.println("Con nata: " + precioNata);

		} 

		
		if (nombre) {
			precioNombre = precioNombre + 2.75;
			System.out.println("Con nombre: " + precioNombre);
		
		}

		double total = precioSabor + precioNata + precioNombre;
		System.out.println("Total: " + total);

	}
}