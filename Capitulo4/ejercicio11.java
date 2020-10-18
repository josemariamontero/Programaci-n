/* Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche. */

public class ejercicio11 {
	public static void main(String[] args ) { 

	System.out.print("Dime una hora: ");
	int hora = Integer.parseInt(System.console().readLine());

	System.out.print("Dime los minutos: ");
	int minutos = Integer.parseInt(System.console().readLine());

	int medianoche = 24 * 3600;

	int horaSegundos = hora * 3600;
	int minutosSegundos = minutos * 60;

	int totalSegundos = horaSegundos + minutosSegundos;

	int segundosMedianoche = medianoche - totalSegundos;

	System.out.println("Faltan " + segundosMedianoche + " segundos para llegar a la media noche");

	}
}