import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = 1, i, d;

    System.out.println("Cuantos valores ingresara?");
    d = sc.nextInt();

    String tab[] = new String[d];

    for (i = 0; i < d; i++) {
      System.out.println("Ingrese el " + q + " valor");
      q++;

      String res = sc.next();
      tab[i] = res;
    }
  }
}
