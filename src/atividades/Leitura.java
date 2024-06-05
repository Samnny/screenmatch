package atividades;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filme;
        int anoLancamento;
        double avaliacao;

        System.out.println("Digite um filme: ");
        filme = sc.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        anoLancamento = sc.nextInt();

        System.out.println("Diga sua avaliação para o filme: ");
        avaliacao = sc.nextDouble();

        System.out.println("""
                    Filme: %s
                    Ano de lançamento: %d
                    Avaliação: %.1f
                """.formatted(filme, anoLancamento, avaliacao));
    }
}
