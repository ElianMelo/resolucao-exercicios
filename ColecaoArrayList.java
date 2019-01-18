/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 18/01/2019
Objetivo sucinto do programa: Demonstra o funcionamento de um ArrayList
Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016)  páginas 225 ate 227
*/
import java.util.ArrayList;

public class ColecaoArrayList {

    public static void tela(ArrayList<String> cores, String cabecalho) {
        // Exibe o cabeçalho
        System.out.printf(cabecalho);

        // Exibe todos os elementos em uma linha
        for(String cor : cores) {
            System.out.printf(" %s", cor);
        }

        // Salta uma linha
        System.out.println();
    }

    public static void main(String[] args) {
        // Cria um novo ArrayList de strings com uma capacidade inicial de 10 (padrão)
        ArrayList<String> cores = new ArrayList<String>();

        // Adiciona vermelho a lista
        cores.add("vermelho");
        // Adiciona amarelo no índice 0
        cores.add(0, "amarelo");

        // Cabeçalho
        System.out.println("Demonstra os itens da lista através de um loop for");

        // Exibe as cores da lista
        for(int i = 0; i < cores.size(); i++) {
            System.out.printf(" %s", cores.get(i));
        }

        // Exibe as cores através de um for aprimorado
        tela(cores, "%nExibe o contéudo da lista com instruções:");

        // Adiciona mais itens a lista
        cores.add("verde");
        cores.add("amarelo");
        tela(cores, "Lista mais dois novos elementos:");

        // Remove a primeira instância de amarelo
        cores.remove("amarelo");
        tela(cores, "Remove a primeira ocorrencia da cor amarela:");

        // Remove a cor que está no índice 1
        cores.remove(1);
        tela(cores, "Remove o segundo item da lista (verde):");

        // verifica se um valor está na List
        System.out.printf("\"vermelho\" %sestá na lista %n", cores.contains("vermelho") ? "": "não ");

        // Exibe o número de elementos que estão na lista
        System.out.printf("Tamanho da lista: %s%n", cores.size());
    }

}
