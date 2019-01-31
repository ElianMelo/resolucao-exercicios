/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 23/01/2019
Objetivo sucinto do programa: Criar uma classe que simula um autor de um livro
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class Autor {
	private String nome;
	private String email;
	private char genero;
	
	Autor(String nome, String email, char genero) {
		this.nome = nome;
		this.email = email;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGenero() {
		return genero;
	}
	
	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", email=" + email + ", genero=" + genero + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Autor other = (Autor) obj;
		
		if (nome.equals(other.getNome()) && email.equals(other.getEmail()))
			return true;
		
		return false;
	}

}
