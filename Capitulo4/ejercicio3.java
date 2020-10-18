/* Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
diente nombre del día de la semana. */

public class ejercicio3 { 
	public static void main(String[] args ) {

	System.out.print("Dime el número de un día de la semana (1-7): ");
	int dia = Integer.parseInt(System.console().readLine());

	switch (dia) {
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MIÉRCOLES");
			break;
		case 4:
			System.out.println("JUEVES");
			break;
		case 5:
			System.out.println("VIERNES");
			break;
		case 6:
			System.out.println("SÁBADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		
		default:
			System.out.println("No existe ese día en la semana.");

	}
	}
}