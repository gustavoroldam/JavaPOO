package _02_PooPessoaHeranca;

public class Main {
    public static void main(String[] args){
        //Pessoa p1 = new Pessoa();
        Visitante p2 = new Visitante();
        p2.setNome("Fabio");
        System.out.println(p2.toString());

        Aluno p3 = new Aluno();
        p3.setNome("Gustavo");
        p3.setCurso("ADS");
        System.out.println(p3.toString());
        p3.pagarMensalidade();

        Bolsista p4 = new Bolsista();
        p4.setNome("Leandro");
        p4.setBolsa(50);
        System.out.println(p4.toString());
        p4.pagarMensalidade();
    }
}