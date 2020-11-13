package ex_prog_20_21_1;

public class NumerosComplices2Cifras {

	public static void main(String[] args) {
		
		// recorro todas las parejas de numeros de dos cifras
		for(int a = 10; a < 100; a++) {
			for(int b = a+1; b < 100; b++) {
				// calculo de reversos
				int reversoA = 0;
				int reversoB = 0;
				int aux;
				
				// calculo el reverso de a
				aux = a;
				while(aux > 0) {
					int digito = aux % 10;
					reversoA = reversoA * 10 + digito;
					aux /= 10;
				}
				// calculo el reverso de b
				aux = b;
				while(aux > 0) {
					int digito = aux % 10;
					reversoB = reversoB * 10 + digito;
					aux /= 10;
				}
				
				// condiciones reversos entre ellos (ej. 87 78) 
				// reversos ellos mismos (11)
				// producto entre ellos igual a producto de sus reversos
				boolean reversoEllosMismos = a == reversoA || b == reversoB;
				boolean reversosEntreEllos = a == reversoB || b == reversoA;
				boolean productoIgual = a * b == reversoA * reversoB;
				
				// si cumplen condiciones son complices y los muestro
				if(!reversoEllosMismos && !reversosEntreEllos && productoIgual) {
					System.out.println("(" + a + ", " + b + ")");
				}
				
			} // cierre for anidado
		} // cierre primer for
	} // cierre main
} // cierre clase
