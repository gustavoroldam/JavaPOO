package PooCaneta_02;

public class Main {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; //Erro por causa de ser private
        c1.carga = 10;
        c1.tampada = true;
        c1.status();
    }
}