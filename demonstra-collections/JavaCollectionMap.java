/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 29/01/2019
Objetivo sucinto do programa: Demonstrar Map com um programa de livros e avaliações
Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/16F6QhldM5D8wA6RISbLAvKviZ6amAqLVrmMzm5lDMLM/edit
*/
//import java.util.HashSet;
import java.util.HashMap;
import java.util.Map.Entry;

public class JavaCollectionMap {
	
	public static void main(String[] args) {
		// Codigo que exemplifica Set
		
		/* HashSet<String> mySet = new HashSet<>();
		
		mySet.add("Banana");
		mySet.add("Apple");
		
		System.out.println("Banana: " + mySet.contains("Banana"));
		System.out.println("Orange: " + mySet.contains("Orange"));
		mySet.remove("Banana");
		System.out.println("Banana: " + mySet.contains("Banana"));
		mySet.add("Banana");
		
		for(String fruit : mySet) {
			System.out.println(fruit);
		} */
		
		HashMap<String, Integer> myBooks = new HashMap<>();
		
		myBooks.put("Ender's Game", 4);
		myBooks.put("Ringworld", 3);
		myBooks.put("Heir to the Empire", 5);
		
		// Faz uma varredura em myBooks pela chave
		for(String title : myBooks.keySet())
			System.out.println(title);
		
		// Faz uma varredura em myBools pelos valores
		for(int score : myBooks.values())
			System.out.println(score);
		
		// Faz uma varredura em myBooks pelas chaves e buscando os valores
		for(String title : myBooks.keySet())
			System.out.println(title + " é nota " + myBooks.get(title));
		
		// Faz uma varredura em myBooks pelas entrys do mapa
		for(Entry<String, Integer> entry : myBooks.entrySet()) {	
			String title = entry.getKey();
			int score = entry.getValue();
			
			System.out.println(title + " é nota " + score);
		}
		
		// Verifica se há a chave no mapa
		System.out.println(myBooks.containsKey("Ringworld"));
		System.out.println(myBooks.containsKey("Crusoe"));
		myBooks.remove("Ringworld");
		System.out.println(myBooks.containsKey("Ringworld"));
		
		// Verifica se há o valor no mapa
		System.out.println(myBooks.containsValue(5));
		System.out.println(myBooks.containsValue(2));
		
	}

}
