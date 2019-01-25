/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 24/01/2019
Objetivo sucinto do programa: Testar as classes Cliente e Conta que usam composição
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class ClienteContaTeste {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(1, "Joao", 'm');
		Cliente cliente2 = new Cliente(2, "Josefa", 'f');
		
		Conta conta1 = new Conta(1, cliente1);
		Conta conta2 = new Conta(2, cliente2, 5000);
		
		System.out.println();
		
		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		
		conta1.setSaldo(50);
		System.out.println(conta1.toString());
		System.out.println(conta2.toString());
		
		System.out.println(conta1.getNomeDoCliente());
		System.out.println(conta2.getNomeDoCliente());
		
		System.out.println(conta1.realizarCredito(1000));
		System.out.println(conta2.realizarDebito(2500));
		
		System.out.println(conta1.toString());
		System.out.println(conta2.toString());
		
		System.out.println(conta1.realizarDebito(5000));
	}

}
