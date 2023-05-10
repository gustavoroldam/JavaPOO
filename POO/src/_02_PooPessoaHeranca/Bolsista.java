package _02_PooPessoaHeranca;

public final class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("BOLSA RENOVADA: "+this.getNome());
    }

    public void pagarMensalidade(){
        System.out.println("MENSALIDADE DO BOLSISTA PAGA");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}