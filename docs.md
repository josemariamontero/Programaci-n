# Índice

## Programar en Java

1. [Salida de datos por pantalla](#1-salida-de-datos-por-pantalla)
	1. [Mi primer programa - ¡Hola Mundo!](#11-mi-primer-programa-hola-mundo)
	2. [Salida formateada](#12-salida-formateada)
2. [Variables](#2-variables)
	1. [Enteros (int y long)](#21-enteros-(-int-y-long-))
	2. [Números decimales (double y float)](#22-numeros-decimales-(-double-y-float-))
	3. [Cadenas de caracteres (String)](#23-cadenas-de-caracteres-(-string-))
	4. [Caracteres (char)](#24-caracteres-(-char-))
	5. [Operadores aritméticos](#25-operadores-aritméticos)
	6. [Asignación de valores a variables](#26-asignación-de-valores-a-variables)
	7. [Conversión de tipos (casting)](#27-conversión-de-tipos-(-casting-))
3. [Lectura de datos desde el teclado](#3-lectura-de-datos-desde-el-teclado)
	1. [Lectura de texto](#31-lectura-de-texto)
	2. [Lectura de números](#32-lectura-de-numeros)
	3. [La clase Scanner](#33-la-clase-scanner)
4. [Sentencia condicional (if y switch)](#4-sentencia-condicional-(-if-y-switch-))
	1. [Sentencia if](#41-sentencia-if)
	2. [Operadores de comparación](#42-operadores-de-comparación)
	3. [Operadores lógicos](#43-operadores-lógicos)
	4. [Sentencia switch](#44-sentencia-switch)
5. [Bucles](#5-bucles)
	1. [Bucle for](#51-bucle-for)
	2. [Bucle while](#52-bucle-while)
	3. [Bucle do-while](#53-bucle-do-while)
6. [Arrays](#6-arrays)
	1. [Arrays de una dimensión](#61-arrays-de-una-dimensión)
	2. [Arrays bidimensionales](#62-arrays-bidimensionales)
	3. [Recorrer arrays con for al estilo foreach](#63-recorrer-arrays-con-for-al-estilo-foreach)
7. [Funciones](#7-funciones)
	1. [Implementando funciones para reutilizar código](#71-implementando-funciones-para-reutilizar-codigo)
	2. [Comentarios de funciones](#72-comentarios-de-funciones)
	3. [Creación de bibliotecas de rutinas mediante paquetes](#73-creacion-de-bibliotecas-de-rutinas-mediante-paquetes)
	4. [Ámbito de las variables](#74-ambito-de-las-variables)


## 1. Salida de datos por pantalla
## 1.1 Mi primer programa - ¡Hola Mundo!

~~~
public class HolaMundo { // Clase principal
public static void main(String[] args) {
System.out.println("¡Hola mundo!");
}
}
~~~

Tras guardar nuestro código fuente, tendremos que crear el bytcode **.class** ejecutando **javac <Nombreprograma>**. Una vez generado, ejecutaremos **java <Nombreprograma>**

- Los ficheros los guardaremos con la extensión **.java**
- Para volcar el texto por pantalla usamos la siguiente instrucción `System.out.println()`.
- Para comentar líneas usaremos // y para varias líneas usaremos /*

## 1.2 Salida formateada

~~~
public class SalidaFormateada01 {
public static void main(String[] args) {
System.out.printf("El número %d no tiene decimales.\n", 21);
System.out.printf("El número %f sale con decimales.\n", 21.0);
System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.0);
}
}
~~~

- La casilla %d debe rellenarse con un número entero.
- La casilla %f debe rellenarse con un número que se mostrará con varios decimales.
- La casilla %.3f debe rellenarse con un número que se mostrará con 3 decimales.

~~~
public class ejercicio5 { 
	public static void main(String[] args) {
		System.out.println(" Artículo		Precio/Caja			Nº Cajas");
		System.out.println("--------------------------------------------");
		System.out.printf("%-10s	%8.2f		%6d\n", "manzanas", 4.5, 10);
		System.out.printf("%-10s   %8.2f 		%6d\n", "peras", 2.75, 10);
		System.out.printf("%-10s   %8.2f       %6d\n", "aguacates", 10.0, 6);
	}
}
~~~

- La casilla %-10s reserva 10 caracteres. El guión indica que la cadena se alineará a la izquierda, para alinearla a la derecha usaremos %10s
- La casilla %8.2f se inserta un número con 2 decimales 
- La casilla %6d se inserta un número con un hueco de 6 posiciones

## 2. Variables
Una variable es un contenedor de información. En las variables podemos guardar valores enteros, numeros decimales, caracteres, cadena de caracteres, etc.
En Java tenemos que declarar siempre las variables ya que es fuertemente tipado, indicando el tipo y el nombre de cada una.
Es importante que usemos nombres significativos a la hora de declarar las variables. Los nombres de las  variables tenemos que escribirlos en formato lowerCamelCase, es decir, la primera letra en minúscula y si se utiliza más de una palabra la escribiremos en mayúsculas.

## 2.1 Enteros (int y long)
Las variables que contengan números enteros se declaran con **int**

~~~
public class ejercicio6 { 
	public static void main(String[] args ) {
		int x;

		x = 5;

		System.out.println("Valor de x: " + x);

		x = 7;

		System.out.println("Nuevo valor de x: " + x);
	}
}
~~~

`Si queremos almacenar valores grandes en una variable usaremos el tipo **long**`

## 2.2 Números decimales (double y float)
Usaremos **double** o **float** cada vez que queramos almacenar numeros con decimales en las variables. La diferencia entre ambos formatos resulta en la precisión, **double** tiene mayor precisión que **float**.

~~~
public class ejercicio7 {
	public static void main(String[] args ) {
		double x;

		double y;

		x = 1.12;

		y= 2.22;

		System.out.println("Valor de la variable x: " + x);
		System.out.println("Valro de la variable y: " + y);
	}
}
~~~

`También podemos almacenar números enteros en las variables tipo **double**`

## 2.3 Cadenas de caracteres (String)
Son utilizadas para almacenar palabras o frases, deben de ir entrecomillada con el símbolo de comillas dobles ("")

~~~
public class ejercicio8 {
	public static void main(String[] args ) {
		String palabra1 = "hola";
		String palabra2 = "mundo";

		System.out.println("Valor de la primera variable: " + palabra1);
		System.out.println("Valor de la segunda variable: " + palabra2);
	}
}
~~~

Una cadena de caracteres puede contener cero o más caracteres => `String cadena = "";`

## 2.4 Caracteres (char)
Se pueden almacenar una letra o un signo de puntuación, el carácter debe ir entrecomillado con comillas simples ('')

~~~
public class ejercicio9 {
	public static void main(String[] args ) {
		char letra1 = 'a';
		char letra2 = 'b';
		char letra3 = 'c';

		System.out.println("1º letra: " + letra1);
		System.out.println("2º letra: " + letra2);
		System.out.println("Todas las letras: " + letra1 + letra2 + letra3);
	}
}
~~~

También las variables tipo **char** se pueden sumar ya que se suman los códigos ASCII de las letras que hemos introducido o pedido por teclado

~~~
public class ejercicio10 {
	public static void main(String[] args ) { 

	char letra1 = 'a';
	char letra2 = 'b';

	System.out.println("1º letra: " + letra1);
	System.out.println("Suma de letras: " + (letra1 + letra2));

	}
}
~~~

## 2.5 Operadores aritméticos
- \+ => suma => suma dos números
- \- => resta => resta dos números
- \* => multiplicación => multiplica dos números
- / => división => divide dos números
- % => resto(módulo) => resto de la división entera
- ++ => incremento => incrementa en 1 el valor de la variable
- -- => decremento => decrementa en 1 el valor de la variable

~~~
public class ejercicio11 { 
	public static void main(String[] args ) {

	int x;

	x = 7;

	System.out.println(x + " " + (x + 7) + " " + (x - 7));
	System.out.println((x * 5) + " " + (x / 2) + " " + (x % 5));
	
	}
}
~~~

## 2.6 Asignación de valores a variables
Para asignar el valor a una variable utilizaremos el símbolo igual (=)

~~~
public class ejercicio12 {
	public static void main(String[] args ) { 

	int x = 2;
	int y = 5;

	double suma = (double) x + (double) y;

	System.out.println(suma);

	int multiplicacion = x * y; 

	System.out.println(multiplicacion);

	}
}
~~~

## 2.7 Conversión de tipos (casting)
En ocasiones es necesarios convertir una variable de un tipo a otro. Para ello escribiremos entre paréntesis el tipo que se quiere obtener.

~~~
public class ejercicio13 {
	public static void main(String[] args ) {

	int x = 2;
	int y = 6;

	double division;

	division = (double) y / (double) x;

	System.out.println(division);
	System.out.println(y / x);

	}
}
~~~

## 3. Lectura de datos desde el teclado
## 3.1 Lectura de texto
Para recoger datos por teclado usaremos la sentencia **System.console().readLine()**.

~~~
public class ejercicio14 {
	public static void main(String[] args ) {
	String nombre = "";

	System.out.print("Cuál es tu nombre?: ");
	nombre = System.console().readLine();
	System.out.println("Encantado " + nombre + "!");
	
	}
}
~~~

`Los datos introducidos por teclado se recogen como una cadena de caracteres **String**`

## 3.2 Lectura de números
Si necesitamos datos numéricos debemos de convertir la cadena **String** a **int** para ello usaremos el método `Integer.parseInt(System.console().readLine());`

~~~
public class ejercicio15 {
	public static void main(String[] args ) {

		String cadena = "";

		System.out.print("Introduce un número: ");

		cadena = System.console().readLine();

		int numero;

		numero = Integer.parseInt(cadena);


		System.out.print("Introduce otro número: ");
		cadena = System.console().readLine();
		int numero2;
		numero2 = Integer.parseInt(cadena);

		int total;

		total = (2 * numero) + numero2;

		System.out.println("El número introducido es: " + numero);
		System.out.println("El 2º número introducido es: " + numero2);
		System.out.println("El doble del primero número mas el segundo numero es: " + total);
		
	}
}
~~~

## 3.3 La clase Scanner
Es una alternativa al método `System.console().readLine();`

~~~
import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args ) { 

	Scanner x = new Scanner(System.in);

	System.out.print("Indica tu nombre: ");

	String nombre = x.nextLine();

	System.out.print("Indica tu edad: ");

	int edad = Integer.parseInt(x.nextLine());

	System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");

	}
}
~~~

- `x.nextLine() es equivalente a System.console().readLine()`

A través del uso de la clase `Scanner` podemos leer varios datos desde una misma línea separados por un espacio

~~~
import java.util.Scanner;

public class ejercicio17 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		System.out.print("Indica tu nombre y tu edad separados por un espacio: ");

		String nombre = x.next();
		int edad = x.nextInt();

		System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");

	}
}
~~~

- `x.next() se ha utilizado para leer una cadena de caracteres y x.nextInt() se ha utilizado para leer un número entero`

Para leer números con decimales utilizaremos `x.nextDouble()`

~~~
import java.util.Scanner;

public class ejercicio18 {
	public static void main(String[] args ) { 

	Scanner x = new Scanner(System.in);

	System.out.print("Introduce tres números enteros o decimales separados por un espacio: ");

	double numero1 = x.nextDouble();
	double numero2 = x.nextDouble();
	double numero3 = x.nextDouble();

	double media = (numero1 + numero2 + numero3) / 3;

	System.out.println("La media de los números introducidos es: " + media);

	}
}
~~~

## 4. Sentencia condicional (if y switch)
Permite al programa bifurcar el flujo de ejecución de instrucciones dependiendo del valor de una expresión

## 4.1 Sentencia if
El resultado de evaluar una expresión lógica es siempre verdadero(true) o falso(false). "Si esta condicion es verdadera entonces haz esto, sino haz esto otro."

~~~
public class ejercicio19 {
	public static void main(String[] args ) {
		String fruta = "pera";

		if ("pera".equals(fruta)) {
			System.out.println("Iguales");
		} else {
			System.out.println("Distintas");
		}
	}
}
~~~

- Para comparar 2 cadenas de caracteres usaremos la expresión: **cadena.equals(cadena);**

~~~
public class ejercicio20 {
	public static void main(String[] args ) { 
		System.out.print("¿Cuál es la capital de España?: ");
		String respuesta = System.console().readLine();

		if (respuesta.equals("Madrid")) {
			System.out.println("Correcto!");
		} else {
			System.out.println("Incorrecto!");
		}
	}
}
~~~

~~~
public class ejercicio21 {
	public static void main(String[] args ) {
	System.out.print("Introduce un número: ");
	String respuesta = System.console().readLine();
	
	int numero = Integer.parseInt(respuesta);

	if (numero >= 0) {
		System.out.println("Positivo");
	} else {
		System.out.println("Negativo");
	}

	}
}
~~~

## 4.2 Operadores de comparación
- == => igual => a es igual a b
- != => distinto => a es distinto a b
- < => menor => a es menor que b
- \> => mayor => a es mayor que b
- <= => menor o igual que => a es menor o igual que b
- \>= => mayor o igual que => a es mayor o igual que b

~~~
public class ejercicio22 {
	public static void main(String[] args ) {
	System.out.print("Introduce una nota: ");
	String respuesta = System.console().readLine();

	double nota = Double.parseDouble(respuesta);

	if (nota >= 5) {
		System.out.println("Has aprobado!");
	} else {
		System.out.println("Has suspendido!");
	}
	}
}
~~~

## 4.3 Operadores lógicos
Se pueden combinar con los operadores de comparación. Si queremos saber que la variable `a` es mayor que `b` y además es menor que `c` sería: `((a > b) && (a < c))`

- && => y => las dos condiciones son verdaderas
- || => o => una de las condiciones es verdadera
- ! => no => la condición es falsa

~~~
public class ejercicio23 {
	public static void main(String[] args ) {
	System.out.println("Adivina el numero que estoy pensando.");
	
	System.out.print("Introduce un numero: ");
	String respuesta = System.console().readLine();
	int numero = Integer.parseInt(respuesta);

	if ((numero < 1) || (numero > 100)) {
		System.out.println("El número introducido se encuentra fuera del rango.");
		
	} 

	System.out.print("Introduce otro número: ");
	String respuesta2 = System.console().readLine();
	int numero2 = Integer.parseInt(respuesta2);


	if (numero2 == 15) {
		System.out.println("Acertaste");
	} else {
		System.out.println("No has acertado, la próxima vez será");
	}

	}
}
~~~

## 4.4 Sentencia switch
A veces es necesario comparar el valor de una variable con una serie de valores. En el lenguaje natural sería: `Si variable vale valor1 entonces entra por case valor1;... Si variable no vale ninguno de los valores anteriores case entonces entra por default:`

- Es necesario introducir un **break;** después de la asignación de la variable, ya que si no el programa continua la ejecución en la siguiente línea.
- El bloque correspondiente a **default;** se ejecuta cuando la variable no coincide con los valores de los `case` anteriores. Lo escribiremos al final de la sentencia aunque no sea necesario.

~~~
public class ejercicio24 {
	public static void main(String[] args ) {
		System.out.print("Introduce un número de mes: ");
		int numero = Integer.parseInt(System.console().readLine());

		String mes = "";

		switch (numero) {
			case 1:
				mes = "enero";
				break;
			case 2:
				mes = "febrero";
				break;
			case 3:
				mes = "marzo";
				break;
			case 4:
				mes = "abril";
				break;
			case 5:
				mes = "mayo";
				break;
			case 6:
				mes = "junio";
				break;
			case 7:
				mes = "julio";
				break;
			case 8:
				mes = "agosto";
				break;
			case 9:
				mes = "septiembre";
				break;
			case 10:
				mes = "octubre";
				break;
			case 11:
				mes = "noviembre";
				break;
			case 12:
				mes = "diciembre";
				break;
		}
		System.out.println("Mes: " + numero + " = " + mes);
	}
}
~~~

~~~
public class ejercicio25 {
	public static void main(String[] args ) {

	System.out.println("Cálculo de áreas");
	System.out.println("------------------");
	System.out.println("1. Cuadrado");
	System.out.println("2. Rectángulo");
	System.out.println("3. Triángulo");
	System.out.print("Elige una de las opciones anteriores: ");

	int respuesta = Integer.parseInt(System.console().readLine());

	double lado;
	double base;
	double altura;
	
	switch (respuesta) {
		case 1:
			System.out.print("\nIntroduzca el lado del cuadrado en cm: ");
			lado = Double.parseDouble(System.console().readLine());
			System.out.println("\nEl área del cuadrado es " + (lado * lado) + " cm2");
			break;

		case 2:
			System.out.print("\nIntroduzca la base del rectángulo en cm: ");
			base = Double.parseDouble(System.console().readLine());
			System.out.print("Introduzca la altura del rectángulo en cm: ");
			altura = Double.parseDouble(System.console().readLine());
			System.out.println("El área del rectángulo es " + (base * altura) + " cm2");
			break;

		case 3:
			System.out.print("\nIntroduzca la base del triángulo en cm: ");
			base = Double.parseDouble(System.console().readLine());
			System.out.print("Introduzca la altura del triángulo en cm: ");
			altura = Double.parseDouble(System.console().readLine());
			System.out.println("El área del triángulo es " + ((base * altura) / 2) + " cm2");
			break;

		default:
			System.out.print("\nLo siento, la opción elegida no es correcta.");

	}
	}
}
~~~

## 5. Bucles
Son utilizados para repetir un conjunto de sentencias. Normalmente existe una condición de salida, que hace que el flujo del programa abandone el bucle y continue justo en la siguiente sentencia. Si no existe condición de salida o no se cumple nunca se generará lo llamado bucle infinito y el programa no terminaría nunca.

## 5.1 Bucle for 
Se utiliza cuando se conoce previamente el número exacto de repeticiones que se van a realizar.

~~~
public class ejercicio26 {
	public static void main(String[] args ) {
		for (int i = 1; i < 11; i++){
			System.out.println("Valor de i: "+ i);
		}
	}
}
~~~

En el ejemplo anterior, `int i = 1;` solamente se ejecuta 1 vez, mientras se cumpla la condición de `i < 11;`, el contenido del bucle se va a ejecutar. `i++;` hace que la variable "i" se incremente en 1. 

## 5.2 Bucle while
Se utiliza para repetir un conjunto de sentencias siempre que se cumpla una determinada condición. La condición se comprueba al comienzo del bucle y las sentencias se ejecutarán mientras la condición sea verdadera.

~~~
import java.util.Scanner;

public class ejercicio28 {
	public static void main(String[] args ){
		
		Scanner x = new Scanner(System.in);

		System.out.println("Introduzca numeros: ");
		System.out.print("Introduzca un numero negativo para terminar: ");

		int numerosIntroducidos = 0;
		int contador = 0;
		int suma = 0;

		while (numerosIntroducidos >= 0) {
			numerosIntroducidos = x.nextInt();
			contador++;
			suma += numerosIntroducidos;
		}

		System.out.println("Has introducido: "+ contador + " numeros.");
		System.out.println("La suma de los números introducidos es: "+ suma);

	}
}
~~~

## 5.3 Bucle do-while
Funciona de la misma manera que el bucle **while** pero la condición se evalúa al final de la sentencia.

~~~
public class ejercicio29 {
	public static void main(String[] args ) {
		int i = 1;

		do {
			System.out.println("El valor de i es: " + i);
			i++;
		} while (i < 11);
	}	
}
~~~


~~~
import java.util.Scanner;

public class ejercicio30 {
	public static void main(String[] args ) {
		int numero;

		Scanner x = new Scanner(System.in);

		do {
			System.out.print("Introduce un número: ");
			numero = x.nextInt();

			if (numero % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar, saliendo del programa");
			}
		} while (numero % 2 == 0);
	}
}
~~~

## 6. Arrays
## 6.1 Arrays de una dimensión
Un array es un tipo de dato capaz de almacenar múltiples valores. Se utiliza para agrupar datos muy parecidos.
También los arrays de una dimensión se llaman vector.

**Ejemplo de creación de array**

~~~
public class ejercicio31 {
  public static void main(String[] args ) {
    //creación de array con números Enteros
    int []numeros = new int[4]; //se reserva 4 espacios para añadir Enteros

    numeros[0] = 26;
    numeros[1] = -30;
    numeros[2] = 0;
    numeros[3] = 100;

    //imprimir los valores del array
    System.out.print(numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + numeros[3]);

    System.out.println();

    //mostrar la suma del primer y el último elemento
    System.out.println("Suma total: " + (numeros[0] + numeros[3]));

  }
}
~~~

Si se conocen previamente todos los valore iniciales del **array**, se puede crear e inicializar en una sola línea

> int []x = {8,33,200,150,11}

Cada elemento del array se puede utilizar igual que cualquier otra variable, se le puede asignar un valor o se puede usar dentro de una expresión.

Para recorrer todos los elementos de un array se suele utilizar el bucle *for*.

~~~
public class ejercicio32 {
  public static void main(String[] args ) {
    //defino el array y reservo 10 espacios
    int numeros[] = new int[10];

    //asignamos valores a cada espacio del array
    numeros[0] = 8;
    numeros[1] = 3;
    numeros[2] = 200;
    numeros[3] = 150;
    numeros[4] = 11;
    numeros[5] = 88;
    numeros[6] = numeros[2] * 10;
    numeros[7] = numeros[2] / 10;
    numeros[8] = numeros[0] + numeros[1] + numeros[2];
    numeros[9] = numeros[8];

    //imprimo todos los valores de array
    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i] + " ");
    }
  }
}
~~~

A diferencia de otros lenguajes como *Ruby* o *PHP*, todos los elementos de un array deben ser del mismo tipo.

**Ejemplo de creación de un arry de caracteres**

~~~
public class ejercicio33 {
  public static void main(String[] args) {

    //defino un array y reservo 6 espacios
    char []caracter = new char[6];

    //asigno valores dentro del array
    caracter[0] = 'R';
    caracter[1] = '%';
    caracter[2] = '&';
    caracter[3] = '+';
    caracter[4] = 'A';
    caracter[5] = '2';

    //imprimo todos los elementos que contiene el array
    for (int i = 0; i < caracter.length; i++) {
      System.out.println(caracter[i]);
    }

  }
}
~~~

## 6.2 Arrays bidimensionales
Utiliza dos índices para localizar cada elemento. También se puede ver como una cuadrícula en la que los datos quedan distribuidos en filas y columnas.

**Ejemplo de creación de un array bidimensional**

~~~
public class ejercicio34 {
  public static void main(String[] args ) {
    //defino un array de 3 filas con 2 columnas
    int [][] numeros = new int[3][2];

    //añado valores a cada fila y columna del array
    numeros[0][0] = 21;
    numeros[1][0] = 67;
    numeros[1][1] = 33;
    numeros[2][1] = 7;

    //defino 2 variables para las filas y las columnas
    int fila, columna;

    //recorro los arryas y muestro el resultado
    for (fila = 0; fila < 3; fila++) {
      System.out.print("Fila: " + fila);

      for (columna = 0; columna < 2; columna++) {
        System.out.printf("%10d", numeros[fila][columna]);
      }
    }
    System.out.println();
  }
}
~~~

## 6.3 Recorrer arrays con for al estilo foreach
Al trabajar con *arrays* es muy frecuente cometer errores utilizando los índices. Para recorrer un array sin tener que preocuparnos por los límites, podemos utilizar el bucle *for* con el formato *foreach*. De esta forma, no tenemos que especificar con qué índice comienza y termina el bucle.

**Ejemplo de utilización de for a la manera foreach**

~~~
import java.util.Scanner;

public class ejercicio35 {
  public static void main(String[] args ) {
    Scanner x = new Scanner(System.in);

    //defino el array reservando 4 espacios
    double []numeros = new double[5];

    System.out.println("Para calcular la nota media necesito conocer las notas de tus examenes");

    //Pedimos las notas por teclado y las guardamos en nuestro array
    for (int i = 1; i < numeros.length; i++) {
      System.out.print("Introduce la nota del examen " + i + " : ");
      numeros[i] = x.nextDouble();
    }

    //inicializo una variable para sumar las notas
    double suma = 0;

    //recorro el array al estilo foreach y calculo el total de los examenes
    for (double i : numeros) {
      suma += i;
    }

    //Muestro la media de los examenes
    System.out.println("La media de los examenes es: " + (suma / 4));

  }
}
~~~

Como vemos en el segundo **for** no se utiliza ningún índice, simplemente saca todos los elementos del array uno a uno y los deposita en la variable **i**.

## 7. Funciones
## 7.1 Implementando funciones para reutilizar código
En programación es muy frecuente reutilizar código, es decir, usar código ya existente.

Una función es un trozo de código que realiza una tarea muy concreta y que se puede incluir en cualquier programa cuando hace falta resolver esa tarea. Opcionalmente, las funciones aceptan una entrada y devuelven una salida.

**Ejemplo de funciones**

~~~
import java.util.Scanner;

public class ejercicio36 {
// FUNCIONES 

/* Comprobamos si un numero entero positivo es primo o no
Un número es primo cuando únicamente es divisible entre él mismo y la unidad*/
	public static boolean primo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
		}

	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//pido un número por teclado
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//comprobamos que el número introducido por teclado es primo
		if (primo(numeroTeclado)) {
			System.out.println("El numero " + numeroTeclado + " es primo.");
		} else {
			System.out.println("El numero " + numeroTeclado + " no es primo.");
		}
	}
}
~~~

## 7.2 Comentarios de funciones 
Los comentarios son importantes en los programas ya que permiten describir, aclarar o dar información relevante sobre qué hace exactamente el código.

Existe una herramienta llamada *javadoc* que crea documentos en **HTML** con información sobre programas escritos en Java.

Con la etiqueta *@param* seguida de un nombre de parámetro se indica qué parámetro espera como entrada la función. Si la función acepta varios parámetros, se especificará varias etiquetas *@param*

Con la etiqueta *@return* especificamos qué devuelve exactamente la función

Para generar documentación con la herramienta **javadoc** ejecutaremos

> javadoc -encoding UTF-8 -charset UTF-8 -docencoding UTF-8 ejercicio36.java 

En el comando ejecutado anteriormente hemos generado un fichero HTML con el ejercicio que hemos realizado anteriormente con la funcion primo. 

## 7.3 Creación de bibliotecas de rutinas mediante paquetes
Las funciones de un determinado tipo se puden agrupar para crear un paquete(*package*) que luego se importará desde el programa que necesite esas funciones.

Cada paquete se corresponde con un directorio, es decir, si un paquete se llama "matemáticas" debe haber un directorio llamado "matemáticas" también en la misma ubicación del programa que importará ese paquete.

Las funciones se pueden agrupar dentro de un paquete de dos maneras diferentes. 
Puede haber subpaquetes dentro de un paquete.

**Ejemplo de funciones mediante paquetes**

~~~
//defino el paquete
package matematicas;

public class ejercicio37 {
	//funcion numeros primos

	public static boolean primo(int x) {
		for (int i = 2; i < x; i++) {
			if (x % 2 == 0) {
				primo = false;
			}
		}
		return true;
	}

	//funcion para devolver los dígitos que contiene un número
	public static int digitos(int x) {
		if (x == 0) {
			return 1;
		} else {
			int numero = 0;
			while (x > 0) {
				x /= 10;
				numero++;
			}
		}
		return numero;
	}
}
~~~

**Ejemplo para importar las funciones anteriores**

~~~
//importo las funciones que se encuentran en el paquete matemáticas
import matematicas.ejercicio37;

import java.util.Scanner;

//probamos las funciones
public class ejercicio38 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//pedimos un número por teclado 
		System.out.print("Introduce un número: ");
		int numeroTeclado = x.nextInt();

		//prueba de la funcion primo
		if (matematicas.ejercicio37.primo(numeroTeclado)) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}

		//prueba de la funcion para calcular dígitos
		System.out.println("Introduce un número: ");
		int numeroTeclado2 = x.nextInt();

		System.out.println("El numero " + numeroTeclado2 + " tiene " + matematicas.ejercicio37.digitos(numeroTeclado));
	}
}
~~~

## 7.4 Ámbito de las variables
El ámbito de una variable es el espacio donde "existe" esa variable, dicho de otro modo, el contexto dentro del cual la variable es válida. 
Cuando se implementan funciones hay que tener muy claro que las variables utilizadas como parámetros y las variables que se definen dentro de la función, son locales a esa función y fuera de la función no existen.


