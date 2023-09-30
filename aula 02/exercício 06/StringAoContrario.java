import java.util.Scanner;

public class StringAoContrario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma string: ");
        String texto = scanner.nextLine();

        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        System.out.println("String invertida: " + invertida);
    }
}

