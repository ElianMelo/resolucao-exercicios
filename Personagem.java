/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 05/12/2018
Objetivo sucinto do programa: Programa para demonstração do uso do THIS (Programação Orientada a Objetos)
Referência ao enunciado/origem do exercício: Exercício prático com THIS
https://docs.google.com/forms/d/e/1FAIpQLSckb5FSZXqMVsgf3gF831PDLcp0iZySindzJ1P4hkZq7wg0og/viewform
Informações adicionais: https://goo.gl/FjGdN9
*/
public class Personagem {
    int vida = 2;
    int forca = 1;

    Personagem(int vida){
      this.vida = vida;
    }

    Personagem(int vida, int forca){
      this(vida);
      this.forca = forca;
    }

    void pocaoVida(int vida){
      this.vida += vida;
    }

    public static void main(String[] args) {
      Personagem cleiton = new Personagem(5, 5);
      cleiton.pocaoVida(10);
      cleiton.pocaoVida(30);
    }
}
