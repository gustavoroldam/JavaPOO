package PooAnimalSobrecarga;

public class Main {
    public static void main(String[] args){
        Cachorro c = new Cachorro();
        c.reagir("Olá");
        c.reagir("Não");
        System.out.println("------------");
        c.reagir(11,45);
        c.reagir(19, 0);
        c.reagir(22,22);
        System.out.println("------------");
        c.reagir(true);
        c.reagir(false);
        System.out.println("------------");
        c.reagir(2,12.5f);
        c.reagir(17,4.5f);
    }
}