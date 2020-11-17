/* Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado
y cubo . Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero . En el array cubo se deben almacenar los cubos de los valores que hay en
numero . A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas. */ 


public class ejercicio4 {
	public static void main(String[] args ) {
		//defino los 3 arrays

		int []numero = new int[20];
		int []cuadrado = new int[20];
		int []cubo = new int[20];

		// cargo en el array numero los numeros aleatorios

		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int)(Math.random()*101);
			
			//calculo el cuadrado
			cuadrado[i] = (int)(Math.pow(numero[i], 2));

			//calculo el cubo
			cubo[i] = (int)(Math.pow(numero[i], 3));			
		}

		//muestro los resultados 

		for (int i = 0; i < numero.length; i++) {
			System.out.printf("%5d | %7d | %9d \n", numero[i], cuadrado[i], cubo[i]);
		}
	}
}