/* Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora. */

public class ejercicio4 {
	public static void main(String[] args ) {
		System.out.print("Introduce el número de horas trabajadas durante la semana: ");
		int horas = Integer.parseInt(System.console().readLine());

		if (horas <= 40) {
			System.out.println("El sueldo semanal que le corresponde es: " + (horas * 12) + " euros.");
		} else {
			System.out.println("El sueldo semanal que le corresponde es: " + (horas * 16) + " euros.");
		}
	}
}