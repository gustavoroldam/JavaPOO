package PooPessoaHeranca;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void aumento(float aumento){
        this.salario += aumento;
        System.out.println("---------AUMENTO-FEITO---------------");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
