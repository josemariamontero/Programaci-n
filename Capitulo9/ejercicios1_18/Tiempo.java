package ejercicios1_18;

/*Crea la clase Tiempo con los métodos suma y resta . Los objetos de la clase Tiempo
son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30)
donde los parámetros que se le pasan al constructor son las horas, los minutos
y los segundos respectivamente. Crea el método toString para ver los intervalos
de tiempo de la forma 10h 35m 5s . Si se suman por ejemplo 30m 40s y 35m 20s el
resultado debería ser 1h 6m 0s . Realiza un programa de prueba para comprobar
que la clase funciona bien.*/

public class Tiempo {
	//atributos
	private int segundos;
	
	//constructor
	public Tiempo (int horas, int minutos, int segundos) {
		this.segundos = (horas * 3600) + (minutos * 60) + segundos;
	}
	
	//setters
	public Tiempo (int segundos) {
		this.segundos = segundos;
	}

	@Override
	public String toString() {
		int segundos = this.segundos;
		int horas = segundos / 3600;
		segundos -= horas * 3600;
		int minutos = segundos / 60;
		segundos -= minutos * 60;
		
		return horas + "horas " + minutos + " minutos " + segundos + " segundos ";
	}
	
	//getter
	public int getSegundos() {
		return this.segundos;
	}
	
	//funciones
	
	public Tiempo suma(Tiempo t) {
		return new Tiempo(this.segundos + t.getSegundos());
	}
	
	public Tiempo resta(Tiempo t) {
		return new Tiempo(this.segundos - t.getSegundos());
	}
	
	public static void main(String[] args) {
		Tiempo tiempo1 = new Tiempo(0, 30, 40);
		Tiempo tiempo2 = new Tiempo(0, 35, 20);
		
		System.out.println(tiempo1 + " + " + tiempo2 + " = " + tiempo1.suma(tiempo2));
		System.out.println(tiempo2 + " - " + tiempo1 + " = " + tiempo2.resta(tiempo1));
	}
	
	
}
