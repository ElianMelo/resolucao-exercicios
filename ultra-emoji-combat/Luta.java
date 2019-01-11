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
    Luta(){}

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
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
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
        if(this.aprovada == true){
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("===== RESULTADO DA LUTA =====");
            switch(vencedor){
                // Empate
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                // Desafiado Vence
                case 1:
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                // Desafiante Vence
                case 2:
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=============================");
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }

}
