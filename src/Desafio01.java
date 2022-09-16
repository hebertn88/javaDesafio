import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        /*
        Escreva um programa que informa a tabuada de multiplicação de um
        número informado pelo usuário (entre 1-10). Exemplo:
        Entre com um número de 1 a 10:
        1
        A tabuada de 1 é:
        1 x 1 = 1
        1 x 2 = 2
        1 x 3 = 3
        */
        Scanner scan = new Scanner(System.in);


        String response = "init";
        while (!isValid(response)) {
            System.out.println("Entre com um número de 1 a 10:");
            response = scan.nextLine();

            if (!isValid(response))
                System.out.println("Resposta inválida! Tente novamente...");
        }
        scan.close();
        int num = Integer.parseInt(response);

        for (int i = 1; i <= 10; i++)
            System.out.printf("%s X %s = %s%n",i, num, i * num);
    }
    public static boolean isValid(String text) {
        if (isInt(text)) {
            int n = Integer.parseInt(text);
            if (n >= 1 && n <= 10)
                return true;
        }
        return false;
    }

    public static boolean isInt(String text) {
        try {
            int n = Integer.parseInt(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
