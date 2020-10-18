/* Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
0 )*/

public class ejercicio5 { 
	public static void main(String[] args ) {
	System.out.println("Resolviendo ecuaciones de primer grado: ax + b = 0");
	System.out.print("Introduce el valor de a: ");
	double a = Double.parseDouble(System.console().readLine());

	System.out.print("Introduce el valor de b: ");
	double b = Double.parseDouble(System.console().readLine());

	if (a == 0) {
		System.out.println("Esta ecuación no tiene solución real.");
	} else {
		double x = 0 + (-b / a);
		System.out.println("El valor de x es: " + x);
	}

	}
}