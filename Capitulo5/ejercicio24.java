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

    System.out.print("Introduzca la altura de la pirámide:");
    int alturaTeclado = x.nextInt();
    
    int altura = 1;
    int espacios = alturaTeclado - 1;
    
    while (altura <= alturaTeclado) {
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      for (int i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (int i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    }
  }
}