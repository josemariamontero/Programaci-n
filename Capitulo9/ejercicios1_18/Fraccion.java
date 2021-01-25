package ejercicios1_18;
/*Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de los
métodos pueden ser invierte , simplifica , multiplica , divide , etc.*/

public class Fraccion {
	//atributos
	private int numerador;
	private int denominador;
	
	//constructor
	public Fraccion (int num, int denom) {
		this.numerador = num;
		this.denominador = denom;
	}

	//getters
	public int getNumerador() {
		return numerador;
	}
	
	public int getDenominador() {
		return denominador;
	}

	//setters
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public String toString() {
		return this.numerador + "/" + this.denominador;
	}

	//acciones
	public Fraccion invertir() {
		return new Fraccion(this.denominador, this.numerador);
	}
	
	public Fraccion simplificar() {
		int d = this.denominador;
		int n = this.numerador;
		
		for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
			while ((n % i != 0) && (d % i != 0)) {
				d /= i;
				n /= i;
			}
		}
		
		return new Fraccion (n,d);
	}
	
	public static void main(String[] args) {
		Fraccion frac = new Fraccion(6,3);
		System.out.println(frac.simplificar());
		System.out.println(frac.invertir());
	}
	
	
	

}
