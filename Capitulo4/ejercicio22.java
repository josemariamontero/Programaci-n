/* Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h. */

public class ejercicio22 {
	public static void main(String[] args ) {
		System.out.print("Introduce un día de la semana: ");
		String dia = System.console().readLine();

		int numeroDia = 0;

		switch (dia) {
			case "lunes":
				numeroDia = 0;
				break;
			case "martes":
				numeroDia = 1;
				break;
			case "miercoles":
				numeroDia = 2;
				break;
			case "jueves":
				numeroDia = 3;
				break;
			case "viernes":
				numeroDia = 4;
				break;
			default:
				System.out.println("Ya es fin de semana.");
		}

		System.out.print("Introduce una hora: ");
		int hora = Integer.parseInt(System.console().readLine());

		System.out.print("Introduce los minutos: ");
		int minutos = Integer.parseInt(System.console().readLine());

		int minutosDias = (numeroDia * 24 * 60) + (hora * 60) + minutos;

		System.out.println("Faltan " + (6660 - minutosDias) + " minutos para que sea fin de semana.");

	}
}