/* Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados.*/

public class ejercicio23 {
	public static void main(String[] args ) {
		System.out.print("Introduce la base imponible: ");
		double baseImponible = Double.parseDouble(System.console().readLine());

		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		String iva = System.console().readLine();

		System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
		String codigo = System.console().readLine();

		double  iva2 = 0; 
		double resultadoIva = 0;
		double resultadoCodigo = 0;
		double total = 0;


		switch (iva) {
			case "general": 
				iva2 = baseImponible * 0.21;
				resultadoIva = baseImponible + iva2;
				break;

			case "reducido":
				iva2 = baseImponible * 0.10;
				resultadoIva = baseImponible + iva2;
				break;

			case "superreducido":
				iva2 = baseImponible * 0.4;
				resultadoIva = baseImponible + iva2;
				break;
			default:
				System.out.println("No existe ese tipo de iva.");

		}

		switch (codigo) {
			case "nopro":
				System.out.println("No se aplica código de descuento.");
				break;
			case "mitad":
				resultadoCodigo = -(resultadoIva / 2);
				break;
			case "meno5":
				resultadoCodigo =  -(resultadoIva - 5);
				break;
			case "5porc":
				resultadoCodigo = -(resultadoIva - (resultadoIva * 0.05));
				break;
			default:
				System.out.println("El código no se encuentra en la promoción");
		}

		total = resultadoIva + resultadoCodigo;

		System.out.println("Base Imponible: " + baseImponible);
		System.out.println("IVA " + iva + " : " + iva2);
		System.out.println("Precio con IVA: " + resultadoIva);
		System.out.println("Cód. promo. " + codigo + " " + resultadoCodigo);
		System.out.println("---------------------------------------------");
		System.out.println("TOTAL " + total);

	}
}