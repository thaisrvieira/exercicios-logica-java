import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        int idadeFutura = idade + 10;

        System.out.println();
        System.out.println("Olá " + nome);
        System.out.println("Daqui a 10 anos você terá " + idadeFutura + " anos.");

        scanner.close();

    }
}
