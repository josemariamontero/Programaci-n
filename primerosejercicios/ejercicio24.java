// sentencia múltiple 

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