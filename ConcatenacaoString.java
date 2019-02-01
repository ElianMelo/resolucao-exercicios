/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 31/01/2019
Objetivo sucinto do programa: Demonstrar a forma correta de se concatenar Strings
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1tHsvSkW3aBy2ZpfaSjeoBOKYCG-XaKoBZA8AwFiPxlw/edit
*/
import java.util.ArrayList;

public class ConcatenacaoString {

	public static void main(String[] args) {

	    ArrayList<String> cores = new ArrayList<>();

		cores.add("Vermelho");
		cores.add("Laranja");
		cores.add("Amarelo");
		cores.add("Verde");
		cores.add("Azul");
		cores.add("Anil");
		cores.add("Violeta");

		// Faz a concatenção através do StringBuffer (Thread-Safe)
		StringBuffer arcoIrisBuffer = new StringBuffer();

		for (String cor : cores) {
			arcoIrisBuffer.append(cor + " ");
		}

		System.out.println(arcoIrisBuffer);

		// Faz a concatenção através do StringBuilder (Não Thread-Safe)
		StringBuilder arcoIrisBuilder = new StringBuilder();

		for (String cor : cores) {
			arcoIrisBuilder.append(cor + " ");
		}

		System.out.println(arcoIrisBuilder);
	}

}
