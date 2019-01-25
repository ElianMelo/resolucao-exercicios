/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 25/01/2019
Objetivo sucinto do programa: Testar as classes Circulo e Cilindro
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1wSPKmVGsvzHlM13SY_IxCcqA1AhFboDvSy6M6NqOTfY/edit
*/
public class CirculoCilindroTeste {
	
	public static void main(String[] args) {
		Circulo circulo1 = new Circulo();
		Circulo circulo2 = new Circulo(50);
		Circulo circulo3 = new Circulo(15, "vermelho");
		
		circulo1.setRaio(5);
		circulo1.setCor("azul");
		circulo2.setCor("amarelo");
		
		System.out.println(circulo1.toString());
		System.out.println(circulo1.toString());
		System.out.println(circulo1.toString());
	
		System.out.println("Area do circulo3: " + circulo3.getArea());
		
		Cilindro cilindro1 = new Cilindro();
		Cilindro cilindro2 = new Cilindro(20);
		Cilindro cilindro3 = new Cilindro(30, 10);
		Cilindro cilindro4 = new Cilindro(40, 20, "vermelho");
		
		cilindro1.setRaio(10);
		cilindro1.setAltura(20);
		cilindro1.setCor("azul");
		
		cilindro2.setAltura(10);
		cilindro2.setCor("verde");
		
		cilindro3.setCor("roxo");
		
		System.out.println(cilindro1.toString());
		System.out.println(cilindro2.toString());
		System.out.println(cilindro3.toString());
		System.out.println(cilindro4.toString());
		
		System.out.println("Altura do cilindro4: " + cilindro4.getAltura());
		System.out.println("Volume do cilindro3: " + cilindro3.getVolume());
		System.out.println("Area do cilindro3: " + cilindro3.getArea());
		System.out.println("Area do cilindro2: " + cilindro2.getArea());
		System.out.println("Area do circulo4: " + circulo2.getArea());
	}

}
