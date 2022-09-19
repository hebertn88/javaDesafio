import java.text.DecimalFormat;
import java.util.*;

public class DesafioFinal {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        //informar lista de desejos(list)
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo! Vamos montar sua lista de Comrpas?");
        ArrayList<String> listaDesejo = new ArrayList<>();

        String resposta;
        do {
            System.out.println("Qual fruta deseja comprar?");
            System.out.printf("Item %s: ", listaDesejo.size() + 1);
            resposta = sc.nextLine().toUpperCase();

            if (!listaDesejo.contains(resposta))
                listaDesejo.add(resposta);
            else System.out.println("A fruta já está na lista!");

            System.out.print("Deseja continuar? [S/N] ");
        }
        while (simOuNao(sc));

        System.out.printf("%nOK! Anotamos %s itens para a compra.%n", listaDesejo.size());
        System.out.println("Já encaminhamos sua Lista para um dos nossos compradores!");

        //informar lista efetivamente compradas e preco pago (hashmap)
        System.out.println();
        System.out.println("Olá COMPRADOR, vamos conferir os itens comprados?");

        Map<String, Double> itensComprados = new HashMap<>();
        for (int i = 0; i < listaDesejo.size(); i++) {
            System.out.printf("%nItem %s - %s: Foi comprado? [S/N] ", i + 1, listaDesejo.get(i));
            if (simOuNao(sc)) {
                do {
                    System.out.print("Quanto você pagou neste item? ");
                    resposta = sc.nextLine();

                    if (!numeroPositivo(resposta))
                        System.out.println("Valor inválido");
                }
                while (!numeroPositivo(resposta));
            itensComprados.put(listaDesejo.get(i), Double.parseDouble(resposta));
            }
        }

        //exibir valor total com gorgeta
        double soma = 0;

        System.out.println("---------------");

        for (Map.Entry item: itensComprados.entrySet()) {
            System.out.printf("%s - %s%n", item.getKey(), df.format(item.getValue()));
            soma += (double) item.getValue();
        }

        System.out.println("---------------");

        double porcItensComprados  = (double) itensComprados.size() / listaDesejo.size();
        if (porcItensComprados >= .5 && porcItensComprados < .7) {
            soma += 3;
            System.out.println("GORGETA - 3,00");
        } else if (porcItensComprados >= .75 && porcItensComprados < .9) {
            soma += 5;
            System.out.println("GORGETA - 5,00");
        } else if (porcItensComprados >= .9) {
            soma += 10;
            System.out.println("GORGETA - 10,00");
        } else {
            System.out.println("GORGETA - 0,00");

        }
        System.out.println("---------------");
        System.out.printf("TOTAL - %s%n", df.format(soma));
        System.out.println("---------------");

    }

    public static boolean simOuNao(Scanner sc) {
        String resposta;

        resposta = sc.nextLine().trim().toUpperCase();
        switch (resposta) {
            case "S":
            case "SIM":
                return true;
            default:
                return false;
        }
    }

    public static boolean numeroPositivo(String numero) {
        try {
           double num = Double.parseDouble(numero);
           if (num > 0)
               return true;
           else
               return false;
        }
        catch (NumberFormatException err) {
            return false;
        }
    }
}
