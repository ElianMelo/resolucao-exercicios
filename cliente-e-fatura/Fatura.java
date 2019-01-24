/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 24/01/2019
Objetivo sucinto do programa: Criar uma classe que simula uma fatura
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class Fatura {
	int ID;
	Cliente cliente;
	double montante;
	
	public Fatura(int iD, Cliente cliente, double montante) {
		this.ID = iD;
		this.cliente = cliente;
		this.montante = montante;
	}

	public int getID() {
		return ID;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMontante() {
		return montante;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}
	
	public String getNomeDoCliente() {
		return cliente.getNome();
	}
	
	public double getMontanteAposDesconto() {
		return (montante - (montante * cliente.getDesconto() / 100));
	}
}
