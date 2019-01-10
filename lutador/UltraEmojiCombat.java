/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 09/01/2019
Objetivo sucinto do programa: Cria a classe UltraEmojiCombat conforme as aulas 7a, 7b, 8a, 8b do Curso em Vídeo de orientação a objetos para testar as classes Lutador e Luta
Referência ao enunciado/origem do exercício: Aulas 7 e 8 https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY
*/
public class UltraEmojiCombat {

    public static void main(String[] args){
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);

        l[0].apresentar();
        System.out.println();

        l[2].status();
        System.out.println();

        System.out.println("Categoria do lutador 4: " + l[3].getCategoria());
        System.out.println();

        l[1].ganharLuta();
        l[1].status();
        System.out.println();

        l[0].empatarLuta();
        l[0].status();
        System.out.println();
    }
}
