/* Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter. */

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//defino el array y reservo 12 espacios para cada mes
		double []temperaturas = new double[13];

		// pido la temperatura por teclado y las añado al array
		for (int i = 1; i < temperaturas.length; i++) {
			System.out.print("Introduce la temperatura del mes " + i + ": ");
			temperaturas[i] = x.nextDouble();
		}

		//muestro el diagrama(resultado)
		for (int i = 1; i < temperaturas.length; i++) {
			System.out.print("Mes " + i + "  |  ");
			for (int j = 1; j < temperaturas.length; j++) {
				System.out.print(" * ");
			}
			System.out.println(temperaturas[i] + " ºC");
		}
	}
}