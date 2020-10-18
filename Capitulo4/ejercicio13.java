/* Escribe un programa que ordene tres números enteros introducidos por teclado.*/

public class ejercicio13 {
	public static void main(String[] args ) {

	System.out.print("Introduce un número: ");
	int numero1 = Integer.parseInt(System.console().readLine());

	System.out.print("Introduce otro número: ");
	int numero2 = Integer.parseInt(System.console().readLine());

	System.out.print("Introduce un último número: ");
	int numero3 = Integer.parseInt(System.console().readLine());

	int a;

	if (numero1 > numero2) {
		a = numero1;
		numero1 = numero2;
		numero2 = a;
	}

	if (numero2 > numero3) {
		a = numero2;
		numero2 = numero3;
		numero3 = a;
	}

	if (numero1 > numero2) {
		a = numero1;
		numero1 = numero2;
		numero2 = a;
	}
	
	System.out.println("Numeros ordenados: " + numero1 + " , " + numero2 + " , " + numero3);

	}

}