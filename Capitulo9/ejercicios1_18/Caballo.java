package ejercicios1_18;

/*Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
instancias y aplicándole algunos métodos*/

public class Caballo {
	
	//atributos
	private String nombre;
	private String color;
	private int edad;
	
	//contructor
	Caballo (String nom, String col, int ed) {
		this.nombre = nom;
		this.color = col;
		this.edad = ed;
	}
	
	//get
	public String getNombre() {
		return this.nombre;
	}
	
	//acciones
	public void cabalgar() {
		System.out.println("TOC TOC TOC");
	}
	
	public void relinchar() {
		System.out.println("ÑIIIIIEEEEEEEE");
	}
	
	public static void main(String[] args) {
		Caballo cab = new Caballo("Pegaso", "Marrón", 2);
		
		System.out.println("Mi caballo se llama " + cab.getNombre());
		cab.relinchar();
		System.out.println("¿Cómo trotas " + cab.getNombre() + "?");
		cab.cabalgar();
	}
	
}
