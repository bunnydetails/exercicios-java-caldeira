import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite o primeiro número: ");
            double primeiroNumero = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double segundoNumero = scanner.nextDouble();

            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");

            int escolha = scanner.nextInt();
            double resultado = 0;

            switch (escolha) {
                case 1:
                    resultado = primeiroNumero + segundoNumero;
                    break;
                case 2:
                    resultado = primeiroNumero - segundoNumero;
                    break;
                case 3:
                    resultado = primeiroNumero * segundoNumero;
                    break;
                case 4:
                    if (segundoNumero != 0) {
                        resultado = primeiroNumero / segundoNumero;
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            if (escolha >= 1 && escolha <= 4) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.print("Deseja continuar? (Digite 'n' para sair): ");
            continuar = scanner.next().charAt(0);

        } while (continuar != 'n');

    }
}

