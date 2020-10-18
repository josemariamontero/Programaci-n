/* Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente). */

public class ejercicio8 {
	public static void main(String[] args ) {

	System.out.print("Introduce una nota: ");
	double nota1 = Double.parseDouble(System.console().readLine());

	System.out.print("Introduce otra nota: ");
	double nota2 = Double.parseDouble(System.console().readLine());

	System.out.print("Introduce otra nota: ");
	double nota3 = Double.parseDouble(System.console().readLine());
	
	double sumaTotal = nota1 + nota2 + nota3;
	double media = sumaTotal / 3;

	System.out.println("Tu media final es: " + media);

		if (media <= 4) { 
		System.out.println("Insuficiente.");
		}

		if (media == 5) {
			System.out.println("Suficiente.");
		}

		if ((media >=6) && (media < 7)) {
			System.out.println("Bien");
		}

		if ((media >= 7) && (media < 9)) {
			System.out.println("Notable");
		}

		if (media >= 9)  {
			System.out.println("Sobresaliente");
		} 

	}

}