package ejerciciosnavidad.funciones;

import java.util.Scanner;

public class ejercicios1_14 {
	/*1. esCapicua: Devuelve verdadero si el número que se pasa como paráme-
	tro es capicúa y falso en caso contrario.*/
	
	public static boolean esCapicua (int numero) {
		//creo 2 variables para guardar el resto del número y el número invertido
		int resto = 0;
	    int numeroInvertido = 0;
	    
	    int auxiliar = numero;
	    
		//compruebo que el número no es capicua
		while (numero > 0) {
			//divido el numero entre el módulo de 10 para coger el último dígito
			resto = numero % 10;
			//creo una variable para ir guardando el número de manera inversa
			numeroInvertido = (numeroInvertido * 10) + resto;
			numero /= 10;
		}
		
		if (auxiliar == numeroInvertido) {
			return true;
		} else {
			return false;
		}
		
	}
	/*2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
	es primo y falso en caso contrario.*/
	public static boolean esPrimo (int numero) {
		//calculo si el número es primo o no
		for (int i = 2; i < numero; i++) {
			if (numero % 2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	/*3. siguientePrimo: Devuelve el menor primo que es mayor al número que
	se pasa como parámetro.*/
	public static int siguientePrimo (int numero) {
		numero += 1;
		while (!esPrimo(numero)) {
			numero++;
		}
		return numero;
	}
	
	/*4. potencia: Dada una base y un exponente devuelve la potencia.*/
	
	public static int potencia (int base, int exponente) {
		//defino una variable para guardar la potencia
		int potencia = 0;
		potencia = (int)(Math.pow(base, exponente));
		return potencia;
	}
	
	/*5. digitos: Cuenta el número de dígitos de un número entero.*/
	public static int digitos (int numero) {
		int contador = 0;
		int numeroInvertido = 0;
		int resto = 0;
		
		while (numero > 0) {
			//divido el numero entre el módulo de 10 para coger el último dígito
			resto = numero % 10;
			//creo una variable para ir guardando el número de manera inversa
			numeroInvertido = (numeroInvertido * 10) + resto;
			numero /= 10;
			contador++;
		}
		return contador;
		
	}
	
	/*6. voltea: Le da la vuelta a un número.*/
	public static int voltea (int numero) {
		int numeroInvertido = 0;
		int resto = 0;
		
		while (numero > 0) {
			//divido el numero entre el módulo de 10 para coger el último dígito
			resto = numero % 10;
			//creo una variable para ir guardando el número de manera inversa
			numeroInvertido = (numeroInvertido * 10) + resto;
			numero /= 10;
		}
		return numeroInvertido;
		
	}
	/*7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
	Se empieza contando por el 0 y de izquierda a derecha.*/
	public static int digitoN (int numero, int posicion) {
		int numPosiciones = 0;
		int posiciones = -1;
		
		while (!(posiciones == posicion)) {
			numPosiciones = numero % 10;
			numero /= 10;
			posiciones++;
		}
		return numPosiciones;
	}
	
	/*8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
	dentro de un número entero. Si no se encuentra, devuelve -1.*/
	public static int posicionDeDigito (int numero, int numeroEncontrar) {
		//creo una bandera
		boolean bandera = false;
		
		//creo una variable para los dígitos
		int digito = 0;
		int posiciones = -1;
		
		for (int i = 0; i < numero; i++) {
			digito = numero % 10;
			if (digito == numeroEncontrar) {
				bandera = true;
				posiciones = i;
			}
			numero /= 10;
		}
		return posiciones;
	}
	
	/*9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
	derecha).*/
	public static int quitaPorDetras (int numero, int quitarDigitos) {
		int resultado = 0;
		resultado = (int)(Math.pow(10, quitarDigitos));
		return numero / resultado;
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner x = new Scanner(System.in);
		
		//pido numero por teclado
		/*System.out.print("Introduce un número por teclado: ");
		int numeroTeclado = x.nextInt();*/
		/*
		//Llamo a la función y compruebo si el número es capicúa o no
		if (esCapicua(numeroTeclado)) {
			System.out.println("El número es capicúa");
		} else {
			System.out.println("El número no es capicúa");
		}
		
		//llamo a la función esPrimo y compruebo si el número es primo o no
		if (esPrimo(numeroTeclado)) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		
		//llamo a la funcion siguientePrimo para coger el siguiente primo al numero introducido
		System.out.println("El siguiente primo de " + numeroTeclado + " es: " + siguientePrimo(numeroTeclado));

		//pido por teclado que introduzcan el valor de la base y el exponente para calcular la potencia
		System.out.print("Introduce el valor de la base: ");
		int base = x.nextInt();
		System.out.print("Introduce el valor del exponente: ");
		int exponente = x.nextInt();
		
		//declaro una variable potencia para guardar el resultado de la funcion potencia
		int potencia = 0;
		potencia = potencia(base,exponente);
		
		//muestro el resultado de la potencia
		System.out.println("La potencia resultante de la base " + base + " y el exponente " + exponente + " es igual a " + potencia);
		
		//muestro la cantidad de numeros que introducimos por teclado
		System.out.println("El número " + numeroTeclado + " tiene " + digitos(numeroTeclado) + " digitos");
		
		//muestro el número volteado
		System.out.println("El número " + numeroTeclado + " es " + voltea(numeroTeclado) + " de manera volteada");
		
		//pido el número por teclado y pido introducir una posicion
		System.out.print("Introduce un número entero: ");
		int numeroTeclado = x.nextInt();
		
		//pido una posicion del número introducido por teclado
		System.out.print("Introduce la posicion para conocer el valor de dicha posicion: ");
		int posicion = x.nextInt();
		
		//muestro el resultado
		System.out.println("El número que se encuentra en la posicion " + posicion + " es: " + digitoN(numeroTeclado,posicion));
		
		//pido el número por teclado y pido introducir una posicion
		System.out.print("Introduce un número entero: ");
		int numeroTeclado = x.nextInt();
		
		//pido una posicion del número introducido por teclado
		System.out.print("Introduce un número para conocer su posición: ");
		int posicion = x.nextInt();
				
		//muestro el resultado
		System.out.println("El número " + posicion + " se encuentra en la posicion " + posicionDeDigito(numeroTeclado,posicion));
		*/
		//pido un número por teclado 
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();
		
		//pido cuantos números se desea quitar por detras
		System.out.print("¿Cuántos números desea quitar por detrás?: ");
		int quitarNumeros = x.nextInt();
		
		//muestro el resultado
		System.out.println("El nuevo número es: " + quitaPorDetras(numeroTeclado,quitarNumeros));
	}

}
