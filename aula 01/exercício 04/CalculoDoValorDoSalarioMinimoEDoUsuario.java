import java.util.Scanner;

public class CalculoDoValorDoSalarioMinimoEDoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1320.00;

        System.out.print("Insira o valor do seu salário: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeDeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.println("Você ganha aproximadamente " + quantidadeDeSalariosMinimos + " salários mínimos.");
    }
}

