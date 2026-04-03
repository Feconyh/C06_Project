package Computador;

import HardwareBasico.HardwareBasico;
import MemoriaUSB.MemoriaUSB;
import SistemaOperacional.SistemaOperacional;

import java.sql.ShardingKey;

public class Computador {
    private String marca;
    private static float preco;

    MemoriaUSB musb16GB;
    MemoriaUSB musb32GB;
    MemoriaUSB musb1Tb;

    SistemaOperacional soMac;
    SistemaOperacional soWin8;
    SistemaOperacional soWin10;

    HardwareBasico hbi3;
    HardwareBasico hbi5;
    HardwareBasico hbi7;


    public Computador(String marca){
        this.marca = marca;

        hbi3 = new HardwareBasico("Pentium Core i3 (2200 Mhz)",8,500);
        hbi5 = new HardwareBasico("Pentium Core i5 (3370 Mhz)",16,1000);
        hbi7 = new HardwareBasico("Pentium Core i7 (4500 Mhz)",32,2000);

        soMac = new SistemaOperacional("macOS Sequoia", 64);
        soWin8 = new SistemaOperacional("Windows 8", 64);
        soWin10 = new SistemaOperacional("Windows 10", 64);

        musb16GB = new MemoriaUSB("Pen-drive",16);
        musb32GB = new MemoriaUSB("Pen-drive", 32);
        musb1Tb = new MemoriaUSB("HD Externo", 1000);
    }

    public void setPreco(float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return preco;
    }

    public void mostraPCConfigs(){
        switch (this.marca){
            case "Apple":
                System.out.println(this.marca);
                System.out.println("R$ " + this.preco);
                hbi3.getInfo();
                soMac.getInfo();
                musb16GB.getInfo();
                System.out.println();
                break;
            case "Samsung":
                System.out.println(this.marca);
                System.out.println(("R$ " + this.preco+1234));
                hbi5.getInfo();
                soWin8.getInfo();
                musb32GB.getInfo();
                System.out.println();
                break;
            case "Dell":
                System.out.println(this.marca);
                System.out.println(("R$ " + this.preco+5678));
                hbi7.getInfo();
                soWin10.getInfo();
                musb1Tb.getInfo();
                System.out.println();
                break;

        }
    }

    public void addMemoriaUSB(){
        System.out.println("addMemoriaUSB");
    }
}
