/* Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error. */

import java.util.Scanner;

public class ejercicio38 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Introduce la altura: ");
		int altura = x.nextInt();

		int altura2 = 1;
		int asteriscos = altura;
		int espacios = 0;

		while (altura2 <= altura / 2 + 1) {
			for (int i = 1; i <= espacios; i++) {
				System.out.print(" ");
			}
		
			for (int i = 0; i < asteriscos; i++){
				System.out.print("*");
			}

			System.out.println();
			altura2++;
			espacios++;
			asteriscos -= 2; 
		}

		 int espacios2 = altura / 2;
		 int altura3 = 1;

		 while (altura3 <= altura / 2 + 1){
		 	for (int i = 1; i <= espacios2; i++) {
				System.out.print(" ");
			}
		
			for (int i = 0; i < asteriscos; i++){
				System.out.print("*");
			}

			System.out.println();
			altura2++;
			espacios2--;
			asteriscos += 2; 
		 }

		
	} 
}