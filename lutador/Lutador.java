/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 09/01/2019
Objetivo sucinto do programa: Cria a classe Lutador conforme a aula 7a do Curso em Vídeo de orientação a objetos
Referência ao enunciado/origem do exercício: Aulas 7 e 8 https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY
*/
public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Construtores
    Lutador(){}

    Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(){
        if(peso < 52.2){
            categoria = "Inválido";
        }else if(peso <= 70.3){
            categoria = "Leve";
        }else if(peso <= 83.9){
            categoria = "Médio";
        }else if(peso <= 120.2){
            categoria = "Pesado";
        }else{
            categoria = "Inválido";
        }
    }

    public int getVitorias(){
        return vitorias;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getDerrotas(){
        return derrotas;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getEmpates(){
        return empates;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }

    // Métodos
    public void apresentar(){
        System.out.println("Lutador: " + getNome() + "\n"
        + "Origem: " + getNacionalidade() + "\n"
        + getIdade() + " anos" + "\n"
        + getAltura() + " m de altura" + "\n"
        + "Pesando " + getPeso() + "Kg" + "\n"
        + "Ganhou: " + getVitorias() + "\n"
        + "Perdeu: " + getDerrotas() + "\n"
        + "Empatou: " + getEmpates()
        );
    }

    public void status(){
        System.out.println(getNome() + "\n"
        + "é um peso " + getCategoria() + "\n"
        + getVitorias() + " vitórias" + "\n"
        + getDerrotas() + " derrotas" + "\n"
        + getEmpates() + " empates"
        );
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
}
