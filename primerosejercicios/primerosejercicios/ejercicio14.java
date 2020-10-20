// lectura de datos desde el teclado

public class ejercicio14 {
	public static void main(String[] args ) {
	String nombre = "";

	System.out.print("Cuál es tu nombre?: ");
	nombre = System.console().readLine();
	System.out.println("Encantado " + nombre + "!");
	
	}
}