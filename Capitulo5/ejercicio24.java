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
		
		System.out.print("Introduce un número: ");
		int numero = x.nextInt();

		 int num2 = 0;
        for(int i=0; i<=15;i++){
           int num = 0;
           while(num<=num2){
               System.out.print("*");
               num++;
           }
           num2++;
           System.out.println("");
        }
	}
}