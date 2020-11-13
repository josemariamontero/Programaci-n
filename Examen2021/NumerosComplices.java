package ex_prog_20_21_1;

import java.util.Scanner;

/*

Numeros complices si cumplen:
	- Tienen la misma cantidad de cifras
	- no son reversos de si mismos ni entre ellos (11 no sirve) (87 y 78 no sirven)
	- El producto de los dos numeros es igual al producto de sus reversos

Los números 42 y 12 son cómplices, puesto que tienen 2 cifras cada uno, no son
reversos de sí mismos ni entre ellos y el producto de los números es igual al
producto de sus reversos 42×12=24×21=504.

 */

public class NumerosComplices {

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
				
		// calculo reversos y numero de cifras
		int reversoA = 0;
		int reversoB = 0;
		int aux;
		
		int cifrasA = 0, cifrasB = 0;
		
		// calculo el reverso de a
		aux = a;
		while(aux > 0) {
			int digito = aux % 10;
			reversoA = reversoA * 10 + digito;
			cifrasA++;
			aux /= 10;
		}
		
		// calculo el reverso de b
		aux = b;
		while(aux > 0) {
			int digito = aux % 10;
			reversoB = reversoB * 10 + digito;
			cifrasB++;
			aux /= 10;
		}
		
		boolean reversoEllosMismos = a == reversoA || b == reversoB;
		boolean reversosEntreEllos = a == reversoB || b == reversoA;
		boolean mismaCantidadCifras = cifrasA == cifrasB; 
		
		if(mismaCantidadCifras && !reversoEllosMismos && !reversosEntreEllos && a * b == reversoA * reversoB) {
			System.out.println("Los numeros " + a + " y " + b + " son complices");
			System.out.println(a + " * " + b + " = " + a*b);
			System.out.println(reversoA + " * " + reversoB + " = " + reversoA*reversoB);
		}
		else {
			System.out.println("Los numeros " + a + " y " + b + " NOOO son complices");

		}
		
		sc.close();
				
	}

}
