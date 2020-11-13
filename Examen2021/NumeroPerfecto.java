package ex_prog_20_21_1;

public class NumeroPerfecto {

	public static void main(String[] args) {
		
		// recorro todos los numeros del 1 al 10000
		// para comprobar si son perfectos o no
		for(int i = 1; i < 10000; i++) {
			
			// para cada numero calculo sus divisores
			int sumaDivisores = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					sumaDivisores += j;
				}
			}
			
			// si el numero es igual a sus divisores lo muestro
			if(i == sumaDivisores) {
				System.out.println(i);
			}
		}
	}

}
