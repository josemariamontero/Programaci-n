/* Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.*/

public class ejercicio6 {
	public static void main(String[] args ) {
		int baseImponible = 400;
		double iva = baseImponible * 0.21;

		double total = baseImponible + iva;

		System.out.println("Total a pagar: " + total);
	}
}