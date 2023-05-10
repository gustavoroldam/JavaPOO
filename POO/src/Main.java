import java.util.Random;

public class Main {
    public static void main(String[] args){
        long tempoInicial = System.currentTimeMillis();
        int t = 10000;
        int v[] = new int[t];

        for(int i=0; i<t; i++){
           Random aleatorio = new Random();
           v[i] = aleatorio.nextInt(200);
        }

        int aux = v[0];
        for(int i=0; i<t; i++){
            for(int j=0; j<t-1; j++){
                if(v[j] > v[j+1]){
                    aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println((i+1)+" - "+v[i]);
        }
        long tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo total de execução: " + (tempoFinal - tempoInicial) + " ms");
    }
}