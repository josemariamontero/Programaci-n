/* Escribe un programa que declare 5 variables de tipo char . A continuación, crea
otra variable como cadena de caracteres y asígnale como valor la concatena-
ción de las anteriores 5 variables. Por último, muestra la cadena de caracteres
por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?*/

public class ejercicio8 {
	public static void main(String[] args ) {

	char letra1 = 'a';
	char letra2 = 'b';
	char letra3 = 'c';
	char letra4 = 'd';
	char letra5 = 'e';

	String cadena = letra1 + " " + letra2 + " " + letra3 + " " + letra4 + " " + letra5;

	System.out.println(cadena);

	}
}