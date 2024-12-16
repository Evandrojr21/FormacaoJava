package conta;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {

  static class TipoInvalidoException extends Exception {
    public TipoInvalidoException(String message) {
      super(message);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      int numeroConta = lerNumeroConta(scanner);

      scanner.nextLine();

      System.out.println("Por favor, digite o número da Agência:");
      String agencia = scanner.nextLine();

      String nomeCliente = lerNomeCliente(scanner);
      double saldo = lerSaldo(scanner);

      scanner.close();

      String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
      System.out.println(mensagem);

    } catch (TipoInvalidoException e) {
      System.out.println("Erro: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Erro inesperado: " + e.getMessage());
    }
  }


  private static int lerNumeroConta(Scanner scanner) throws TipoInvalidoException {
    System.out.println("Por favor, digite o número da Conta:");
    try {
      return scanner.nextInt();
    } catch (InputMismatchException e) {
      scanner.nextLine();
      throw new TipoInvalidoException("O número da conta deve ser um número inteiro, Refaça o processo");
    }
  }

  private static double lerSaldo(Scanner scanner) throws TipoInvalidoException {
    System.out.println("Por favor, digite o saldo:");
    try {
      return scanner.nextDouble();
    } catch (InputMismatchException e) {
      scanner.nextLine();
      throw new TipoInvalidoException("O saldo deve ser um número decimal, refaça o processo");
    }
  }
  private static String lerNomeCliente(Scanner scanner) throws TipoInvalidoException {
    String nomeCliente;
    while (true) {
      System.out.println("Por favor, digite o nome do Cliente:");
      nomeCliente = scanner.nextLine();

      if (nomeCliente.matches(".*\\d.*")) {
        System.out.println("Erro: O nome não pode conter números. Tente novamente.");
      } else {
        break;
      }
    }
    return nomeCliente;
  }

}