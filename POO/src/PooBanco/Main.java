package PooBanco;

public class Main {
    public static void main(String[] args){
        Banco b1 = new Banco();

        System.out.println("Primeira Conta:");

        b1.imprimir();
        b1.setNumConta(1);
        b1.setTipo("cc");
        b1.setDono("Gustavo");
        System.out.println("\n\n");
        b1.abrirConta();
        b1.imprimir();
        System.out.println("\n\n");
        b1.depositar(1000);
        b1.sacar(1500);
        b1.sacar(1000);
        b1.pagarMensalidade();
        b1.imprimir();
        b1.fecharConta();
        System.out.println("\n\n");
        b1.pagarMensalidade();
        b1.pagarMensalidade();
        b1.pagarMensalidade();
        b1.pagarMensalidade();
        b1.imprimir();
        b1.fecharConta();
        System.out.println("\n\n");
        b1.depositar(10);
        b1.fecharConta();
        b1.sacar(1000);
        b1.depositar(1000);

        Banco b2 = new Banco();

        System.out.println("\n\nSegunda Conta:");
        b2.imprimir();
        b2.setNumConta(1);
        b2.setTipo("cp");
        b2.setDono("Guilherme");
        System.out.println("\n\n");
        b2.abrirConta();
        b2.imprimir();
        System.out.println("\n\n");
        b2.depositar(1000);
        b2.sacar(1500);
        b2.sacar(1000);
        b2.pagarMensalidade();
        b2.imprimir();
        b2.fecharConta();
        System.out.println("\n\n");
        b2.pagarMensalidade();
        b2.pagarMensalidade();
        b2.pagarMensalidade();
        b2.pagarMensalidade();
        b2.imprimir();
        b2.fecharConta();
        System.out.println("\n\n");
        b2.sacar(50);
        b2.fecharConta();
        b2.sacar(1000);
        b2.depositar(1000);
    }
}
