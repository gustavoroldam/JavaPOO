package ExercicioPratico;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private float totalPag;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, float totalPag, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public void detalhe(){
        System.out.println("---------DETALHES---------");
        System.out.println("TITULO: "+this.titulo);
        System.out.println("AUTOR: "+this.autor);
        System.out.println("TOTAL DE PÁG.(s) LIDAS: "+this.totalPag);
        if (this.aberto){
            System.out.println("LIVRO ABERTO");
        }
        else {
            System.out.println("LIVRO FECHADO");
        }
        System.out.println("LEITOR: "+this.leitor.getNome());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(float totalPag) {
        this.totalPag = totalPag;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (this.aberto){
            System.out.println("----------ERRO----------");
            System.out.println("Livro já está aberto");
            System.out.println("------------------------");
        }
        else {
            System.out.println("---------SUCESSO---------");
            System.out.println("Livro aberto");
            System.out.println("-------------------------");
            this.aberto = true;
        }
    }

    @Override
    public void fechar() {
        if (this.aberto){
            System.out.println("---------SUCESSO---------");
            System.out.println("Livro Fechado");
            System.out.println("-------------------------");
        }
        else {
            System.out.println("---------ERRO---------");
            System.out.println("Livro já está fechado");
            System.out.println("----------------------");
        }
    }

    @Override
    public void folhear() {
        for (int i=0; i<5; i++){
            System.out.println("------------------");
        }
    }

    @Override
    public void avancarPag() {
        this.totalPag ++;
        System.out.println("---------SUCESSO---------");
        System.out.println("1 Pag. avançada: "+this.totalPag);
        System.out.println("-------------------------");
    }

    @Override
    public void voltarPag() {
        this.totalPag --;
        System.out.println("---------SUCESSO---------");
        System.out.println("1 Pag. voltada: "+this.totalPag);
        System.out.println("-------------------------");
    }
}
