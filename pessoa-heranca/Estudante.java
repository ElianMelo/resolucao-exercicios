/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 29/01/2019
Objetivo sucinto do Programa: Criar uma classe que simula um estudante e que herda uma pessoa
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class Estudante extends Pessoa {
	
	private String curso;
	private int ano;
	private double mensalidade;
	
	public Estudante(String nome, String endereco, String curso, int ano, double mensalidade) {
		super(nome, endereco);
		this.curso = curso;
		this.ano = ano;
		this.mensalidade = mensalidade;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public double getMensalidade() {
		return mensalidade;
	}
	
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	@Override
	public String toString() {
		return "Estudante [" + super.toString() + ", curso=" + curso + ", ano=" + ano + ", mensalidade=" + mensalidade + "]";
	}	

}
