package UFC_Relacionamento_entre_Classes;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        setCategoria();
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("Lutador: "+this.nome);
        System.out.println("Nacionalidade: "+this.nacionalidade);
        System.out.println("Idade: "+this.idade);
        System.out.println("Altura: "+this.altura+" m");
        System.out.println("Peso: "+this.peso+" kg");
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Vitorias: "+this.vitorias);
        System.out.println("Derrotas: "+this.derrotas);
        System.out.println("Empates: "+this.empates);
    }

    public void status(){
        System.out.println("Lutador: "+this.nome);
        System.out.println("Peso: "+this.peso+" kg");
        System.out.println("Vitorias: "+this.vitorias);
        System.out.println("Derrotas: "+this.derrotas);
        System.out.println("Empates: "+this.empates);
    }

    public void ganharLuta(){
        this.vitorias++;
    }

    public void perderLuta(){
        this.derrotas++;
    }

    public void empatarLuta(){
        this.empates++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Invalido";
        } else if (this.peso <= 78.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        }else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
