/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 18/01/2019
Objetivo sucinto do programa: Criar um estojo que é composto por um array de Lapis
Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016)  páginas 261 ate 262
*/
public class Estojo {
    private String marca;
    private String cor;
    private double tamanho;
    private Lapis[] lapis;

    Estojo(String marca, String cor, double tamanho, Lapis[] lapis) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.lapis = lapis;
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

    public Lapis[] getLapis() {
        return this.lapis;
    }

    public void setLapis() {
        this.lapis = lapis;
    }

    public String toString() {
        String texto = "Estojo[marca=" + this.marca + ", cor=" + this.cor + ", tamanho=" + this.tamanho + "]\n";
        for(int i = 0; i < lapis.length; i++) {
            texto += lapis[i].toString() + "\n";
        }
        return texto;
    }

}
