package PooBanco;

import java.util.Scanner;

public class Banco {
    private int numConta;
    private String tipo; // cc = Conta Corrente / cp = Conta Poupança
    private String dono;
    private float saldo;
    private boolean status;

    public Banco() {
        this.status = false;
        this.saldo = 0;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == "cc" || tipo == "cp"){
            this.tipo = tipo;
        }
        else {
            System.out.println("Tipo incorreto...");
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){ // Mudar status para "true" / Dizer o tipo da Conta -> se for cc = 50 se for cp = 150
        this.status = true;
        System.out.println("Tipo da conta: " + this.tipo);
        System.out.println("Saldo antigo: " + this.saldo);
        if (this.tipo == "cc"){
            this.saldo += 50;
        } else if (this.tipo == "cp") {
            this.saldo += 150;
        }
        System.out.println("Saldo novo: " + this.saldo);
    }

    public void fecharConta(){ // Não pode ter dinehiro e tem que pagar tudo
        if (this.saldo == 0){
            this.status = false;
            System.out.println("Conta Fechada");
        }
        else {
            if (this.saldo > 0){
                System.out.println("Deixe sua conta vazia primeiro");
            }
            else {
                System.out.println("Quite as dividas primeiro");
            }
        }
    }

    public void depositar(float valor){ // Status "true"
        if (this.status){
            this.saldo += valor;    
        }
        else {
            System.out.println("Abra a conta primeiro");
        }
    }

    public void sacar(float valor){ // Status "true" tem q ter saldo
        if (this.status && this.saldo > valor){
            this.saldo -= valor;
        }
        else {
            System.out.println("Conta fechado ou saldo inferior ao pedido");
        }
    }

    public void pagarMensalidade(){ // cc = 12 / cp = 20
        if (this.tipo == "cc"){
            saldo -= 12;
        } else if (this.tipo == "cp") {
            saldo -= 20;
        }
    }

    public void imprimir(){
        System.out.println("Num. Conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
    }
}
