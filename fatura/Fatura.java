/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 07/12/2018
Objetivo sucinto do programa: Cria a classe Fatura que simula uma fatura e suas características como descricao, preco, quantidade, etc
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
public class Fatura {
    private int id;
    private String descricao;
    private int quantidade;
    private double precoUnidade;

    Fatura(){}

    Fatura(int id, String descricao, int quantidade, double precoUnidade){
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnidade = precoUnidade;
    }

    public int getId(){
        return id;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getPrecoUnidade(){
        return precoUnidade;
    }

    public void setPrecoUnidade(double precoUnidade){
        this.precoUnidade = precoUnidade;
    }

    public double getPrecoTotal(){
        return (precoUnidade * quantidade);
    }

    public String toString(){
        return "Fatura[id=" + id + " descricao=" + descricao + " quantidade=" + quantidade + " precoUnidade=" + precoUnidade + "]";
    }
}
