import java.util.Scanner;

public class TresNumerosMaiorMenorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.print("Insira o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        System.out.print("Insira o terceiro número: ");
        double terceiroNumero = scanner.nextDouble();

        double maior = Math.max(Math.max(primeiroNumero, segundoNumero), terceiroNumero);

        double menor = Math.min(Math.min(primeiroNumero, segundoNumero), terceiroNumero);

        double media = (primeiroNumero + segundoNumero + terceiroNumero) / 3;

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média aritmética é: " + media);
    }
}

