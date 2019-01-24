/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 23/01/2019
Objetivo sucinto do programa: Criar um classe que simula um livro com seu respectivo autor
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class Livro {
	private String nome;
	private Autor autor;
	private double preco;
	private int quantidade = 0;
	
	Livro(String nome, Autor autor, double preco) {
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
	}
	
	Livro(String nome, Autor autor, double preco, int quantidade) {
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Livro [nome=" + nome + "," + autor.toString() + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
}
