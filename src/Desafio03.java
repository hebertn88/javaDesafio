import java.util.Arrays;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        String[] listaCompras = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua lista de Compras:");
        for (int i = 0; i < listaCompras.length; i++) {
            System.out.printf("Item %s: ", i+1);
            listaCompras[i] = sc.nextLine();
        }
        System.out.println("Os itens no seu carrinho são:");
        for (int i = 0; i < listaCompras.length; i++) {
            if (i < listaCompras.length -1 )
                System.out.printf("%s, ", listaCompras[i]);
            else
                System.out.printf("%s.", listaCompras[i]);

        sc.close();
        }
    }
}
