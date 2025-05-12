// crieando a classe livro
public class Livro {
  String titulo, autor, genero;
  int qtdPaginas;
  double preco;

  // Métodos em java
  void mostrarDadosLivro() {
    System.out.println("Dados dos Livros" + titulo + ":");
    System.out.println("\tAutor " + autor);
    System.out.println("\tGênero " + genero);
    System.out.println("\tPáginas " + qtdPaginas);
    System.out.println("\tPreço " + preco);
  }

  void calculaPreçoLivro() {
    preco = qtdPaginas / 3;
    System.out.println("Novo preço do livro: " + titulo + ":" + preco);
  }

}

// Quando dentro do IF existrie somente uma instrução não precisa usar "{}"
