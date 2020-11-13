package ex_prog_20_21_1;

import java.util.Scanner;

public class Copa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// introduccion de parametros
		int alturaTotal;
		do {
			System.out.println("Introduce altura total copa: ");
			alturaTotal = sc.nextInt();
			if(alturaTotal < 10) {
				System.out.println("La altura total debe ser mayor o igual a 10");
			}
		}while(alturaTotal < 10); // comprobacion altura
		System.out.println("Introduce altura soporte: ");
		int soporte = sc.nextInt();
		System.out.println("Introduce llenado: ");
		int llenado = sc.nextInt();
		
		// calculo de altura del vaso (altura total - soporte - base)
		int alturaCopa = alturaTotal - soporte - 1;
		
		// comprobacion que no se desborda
		// si se desborda sale del programa
		if(llenado > alturaCopa) {
			System.out.println("La copa se desborda");
			sc.close();
			return;
		}
		
		// claculo inicial para espacios
		int espaciosExt = 0;
		int espaciosInt = 2 * (alturaCopa - 1) + 1;
		
		// pintar vaso de la copa
		for(int i = 0; i < alturaCopa; i++) {
			
			// pintar espacios exteriores
			for(int j = 0; j < espaciosExt; j++) {
				System.out.print(" ");
			}
			
			// pintar borde izquierdo
			System.out.print("\\");
			
			// pintar espacios interiores o llenado
			String caracterInterior=" ";
			if(alturaCopa - i <= llenado) {
				caracterInterior="-";
			}
			for(int j = 0; j < espaciosInt; j++) {
				System.out.print(caracterInterior);
			}
			
			// pintar borde derecho
			System.out.print("/");
			
			// pintar salto de linea
			System.out.println("");
			
			// actualizar contadores
			espaciosExt++;
			espaciosInt -= 2;
		}
		
		
		// pintar soporte de la copa
		for(int i = 0; i < soporte; i++) {
			
			// pintar espacios exteriores
			for(int j = 0; j < espaciosExt; j++) {
				System.out.print(" ");
			}
			
			// pintar soporte
			System.out.println("|");
		}
		
		// pintar base
		for(int i = 0; i < espaciosExt-2; i++) {
			System.out.print(" ");
		}
		System.out.println("*****");
		
		
		sc.close();
	}

}
