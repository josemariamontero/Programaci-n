/*Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
correspondiente traducción al castellano. Las palabras deben estar distribuidas
en dos columnas y alineadas a la izquierda.*/

public class ejercicio3 { 
	public static void main(String[] args) {
		System.out.println("Español					Inglés");
		System.out.println("--------------------------------------------");
		System.out.printf("%-20s %-20s \n", "manzanas", "apple");
		System.out.printf("%-20s %-20s \n", "perro", "dog");
		System.out.printf("%-20s %-20s \n", "zanahoria", "carrot");
		System.out.printf("%-20s %-20s \n", "portatil", "laptop");
		System.out.printf("%-20s %-20s \n", "movil", "smartphone");
		System.out.printf("%-20s %-20s \n", "calabaza", "pumkin");
		System.out.printf("%-20s %-20s \n", "raton", "mouse");
		System.out.printf("%-20s %-20s \n", "mesa", "table");
		System.out.printf("%-20s %-20s \n", "reloj", "clock");
		System.out.printf("%-20s %-20s \n", "zapatos", "shoes");
	}
}