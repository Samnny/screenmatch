package atividades;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao;
        double notas = 0;
        double nota = 0;
        double qtdNotas = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme: ");
            notas += sc.nextDouble();
        }

        mediaAvaliacao = notas/3;
        System.out.println("Media das avaliações: "+ mediaAvaliacao);

        mediaAvaliacao = 0;
        notas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            nota = sc.nextDouble();
            if (nota != -1) {
                notas += nota;
                qtdNotas++;
            }
        }

        mediaAvaliacao = notas/qtdNotas;
        System.out.println("Media das avaliações: "+ mediaAvaliacao);

    }
}
