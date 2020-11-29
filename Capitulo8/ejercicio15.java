/* Muestra los números primos que hay entre 1 y 1000 */

public class ejercicio15{
	//llamo a la función es primo 
	public static void main(String[] args) {
		System.out.println("NUMEROS PRIMOS");
		for (int i = 1; i < 1001; i++) {
			if (ejercicio2.esPrimo(i)) {
				//muestro los números primos
				System.out.print(i + " ");
			}
		}
	}
}