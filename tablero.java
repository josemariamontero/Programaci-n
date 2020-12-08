public class Tablero {

	

	public static void main(String[] args) {
		
		// rellenar tablero
		String tablero[][] = new String[8][8];

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				tablero[i][j] = "";
				String jugador = "";
				if (i < 3) {
					jugador = "*";
				} else if (i >= 5) {
					jugador = "o";
				}
				if (i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0)
					tablero[i][j] = jugador;
			}
		}
		// --------------------------------------------

		// relleno dos damas de ejemplo
		//tablero[3][2] = "d*";
		//tablero[4][3] = "do";
		
		tablero[5][3]="*";
		tablero[5][4]="do";
		
		
		pintaTablero(tablero);		

	}

	
	// imprime el tablero recibido por parámetro
	// el tablero debe ser una matriz de cadenas de 8x8
	// debera tener:
	//      "" si la casilla es vacía
	//      "*" si la pieza es roja
	//      "o" si la pieza es verde
	//      "d*" si la pieza es dama roja
	//      "do" si la pieza es dama verde
	static void pintaTablero(String[][] tablero) {

		// imprimir borde superior tablero
		System.out.println("       0     1     2     3     4     5     6     7");
		System.out.println(" ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println(" ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		
		// hay 24 filas porque cada casilla tiene tres filas
		for (int fila = 0; fila < 24; fila++) {
			
			// obtengo el valor de la fila
			// es fila/3 porque fila puede valer de 0 a 23
			int nFila = fila/3;
			
			// obtengo si estoy en el centro de la fila
			// serian fila 1, 4, 7, 10, 13, etc
			boolean centroFila = (fila-1)%3 == 0;

			// imprimir numeros de fila solo si esta centrado, sino espacio
			if (centroFila) {
				System.out.print(nFila);
			} else {
				System.out.print(" ");
			}
			
			
			// imprimir borde exterior
			System.out.print("░░░░");

			// recorro las columnas
			for (int columna = 0; columna < 8; columna++) {
				 
				// obtengo el color de la casilla				 
				String casilla = getColorCasilla(nFila, columna);
			
				// obtengo el color de la pieza (si está vacía sera casilla)
				String pieza = getColorPieza(tablero, nFila, columna);
				
				// si no estoy en el centro de la fila el color sera casilla
				if(!centroFila) {
					pieza = casilla;
				}
				
				// pinto la pieza rodeada de casilla
				System.out.print(casilla + pieza + casilla);
			}
			
			// pintar el borde exterior derecho
			System.out.print("░░░░");

			// pintar el número de fila a la derecha (si está centrada)
			if (centroFila) {
				System.out.print(nFila);
			}
			
			// salto de linea
			System.out.println();
		}
		
		// imprimir borde final de tablero
		System.out.println(" ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println(" ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("       0     1     2     3     4     5     6     7");

	}
	
	
	
	// devuelve true si hay pieza en la coordenada del tablero
	static boolean hayPieza(String tablero[][], int i, int j) {
		if (!tablero[i][j].equals(""))
			return true;
		else
			return false;
	}

	// devuelve el color de la pieza en una cordenada del tablero
	// el tablero pasado debera tener:
	//      "" si la casilla es vacía
	//      "*" si la pieza es roja
	//      "o" si la pieza es verde
	//      "d*" si la pieza es dama roja
	//      "do" si la pieza es dama verde
	static String getColorPieza(String tablero[][], int i, int j) {

		String piezaRoja = "\033[0m" + "\033[91m" + "██" + "\033[0m";
		String piezaVerde = "\033[0m" + "\033[92m" + "██" + "\033[0m";
		String piezaDamaRoja = "\033[0m" + "\033[31m" + "D█" + "\033[0m";
		String piezaDamaVerde = "\033[0m" + "\033[32m" + "D█" + "\033[0m";

		String pieza = "";

		if (tablero[i][j].equals("*"))
			pieza = piezaRoja;
		else if (tablero[i][j].equals("o"))
			pieza = piezaVerde;
		else if(tablero[i][j].equals("d*"))
			pieza = piezaDamaRoja;
		else if((tablero[i][j].equals("do")))
			pieza = piezaDamaVerde;
		else
			pieza = getColorCasilla(i, j);

		return pieza;
	}
	
	// devuelve el color de la casilla dadas fila y columna
	static String getColorCasilla(int fila, int columna) {
		
		// se definen constantes para representar el
		// contenido de las celdas
		final String RESET = "\033[0m";
		final String INVERSO = "\033[7m";
		final String NEGRA = "  ";
		final String BLANCA = INVERSO + NEGRA + RESET;		
		
		String casilla = "";		
		boolean filaPar = fila %2 == 0;
		boolean columnaPar = columna%2 == 0;	
		
		if(filaPar == columnaPar) {
			casilla = BLANCA;
		}
		else {
			casilla = NEGRA;
		}
		
		return casilla;
	}
	

}

