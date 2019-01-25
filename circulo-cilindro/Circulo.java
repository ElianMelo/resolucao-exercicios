/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 25/01/2019
Objetivo sucinto do programa: Criar uma classe que simula um circulo
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class Circulo {	
	private double raio = 1.0;
	private String cor = "vermelho";

	Circulo() {}
	
	Circulo(double raio) {
		this.raio = raio;
	}
	
	Circulo(double raio, String cor) {
		this(raio);
		this.cor = cor;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", cor=" + cor + "]";
	}
}
