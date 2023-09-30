import java.util.Scanner;

public class CalculoNumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Insira o segundo número: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Números primos de " + primeiroNumero + " a " + segundoNumero + ":");

        for (int numero = primeiroNumero; numero <= segundoNumero; numero++) {
            if (isPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
