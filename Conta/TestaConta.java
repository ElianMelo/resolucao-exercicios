/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 05/12/2018
Objetivo sucinto do programa: Manipula a classe conta, com os métodos pega e define, e Scanner
Referência ao enunciado/origem do exercício: Paul Deitel, Harvey Deitel-Java - Como Programar-Pearson (2016) páginas: 91-94
*/
import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args){
        // Cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner leitor = new Scanner(System.in);

        // Cria um objeto Conta e o atribui a minhaConta
        Conta minhaConta = new Conta();

        // Exibe o valor inicial do nome (null)
        System.out.printf("Nome inicial e: %s%n%n", minhaConta.pegaNome());

        // Solicita e lê o nome
        System.out.println("Por favor insira um nome: ");
        String nome = leitor.nextLine(); // Lê uma linha de texto
        minhaConta.defineNome(nome); // Insere nome em minhaConta
        System.out.println(); // Gera saída de uma linha em branco

        // Exibe o nome armazenado no objeto minhaConta
        System.out.printf("nome no objeto minhaConta e: %n%s%n", minhaConta.pegaNome());
    }
}
