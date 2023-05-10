package PooAnimalPolimorfismo;

public class Main {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        //m.setPeso(35.3f);
        //m.setCorPelo("Marrom");
        //m.alimentar();
        m.locomover();
        //m.emitirSom();

        a.locomover();

        p.locomover();

        r.locomover();

        System.out.println("-------------------------------");

        Cachorro cachorro = new Cachorro();
        Canguru canguru = new Canguru();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        Goldfish goldfish = new Goldfish();
        Arara arara = new Arara();

        cachorro.locomover();
        canguru.locomover();
        cobra.locomover();
        tartaruga.locomover();
        goldfish.locomover();
        arara.locomover();
    }
}