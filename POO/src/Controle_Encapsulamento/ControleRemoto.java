package Controle_Encapsulamento;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //Fazer a ligação

    @Override // Significa Sobrescrever
    public void ligar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public void abrirMenu() {
        System.out.println("--------MENU--------");
        System.out.println("Está Ligado? " + this.ligado);
        System.out.println("Está tocando? " + this.tocando);
        System.out.print("Volume" + this.volume + ": ");
        for (int i=0; i <= this.volume; i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if (this.ligado){
            this.volume += 5;
        }
    }

    @Override
    public void menosVolume() {
        if (this.ligado){
            this.volume -= 5;
        }
    }

    @Override
    public void ligarMudo() {
        if (this.ligado && this.volume > 0){
            this.volume = 0;
        }
    }

    @Override
    public void desligarMudo() {
        if (this.ligado && this.volume == 0){
            this.volume = 50;
        }
    }

    @Override
    public void play() {
        if (this.ligado && !this.tocando){
            this.tocando = true;
        }
    }

    @Override
    public void pause() {
        if (this.ligado && this.tocando){
            this.tocando = false;
        }
    }

}
