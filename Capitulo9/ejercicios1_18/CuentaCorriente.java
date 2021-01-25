package ejercicios1_18;

/*Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un núme-
ro de cuenta de 10 dígitos. Para simplificar, el número de cuenta se genera de
forma aleatoria cuando se crea una cuenta nueva. La cuenta se puede crear con
un saldo inicial; en caso de no especificar saldo, se pondrá a cero inicialmente.
En una cuenta se pueden hacer ingresos y gastos. También es posible hacer
una transferencia entre una cuenta y otra. Se permite el saldo negativo. En
el siguiente capítulo se propone un ejercicio como mejora de éste, en el que se
pide llevar un registro de los movimientos realizados.*/

public class CuentaCorriente {
	//atributos
	private String numCuenta = "";
	private double saldo;
	
	//constructor
	public CuentaCorriente() {
		this.generaNumero();
	}
	
	public CuentaCorriente (double saldo) {
		this.generaNumero();
		this.saldo = saldo;
	}
	
	private void generaNumero() {
		for (int i = 0; i < 10; i++) {
			numCuenta += (int)(Math.random() * 10);
		}
	}

	@Override
	public String toString() {
		return "Numero de cta: " + numCuenta + " Saldo: " + String.format("%.2f", saldo) + "€";
	}
	
	public void ingreso(int dineroIngresar) {
		this.saldo += dineroIngresar;
	}
	
	public void gastos(int dineroGastos) {
		this.saldo -= dineroGastos;
	}
	
	public void transferencia(CuentaCorriente cuentaDestino, int transferencia) {
		this.saldo -= transferencia;
		cuentaDestino.saldo += transferencia;
	}
	
	public static void main(String[] args) {
		CuentaCorriente cuenta1 = new CuentaCorriente();
		CuentaCorriente cuenta2 = new CuentaCorriente(1500);
		CuentaCorriente cuenta3 = new CuentaCorriente(6000);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		cuenta1.ingreso(2000);
		cuenta2.gastos(600);
		cuenta3.ingreso(75);
		cuenta1.gastos(55);
		cuenta2.transferencia(cuenta3, 100);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
	}
}
