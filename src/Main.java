import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número (ou 'sair' para encerrar):");

            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();

                if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é par.");
                } else {
                    System.out.println("O número " + numero + " é ímpar.");
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("sair")) {
                    System.out.println("Encerrando o programa...");
                    break;
                } else {
                    System.out.println("Entrada inválida. Digite um número inteiro válido.");
                }
            }
        }

        scanner.close();
    }
}