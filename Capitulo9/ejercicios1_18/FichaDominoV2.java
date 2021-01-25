package ejercicios1_18;

/*Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de
forma aleatoria, que encajen bien y que estén bien colocadas según el juego
del dominó. No hay que controlar si se repiten o no las fichas.*/

public class FichaDominoV2 {
	
	private int lado1;
	private int lado2;
	
	public FichaDominoV2 () {
		this.lado1 = (int)(Math.random() * 7);
		this.lado2 = (int)(Math.random() * 7);
	}
	
	public FichaDominoV2(int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public boolean encajan(FichaDominoV2 ficha) {
		return (lado1 == ficha.lado1) || (lado1 == ficha.lado2) || (lado2 == ficha.lado1) || (lado2 == ficha.lado2);
	}
	
	public boolean encajanEnFila(FichaDominoV2 ficha) {
		return this.lado2 == ficha.lado1;
	}
	
	public String toString() {
		return "[" + lado1 + "|" + lado2 + "]";
	}
	
	public static void main(String[] args) {
		int cuentaFichas = 0;

	    FichaDomino[] fichas = new FichaDomino[8];

	    fichas[0] = new FichaDomino();
	    
	    for (int i = 1; i < 8; i++) {
	      FichaDomino aux;
	      do {
	        aux = new FichaDomino();
	      } while (!fichas[i - 1].encajanEnFila(aux));
	      fichas[i] = aux;
	    }

	    for (FichaDomino ficha : fichas) {
	      System.out.print(ficha);
	    }
	}
}
