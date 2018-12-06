/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 06/12/2018
Objetivo sucinto do programa: Cria e Manipula um círculo com seus respectivos métodos: setRaio, setCor, getCor, getRaio, getArea e toString
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
public class TestaCirculo {

    public static void main(String[] args){
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(2);
        Circulo circulo3 = new Circulo(5, "azul");

        circulo1.setRaio(10);
        circulo1.setCor("vermelho");

        circulo2.setCor("amarelo");

        System.out.println("circunferencia do circulo1: " + circulo1.getCircunferencia());
        System.out.println("circunferencia do circulo2: " + circulo2.getCircunferencia());
        System.out.println("circunferencia do circulo3: " + circulo3.getCircunferencia());

        System.out.println();

        System.out.println("area do circulo1: " + circulo1.getArea());
        System.out.println("area do circulo2: " + circulo2.getArea());
        System.out.println("area do circulo3: " + circulo3.getArea());

        System.out.println();

        System.out.println("cor do circulo1: " + circulo1.getCor());
        System.out.println("raio do circulo2: " + circulo2.getRaio());
        System.out.println("cor do circulo3: " + circulo3.getCor());

        System.out.println();

        System.out.println("informacoes do circulo1: " + circulo1.toString());
        System.out.println("informacoes do circulo2: " + circulo2.toString());
        System.out.println("informacoes do circulo3: " + circulo3.toString());
    }

}
