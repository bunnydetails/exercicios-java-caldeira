import java.util.Scanner;

public class VerificacaoDoAtendimentoPrioritario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à fila prioritária!");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Gestante");
        System.out.println("2. Idosa");
        System.out.println("3. Pessoa com Deficiência (PCD)");
        System.out.println("4. Nenhuma das alternativas");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você tem direito a fila prioritária!");
                break;
            case 2:
                System.out.println("Você tem direito a fila prioritária!");
                break;
            case 3:
                System.out.println("Você tem direito a fila prioritária!");
                break;
            case 4:
                System.out.println("Você não tem direito a fila prioritária!");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }
    }
}

