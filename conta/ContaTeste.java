/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 05/12/2018
Objetivo sucinto do programa: Manipula a classe conta, com os métodos get e set, e Scanner
Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016) páginas: 56 a 63
*/
import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args){
        // Cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner leitor = new Scanner(System.in);

        // Cria um objeto Conta e o atribui a minhaConta
        Conta minhaConta = new Conta();

        // Exibe o valor inicial do nome (null)
        System.out.printf("Nome inicial e: %s%n%n", minhaConta.getNome());

        // Solicita e lê o nome
        System.out.println("Por favor insira um nome: ");
        String nome = leitor.nextLine(); // Lê uma linha de texto
        minhaConta.setNome(nome); // Insere nome em minhaConta
        System.out.println(); // Gera saída de uma linha em branco

        // Exibe o nome armazenado no objeto minhaConta
        System.out.printf("nome no objeto minhaConta e: %n%s%n", minhaConta.getNome());
    }
}
