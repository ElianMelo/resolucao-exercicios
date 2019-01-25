/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 24/01/2019
Objetivo sucinto do programa: Criar uma classe que simula um cliente
Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class Cliente {
	private int ID;
	private String nome;
	private char genero;
	
	Cliente(int ID, String nome, char genero) {
		this.ID = ID;
		this.nome = nome;
		this.genero = genero;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getNome() {
		return nome;
	}

	public char getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		return this.nome  + "(" + this.ID  + ")";
	}
	
}
