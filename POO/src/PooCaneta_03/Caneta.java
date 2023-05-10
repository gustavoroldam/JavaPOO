package PooCaneta_03;

public class Caneta {
    private String modelo;
    private float ponta;

    // Atalho para os criar rápido "alt+insert"

    public Caneta(){
        this.modelo = "";
        this.ponta = 0.0f;
    }

    public Caneta(String modelo, float ponta){
        this.modelo = modelo;
        this.ponta = ponta;
    }

    public String getModeloCaneta(){
        return this.modelo;
    }
    public float getPontaCaneta(){
        return this.ponta;
    }

    public void setModeloCaneta(String modelo){
        this.modelo = modelo;
    }
    public void setPontaCaneta(float ponta){
        this.ponta = ponta;
    }

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
    }
}
