/* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.*/


public class ejercicio22 {
	public static void main(String[] args ) {		

		for (int numero = 2; numero <= 100; numero++) {
			boolean primo = true;
			for (int contador = 2; contador < numero; contador++) {
				if (numero % contador == 0) {
					primo = false;
				}
			}
			
			if (primo){ 
				System.out.println(numero);
			}
		}

	}
}
