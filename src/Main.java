import Cliente.Cliente;
import Computador.Computador;
import Utils.ProcessarPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int promo;

        Cliente cliente = new Cliente();
        Computador pcApple = new Computador("Apple");
        Computador pcSamsung = new Computador("Samsung");
        Computador pcDell = new Computador("Dell");

        pcApple.setPreco(2000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe seu CPF: ");
        String cpf = scanner.nextLine();

        cliente.setInfo(nome,cpf);
        cliente.getInfo();

        System.out.println("--------------------");
        pcApple.mostraPCConfigs();
        pcSamsung.mostraPCConfigs();
        pcDell.mostraPCConfigs();
        System.out.println("--------------------");

        promo = 1;
        while(promo != 0){
            System.out.println("Qual promoção deseja: ");
            promo = scanner.nextInt();
            switch (promo){
                case 1:
                    cliente.calculaTotalCompra(pcApple.getPreco());
                    ProcessarPedido.helper(1);
                    break;
                case 2:
                    cliente.calculaTotalCompra((pcSamsung.getPreco()+1234));
                    ProcessarPedido.helper(2);
                    break;
                case 3:
                    cliente.calculaTotalCompra((pcDell.getPreco()+5678));
                    ProcessarPedido.helper(3);
                    break;
                default:
                    break;
            }
        }

        ProcessarPedido.getCarrinho();
        cliente.getTotal();

    }
}