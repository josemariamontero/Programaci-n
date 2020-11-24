import java.util.Scanner;

public class ejercicio35 {
  public static void main(String[] args ) {
    Scanner x = new Scanner(System.in);

    //defino el array reservando 4 espacios
    double []numeros = new double[5];

    System.out.println("Para calcular la nota media necesito conocer las notas de tus examenes");

    //Pedimos las notas por teclado y las guardamos en nuestro array
    for (int i = 1; i < numeros.length; i++) {
      System.out.print("Introduce la nota del examen " + i + " : ");
      numeros[i] = x.nextDouble();
    }

    //inicializo una variable para sumar las notas
    double suma = 0;

    //recorro el array al estilo foreach y calculo el total de los examenes
    for (double i : numeros) {
      suma += i;
    }

    //Muestro la media de los examenes
    System.out.println("La media de los examenes es: " + (suma / 4));

  }
}
