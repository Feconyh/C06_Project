package Utils;

import Computador.Computador;

import java.util.Scanner;

public class ProcessarPedido {
    private static int[] carrinho = new int[10];
    private static int n = 0;

    public static void helper(int promo){
        carrinho[n] = promo;
        n++;
    }

    public static void getCarrinho(){
        for (int i = 0; i < n; i++) {
            System.out.println(carrinho[i]);
        }
    }
}
