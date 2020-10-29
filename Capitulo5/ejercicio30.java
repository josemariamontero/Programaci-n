/* Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero. */

/*Por favor, introduzca la primera hora.
Día: lunes
Hora: 18
Por favor, introduzca la segunda hora.
Día: martes
Hora: 20
Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.*/


import java.util.Scanner;

public class ejercicio30 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);

		String dia1 = "";
		String dia2 = "";
		int horaDia1 = 0;
		int horaDia2 = 0;
		int numDia1 = 0;
		int numDia2 = 0;
		int resultado = 0;
		boolean correcto = true;

		do {
			System.out.println("Por favor, introduzca la primera hora: ");
			System.out.print("Día: ");
			dia1 = x.nextLine();
			System.out.print("Hora: ");
			horaDia1 = x.nextInt();

			switch (dia1) {
				case "lunes":
					numDia1 = 1;
					break;
				case "martes":
					numDia1 = 2;
					break;
				case "miercoles":
					numDia1 = 3;
					break;
				case "jueves":
					numDia1 = 4;
					break;
				case "viernes":
					numDia1 = 5;
					break;
				case "sabado":
					numDia1 = 6;
					break;
				case "domingo":
					numDia1 = 7;
					break;
			}

			System.out.println("Por favor, introduzca la segunda hora: ");
			System.out.print("Día: ");
			dia2 = y.nextLine();
			System.out.print("Hora: ");
			horaDia2 = y.nextInt();

			switch (dia2) {
				case "lunes":
					numDia2 = 1;
					break;
				case "martes":
					numDia2 = 2;
					break;
				case "miercoles":
					numDia2 = 3;
					break;
				case "jueves":
					numDia2 = 4;
					break;
				case "viernes":
					numDia2 = 5;
					break;
				case "sabado":
					numDia2 = 6;
					break;
				case "domingo":
					numDia2 = 7;
					break;
			}

			if (numDia2 >  numDia1) {
				System.out.print("El segundo día debe ser posterior al primero día");
				correcto = false;
			}

			if (horaDia1 < 0 || horaDia1 > 23 || horaDia2 < 0 || horaDia2 > 23){
				System.out.print("Fuera del límite de horas");
				correcto = false;
			}

			if ((numDia1 == 0) && (numDia1 > 8) || (numDia2 == 0) && (numDia2 > 8)) {
				System.out.print("Error no existe ese día");
				correcto = false;
			}			

		} while (correcto);


		resultado = (((24 * numDia2) + horaDia2) - ((24 * numDia1) + horaDia1));

		System.out.println("Entre las " + horaDia1 + ":00h del " + dia1 + " y las " + horaDia2 + ":00h del " + dia2 + " hay " + resultado + " hora/s");

}
}
