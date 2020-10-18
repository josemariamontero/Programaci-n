/* Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error. */

import java.util.Scanner;

public class ejercicio28 {
	public static void main(String[] args ) {

		Scanner x = new Scanner(System.in);

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
		String jug1 = x.nextLine();

		System.out.print("Turno del jugador 2 (introduzca pieda, papel o tijera): ");
		String jug2 = x.nextLine();


		if (jug1.equals(jug2)) {
				System.out.println("Empate");
		} else {

		int jugador = 2;
		switch (jug1) {
			case "piedra":
				if (jug2.equals("tijera")) {
					jugador = 1;
					break;
				}
			case "papel":
				if (jug2.equals("piedra")) {
					jugador = 1;
					break;
				}
			case "tijera":
				if (jug2.equals("papel")) {
					jugador = 1;
					break;
				}
			default:
				
		System.out.println("Gana el jugador: " + jugador);

		}
	}
	}
}