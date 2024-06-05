package atividades;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroEscolhido;

        for (int i = 0; i < 5; i++) {
            System.out.println("Tente adivinhar um numero entre 0 e 100:");
            numeroEscolhido = sc.nextInt();

            if (numeroAleatorio == numeroEscolhido){
                System.out.println("Parabéns! Você acertou!!");
                break;
            } else if (numeroEscolhido > numeroAleatorio) {
                System.out.println("Número maior que o resultado");
            }else {
                System.out.println("Número menor que o resultado");
            }
        }

        System.out.println(numeroAleatorio);
    }
}
