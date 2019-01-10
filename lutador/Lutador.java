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
    Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
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
        this.setCategoria();
    }

    public String getCategoria(){
        return categoria;
    }

    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
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
        System.out.println("--------------------------------------------" + "\n"
        + "CHEGOU A HORA! Apresentamos o lutador " + this.getNome() + "\n"
        + "Diretamente de " + this.getNacionalidade() + "\n"
        + "Com " + this.getIdade() + " anos e " + this.getAltura() + "m" + "\n"
        + "Pesando " + this.getPeso() + "Kg" + "\n"
        + this.getVitorias() + " vitórias" + "\n"
        + this.getDerrotas() + " derrotas e" + "\n"
        + this.getEmpates() + " empates!"
        );
    }

    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria() + "\n"
        + "Ganhou " + this.getVitorias() + " vezes" + "\n"
        + "Perdeu " + this.getDerrotas() + " vezes" + "\n"
        + "Empatou " + this.getEmpates() + " vezes"
        );
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
