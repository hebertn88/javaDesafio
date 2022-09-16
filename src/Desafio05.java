import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        //iniciar scaner
        Scanner sc = new Scanner(System.in);

        //criar array produtos promocao
        String[] produtosPromocao = {
                "banana",
                "maca",
                "abacaxi",
                "melao",
                "mamao"
        };

        //criar lista compras
        List<String> listaCompras = new ArrayList<String>();

        //obter lista compras
        System.out.println("Qual sua lista de compras para hoje?");

        String continua = "S";
        while (continua.equals("S")) {
            System.out.println("Insira uma fruta em sua lista de compras:");
            listaCompras.add(sc.nextLine().toLowerCase());

            System.out.println("Deseja continuar comprando?[S/N]");
            continua = sc.nextLine().toUpperCase();
        }

        //verificar qts itens da lista compras estao em promocao
        int qtdProdutosPromocao = 0;
        for (int i = 0; i < produtosPromocao.length; i++) {
            if (listaCompras.contains(produtosPromocao[i]))
                qtdProdutosPromocao++;
        }

        //exibir resultado
        System.out.printf("%s produto(s) escolhidos estão em promoção,%npontanto você terá %s%% de desconto!%n",qtdProdutosPromocao, qtdProdutosPromocao * 5);

    }
}
