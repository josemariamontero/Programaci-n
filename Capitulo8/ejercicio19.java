/* Une y amplía los dos programas anteriores de tal forma que se permita
convertir un número entre cualquiera de las siguientes bases: decimal, binario,
hexadecimal y octal. */

import java.util.Scanner;

public class ejercicio19 {
	//defino la función para pasar el número decimal a binario
	public static int decimalBinario (int numero) {
		//defino 2 variables para par e impar
		int binario = 0;
		int i = 0;
		while (numero != 0) {
			int resto = numero % 2;
			binario = binario + resto * (int)(Math.pow(10,i));
			i++;
			numero /= 2;
			
		}
		return binario;
	}

	//funcion para pasar de decimal a octal
	public static String decimalOctal (int numero) {
		int resto;
    	String octal = "";
    	char[] caracteresOctales = {'0', '1', '2', '3', '4', '5', '6', '7'};
    	while (numero > 0) {
        	resto = numero % 8;
        	char caracter = caracteresOctales[resto];
        	octal = caracter + octal;
        	numero /= 8;
    	}
    	return octal;
	}

	//funcion para pasar de decimal a hexadecimal
	public static String decimalHexadecimal (int numero) {
		int resto = 0;
   		String hexadecimal = "";
    	char[] caracteresHexadecimales = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    	while (numero > 0) {
        	resto = numero % 16;
        	char caracterHexadecimal = caracteresHexadecimales[resto];
        	hexadecimal = caracterHexadecimal + hexadecimal;
   	     	numero /= 16;
    	}
    	return hexadecimal;

	}

	//funcion para pasar de binario a decimal
	public static int binarioDecimal(int numero) {
		int i = 0;
		int decimal = 0;
		while (numero != 0) {
			int resto = numero % 10;
			decimal = decimal + resto * (int)(Math.pow(2,i));
			i++;
			numero /= 10;
		}
		return decimal;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		//pido un número por teclado
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//Muestro los resultados por pantalla
		System.out.println("El numero " + numeroTeclado + " es igual a " + decimalBinario(numeroTeclado) + " en binario");
		System.out.println("El numero " + numeroTeclado + " es igual a " + decimalOctal(numeroTeclado) + " en octal");
		System.out.println("El numero " + numeroTeclado + " es igual a " + decimalHexadecimal(numeroTeclado) + " en hexadecimal");
		System.out.println("El numero " + numeroTeclado + " es igual a " + binarioDecimal(numeroTeclado) + " en binario");
	}
}