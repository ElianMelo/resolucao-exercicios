/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 06/12/2018
Objetivo sucinto do programa: Cria a classe Circulo utilizando encapsulamento e métodos referentes a um círculo
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
public class Circulo {
    private double raio = 1.0;
    private String cor = "vermelho";

    public Circulo(){}

    public Circulo(double raio){
        this.raio = raio;
    }

    public Circulo(double raio, String cor){
        this(raio);
        this.cor = cor;
    }

    public double getRaio(){
        return raio;
    }

    public String getCor(){
        return cor;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String toString(){
        return "Circulo[raio=" + raio + " cor=" + cor + "]";
    }

    public double getArea(){
        return (Math.PI * Math.pow(raio, 2));
    }

    public double getCircunferencia(){
        return (2 * Math.PI * raio);
    }

}
