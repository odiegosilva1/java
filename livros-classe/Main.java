import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    Livro livro1 = new Livro();
    Livro livro2 = new Livro();

    livro1.titulo = "Harry Potter";
    livro1.autor = "JK Rolando";
    livro1.qtdPaginas = 200;

    livro2.preco = 36.90;
    livro2.titulo = "Código Limpo";
    livro2.qtdPaginas = 666;

  }

}
