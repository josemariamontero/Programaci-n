/* Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.*/

import java.util.Scanner;

public class ejercicio40 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce la altura: ");
		int alturaTeclado = x.nextInt();

		int espaciosInternos = 0;
		int espaciosExternos = alturaTeclado / 2;
		int altura = 1;

		while (altura <= alturaTeclado / 2 + 1) {
			for (int i = 1; i <= espaciosExternos; i++) {
          		System.out.print(" ");
        	}

       		System.out.print("*");
        	for (int i = 1; i < espaciosInternos; i++) {
          		System.out.print(" ");
        	}

        	if (altura>1) {
          		System.out.print("*");
        	}
        
        System.out.println();
        altura++;
        espaciosExternos--;
        espaciosInternos+=2;
		}
		
		espaciosInternos = alturaTeclado - 3;
		espaciosExternos = 1;
		altura = 0;

		while (altura < alturaTeclado / 2) {
			for (int i = 1; i <= espaciosExternos; i++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int i = 1; i < espaciosInternos; i++) {
				System.out.print(" ");
			}

			if (altura < alturaTeclado / 2 - 1) {
          		System.out.print("*");
        	}

        	System.out.println();

        	altura++;
        	espaciosInternos -= 2;
        	espaciosExternos++;
		}


	}
}