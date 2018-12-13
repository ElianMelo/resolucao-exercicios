/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 11/12/2018
Objetivo sucinto do programa: Manipula 5 instancias livro dentre elas um array de livros, utilizando todos os metodos disponiveis
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class LivroTeste {

    public static void main(String[] args) {

        SimpleDateFormat conversor = new SimpleDateFormat("dd-MM-yyyy");

        Date dataAtual = new Date();
        Date dataInicio = new Date(dataAtual.getTime() - (864 * 10 * 100000));
        Date dataFim = new Date(dataAtual.getTime() + (864 * 1 * 100000));
        Date dataFimAtrasado1 = new Date(dataAtual.getTime() - (864 * 3 * 100000));
        Date dataFimAtrasado2 = new Date(dataAtual.getTime() - (864 * 5 * 100000));

        Livro[] harryPotter = new Livro[8];

        harryPotter[0] = new Livro(0, "Harry potter e a pedra filosofal", "J. K. Rowling", dataInicio, dataFim, "emprestado", 10);
        harryPotter[1] = new Livro(1, "Harry potter e a camara secreta", "J. K. Rowling", dataInicio, dataFimAtrasado1, "emprestado", 20);
        harryPotter[2] = new Livro(2, "Harry potter e o prisioneiro de azkaban", "J. K. Rowling", dataInicio, dataFim, "disponivel", 2);
        harryPotter[3] = new Livro(3, "Harry potter e o calice de fogo", "J. K. Rowling", dataInicio, dataFimAtrasado2, "disponivel", 7);
        harryPotter[4] = new Livro(4, "Harry potter e a ordem da fenix", "J. K. Rowling", dataInicio, dataFim, "disponivel", 1);
        harryPotter[5] = new Livro(5, "Harry potter e o enigma do principe", "J. K. Rowling", dataInicio, dataFimAtrasado2, "emprestado", 30);
        harryPotter[6] = new Livro(6, "Colecao harry potter", "J. K. Rowling", dataInicio, dataFim, "disponivel", 50);
        harryPotter[7] = new Livro(7, "Animais fantasticos e onde habitam", "J. K. Rowling", dataInicio, dataFim, "emprestado", 5);

        Livro vivian = new Livro(8, "Vivian contra o apocalipse", "Katie Coyle", dataInicio, dataFimAtrasado2, "emprestado", 5);
        Livro habito = new Livro(9, "O poder do habito", "Charles Duhigg", dataInicio, dataFim, "disponivel", 3);
        Livro corvo = new Livro(9, "O corvo", "Edgar Allan Poe", dataInicio, dataFim, "disponivel", 7);
        Livro rapido = new Livro(9, "Rapido e devagar", "Daniel Kahneman", dataInicio, dataFim, "emprestado", 2);

        // To string inicial
        System.out.println(vivian.toString());
        System.out.println(habito.toString());
        System.out.println(corvo.toString());
        System.out.println(rapido.toString());
        System.out.println(harryPotter[0].toString());
        System.out.println(harryPotter[1].toString());
        System.out.println(harryPotter[2].toString());
        System.out.println("...");
        System.out.println();

        // Testes com vivian
        System.out.println("--- Testes com vivian ---");
        System.out.println();
        System.out.println("Titulo do livro: " + vivian.getTitulo());
        System.out.println("Status do livro: " + vivian.getStatusLivro());
        System.out.println("Emprestar livro:\n" + vivian.emprestarLivro());
        System.out.println("Devolver livro:\n" + vivian.devolverLivro());
        System.out.println();

        // Testes com get e set no livro corvo
        System.out.println("--- Testes com corvo ---");
        System.out.println();
        System.out.println("ID: " + corvo.getId());
        System.out.println("Título do livro: " + corvo.getTitulo());
        corvo.setTitulo("O corvo edicao limitada");
        System.out.println("Título do livro: " + corvo.getTitulo());
        System.out.println("Autor do livro: " + corvo.getAutor());
        corvo.setAutor("Poe, Edgar Allan");
        System.out.println("Autor do livro: " + corvo.getAutor());
        System.out.println("Data de emprestimo: " + corvo.getDataEmprestimo());
        corvo.setDataEmprestimo(dataFimAtrasado2);
        System.out.println("Data de emprestimo: " + corvo.getDataEmprestimo());
        System.out.println("Data de devolucao: " + corvo.getDataDevolucao());
        corvo.setDataDevolucao(dataFimAtrasado1);
        System.out.println("Data de devolucao: " + corvo.getDataDevolucao());
        System.out.println("Status do livro: " + corvo.getStatusLivro());
        corvo.setStatusLivro("emprestado");
        System.out.println("Status do livro: " + corvo.getStatusLivro());
        System.out.println("Quantidade de emprestimos: " + corvo.getQuantidadeEmprestimos());
        corvo.setQuantidadeEmprestimos(15);
        System.out.println("Quantidade de emprestimos: " + corvo.getQuantidadeEmprestimos());
        System.out.println();

        // Testes com os metodos simples no livro rapido e habito
        System.out.println("--- Testes com rapido e habito ---");
        System.out.println();
        System.out.println("Emprestar livro rapido:\n" + rapido.emprestarLivro());
        System.out.println("Emprestar livro habito:\n" + habito.emprestarLivro());
        System.out.println();

        System.out.println("Devolver livro rapido:\n" + rapido.devolverLivro());
        System.out.println("Devolver livro habito:\n" + habito.devolverLivro());
        System.out.println();

        // Testa os metodos de array com harryPotter
        System.out.println("--- Testes com harry potter ---");
        System.out.println();
        System.out.println("Busca o livro Colecao harry potter da J. K. Rowling\n" + Livro.buscarLivro(harryPotter, "Colecao harry potter", "J. K. Rowling"));
        System.out.println("Busca o livro animais fantasticos 2 da J. K. Rowling\n" + Livro.buscarLivro(harryPotter, "animais fantasticos 2", "J. K. Rowling"));
        System.out.println();

        System.out.println(Livro.exibirLivrosEmprestados(harryPotter));
        System.out.println(Livro.exibirLivrosDisponiveis(harryPotter));
        System.out.println(Livro.exibirLivrosAtrasados(harryPotter));
        System.out.println(Livro.exibeLivroMaisEmprestado(harryPotter));
        System.out.println();

        System.out.println("Cobra R$2.00 para cada dia atrasado do livro: " + harryPotter[1].getTitulo() + "\nValor total: R$" + harryPotter[1].gerarMulta(2));
        System.out.println("Cobra R$5.00 para cada dia atrasado do livro: " + harryPotter[5].getTitulo() + "\nValor total: R$" + harryPotter[5].gerarMulta(5));
        System.out.println();

        System.out.println(Livro.listarTodosLivros(harryPotter));

        System.out.println(vivian.toString());
        System.out.println(habito.toString());
        System.out.println(corvo.toString());
        System.out.println(rapido.toString());
        System.out.println(harryPotter[0].toString());
        System.out.println(harryPotter[1].toString());
        System.out.println(harryPotter[2].toString());
        System.out.println("...");
    }
}
