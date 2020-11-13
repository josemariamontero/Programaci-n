package ex_prog_20_21_1;

import java.util.Scanner;

/*
Dos números amigos son dos números enteros positivos a y b 
tales que la suma de los divisores propios de uno es igual al otro número y viceversa, 
(La unidad se considera divisor propio, pero no lo es el mismo número.).

Un ejemplo es el par de naturales 220 y 284, ya que:

    los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, que suman 284;
    los divisores propios de 284 son 1, 2, 4, 71 y 142, que suman 220.
    
Si un número es amigo de si mismo se le llama numero perfecto
*/

public class NumerosAmigos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// peticion de dos numeros (mayores que 1)
		int a, b;
		
		// pido a		
		do {
			System.out.println("Introduce el numero a (mayor a 1) ");
			a = sc.nextInt();
		}while(a <= 1);
		// pido b
		do {
			System.out.println("Introduce el numero b (mayor a 1) ");
			b = sc.nextInt();
		}while(b <= 1);
		
		// calculo de divisores propios de a y b
		int sumaDivisoresA = 0;
		int sumaDivisoresB = 0;
		
		for(int i = 1; i < a; i++) {
			if(a % i == 0) {
				sumaDivisoresA += i;
			}
		}
		
		for(int i = 1; i < b; i++) {
			if(b % i == 0) {
				sumaDivisoresB += i;
			}
		}
		
		// si los divisores de a suman b y los divisores de b suman a son amigos
		if(sumaDivisoresA == b && sumaDivisoresB == a) {
			System.out.println("Los números " + a + " y " + b + " son amigos");
			if(a == b) {
				System.out.println("Como es amigo de si mismo, además es un número perfecto");
			}
		}
		else {
			System.out.println("Los números " + a + " y " + b + " NOOO son amigos");
		}

		sc.close();
	}

}
