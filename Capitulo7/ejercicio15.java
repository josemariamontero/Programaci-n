/* Un restaurante nos ha encargado una aplicación para colocar a los clientes en
sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
(mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
como máximo e intente de nuevo”. Para el grupo que llega, se busca
siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
pueden romper aunque haya huecos sueltos suficientes */

import java.util.Scanner;

public class ejercicio15 {
	public static void main(String[] args ) {
		Scanner x = new Scanner(System.in);

		//defino el array para las mesas reservando 10 espacios
		int []mesas = new int[10];

		//completo las mesas de forma aleatoria
		for (int i = 0; i < mesas.length; i++) {
			mesas[i] = (int)(Math.random()*5);
		}

		int personas;

		do {
			//muestro el número de mesas que hay
			System.out.print("Mesa nº: ");
			for (int i = 1; i < 11; i++) {
				System.out.print(i + " ");
			}

			//salto de línea
			System.out.println();

			//Muestro el número de personas que hay en cada mesa
			System.out.print("Ocupación: ");
			for (int i = 0; i < mesas.length; i++) {
				System.out.print(mesas[i] + " ");
			}

			//salto de línea
			System.out.println();

			//pregunto cuántas personas son
			System.out.print("¿Cuántas personas son?: ");
			personas = x.nextInt();

			//comprobamos que el grupo de personas sea menor que 4
			if (personas > 4) {
				System.out.println("Lo sentimos, no admitimos tantas personas en un grupo");		
			} else {
				//primero buscamos que una mesa esté vacía
				int mesaVacía = 0;
				boolean hayMesaVacía = false;

				for (int i = mesas.length - 1; i >= 0; i--) {
					if (mesas[i] == 0) {
						mesaVacía = i;
						hayMesaVacía = true;
					}
				}

				//Si hay mesas vacías sentamos al grupo en esa mesa
				if (hayMesaVacía) {
					mesas[mesaVacía] = personas;
					System.out.println("Coloquese en la mesa " + mesaVacía + " por favor.");
				} else {
					//buscamos una mesa en la que quepan el grupo de personas
					int hueco = 0;
					boolean hayHueco = false;

					for (int i = mesas.length - 1; i >= 0; i--) {
						if (personas == (4 - mesas[i])) {
							hueco = i;
							hayHueco = true;
						}
					}

					if (hayHueco) {
						mesas[hueco] += personas;
						System.out.println("Hay hueco en la mesa " + hueco + 1);
					} else {
						System.out.println("Lo siento no nos queda sitio");
					}

				}
			}
		} while (personas != -1);
 
	}
}