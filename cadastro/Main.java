package cadastro;

public class Main {
  public static void main(String[] args) { // Isso define por onde começa o preograma.

    // Criando usuários
    User user1 = new User();
    User user2 = new User();

    user1.name = "Diego";
    user1.email = "diego@contato.br";
    user1.password = "666";
    user1.salary = 1500;

    user2.name = "Maria";
    user2.email = "maria@contato.br";
    user2.password = "555";
    user2.salary = 2000;

    // Usando Método
    user1.CalculateSalary(150, 50);

    user1.ShowInfo();

  }

}
