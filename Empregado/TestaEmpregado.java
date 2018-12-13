/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 07/12/2018
Objetivo sucinto do programa: Cria a classe TestaEmpregado que manipula objetos Empregado utilizando seus métodos
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
public class TestaEmpregado {

    public static void main(String[] args){
        Empregado empregado1 = new Empregado(1, "Elian", "Melo", 450);
        Empregado empregado2 = new Empregado(2, "Ilton", "Batista", 1000);
        Empregado empregado3 = new Empregado(3, "Fábio", "Amaro", 50000);

        System.out.println("ID do empregado3: " + empregado3.getId());
        System.out.println("primeiro nome do empregado1: " + empregado1.getPrimeiroNome());
        System.out.println("segundo nome do empregado3: " + empregado3.getSegundoNome());
        System.out.println("nome completo do empregado2: " + empregado2.getNomeCompleto());
        System.out.println("salario do empregado1: " + empregado1.getSalario());
        System.out.println("salario anual do empregado1: " + empregado1.getSalarioAnual());

        empregado1.setAumentoSalario(10);
        System.out.println("salario do empregado1 aumentado em 10%: " + empregado1.getSalario());

        empregado1.setSalario(1000);
        System.out.println("salario do empregado1 atualizado: " + empregado1.getSalario());

        System.out.println("informacoes do empregado1: " + empregado1.toString());
        System.out.println("informacoes do empregado2: " + empregado2.toString());
        System.out.println("informacoes do empregado3: " + empregado3.toString());

    }
}
