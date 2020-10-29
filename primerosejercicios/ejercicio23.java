// operadores logicos

public class ejercicio23 {
	public static void main(String[] args ) {
	System.out.println("Adivina el numero que estoy pensando.");
	
	System.out.print("Introduce un numero: ");
	String respuesta = System.console().readLine();
	sssint numero = Integer.parseInt(respuesta);

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
