import java.util.Scanner;

public class StringPelaMetade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma string: ");
        String texto = scanner.nextLine();


        int comprimento = texto.length();
        int metade = comprimento / 2;

        String[] partes = {texto.substring(0, metade), texto.substring(metade)};

        System.out.println("Primeira parte da string: " + partes[0]);
    }
}

