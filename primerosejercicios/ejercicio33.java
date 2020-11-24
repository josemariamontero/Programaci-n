public class ejercicio33 {
  public static void main(String[] args) {

    //defino un array y reservo 6 espacios
    char []caracter = new char[6];

    //asigno valores dentro del array
    caracter[0] = 'R';
    caracter[1] = '%';
    caracter[2] = '&';
    caracter[3] = '+';
    caracter[4] = 'A';
    caracter[5] = '2';

    //imprimo todos los elementos que contiene el array
    for (int i = 0; i < caracter.length; i++) {
      System.out.println(caracter[i]);
    }

  }
}
