package _02_PooPessoaHeranca;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("MENSALIDADE PAGA");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}