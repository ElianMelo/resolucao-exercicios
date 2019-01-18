/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 18/01/2019
Objetivo sucinto do programa: Demonstrar a composição entre as classes Estojo e Lapis
Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016)  páginas 261 ate 262
*/
public class EstojoTeste {

    public static void main(String[] args) {
        Lapis[] lapis = new Lapis[5];
        lapis[0] = new Lapis("Faber Castel", "verde", 12);
        lapis[1] = new Lapis("Faber Castel", "vermelho", 5);
        lapis[2] = new Lapis("Faber Castel", "azul", 15);
        lapis[3] = new Lapis("Faber Castel", "roxo", 7);
        lapis[4] = new Lapis("Faber Castel", "rosa", 10);

        Estojo estojo = new Estojo("Dermiwil", "marrom", 25, lapis);

        System.out.print(estojo.toString());
    }

}
