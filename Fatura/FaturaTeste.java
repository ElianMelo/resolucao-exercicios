/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 07/12/2018
Objetivo sucinto do programa: Cria a classe TestaFatura que manipula objetos Fatura utilizando seus métodos
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
public class FaturaTeste {

    public static void main(String[] args){
        Fatura fatura1 = new Fatura();
        Fatura fatura2 = new Fatura(2, "Arroz", 2, 10.5);
        Fatura fatura3 = new Fatura(3, "Feijao", 5, 5.5);

        fatura1.setQuantidade(10);
        fatura1.setPrecoUnidade(3.14);

        System.out.println("ID da fatura1: " + fatura1.getId());
        System.out.println("descricao da fatura3: " + fatura3.getDescricao());
        System.out.println("preco total da fatura2: " + fatura2.getPrecoTotal());
        System.out.println("quantidade da fatura2: " + fatura2.getQuantidade());
        System.out.println("preco da unidade da fatura3: " + fatura3.getPrecoUnidade());

        System.out.println();

        fatura2.setQuantidade(1);
        System.out.println("quantidade da fatura2 atualizada: " + fatura2.getQuantidade());
        fatura3.setPrecoUnidade(5);
        System.out.println("preco da fatura3 atualizada: " + fatura3.getPrecoUnidade());

        System.out.println();

        System.out.println("fatura1: " + fatura1.toString());
        System.out.println("fatura2: " + fatura2.toString());
        System.out.println("fatura3: " + fatura3.toString());
    }

}
