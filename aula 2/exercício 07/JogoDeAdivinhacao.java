import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soldadosInimigos = 300000;
        int palpite;

        System.out.println("Leônidas desafia você a adivinhar quantos soldados inimigos os 300 espartanos enfrentarão!");

        do {
            System.out.print("Insira o seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < soldadosInimigos) {
                System.out.println("Um pouco mais!");
            } else if (palpite > soldadosInimigos) {
                System.out.println("Um pouco menos!");
            } else {
                System.out.println("Parabéns! Você acertou. Os 300 espartanos enfrentarão " + soldadosInimigos + " soldados inimigos!");
            }
        } while (palpite != soldadosInimigos);

    }
}

