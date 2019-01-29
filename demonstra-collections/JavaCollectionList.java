/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 29/01/2019
Objetivo sucinto do programa: Demonstrar List com um programa de números aleatórios
Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/16F6QhldM5D8wA6RISbLAvKviZ6amAqLVrmMzm5lDMLM/edit
*/
import java.util.ArrayList;

public class JavaCollectionList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<>();
		
		int numOfElements = (int) (Math.random() * 100);		
		
		for (int i = 0; i < numOfElements; i++) {
			myList.add(i);
		}
		
		for (int element : myList) {
			System.out.println(element);
		}
		
	}

}
