package atividades;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperaturaCelsius;
        double temperaturaFahrenheit;
        int temperaturaFahrenheitInteira;

        System.out.println("Digite uma temperatura em Celsius:");
        temperaturaCelsius = sc.nextDouble();

        temperaturaFahrenheit = converterTemperatura(temperaturaCelsius);
        System.out.println("Temperatura em Fahrenheit: "+ temperaturaFahrenheit);

        temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("Temperatura inteira: "+ temperaturaFahrenheitInteira);
    }

    static double converterTemperatura(double temperaturaCelsius){
        return (temperaturaCelsius * 1.8) + 32;
    }
}
