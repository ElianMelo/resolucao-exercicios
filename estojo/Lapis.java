/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 18/01/2019
Objetivo sucinto do programa: Criar um Lapis com as caracterísicas marca, cor e tamanho
Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016)  páginas 261 ate 262
*/
public class Lapis {
    private String marca;
    private String cor;
    private double tamanho;

    Lapis(String marca, String cor, double tamanho) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String toString() {
        return "Lapis[marca=" + this.marca + ", cor=" + this.cor + ", tamanho=" + this.tamanho + "]";
    }

}
