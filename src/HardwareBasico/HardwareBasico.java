package HardwareBasico;

public class HardwareBasico {
    private String nome;
    private float capacidadeRAM;
    private float capacidadeHD;


    public HardwareBasico(String nome, float capacidadeRAM, float capacidadeHD){
        this.nome = nome;
        this.capacidadeRAM = capacidadeRAM;
        this.capacidadeHD = capacidadeHD;

    }

    public void getInfo(){
        System.out.println(this.nome);
        System.out.println(this.capacidadeRAM + "Gb de RAM");
        System.out.println(this.capacidadeHD + "Gb de HD");

    }

}
