/* Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax 2 + bx + c = 0 ).*/

import java.util.*;

public class ejercicio9 {
	public static void main(String[] args ) {

	System.out.print("Introduce el valor de a: ");
	double a = Double.parseDouble(System.console().readLine());

	System.out.print("Introduce el valor de b: ");
	double b = Double.parseDouble(System.console().readLine());

	System.out.print("Introduce el valor de c: ");
	double c = Double.parseDouble(System.console().readLine());

	double cuadrado = Math.pow(b, 2);
	double x1 = cuadrado - (4 * a * c);
	double raizX1 = Math.sqrt(x1);

	double resultado1 = ((-b) + raizX1) / (2 * a);
	double resultado2 = ((-b) - raizX1) / (2 * a);

	System.out.println("El resultado de x1 es: " + resultado1 + " y el resultado de x2 es: " + resultado2);
	}
}