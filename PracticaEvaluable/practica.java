/* Para ello se reservará memoria para un array de 32 números enteros. El programa deberá
llevar la cuenta de cuantos elementos se han ido introduciendo. Los números
almacenados estarán comprendidos entre 0 y 100, es decir, no puede tener números
negativos ni mayores a 100.
Mostrará el siguiente menu
1. Rellenar array
2. Rellenar aleatoriamente los 10 primeros elementos del array
3. Borrar array
4. Introducir o borrar elemento en una posición determinada del array
5. Listar contenido
6. Mostrar los números primos que contiene el array
7. Calcular la media de los números primos del array
8. Filtrar números iguales
9. Buscar elemento en el array
10. Mostrar números mayores a la suma de sus posiciones adyacentes
0. Salir */

import java.util.Scanner;
import java.util.Arrays;

public class practica {
	//defino la función para los números primos
	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if (x % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		//defino el array y reservo 32 espacios
		int []numeros = new int[32];

		//defino un array para guardar los números primos
		int []numerosPrimos = new int[32];

		//creo el menú y pregunto la opción que desea escoger
		int opcion;
		boolean salir = false;
		do {
			System.out.println("MENÚ");
			System.out.println("1º. Rellenar array");
			System.out.println("2º. Rellenar aleatoriamente los 10 primeros elementos del array");
			System.out.println("3º. Borrar array");
			System.out.println("4º. Introducir o borrar elemento en una posición determinada del array");
			System.out.println("5º. Listar contenido");
			System.out.println("6º. Mostrar los números primos que contiene el array");
			System.out.println("7º. Calcular la media de los números primos del array");
			System.out.println("8º. Filtrar números iguales");
			System.out.println("9º. Buscar elemento en el array");
			System.out.println("10º. Mostrar números mayores a la suma de sus posiciones adyacentes");
			System.out.println("0. Salir");
			System.out.print("Elige una opción de las anteriores: ");
			opcion = x.nextInt();
		

		switch (opcion) {
			case 1:
			/*La opción rellenar array debe ir pidiendo números por teclado y almacenándolos en el
			array en el orden en que han sido introducidos hasta que el usuario introduzca un número
			negativo. (el negativo no se introduce). Se debe comprobar que el número reúne los
			requisitos (comprendido entre 0 y 100)*/
				for (int i = 0; i < numeros.length; i++) {
					System.out.print("Introduce el número " + i + " : ");
					int numeroTemporal = x.nextInt();
					if (numeroTemporal >= 0 && numeroTemporal <= 100) {
						numeros[i] = numeroTemporal;
					} else {
						System.out.println("Has introducido un número negativo");
					}
				}

				//recorro y muestro el array
				System.out.println("ARRAY");
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + " ");
				}

				//salto de línea
				System.out.println();

				break;

			case 2:
			/*Rellenar aleatoriamente los 10 primeros elementos del array. Pondrá en los diez primeros
			elementos números generados aleatoriamente, hay que tener en cuenta que tienen que
			cumplir los requisitos (comprendido entre 0 y 100).*/
				//recorro el array y lo relleno con números aleatorios las 10 primeras posiciones
				for (int i = 0; i < numeros.length; i++) {
					if (i < 10) {
						numeros[i] = (int)(Math.random()*101);
					}
				}

				//recorro y muestro el array
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + " ");
				}
				//salto de línea
				System.out.println();
				break;

			case 3: 
			/*La opción borrar array debe poner todo el array completo a 0 y además su número de
			elementos también debe ser puesto también a cero. */ 
				//Muestro el array con los valores que tiene introducido
				System.out.println("ARRAY ORIGINAL");
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + " ");
				}

				//salto de línea
				System.out.println();

				//recorro el array de manera inversa para borrar todos los números e igualarlos a 0
				System.out.println("ARRAY BORRADO");
				for (int i = numeros.length - 1; i >= 0; i--) {
					numeros[i] = 0;
				}

				//recorro el array para comprobar que todos los valores del array son 0
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + " ");
				}
				//salto de línea
				System.out.println();
				break;

			case 4:
			/*La opción introducir o borrar elemento en una posición debe pedir qué opción se elige
			(introducir o borrar) y una posición y un número positivo e introducirlo en el array. Se
			deberá comprobar que hay espacio, finalmente indicar si la operación ha tenido éxito. Ten
			en cuenta que no se pueden perder valores por lo que al introducir se debe hacer hueco
			desplazando los otros elementos. Al borrar se debe compactar para que no haya huecos
			en medio.*/
				//creo un menú pidiendo la opción que desea escoger el usuario
				System.out.println("¿Qué desea hacer?");
				System.out.println("1. Introducir elementos");
				System.out.println("2. Borrar elementos");
				System.out.print("Introduzca el número de la opción que desea realizar: ");
				int opcion2 = x.nextInt();
				int contador = 0;
				

				switch (opcion2) {
					case 1: 
						//recorro el array y muestro como está el array
						System.out.println("ARRAY ORIGINAL");
						for (int i = 0; i < numeros.length; i++) {
							System.out.print(numeros[i] + " ");
						}

						//salto de línea
						System.out.println();

						//pido el número que queremos introducir
						System.out.print("Introduce un número positivo que desesa introducir en el array: ");
						int numeroTeclado = x.nextInt();

						//pido la posición en la cuál queremos introducir el número anterior
						System.out.print("Introduce la posicion en la cual quieres introducir el número anterior: ");
						int posicion = x.nextInt();

						//recorro el array e inserto el número introducido por teclado en la posición indicada
						System.out.println("ARRAY MODIFICADO");
						for (int i = 0; i < numeros.length - 1; i++) {
							if (i == posicion) {
								for (int j = numeros.length - 1; j >= posicion; j--) {
									numeros[j] = numeros[j - 1];
								}
							numeros[posicion] = numeroTeclado;
							}
						}

						//Muestro el array modificado
						for (int i = 0; i < numeros.length; i++) {
							System.out.print(numeros[i] + " ");
						}

						break;
					case 2:
						//preguntamos la posición del número a borrar
						System.out.print("Introduce la posicion en la cual quieres borrar el número: ");
						posicion = x.nextInt();

						//recorremos el bucle y machacamos el número que se encuentra en la posición introducida por teclado
						for (int i = posicion; i < numeros.length - 1; i++) {
							numeros[i] = numeros[i + 1];

						}

						//recorremos el array y mostramos resultado
						System.out.println("ARRAY CAMBIADO");
						for (int i = 0; i < numeros.length; i++) {
							System.out.print(numeros[i] + " ");
						}

						break;
				}


				//salto de línea
				System.out.println();

				break;

			case 5: 
			/*La opción listar contenido debe mostrar por pantalla el contenido completo del array (sólo
			hasta el numero de elementos que se hayan introducido.*/
				System.out.println("ARRAY");
				//recorro el array y muestro los elementos
				for (int i = 0; i < numeros.length; i++) {
					if(numeros[i] != 0) {
						System.out.print(numeros[i] + " ");
					}
				}

				//salto de línea 
				System.out.println();

				break;

			case 6: 
			/*La opción mostrar los números primos que contiene el array. Mostrará por pantalla todos
			los números primos que hay en el array. Para ello se debe implementar una función que
			rellene un array distinto con los números primos, además esa función devolverá la
			cantidad de números primos existentes.*/

				//recorro el array y muestro su contenido
				System.out.println("ARRAY ORIGINAL");
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + " ");
				}

				//salto de línea
				System.out.println();

				//relleno el array numerosPrimos con los numeros primos que contenga el array numeros
				System.out.println("ARRAY DE PRIMOS");
				for (int i = 0; i < numeros.length; i++) {
					if (esPrimo(numeros[i]) && numeros[i] != 0) {
						numerosPrimos[i] = numeros[i];
					}
				}

				//recorro el array y muestro su contenido
				for (int i = 0; i < numerosPrimos.length; i++) {
					if (numerosPrimos[i] != 0) {
						System.out.print(numerosPrimos[i] + " ");
					}
				}

				//salto de línea
				System.out.println();
				break;

			case 7: 
			/*La opción calcular la media de números primos. Mostrará la media aritmética de los
			números primos existentes en el array, para ello se usará también la función desarrollada
			en el punto anterior. */

				//declaro una variable digitos para saber el número de primos
				int digitos = 0;

				//declaro la variable de sumaPrimos para sumar los números primos
				int sumaPrimos = 0;

				//declaro la variable mediaPrimos para realizar la media de los primos
				double mediaPrimos = 0;

				//relleno el array numerosPrimos con los numeros primos que contenga el array numeros
				System.out.println("ARRAY DE PRIMOS");
				for (int i = 0; i < numeros.length; i++) {
					if (esPrimo(numeros[i]) && numeros[i] != 0) {
						numerosPrimos[i] = numeros[i];
						sumaPrimos += numerosPrimos[i];
					}
				}

				//recorro el array de primos y muestro su contenido y cuento el número de primos que tiene
				for (int i = 0; i < numerosPrimos.length; i++) {
					if (numerosPrimos[i] != 0) {
						System.out.print(numerosPrimos[i] + " ");
						digitos++;
					}
				}

				mediaPrimos = sumaPrimos / digitos;

				//salto de línea
				System.out.println();
			
				System.out.print("La media de los números primos es: " + mediaPrimos);

				//salto de línea
				System.out.println();
				break;

			case 8:
			/*La opción filtrar números iguales deberá eliminar todos los números repetidos, hay que
			tener en cuenta que se debe compactar el array, es decir, no puede haber huecos entre
			valores una vez eliminados los repetidos.*/
			//convierto el array de enteros en array de cadenas
				String []numerosCadenas = new String[numeros.length];

				//recorro el array y cambio el tipo de dato
				for (int i = 0; i < numeros.length; i++) {
            		numerosCadenas[i] = String.valueOf(numeros[i]);
				}

				//Muestro el resultado del array de cadenas
				System.out.println("ARRAY ORIGINAL");
				for (int i = 0; i < numerosCadenas.length; i++) {
					System.out.print(numerosCadenas[i] + " ");
				}

				//recorro el array de cadenas y compruebo si hay números iguales en el array
				for (int i = 0; i < numerosCadenas.length; i++) {
					for (int a = 0; a < numerosCadenas.length; a++) {
						//compruebo que i sea distinto que j
						if (i != a) {
							//comparo i con j para comprobar que existan valores repetidos
							if (numerosCadenas[i].equals(numerosCadenas[a])){
								//elimino el valor repetido
								numerosCadenas[i] = "";
							}
						}
					}
				}

				//salto de línea
				System.out.println();

				//ordeno el array
				Arrays.sort(numerosCadenas);

				//recorro el bucle y muestro el resultado
				System.out.println("ARRAY SIN VALORES REPETIDOS");
				for (int i = 0; i < numerosCadenas.length; i++) {
					System.out.print(numerosCadenas[i] + " ");
				}

				//salto de línea
				System.out.println();
				break;

			case 9:
			/*La opción buscar elemento pedirá un número e indicará en que posición se encuentra
			dentro del array, si no lo encuentra también lo indicará.*/
				//declaro la variable posción = -1 
				int posicion = -1;

				//pido por teclado el número del cuál deseo conocer la posición
				System.out.print("Introduce un número para localizar su posición en el array: ");
				int numeroEjer9 = x.nextInt();

				//recorro el array
				for (int i = 0; i < numeros.length; i++) {
					//compruebo si el número por teclado śe encuentra dentro del array
					if (numeros[i] == numeroEjer9) {
						//guardo su posición
						posicion = i;
					}
				}

				//Muestro si el número se encuentra en el array y su posicion y sino también
				if (posicion == -1) {
					System.out.println("No se ha encontrado el número dentro del array");
				} else {
					System.out.println("El número " + numeroEjer9 + " se encuentra en la posicion " + posicion);
				}

				//salto de línea
				System.out.println();
				break;

			case 10:
			/*La opción mostrar números mayores a la suma de sus posiciones adyacentes. Mostrará el
			número y la posición de ese número dentro del array que cumpla que la suma del
			elemento siguiente + el elemento anterior es menor a número en cuestión.*/

				//uso la variable posición utilizada anteriormente
				posicion = -1;

				//defino la variable para guardar el número que pedimos por teclado
				int numeroEjer10 = 0;

				//declaro una variable para guardar el número que queremos sumar sus adyacentes
				int numeroArray = 0;
			
				//declaro las variables para obtener la posición y el número posterior
				int posicionPosterior = 0;
				int numeroArrayPosterior = 0;

				//declaro las variables para obtener la posición y el número anterior
				int posicionAnterior = 0;
				int numeroArrayAnterior = 0;

				//declaro la variable para la suma de los numeros adyacentes
				int sumaAdyacentes = 0;

				//pido la posición para indicar la posición y el número que queremos conocer dentro del array
				System.out.print("Introduce un número para localizar su posición en el array: ");
				numeroEjer10 = x.nextInt();

				//recorro el array
				for (int i = 0; i < numeros.length; i++) {
					//compruebo si el número por teclado śe encuentra dentro del array
					if (numeros[i] == numeroEjer10) {
						//guardo su posición
						posicion = i;
						//guardo el número
						numeroArray = numeros[i];
					}
				}

				System.out.println("El número " + numeroEjer10 + " se encuentra en la posición " + posicion);

				//Recorro el array y obtengo el número y la posición posterior
				for (int i = 0; i < numeros.length; i++) {
					if (numeros[i] == numeroEjer10) {
						//guardo su posición
						posicionPosterior = posicion + 1;
						//guardo el número
						numeroArrayPosterior = numeros[i+1];
					}
				}

				//System.out.println("POSTERIOR: "+ posicionPosterior + " : " + numeroArrayPosterior);

				//recorro el array y obtengo el numero y la posicion anterior
				for (int i = numeros.length - 1; i >= 0; i--) {
					if (numeros[i] == numeroEjer10) {
						//guardo su posición
						posicionAnterior = posicion - 1;
						//guardo el número
						numeroArrayAnterior = (numeros[i-1]);
					}
				}

				//System.out.println("ANTERIOR: "+ posicionAnterior + " : " + numeroArrayAnterior);

				//sumo los valores adyacentes
				sumaAdyacentes = numeroArrayPosterior + numeroArrayAnterior;

				//recorro el array y muestro los números adyacentes
				for (int i = 0; i < numeros.length; i++) {
					if (sumaAdyacentes < numeroEjer10) {
						System.out.println("Números adyacentes: " + numeros[i]);
					} else {
						System.out.println("No hay números adyacentes");
					}
				}
				
				//salto de línea
				System.out.println();
				break;

			case 0:
				salir = true;
				break;

			}
		} while (!salir);
	}  
}