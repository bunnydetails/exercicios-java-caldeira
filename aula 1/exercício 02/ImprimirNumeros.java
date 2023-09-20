import java.util.Scanner;

public class ImprimirNumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        double primeiroNumero = scan.nextDouble();

        System.out.print("Insira o segundo número: ");
        double segundoNumero = scan.nextDouble();

        System.out.println("Você inseriu os números: " + primeiroNumero + " e " + segundoNumero);
    }
}
