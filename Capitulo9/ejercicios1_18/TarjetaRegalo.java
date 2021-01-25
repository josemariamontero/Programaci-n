package ejercicios1_18;

import java.text.DecimalFormat;

/*La empresa El Corte Islandés nos ha encargado una aplicación para gestionar
las tarjetas regalo. Como primer paso para implementar la aplicación, es
necesario crear la clase principal. Implementa la clase TarjetaRegalo. Cuando
se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática
un número de 5 dígitos. Si se intenta gastar más dinero del que tiene la tarjeta,
se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar
creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo
número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas
originales se quedarían con 0 € de saldo.*/

public class TarjetaRegalo {
	//atributos
	private String numero;
	private double saldo;
	
	//constructor
	public TarjetaRegalo (double saldo) {
		this.saldo = saldo;
		
		//generamos 5 números aleatorios
		this.numero = "";
		for (int i = 0; i < 5; i++) {
			this.numero += (int)(Math.random() * 10);
		}
	}
	
	public String toString() {
		DecimalFormat dosDecimales = new DecimalFormat("0.00");
		return "Tarjeta nº " + this.numero + " - " + dosDecimales.format(this.saldo) + "€";
	}
	
	//funciones
	public void gastar(double gasto) {
		if (this.saldo < gasto) {
			System.out.printf("No dispone del suficiente saldo para gastar %.2f\n " , gasto);
		} else {
			this.saldo -= gasto;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
		double saldoNuevo = this.getSaldo() + t.getSaldo();
		this.setSaldo(0);
		t.setSaldo(0);
		return new TarjetaRegalo(saldoNuevo);
	}
	
	public static void main(String[] args) {
		TarjetaRegalo t1 = new TarjetaRegalo(100);
		TarjetaRegalo t2 = new TarjetaRegalo(120);
		System.out.println(t1);
		System.out.println(t2);
		t1.gastar(45.90);
		t2.gastar(5);
		t2.gastar(200);
		t1.gastar(3.55);
		System.out.println(t1);
		System.out.println(t2);
		TarjetaRegalo t3 = t1.fusionaCon(t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
