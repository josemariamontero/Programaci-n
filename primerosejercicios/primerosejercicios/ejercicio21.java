// Sentencia if

public class ejercicio21 {
	public static void main(String[] args ) {
	System.out.print("Introduce un número: ");
	String respuesta = System.console().readLine();
	
	int numero = Integer.parseInt(respuesta);

	if (numero >= 0) {
		System.out.println("Positivo");
	} else {
		System.out.println("Negativo");
	}

	}
}