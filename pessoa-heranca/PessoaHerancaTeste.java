/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo:
Objetivo sucinto do programa: Testar a classe Pessoas e suas subclasses
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class PessoaHerancaTeste {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Robson", "Jardim das Palameiras");
		Pessoa pessoa2 = new Pessoa("Maria", "Glória");
		
		Estudante estudante1 = new Estudante("Fábio", "Gávea", "PHP", 2, 2500);
		Estudante estudante2 = new Estudante("Maria Luiza", "Morada da Colina", "Administração", 10, 10000);
	
		Funcionario funcionario1 = new Funcionario("Valdemir", "Copacabana", "Nacional", 1000);
		Funcionario funcionario2 = new Funcionario("Juracema", "Tabajaras", "Gabarito", 1000);
		
		System.out.println();
		
		System.out.println(pessoa2.toString());
		System.out.println(estudante1.toString());
		System.out.println(funcionario2.toString());
		
		System.out.println("Nome da pessoa1: " + pessoa1.getNome());
		System.out.println("Nome do estudante2: " + estudante2.getNome());
		System.out.println("Nome do funcionário1: " + funcionario1.getNome());
		
		pessoa1.setEndereco("Santa Mônica");
		System.out.println("Altera o endereco da pessoa1: " + pessoa1.getEndereco());
		estudante1.setCurso("Java");
		System.out.println("Altera o curso do estudante1: " + estudante1.getCurso());
		funcionario2.setEscola("Super Geeks");
		System.out.println("Altera a escola do funcionário2: " + funcionario2.getEscola());
		
		System.out.println(pessoa1.toString());
		System.out.println(estudante2.toString());
		System.out.println(funcionario1.toString());
		
	}
	
}
