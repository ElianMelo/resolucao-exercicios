/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 29/01/2019
Objetivo sucinto do programa: Criar uma classe que simula um funcionario e que herda uma pessoa
Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class Funcionario extends Pessoa {
	
	private String escola;
	private double salario;
	
	public Funcionario(String nome, String endereco, String escola, double salario) {
		super(nome, endereco);
		this.escola = escola;
		this.salario = salario;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [" + super.toString() + ", escola=" + escola + ", salario=" + salario + "]";
	}

}
