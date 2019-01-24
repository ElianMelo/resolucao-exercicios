/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 23/01/2019
Objetivo sucinto do programa: Criar um classe que testa as classes Livro e Autor utilizando arrays de livros
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class AutorLivroTeste {
	
	public static void main(String[] args) {
		Autor[] autores1 = new Autor[2];
		
		autores1[0] = new Autor("Allan Pease", "allan-pease@gmail.com", 'm');
		autores1[1] = new Autor("Barbara Pease", "barbara-pease@gmail.com", 'f');
		
		Autor[] autores2 = new Autor[2];
		
		autores2[0] = new Autor("Albergaria", "albergaria@gmail.com", 'f');
		autores2[1] = new Autor("Angela Leite", "angela-leite@gmail.com", 'f');
		
		Livro livro1 = new Livro("por que os homens mentem e as mulheres choram", autores1, 34.90, 2);
		Livro livro2 = new Livro("cabelos de fogo, olhos de agua", autores2, 100, 0);
		
		System.out.println(livro1.toString());
		System.out.println(livro2.toString());
		
		autores1[0].setEmail("allan-pease@hotmail.com");
		System.out.println("Altera o e-mail do primeiro array de autores: " + autores1[0].getEmail());
		
		System.out.println(livro1.getNomeDosAutores());
		System.out.println(livro2.getNomeDosAutores());
	}

}
