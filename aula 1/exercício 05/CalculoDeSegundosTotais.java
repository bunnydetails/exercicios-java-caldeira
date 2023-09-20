import java.util.Scanner;

public class CalculoDeSegundosTotais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora (0-23): ");
        int hora = scanner.nextInt();

        System.out.print("Digite o minuto (0-59): ");
        int minuto = scanner.nextInt();

        System.out.print("Digite o segundo (0-59): ");
        int segundo = scanner.nextInt();

        int segundosDesdeMeiaNoite = hora * 3600 + minuto * 60 + segundo;

        int segundosParaMeiaNoite = 24 * 3600 - segundosDesdeMeiaNoite;

        System.out.println("Segundos desde a meia-noite: " + segundosDesdeMeiaNoite + " segundos");
        System.out.println("Segundos que faltam para a meia-noite: " + segundosParaMeiaNoite + " segundos");
    }
}

