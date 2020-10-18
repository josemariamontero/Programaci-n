/* Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.*/

public class ejercicio1 {
	public static void main(String[] args ) {
	System.out.print("Dime un día de la semana: ");
	String respuesta = System.console().readLine();

	switch (respuesta) {
		case "Lunes":
			System.out.println("A 1º hora tienes Lenguaje de marcas.");
			break;
		case "Martes":
			System.out.println("A 1º hora tienes Sistemas.");
			break;
		case "Miercoles":
			System.out.println("A 1º hora tienes Programación.");
			break;
		case "Jueves":
			System.out.println("A 1º hora tienes Base de datos.");
			break;
		case "Viernes":
			System.out.println("A 1º hora tienes Sistemas.");
			break;
		default:
			System.out.println("El día que has introducido no es correcto.");
	}
	}
}