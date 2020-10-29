/* Realiza el control de acceso a una caja fuerte. 
La combinación será un número de 4 cifras. 
El programa nos pedirá la combinación para abrirla. 
Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”y si acertamos se nos dirá 
“La caja fuerte se ha abierto satisfactoriamente”.Tendremos cuatro oportunidades para abrir la caja fuerte.*/ 

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args ) { 
		Scanner x = new Scanner(System.in);

		int combinación = 1998;
		int respuesta = 0;
		int contador = 1;

		System.out.print("Introduce la combinación para abrir la caja fuerte: ");
		
		for (respuesta = x.nextInt(); respuesta != combinación && contador < 4; contador++) {
			System.out.println("Lo siento, esa no es la combinación.");
			System.out.print("Introduce la combinación para abrir la caja fuerte: ");
			respuesta = x.nextInt();
		}
			
		if (respuesta == combinación) {
			System.out.println("La caja fuerte se ha abierto satisfactoriamente");	
		} else {
			System.out.println("Lo siento, esa no es la combinación");
		}		

	}

}