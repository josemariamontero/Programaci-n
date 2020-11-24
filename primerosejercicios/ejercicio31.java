public class ejercicio31 {
  public static void main(String[] args ) {
    //creación de array con números Enteros
    int []numeros = new int[4]; //se reserva 4 espacios para añadir Enteros

    numeros[0] = 26;
    numeros[1] = -30;
    numeros[2] = 0;
    numeros[3] = 100;

    //imprimir los valores del array
    System.out.print(numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + numeros[3]);

    System.out.println();

    //mostrar la suma del primer y el último elemento
    System.out.println("Suma total: " + (numeros[0] + numeros[3]));

  }
}
