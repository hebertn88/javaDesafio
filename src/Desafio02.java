import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        /*
        Escreva um programa que converte temperaturas de Celsius para Fahrenheit. Fórmula (0 °C ×
        9/5) + 32 = 32 °F. Exemplo:
        Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit:
        22
        O equivalente a 22 C é 71,6 F.
        */

        Scanner scan = new Scanner(System.in);

        String response = "init";
        while (!Desafio01.isInt(response)) {
            System.out.println("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit:");
            response = scan.nextLine();

            if (!Desafio01.isInt(response))
                System.out.println("Resposta inválida! Tente novamente...");
        }
        int num = Integer.parseInt(response);

        System.out.printf("%s°C equivale a %s°F!%n!", num, (float) num * 9 / 5 + 32);


    }

}
