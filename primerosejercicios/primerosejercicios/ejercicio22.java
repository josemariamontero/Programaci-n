// Sentencia if

public class ejercicio22 {
	public static void main(String[] args ) {
	System.out.print("Introduce una nota: ");
	String respuesta = System.console().readLine();

	double nota = Double.parseDouble(respuesta);

	if (nota >= 5) {
		System.out.println("Has aprobado!");
	} else {
		System.out.println("Has suspendido!");
	}
	}
}