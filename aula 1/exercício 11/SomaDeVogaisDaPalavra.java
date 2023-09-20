import java.util.Scanner;

public class SomaDeVogaisDaPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma palavra ou frase: ");
        String texto = scanner.nextLine().toLowerCase();

        int contadorVogais = 0;

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Número de vogais: " + contadorVogais + ".");
    }
}

