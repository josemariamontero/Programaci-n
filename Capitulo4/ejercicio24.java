/* Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado. */

public class ejercicio24 {
	public static void main(String[] args ) {
		System.out.println("1 - Programador junior");
		System.out.println("2 - Programador senior");
		System.out.println("3 - Jefe de proyecto");	

		System.out.print("Introduce el cargo del empleado: ");
		int cargo = Integer.parseInt(System.console().readLine());

		System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
		int diasViaje = Integer.parseInt(System.console().readLine());

		System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado) ");
		int estadoCivil = Integer.parseInt(System.console().readLine());
	
		double sueldoBase = 0;
		double dietas = 0;
		double sueldoBruto = 0;
		double retencion = 0;

		switch (cargo) {
			case 1:
				sueldoBase = 950;
				break;
			case 2:
				sueldoBase	= 1200;
				break;
			case 3:
				sueldoBase = 1600;
				break;
			default:
				System.out.print("No existe ese cargo.");
		}

		
		dietas = diasViaje * 30;
	

		sueldoBruto =  sueldoBase + dietas;

		switch (estadoCivil) {
			case 1:
				retencion = sueldoBruto * 0.25;
				break;
			case 2:
				retencion = sueldoBruto * 0.20;
				break;
			default:
				System.out.print("No se puede comprobar ese estado civil"); 
		}

		double total = sueldoBruto - retencion;

		System.out.println("Sueldo base: " + sueldoBase);
		System.out.println("Dietas ( " + diasViaje + " viajes) " + dietas);
		System.out.println("---------------------------");
		System.out.println("Sueldo bruto: " + sueldoBruto);
		System.out.println("Retención IRPF: " + retencion);
		System.out.println("-----------------------------");
		System.out.println("Sueldo neto: " + total);

	}	
}