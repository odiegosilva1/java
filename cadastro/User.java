package cadastro;

// Atributos
public class User {
  public String name, email, password;
  public double salary;

 }

  // Métodos - é void pois o valor é definido na pariemeira parte.
  public void CalculateSalary(int HoursMonth, double HourlyRate) {
    salary = HoursMonth * HourlyRate;

  }

  // Mostra na tela informações do usuário
  public void ShowInfo() {
    System.out.println("Dados usuário " + name + ":");
    System.out.println("E-mail" + email);
    System.out.println("Senha" + password);

  }

// Encapsulamento e definir quais parets do código vão ser visiveis de dentro e
// de fora da classe.
