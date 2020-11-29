/* Muestra los números capicúa que hay entre 1 y 99999. */

public class ejercicio16 {
	//llamo a la funcion es capicua
	public static void main(String[] args ) {
		System.out.println("NUMEROS CAPICÚAS");
		for (int i = 1; i < 100000; i++) {
			if (ejercicio1.esCapicua(i)) {
				System.out.print(i + " ");
			}
		}

		//salto de línea
		System.out.println();
	}
}