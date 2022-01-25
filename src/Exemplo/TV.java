package Exemplo;

public class TV {

    int canal;
    int volume;
    boolean ligada;
    int tamanho;

    public TV() {
        this.canal = 21;
        this.ligada = false;
        this.tamanho = 0;
        this.volume = 0;
    }
    //método da classe

    public void ligar(boolean ligada) {
        this.ligada = ligada;
    }
    //função  

    public static void estahLigada(TV objeto) {
        if (objeto.ligada) {
            System.out.println("está ligada");
        } else {
            System.out.println("não está ligada");
        }
    }

    public static void main(String args []) {
        TV televisao1 = new TV();
        TV televisao2 = new TV();
        //chamando o método ligar
        televisao1.ligar(true);
        televisao2.ligar(false);
        System.out.println("A televisão 1 ");
        //chamando a função estahLigada
        estahLigada(televisao1);
        System.out.println("A televisão 2 ");
        estahLigada(televisao2);
    }
}
