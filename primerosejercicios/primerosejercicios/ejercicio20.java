// Sentencia if

public class ejercicio20 {
	public static void main(String[] args ) { 
		System.out.print("¿Cuál es la capital de España?: ");
		String respuesta = System.console().readLine();

		if (respuesta.equals("Madrid")) {
			System.out.println("Correcto!");
		} else {
			System.out.println("Incorrecto!");
		}
	}
}