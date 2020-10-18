/*Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha.*/

public class ejercicio15 {
	public static void main(String[] args ) {
		System.out.print("Introduce una letra para dibujar una pirámide: ");
		String letra = System.console().readLine();


		System.out.println("1. Vertice hacia arriba");
		System.out.println("2. Vertice hacia abajo");
		System.out.println("3. Vertice hacia la derecha");
		System.out.println("4. Vertice hacia la izquierda");
		System.out.print("Elige una de las opciones anteriores: ");
		int menu = Integer.parseInt(System.console().readLine());

		switch (menu) {
			case 1:
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n", "", "", letra, "", "", "");
				System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "", letra, letra, letra, "");
				System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", letra, letra,letra,letra, letra);
				break;
			case 2:
				System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", letra, letra,letra,letra, letra);
				System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "", letra, letra, letra, "");
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n", "", "", letra, "", "", "");
				break;
			case 3:
				System.out.printf("%-10s  \n", letra);
				System.out.printf("%-10s %-10s  \n", letra, letra);
				System.out.printf("%-10s %-10s %-10s  \n", letra, letra, letra);
				System.out.printf("%-10s %-10s \n", letra, letra);
				System.out.printf("%-10s  \n", letra);
				break;
			case 4:
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n", "", "", "", "", "", letra);
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n", "", "", "", "", letra, letra);
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n", "", "", "", letra, letra, letra);
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n", "", "", "", "", letra, letra);
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n", "", "", "", "", "", letra);
				break;
			default:
		}

	}
}