/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 24/01/2019
Objetivo sucinto do programa: Criar uma classe que simula uma conta
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Conta {
	private int ID;
	private Cliente cliente;
	private double saldo = 0.0;
	
	public Conta(int ID, Cliente cliente, double saldo) {
		this.ID = ID;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public Conta(int ID, Cliente cliente) {
		this.ID = ID;
		this.cliente = cliente;
	}
	
	public int getID() {
		return ID;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		DecimalFormat formatador = new DecimalFormat("#0.00");
		DecimalFormatSymbols formatadorSimbolo = formatador.getDecimalFormatSymbols();
		formatadorSimbolo.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(formatadorSimbolo);
		
		return cliente.toString() + " saldo = R$" + formatador.format(saldo);
	}
	
	public String getNomeDoCliente() {
		return cliente.getNome();
	}
	
    public String realizarCredito(double valor){
        saldo += valor;
        return "Saldo total da conta: " + saldo;
    }

    public String realizarDebito(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return "Saldo total da conta: " + saldo;
        }else{
            return "O saldo disponível é insuficiente";
        }
    }
}
