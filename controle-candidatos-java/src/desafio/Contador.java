package desafio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
          System.out.println("Digite um número: ");
          int numeroUm = terminal.nextInt();
          System.out.println("Digite um segundo número: ");
          int numeroDois = terminal.nextInt();

          try {
              contar(numeroUm, numeroDois);

          } catch (ParametrosInvalidosException exception) {
              System.out.println(exception.getMessage());
          }
        }
    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        if(numeroUm >= numeroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = numeroDois - numeroUm;
        for(int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

