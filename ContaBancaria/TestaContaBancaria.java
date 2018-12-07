/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 07/12/2018
Objetivo sucinto do programa: Cria a classe TestaContaBancaria que manipula contas bancarias entre si por transferencia além dos métodos credito e débito
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
public class TestaContaBancaria {

    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria(1, "Elian", 500);
        ContaBancaria conta2 = new ContaBancaria(2, "Robson", 50000);
        ContaBancaria conta3 = new ContaBancaria(3, "Juria", 10);

        System.out.println("ID da conta1: " + conta1.getId());
        System.out.println("saldo da conta2: " + conta2.getSaldo());
        System.out.println("nome da titular da conta3: " + conta3.getNomeTitular());

        System.out.println();

        System.out.println("credito de 1000 na conta1: " + conta1.realizarCredito(1000));
        System.out.println("debito de 45000 na conta2: " + conta2.realizarDebito(45000));
        System.out.println("Transferencia da conta1 para conta3: " + conta1.realizarTransferencia(conta3, 500));

        System.out.println("conta1: " + conta1.toString());
        System.out.println("conta2: " + conta2.toString());
        System.out.println("conta3: " + conta3.toString());

    }
}
