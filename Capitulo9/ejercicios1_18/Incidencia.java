package ejercicios1_18;

public class Incidencia {
	private int codigo;
	private int puesto;
	private String problema;
	private String resuelto;
	private String estado;
	private static int contadorIncidencias = 1;
	private static int incidenciasPendientes = 0;
	
	public Incidencia(int puesto, String problema) {
		this.puesto = puesto;
		this.problema = problema;
		this.estado = "Pendiente";
		this.codigo = contadorIncidencias;
		incidenciasPendientes++;
		contadorIncidencias++;
	}
	
	public void resolucion(String resolucion) {
		this.resuelto = resolucion;
		this.estado = "Resuelto";
		incidenciasPendientes--;
	}

	@Override
	public String toString() {
		if (estado.equals("Resuelto")) {
			return "Incidencia " + codigo + " - " + "Puesto: " + puesto + " - " + problema + " - " + estado + " - " + resuelto;
		} else {
			return "Incidencia " + codigo + " - " + "Puesto: " + puesto + " - " + problema + " - " + estado;
		}
	}
	
	public static int getPendientes() {
		return incidenciasPendientes;
	}
	
	public static void main(String[] args) {
		Incidencia inc1 = new Incidencia(105, "No tiene acceso a internet");
		Incidencia inc2 = new Incidencia(14, "No arranca");
		Incidencia inc3 = new Incidencia(5, "La pantalla se ve rosa");
		Incidencia inc4 = new Incidencia(237, "Hace un ruido extraño");
		Incidencia inc5 = new Incidencia(111, "Se cuelga al abrir 3 ventanas");
		inc2.resolucion("El equipo no estaba enchufado");
		inc3.resolucion("Cambio del cable VGA");
		System.out.println(inc1);
		System.out.println(inc2);
		System.out.println(inc3);
		System.out.println(inc4);
		System.out.println(inc5);
		System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
	}

}
