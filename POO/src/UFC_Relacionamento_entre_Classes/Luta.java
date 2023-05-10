package UFC_Relacionamento_entre_Classes;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiador;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador desafiador, Lutador desafiante){
        if (!Objects.equals(desafiador.getNome(), desafiante.getNome()) && Objects.equals(desafiante.getCategoria(), desafiador.getCategoria())){
            this.aprovada = true;
            this.desafiador = desafiador;
            this.desafiante = desafiante;
            System.out.println("LUTA MARCADA COM SUCESSO!");
        }
        else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiador = null;
            System.out.println("A LUTA NÃO PODE SER MARCADA");
        }
    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("#### DESAFIADO ####");
            this.desafiador.apresentar();
            System.out.println("#### DESAFIANTE ####");
            this.desafiante.apresentar();
            System.out.println("#### RESULTADO ####");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("Empatou");
                    this.desafiante.empatarLuta();
                    this.desafiador.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do "+this.desafiador.getNome());
                    this.desafiante.perderLuta();
                    this.desafiador.ganharLuta();
                    break;
                case 2:
                    System.out.println("Vitória do "+this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiador.perderLuta();
                    break;
            }
        }
        else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public Lutador getDesafiador() {
        return desafiador;
    }

    public void setDesafiador(Lutador desafiador) {
        this.desafiador = desafiador;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
