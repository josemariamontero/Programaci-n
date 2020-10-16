/* Escribe un programa que muestre tu horario de clase. */

public class ejercicio4 {
	public static void main(String[] args ) {
	System.out.println("HORARIO		|	LUNES	|	MARTES	|	MIÉRCOLES	|	JUEVES	|	VIERNES	|\n");
	System.out.println("---------------------------------------------------------------------------------------------------------\n");
	System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "8:15:9:15", "", "", "PROG", "", "");
	System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "9:15:10:15", "", "", "PROG", "", "");
	System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "10:15:11:15", "", "PROG", "PROG", "", "");
	System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "11:45:12:45", "", "PROG", "ENDE", "", "PROG");
	System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "12:45:13:45", "", "", "", "ENDE", "PROG");
	System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "13:45:14:45", "", "", "", "ENDE", "PROG");
	}
}