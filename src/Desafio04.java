import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] produtosPromocao = {
                "BANANA",
                "MACA",
                "ABACAXI",
                "MELAO",
                "MAMAO"
        };
        System.out.println("Qual fruta você deseja comprar hoje? (Não use acentos)");
        String resposta = sc.nextLine();

        List<String> listaPromocao = Arrays.asList(produtosPromocao);
        if (listaPromocao.contains(resposta.toUpperCase()))
            System.out.printf("Ótima escolha! %s está em promoção hoje.%n", resposta);
        else
            System.out.println("Este produto não está em promoção!");

        sc.close();
    }
}
