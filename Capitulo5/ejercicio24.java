/* Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
1
121
12321
1234321
*/

import java.util.Scanner;

public class ejercicio24 { 
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);
		
		System.out.print("Introduce la altura: ");
    int altura = x.nextInt();

    int altura2 = 1;
    int i = 0;
    int espacios = altura - 1;

    while (altura2 <= altura) {
      for (i = 1; i < espacios; i++) {
        System.out.print(" ");
      }

      for (i = 1; i < altura2; i++) {
        System.out.print(i);
      }

     for (i = altura2; i > 0; i--) {
        System.out.print(i);
      }

      System.out.println();
      altura2++;
      espacios--;
    }
	}
}