import java.util.Scanner;
import java.time.LocalDate;

public class CalculoDaIdadeDoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o ano que você nasceu: ");
        int anoNascimento = scanner.nextInt();

        scanner.close();

        int anoAtual = LocalDate.now().getYear();

        int idade = anoAtual - anoNascimento;

        System.out.println("Você tem " + idade + " anos.");
    }
}

