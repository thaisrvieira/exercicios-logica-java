/*
 * Exercício 02 – Cálculo de média e situação do aluno
 *
 * Este programa solicita o nome do aluno e duas notas.
 * A partir dessas notas, calcula a média e informa
 * a situação do aluno (Aprovado, Recuperação ou Reprovado),
 * utilizando estruturas condicionais.
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a nota 1:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3:");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a nota 4:");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 70){
            System.out.println("O aluno " + nome + " está aprovado. Com a média de " + media);
        } else if (media >=50 & media <70 ) {
            System.out.println("O aluno " + nome + " está de recuperação.  Com a média de " + media);
        } else {
            System.out.println("O aluno " + nome + " está reprovado. Com a média de " + media);

        }
    }
}
