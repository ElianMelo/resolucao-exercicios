/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 06/02/2019
Objetivo sucinto do programa: Demonstrar o uso de threads no Java
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1g6IIaB-HUmiA4QaFkECVG4JA0PRx2BDExf2RtSj4XnQ/edit
*/
public class Teste {
	
	public static void main(String[] args) {
		
		MinhaThread thread = new MinhaThread("Thread #1", 600);
		//thread.start();
		
		MinhaThread thread2 = new MinhaThread("Thread #2", 900);
		MinhaThread thread3 = new MinhaThread("Thread #3", 500);
		
	}

}
