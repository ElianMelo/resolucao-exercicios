/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 24/01/2019
Objetivo sucinto do programa: Testar a relação entre as classes Cliente e Fatura
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class ClienteFaturaTeste {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(1, "Ana Vitoria", 20);
		Cliente cliente2 = new Cliente(2, "Robson Silva", 50);
		
		Fatura fatura1 = new Fatura(1, cliente1, 100);
		Fatura fatura2 = new Fatura(2, cliente2, 5000);
		
		System.out.println();
		
		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		
		System.out.println("Fatura1 montante com desconto: " + fatura1.getMontanteAposDesconto());
		System.out.println("Nome do cliente da fatura1: " + fatura1.getNomeDoCliente());
		
		System.out.println("Fatura2 montante com desconto: " + fatura2.getMontanteAposDesconto());
		System.out.println("Nome do cliente da fatura2: " + fatura2.getNomeDoCliente());
		
		fatura1.setMontante(100);
		System.out.println(fatura1.getMontante());
		
		fatura2.setCliente(cliente1);
		System.out.println(fatura2.getCliente());
	}

}
