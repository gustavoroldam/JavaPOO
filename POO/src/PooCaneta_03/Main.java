package PooCaneta_03;

public class Main {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.status();
        c1.setModeloCaneta("BIC");
        c1.setPontaCaneta(0.5f);

        System.out.println("GETS\nModelo: " + c1.getModeloCaneta() + " Ponta: " + c1.getPontaCaneta());

        Caneta c2 = new Caneta("NIC", 0.8f);
        c2.status();
    }
}
