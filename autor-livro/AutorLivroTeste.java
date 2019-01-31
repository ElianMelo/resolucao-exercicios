/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 23/01/2019
Objetivo sucinto do programa: Criar um classe que testa as classes Livro e Autor
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class AutorLivroTeste {
	
	public static void main(String[] args) {
		Autor autor1 = new Autor("John Carreyrou", "john-carreyrou@gmail.com", 'm');
		Autor autor2 = new Autor("Tara Westover", "tara-westover@gmail.com", 'f');
		
		Livro livro1 = new Livro("Bad Blood", autor1, 59.90, 50);
		Livro livro2 = new Livro("A Menina da Montanha", autor2, 38.61, 100);
		
		System.out.println(autor1.toString());
		System.out.println(autor2.toString());
		System.out.println(livro1.toString());
		System.out.println(livro2.toString());
		
		livro1.setPreco(100);
		System.out.println("Preço do livro1: " + livro1.getPreco());
		livro2.setQuantidade(10);
		System.out.println("Quantidade do livro2: " + livro2.getQuantidade());
		System.out.println("Autor do livro2: " + livro2.getAutor());
		
		autor1.setEmail("joao-carr@gmail.com");
		System.out.println("Email do autor1: " + autor1.getEmail());
		System.out.println("Genênero do autor2: " + autor2.getGenero());
		
		System.out.println("autor1 é igual ao autor2: " + autor1.equals(autor2));
		
		Autor autor3 = new Autor("John Carreyrou", "joao-carr@gmail.com", 'm');
		
		System.out.println("autor1 é igual ao autor3: " + autor1.equals(autor3));
	}

}
