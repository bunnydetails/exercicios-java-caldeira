import java.util.Scanner;

public class ConversaoDeDolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantia em dólares: ");
        double quantiaDolares = scanner.nextDouble();

        System.out.print("Insira a taxa de câmbio atual: ");
        double taxaCambio = scanner.nextDouble();

        double valorConvertido = quantiaDolares * taxaCambio;

        System.out.println("A quantia convertida é: " + valorConvertido + ".");
    }
}

