/*Ejercicio 1. Realiza un programa en java que calcule la nota final de un
alumno/a , para ello pedirá 4 valores: dos notas de examen (examen1 y
examen2) y dos notas de prácticas (práctica1 y práctica2) y mostrará el
resultado de la nota final que será un 60% de la media de la nota de los
exámenes y un 40% de la media de la nota de las prácticas.

Además mostrará el mensaje:
SUSPENSO (si la nota es menor de 5)
APROBADO (si la nota es mayor o igual que 5 y menor que 7)
NOTABLE (si la nota es mayor o igual a 7 y menor que 9)
SOBRESALIENTE (si la nota es mayor o igual que 9 y menor que 10)
MATRICULA DE HONOR si la nota es 10.*/

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);

		System.out.print("Introduce la nota del primer examen: ");
		int primerExamen = x.nextInt();
		System.out.print("Introduce la nota del segundo examen: ");
		int segundoExamen = x.nextInt();

		System.out.print("Introduce la nota de la primera práctica: ");
		int primeraPractica = y.nextInt();
		System.out.print("Introduce la nota de la segunda práctica: ");
		int segundaPractica = y.nextInt();

		double mediaExamen = 0;
		double mediaPractica = 0;
		double resultado = 0;

		mediaExamen = (primerExamen + segundoExamen) * 0.6;
		mediaPractica = (primeraPractica + segundaPractica) * 0.4;

		resultado = (mediaExamen + mediaPractica) / 2;
	
		if (resultado < 5) {
			System.out.println("SUSPENSO");
		}		
		if ((resultado >= 5) && (resultado < 7)) {
				System.out.println("APROBADO");
		}
				
		if ((resultado >= 7) && (resultado < 9)) {
				System.out.println("NOTABLE");
		}
		if  ((resultado >= 9) && (resultado < 10)) {
				System.out.println("SOBRESALIENTE");
		}
		if (resultado == 10) {
			System.out.println("MATRICULA DE HONOR");
		}
				
	}
}