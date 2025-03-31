package java02;

// Main class 
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int x, y, res;

    try (Scanner teclado = new Scanner(System.in)) {
      System.out.println("Digite x: "); // Mensagem ao usuário
      x = teclado.nextInt();

      System.out.println("Digite Y: "); // Mensagem ao usuário
      y = teclado.nextInt();
    }

    res = x + y;
    System.out.println("A soma dos números é: " + res);
  }

}
