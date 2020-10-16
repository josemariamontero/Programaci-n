/* Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.*/

//trimestre = ((nota1 * 40) + (nota2 * 60)) / 100


// nota2 = ((trimestre * 100) - (nota1 * 400)) / 60

public class ejercicio12 {
	public static void main(String[] args ) { 

	System.out.print("Introduce la nota del primer examen: ");
	double nota1 = Double.parseDouble(System.console().readLine());

	System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
	double trimestre = Double.parseDouble(System.console().readLine());

	double nota2 = (trimestre * 100) - (nota1 * 40);
	double finalTrimestre = nota2 / 60;

	System.out.println("Para sacar un " + trimestre + " en el trimestre necesitas sacar un " + finalTrimestre + " en el segundo examen" );

	}
}
