/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 05/02/2019
Objetivo sucinto do programa: Demonstrar o uso de threads no Java
Refer�ncia ao enunciado/origem do exerc�cio: https://docs.google.com/document/d/1g6IIaB-HUmiA4QaFkECVG4JA0PRx2BDExf2RtSj4XnQ/edit
*/
public class JavaThreads {

	public static void main(String[] args) {
		
		Printer p1 = new Printer("Eduardo", 100, 20);
		Printer p2 = new Printer("M�nica", 100, 20);
		
		p1.start();
		p2.start();
		
		try {
			p1.join();
			p2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Printer extends Thread {
	String text;
	int delay;
	int times;
	
	public Printer(String text, int delay, int times) {
		this.text = text;
		this.delay = delay;
		this.times = times;
	}
	
	public void run() {
		for(int i = 0; i < times; i++) {
			System.out.println(text);
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
	
}