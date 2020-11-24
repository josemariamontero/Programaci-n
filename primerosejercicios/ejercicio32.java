public class ejercicio32 {
  public static void main(String[] args ) {
    //defino el array y reservo 10 espacios
    int numeros[] = new int[10];

    //asignamos valores a cada espacio del array
    numeros[0] = 8;
    numeros[1] = 3;
    numeros[2] = 200;
    numeros[3] = 150;
    numeros[4] = 11;
    numeros[5] = 88;
    numeros[6] = numeros[2] * 10;
    numeros[7] = numeros[2] / 10;
    numeros[8] = numeros[0] + numeros[1] + numeros[2];
    numeros[9] = numeros[8];

    //imprimo todos los valores de array
    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i] + " ");
    }
  }
}
