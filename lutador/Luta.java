/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 10/01/2019
Objetivo sucinto do programa: Cria a classe Luta conforme a aula 8a do Curso em Vídeo de orientação a objetos
Referência ao enunciado/origem do exercício: Aulas 7 e 8 https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY
*/
import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Construtores
    Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada){
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

    // Getters e Setters
    public Lutador getDesafiado(){
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }

    public int getRounds(){
        return rounds;
    }

    public void setRounds(int rounds){
        this.rounds = rounds;
    }

    public boolean getAprovada(){
        return aprovada;
    }

    public void setAprovada(){
        this.aprovada = aprovada;
    }

    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(aprovada == true){
            desafiado.apresentar();
            desafiante.apresentar();
            Random randomizador = new Random();
            int vencedor = randomizador.nextInt(2) + 0;
            switch(vencedor){
                // Empate
                case 0:
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                // Ganhou desafiado
                case 1:
                    System.out.println(desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                // Ganhou desafiante
                case 2:
                    System.out.println(desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }

}
