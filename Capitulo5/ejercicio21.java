/* Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/

import java.util.Scanner;

public class ejercicio21 {
  public static void main(String[] args) {
	Scanner x = new Scanner(System.in);

    int numero;
    int numeroIntroducidos = 0;
    int impares = 0;
    int cantidadImpares = 0;
    int mayorPar = 0;
    double media = 0;
    
    do {
      	System.out.print("Introduce un número: ");
		numero = x.nextInt();
      
      if (numero >= 0) {
        numeroIntroducidos++;
        if ((numero % 2) == 1) { 
          impares += numero;
          cantidadImpares++;
        } else { 
          if (numero > mayorPar)
            mayorPar = numero;
        }
      }
    } while (numero >= 0);

    media = impares / cantidadImpares;

    System.out.println("Cantidad de números introducidos: " + numeroIntroducidos);
    System.out.println("La media de los impares es: " + media);
    System.out.println("El mayor de los pares es: " + mayorPar);
  }
}