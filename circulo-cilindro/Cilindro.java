/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 25/01/2019
Objetivo sucinto do programa: Criar uma classe que herda um cilindro
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class Cilindro extends Circulo {
	private double altura = 1.0;
	
	Cilindro() {}
	
	Cilindro(double raio) {
		super(raio);
	}
	
	Cilindro(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}
	
	Cilindro(double raio, double altura, String cor) {
		super(raio, cor);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getVolume() {
		return super.getArea() * this.altura;
	}
	
	@Override
	public double getArea() {
		return (2 * super.getArea()) + (this.altura * (2 * Math.PI * this.getRaio()));
	}
}
