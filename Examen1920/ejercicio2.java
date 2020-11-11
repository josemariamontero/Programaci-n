/* Ejercicio 2. Realiza un programa en java que muestre un menú con las
siguientes opciones:
1. Tabla de multiplicar
2. Descomposición en números primos
3. Salir
Cada vez que se pulse una opción mostrará el resultado y posteriormente
volverá a mostrar el menú (excepto cuando se elija la opción salir).*/

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.println("1. Tabla de multiplicar");
		System.out.println("2. Descomposición en números primos");
		System.out.println("3. Salir");
		System.out.print("Elige una opción: ");
		int opcion = x.nextInt();

		switch (opcion) {
			case 1:
				System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
				int numero = x.nextInt();

				System.out.println("Tabla del NUMERO " + numero);
				System.out.println("------------------------------");
				for (int i = 0; i < 11; i++) {
					int resultado = numero * i;

					System.out.println(numero + " * " + i + " = " + resultado);
				}
				break;
			case 2:
				System.out.print("Introduce un número para mostrar su descomposición en números primos: ");
				int numero2 = x.nextInt();

				int divisor = 2;

				while (numero2 != 1) {
					if (numero2 % divisor == 0) {
						numero2 /= divisor;
						System.out.println(divisor);
					} else {
						divisor++;
					}
				}
				break;
				
			case 3:
			System.out.println("Gracias por utilizar la aplicación");
			break;
		}
	}
}

