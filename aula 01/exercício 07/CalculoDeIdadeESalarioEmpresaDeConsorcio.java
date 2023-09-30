import java.util.Scanner;

public class CalculoDeIdadeESalarioEmpresaDeConsorcio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Insira seu salário: ");
        double salario = scanner.nextDouble();

        if (idade >= 18 && salario >= 2000.00) {
            System.out.println("Parabéns, você pode comprar um automóvel!");
        } else {
            System.out.println("Sentimos muito, mas você não atende aos requisitos para comprar um automóvel.");
        }
    }
}

