/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 23/01/2019
Objetivo sucinto do programa: Criar um classe que simula um livro com seus respectivos autores
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class Livro {
	private String nome;
	private Autor[] autores;
	private double preco;
	private int quantidade = 0;
	
	Livro(String nome, Autor[] autores, double preco) {
		this.nome = nome;
		this.autores = autores;
		this.preco = preco;
	}
	
	Livro(String nome, Autor[] autores, double preco, int quantidade) {
		this.nome = nome;
		this.autores = autores;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public Autor[] getAutores() {
		return autores;
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
		String texto = "{";
		
		for(int i = 0; i < autores.length; i++) {
			texto += autores[i].toString() + (i != autores.length - 1 ? ", " : "");
		}
		
		texto += "}";
		
		return "Livro [nome=" + nome + ", " + texto + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	public String getNomeDosAutores() {
		String texto = "";
		
		for(int i = 0; i < autores.length; i++) {
			texto += autores[i].getNome() + (i != autores.length - 1 ? ", " : "");
		}
		
		return texto;
	}
}
