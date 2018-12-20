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
        String data = "" + conversor.format(dataEmprestimo);
        return data;
    }

    // Altera a data de emprestimo
    public void setDataEmprestimo(Date dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    // Retorna a data de devolucao
    public String getDataDevolucao(){
        String data = "" + conversor.format(dataDevolucao);
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

            return "O livro \"" + titulo + "\" foi emprestado com sucesso.";
        }else{
            return "O livro \"" + titulo + "\" já está emprestado.";
        }
    }

    // Realiza a devolucao do livro
    public String devolverLivro(){
        if(statusLivro == "emprestado"){
            statusLivro = "disponivel";
            return "O livro \"" + titulo + "\" foi devolvido com sucesso.";
        }else{
            return "O livro \"" + titulo + "\" não pode ser devolvido, pois não está emprestado.";
        }
    }

    // Realiza uma busca em um array de livros
    public static String buscarLivro(Livro[] arr, String titulo, String autor){
        if(arr.length == 0){
            return "Insira um array válido";
        }else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i].getTitulo() == titulo && arr[i].getAutor() == autor){
                    if(arr[i].getStatusLivro() == "disponivel"){
                        return "Livro encontrado com sucesso!\n"
                         + "id: " + arr[i].getId() + "\n"
                         + "titulo: " + arr[i].getTitulo() + "\n"
                         + "autor: " + arr[i].getAutor() + "\n"
                         + "dataEmprestimo: " + arr[i].getDataEmprestimo() + "\n"
                         + "dataDevolucao: " + arr[i].getDataDevolucao() + "\n"
                         + "statusLivro: " + arr[i].getStatusLivro() + "\n"
                         + "quantidadeEmprestimos: " + arr[i].getQuantidadeEmprestimos();
                    }else{
                        return "Livro encontrado com sucesso!\n"
                         + "id: " + arr[i].getId() + "\n"
                         + "titulo: " + arr[i].getTitulo() + "\n"
                         + "autor: " + arr[i].getAutor() + "\n"
                         + "dataEmprestimo: 10/12/2018\n"
                         + "dataDevolucao: 17/12/2018\n"
                         + "statusLivro: " + arr[i].getStatusLivro() + "\n"
                         + "quantidadeEmprestimos: " + arr[i].getQuantidadeEmprestimos();
                    }
                }
            }
            return "Falha ao encontrar o livro";
        }
    }

    // Realiza uma exibicao dos livros emprestados de um array
    public static String exibirLivrosEmprestados(Livro[] arr){
        String livros = "";
        if(arr.length == 0){
            return "Insira um array válido";
        }else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i].getStatusLivro() == "emprestado"){
                    livros += "Título do livro= " + arr[i].getTitulo() + ", Autor= " + arr[i].getAutor() + "\n";
                }
            }
            return livros;
        }
    }

    // Realiza a exibicao dos livos disponiveis de um array
    public static String exibirLivrosDisponiveis(Livro[] arr){
        String livros = "";
        if(arr.length == 0){
            return "Insira um array válido";
        }else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i].getStatusLivro() == "disponivel"){
                    livros += "Título do livro= " + arr[i].getTitulo() + ", Autor= " + arr[i].getAutor() + "\n";
                }
            }
            return livros;
        }
    }

    // Realiza uma exibicao dos livros atrasados de um array
    public static String exibirLivrosAtrasados(Livro[] arr){
        String livros = "";
        if(arr.length == 0){
            return "Insira um array válido";
        }else{
            Date dataAtual = new Date();
            for(int i = 0; i < arr.length; i++){
                if(dataAtual.getTime() > arr[i].dataDevolucao.getTime() && arr[i].getStatusLivro() == "emprestado"){
                    long dias = (dataAtual.getTime() - arr[i].dataDevolucao.getTime()) / (864 * 1 * 100000);
                    livros += "Título do livro= " + arr[i].getTitulo() + ", Autor= " + arr[i].getAutor() + ", Dias de atrasado: " +  dias + "\n";
                }
            }
            return livros;
        }
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

    // Exibe o livro mais emprestado no array
    public static String exibeLivroMaisEmprestado(Livro[] arr){
        int id = 0;
        String titulo = "";
        String autor = "";
        String dataEmprestimo = "";
        String dataDevolucao = "";
        String statusLivro = "";
        int quantidadeEmprestimos = 0;
        if(arr.length == 0){
            return "Insira um array válido";
        }else{
            for(int i = 0; i < arr.length; i++){
                if(i == 0){
                    id = arr[i].getId();
                    titulo = arr[i].getTitulo();
                    autor = arr[i].getAutor();
                    dataEmprestimo = arr[i].getDataEmprestimo();
                    dataDevolucao = arr[i].getDataDevolucao();
                    statusLivro = arr[i].getStatusLivro();
                    quantidadeEmprestimos = arr[i].getQuantidadeEmprestimos();
                }
                if(arr[i].getQuantidadeEmprestimos() > quantidadeEmprestimos){
                    id = arr[i].getId();
                    titulo = arr[i].getTitulo();
                    autor = arr[i].getAutor();
                    dataEmprestimo = arr[i].getDataEmprestimo();
                    dataDevolucao = arr[i].getDataDevolucao();
                    statusLivro = arr[i].getStatusLivro();
                    quantidadeEmprestimos = arr[i].getQuantidadeEmprestimos();
                }
            }
            return "Livro mais emprestado\n"
                + "id: " + id + "\n"
                + "titulo: " + titulo + "\n"
                + "autor: " + autor + "\n"
                + "dataEmprestimo: " + dataEmprestimo + "\n"
                + "dataDevolucao: " + dataDevolucao + "\n"
                + "statusLivro: " + statusLivro + "\n"
                + "quantidadeEmprestimos: " + quantidadeEmprestimos;
        }
    }

    // Cria o método toString
    public String toString(){
        return "Livro[id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", dataEmprestimo=" + conversor.format(dataEmprestimo) + ", dataDevolucao=" + conversor.format(dataDevolucao) + ", statusLivro=" + statusLivro + ", quantidadeEmprestimos=" + quantidadeEmprestimos + "]";
    }
}
