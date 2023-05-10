package ExercicioPratico;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        Pessoa p = new Pessoa("Gustavo",18,"M");
        Livro l = new Livro("Diario de um Banana", "AUTOR X", 0.0f, true, p);
        for (boolean sair = true; true;){
            System.out.println("---------MENU---------");
            System.out.println("1- Ver Pessoa");
            System.out.println("2- Fazer Aniversário");
            System.out.println("3- Ver Livro");
            System.out.println("4- Abrir Livro");
            System.out.println("5- Fechar Livro");
            System.out.println("6- Folhear");
            System.out.println("7- Avançar 1 Pag.");
            System.out.println("8- Voltar 1 Pag.");
            System.out.print("Escolha uma opção: ");
            int op = teclado.nextInt();
            switch (op){
                case 1:{
                    System.out.println("---------LEITOR---------");
                    System.out.println("NOME: "+p.getNome());
                    System.out.println("IDADE: "+p.getIdade());
                    System.out.println("SEXO: "+p.getSexo());
                    System.out.println("------------------------");
                    teclado.next();
                    for (int i=0; i<1000; i++){
                        System.out.println("\n");
                    }
                    break;
                }
                case 2:{
                    p.fazerAniversario();
                    teclado.next();
                    for (int i=0; i<1000; i++){
                        System.out.println("\n");
                    }
                    break;
                }
                case 3:{
                    l.detalhe();
                    teclado.next();
                    for (int i=0; i<1000; i++){
                        System.out.println("\n");
                    }
                    break;
                }
                case 4:{
                    l.abrir();
                    teclado.next();
                    for (int i=0; i<1000; i++){
                        System.out.println("\n");
                    }
                    break;
                }
                case 5:{
                    l.fechar();
                    teclado.next();
                    for (int i=0; i<1000; i++){
                        System.out.println("\n");
                    }
                    break;
                }
                case 6:{
                    l.folhear();
                    teclado.next();
                    for (int i=0; i<1000; i++){
                        System.out.println("\n");
                    }
                    break;
                }
                case 7:{
                    l.avancarPag();
                    teclado.next();
                    for (int i=0; i<1000; i++){
                        System.out.println("\n");
                    }
                    break;
                }
                case 8:{
                    l.voltarPag();
                    teclado.next();
                    for (int i=0; i<1000; i++){
                        System.out.println("\n");
                    }
                    break;
                }
                default:{
                    System.out.println("---------ERRO---------");
                    System.out.println("Opção não encontrada");
                    System.out.println("----------------------");
                    teclado.next();
                    for (int i=0; i<1000; i++){
                        System.out.println("\n");
                    }
                }
            }
        }
    }
}
