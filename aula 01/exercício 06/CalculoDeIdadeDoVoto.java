import java.util.Scanner;

public class CalculoDeIdadeDoVoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 16){
            System.out.println("Você não pode votar, pois é menor de 16 anos!");
        } else if (idade == 16 || idade == 17 || idade > 65) {
            System.out.println("Você pode votar, mas não é necessário, pois seu voto é facultativo.");
        } else {
            System.out.println("Você é obrigado a votar!");
        }
    }
}
