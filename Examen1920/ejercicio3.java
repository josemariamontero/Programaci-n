/* Realiza un programa en java que pida un número y si es par y
mayor que 2 encuentre y muestre dos número primos cuya suma de como
resultado ese número, si el número es impar y mayor que 5 encuentre y
muestre los tres números primos que sumados dan como resultado ese
número. Si no los encuentra que lo indique. */

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		 System.out.print("Introduce un número: ");
		 int numeroTeclado = x.nextInt();

		 //2 primos

		if ((numeroTeclado > 2) && (numeroTeclado % 2 == 0)) {
			for (int i = 2; i < numeroTeclado; i++) {
		 		for (int j = 2; j < numeroTeclado; j++) {
		 			//suma de los primos 

		 			if (i + j == numeroTeclado) {
		 				//comprobación de que i es primo
		 				boolean iPrimo = true;
		 				for (int y = 2; y < i && iPrimo; y++) {
		 					if (y % i == 0) {
		 						iPrimo = false;
		 					}
		 				}

		 				//comprobación de que j es primo
		 				boolean jPrimo = true;
		 				for (int a = 2; a < j && jPrimo; a++){
		 					if (a % j == 0) {
		 						jPrimo = false;
		 					}
		 				}

		 				//son primos
		 				if (iPrimo && jPrimo) {
		 					System.out.println(numeroTeclado + " = " + i + " + " + j); 
		 				}

		 			}	
		 		}
		 	}
		}
 		
 		//3 primos

 		if ((numeroTeclado % 2 != 0) && (numeroTeclado > 5)) {
 			for (int i = 2; i < numeroTeclado; i++) {
 				for (int j = 2; j < numeroTeclado; j++) {
 					for (int n = 2; n < numeroTeclado; n++) {
 						//suma de los 3 primos
 						if (i + j + n == numeroTeclado) {
 							//comprobación de que i es primo
 							boolean iPrimo = true;
		 					for (int y = 2; y < i && iPrimo; y++) {
		 						if (y % i == 0) {
		 							iPrimo = false;
		 						}
		 					}

		 					//comprobación de que j es primo
		 					boolean jPrimo = true;
		 					for (int a = 2; a < j && jPrimo; a++){
		 						if (a % j == 0) {
		 							jPrimo = false;
		 						}
		 					}

		 					//comprobación de que n es primo
		 					boolean nPrimo = true;
		 					for (int q = 2; q < n && nPrimo; q++) {
		 						if (q % n == 0) {
		 							nPrimo = false;
		 						}
		 					}

		 					if (iPrimo && jPrimo && nPrimo) {
		 						System.out.println(numeroTeclado + " = " + i + " + " + j + " + " + n);
		 					}

 						}
 					}
 				}
 			}
 		} 
 		
	}
}