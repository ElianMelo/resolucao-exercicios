/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 15/01/2019
Objetivo sucinto do programa: Implementa a classe Arqueiro na classe ArqueiroMedieval
Referência ao enunciado/origem do exercício: https://docs.oracle.com/javase/tutorial/java/concepts/QandE/questions.html
*/
class ArqueiroMedieval implements Arqueiro {
    private int vida;
    private int itens;
    private int flechas;

    public void curar(int vida){
        this.vida += vida;
    }

    public void atirarFlechas(int flechas){
        this.flechas -= flechas;
    }

    public void pegarFlechas(int flechas){
        this.flechas += flechas;
    }

    public void pegarItem(){
        this.itens++;
    }

    public void lagarItem(){
        this.itens--;
    }

}
