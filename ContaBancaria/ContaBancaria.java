/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 07/12/2018
Objetivo sucinto do programa: Cria a classe ContaBancaria que simula uma conta bancaria com os métodos de credito, debito e transferencia
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
public class ContaBancaria {
    private int id;
    private String nomeTitular;
    private double saldo = 0.0;

    ContaBancaria(){}

    ContaBancaria(int id, String nomeTitular, double saldo){
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getId(){
        return id;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public double getSaldo(){
        return saldo;
    }

    public String realizarCredito(double valor){
        saldo += valor;
        return "Saldo total da conta: " + saldo;
    }

    public String realizarDebito(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return "Saldo total da conta: " + saldo;
        }else{
            return "O saldo disponível é insuficiente";
        }

    }

    public String realizarTransferencia(ContaBancaria contaDestino, double valor){
        if(saldo >= valor){
            saldo -= valor;
            contaDestino.saldo += valor;
            return "\n-------------------------------------\nTransferência realizada com sucesso\nValor transferido: " + valor + "\nTitular da conta destino: " + contaDestino.getNomeTitular() + "\nSaldo total da sua conta: " + saldo + "\n-----------------------------------";
        }else{
            return "O saldo disponível é insuficiente";
        }
    }

    public String toString(){
        return("ContaBancaria[id=" + id + " nomeTitular=" + nomeTitular + " saldo=" + saldo + "]");
    }
}
