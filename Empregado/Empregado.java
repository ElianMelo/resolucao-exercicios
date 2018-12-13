/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 07/12/2018
Objetivo sucinto do programa: Cria a classe Empregado que simula um registro de empregados
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
public class Empregado {
    private int id;
    private String primeiroNome;
    private String segundoNome;
    private int salario;

    Empregado(int id, String primeiroNome, String segundoNome, int salario){
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.salario = salario;
    }

    public int getId(){
        return id;
    }

    public String getPrimeiroNome(){
        return primeiroNome;
    }

    public String getSegundoNome(){
        return segundoNome;
    }

    public String getNomeCompleto(){
        return (primeiroNome + " " + segundoNome);
    }

    public int getSalario(){
        return salario;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    public int getSalarioAnual(){
        return (salario * 12);
    }

    public void setAumentoSalario(int porcentagem){
        this.salario = salario + salario * porcentagem / 100;
    }

    public String toString(){
        return("Empregado[id=" + id + " primeiroNome=" + primeiroNome + " segundoNome=" + segundoNome + " salario=" + salario + "]");
    }
}
