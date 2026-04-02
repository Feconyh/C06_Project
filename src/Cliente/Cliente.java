package Cliente;
import java.util.Scanner;
import Utils.ProcessarPedido;


public class Cliente {
    private String nome;
    private String cpf;
    private float total;

    public void setInfo(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void getInfo(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }
    public void calculaTotalCompra(float valor){
        total += valor;
    }

    public void getTotal() {
        System.out.println(total);
    }
}
