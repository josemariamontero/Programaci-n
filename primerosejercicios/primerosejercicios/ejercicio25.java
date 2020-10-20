// menú con switch

public class ejercicio25 {
	public static void main(String[] args ) {

	System.out.println("Cálculo de áreas");
	System.out.println("------------------");
	System.out.println("1. Cuadrado");
	System.out.println("2. Rectángulo");
	System.out.println("3. Triángulo");
	System.out.print("Elige una de las opciones anteriores: ");

	int respuesta = Integer.parseInt(System.console().readLine());

	double lado;
	double base;
	double altura;
	
	switch (respuesta) {
		case 1:
			System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
			lado = Double.parseDouble(System.console().readLine());
			System.out.println("\nEl área del cuadrado es " + (lado * lado) + " cm2");
			break;

		case 2:
			System.out.print("\nIntroduzca la base del rectángulo en cm: ");
			base = Double.parseDouble(System.console().readLine());
			System.out.print("Introduzca la altura del rectángulo en cm: ");
			altura = Double.parseDouble(System.console().readLine());
			System.out.println("El área del rectángulo es " + (base * altura) + " cm2");
			break;

		case 3:
			System.out.print("\nIntroduzca la base del triángulo en cm: ");
			base = Double.parseDouble(System.console().readLine());
			System.out.print("Introduzca la altura del triángulo en cm: ");
			altura = Double.parseDouble(System.console().readLine());
			System.out.println("El área del triángulo es " + ((base * altura) / 2) + " cm2");
			break;

		default:
			System.out.print("\nLo siento, la opción elegida no es correcta.");

	}
	}
}