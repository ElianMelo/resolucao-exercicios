/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 11/12/2018
Objetivo sucinto do programa: Cria a classe Livro que possui diversos metodos para manipulacao de Livros e array de Livros
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Uq6IUqO100w2ylIxVi17RTwYLo-ljPu2YGu7KPPDydg/edit
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private String statusLivro;
    private int quantidadeEmprestimos;

    SimpleDateFormat conversor = new SimpleDateFormat("dd-MM-yyyy");

    Livro(){}

    Livro(int id, String titulo, String autor, Date dataEmprestimo, Date dataDevolucao, String statusLivro, int quantidadeEmprestimos){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.statusLivro = statusLivro;
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }

    // Retorna o ID
    public int getId(){
        return id;
    }

    // Retorna o título
    public String getTitulo(){
        return titulo;
    }

    // Altera o título
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    // Retorna o autor
    public String getAutor(){
        return autor;
    }

    // Altera o autor
    public void setAutor(String autor){
        this.autor = autor;
    }

    // Retorna a data de emprestimo
    public String getDataEmprestimo(){
        String data = "Emprestimo realizado no dia: " + conversor.format(dataEmprestimo);
        return data;
    }

    // Altera a data de emprestimo
    public void setDataEmprestimo(Date dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    // Retorna a data de devolucao
    public String getDataDevolucao(){
        String data = "Devolucao deve ser realizada no dia: " + conversor.format(dataDevolucao);
        return data;
    }

    // altera a data de devolucao
    public void setDataDevolucao(Date dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }

    // Retorna o status do livro
    public String getStatusLivro(){
        return statusLivro;
    }

    // Altera o status do livro
    public void setStatusLivro(String statusLivro){
        this.statusLivro = statusLivro;
    }

    // Retorna a quantidade de emprestimos
    public int getQuantidadeEmprestimos(){
        return quantidadeEmprestimos;
    }

    // Altera a quantidade de emprestimos
    public void setQuantidadeEmprestimos(int quantidadeEmprestimos){
        this.quantidadeEmprestimos = quantidadeEmprestimos;
    }

    // Realiza o emprestimo do livro
    public String emprestarLivro(){
        if(statusLivro == "disponivel"){
            statusLivro = "emprestado";
            Date dataAtual = new Date();
            setDataEmprestimo(dataAtual);
            long soma = dataEmprestimo.getTime() + (86400 * 7 * 1000);
            Date dataAux = new Date(soma);
            setDataDevolucao(dataAux);
            quantidadeEmprestimos++;

            return "O livro foi emprestado com sucesso\n" + "data de emprestimo: " + conversor.format(dataEmprestimo) + "\n" + "data de devolucao: " + conversor.format(dataDevolucao);
        }else{
            return "Falha ao emprestar o livro";
        }
    }

    // Realiza a devolucao do livro
    public String devolverLivro(){
        if(statusLivro == "emprestado"){
            statusLivro = "disponivel";
            return "O livro foi devolvido com sucesso";
        }else{
            return "Falha ao devolver o livro";
        }
    }

    // Realiza uma busca em um array de livros
    public static String buscarLivro(Livro[] arr, String titulo, String autor){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getTitulo() == titulo && arr[i].getAutor() == autor){
                return "Livro encontrado na posicao: " + i;
            }
        }
        return "Livro nao encontrado";
    }

    // Realiza uma exibicao dos livros emprestados de um array
    public static String exibirLivrosEmprestados(Livro[] arr){
        String livros = "Livros Emprestados:\n";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getStatusLivro() == "emprestado"){
                livros += arr[i].getTitulo() + "\n";
            }
        }
        return livros;
    }

    // Realiza a exibicao dos livos disponiveis de um array
    public static String exibirLivrosDisponiveis(Livro[] arr){
        String livros = "Livros Disponiveis:\n";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getStatusLivro() == "disponivel"){
                livros += arr[i].getTitulo() + "\n";
            }
        }
        return livros;
    }

    // Realiza uma exibicao dos livros atrasados de um array
    public static String exibirLivrosAtrasados(Livro[] arr){
        String livros = "Livros Atrasados:\n";
        Date dataAtual = new Date();
        for(int i = 0; i < arr.length; i++){
            if(dataAtual.getTime() > arr[i].dataDevolucao.getTime() && arr[i].getStatusLivro() == "emprestado"){
                livros += arr[i].getTitulo() + "\n";
            }
        }
        return livros;
    }

    // Gera uma multa por dias atrasados baseado em uma taxa
    public double gerarMulta(double taxaPorDiaAtrasado){
        Date dataAtual = new Date();
        if(dataAtual.getTime() > dataDevolucao.getTime()){
            long diferenca = dataDevolucao.getTime() - dataAtual.getTime();
            long dia = diferenca / (864 * 1 * 100000) * -1;
            double preco = dia * taxaPorDiaAtrasado;
            return preco;
        }else{
            return -1;
        }
    }

    // Lista o titulo dos livros armazenados no array
    public static String listarTodosLivros(Livro[] arr){
        String livros = "Todos os Livros:\n";
        for(int i = 0; i < arr.length; i++){
            livros += arr[i].getTitulo() + "\n";
        }
        return livros;
    }

    // Exibe o livro mais emprestado no array
    public static String exibeLivroMaisEmprestado(Livro[] arr){
        String livro = "Livro mais emprestado: ";
        int qtdEmp = 0;
        int posicao = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                qtdEmp = arr[i].getQuantidadeEmprestimos();
                posicao = i;
            }
            if(arr[i].getQuantidadeEmprestimos() > qtdEmp){
                qtdEmp = arr[i].getQuantidadeEmprestimos();
                posicao = i;
            }
        }
        return livro += arr[posicao].getTitulo() + " com " + qtdEmp + " emprestimos";
    }

    // Cria o método toString
    public String toString(){
        return "Livro[id=" + id + " titulo=" + titulo + " autor=" + autor + " dataEmprestimo=" + conversor.format(dataEmprestimo) + " dataDevolucao=" + conversor.format(dataDevolucao) + " statusLivro=" + statusLivro + " quantidadeEmprestimos=" + quantidadeEmprestimos + "]";
    }
}
