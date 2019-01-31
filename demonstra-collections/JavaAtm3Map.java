/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 29/01/2019
Objetivo sucinto do programa: Demonstrar Map com um programa de notas
Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/16F6QhldM5D8wA6RISbLAvKviZ6amAqLVrmMzm5lDMLM/edit 
*/
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class JavaAtm3Map {
	
	public static void main(String[] args) {
		
		int amount = 130;
		
		List<Integer> billValues = Arrays.asList(100, 50, 20, 10, 5, 2, 1);
		
		Map<Integer, Integer> distribution = getBillDistribution(amount, billValues);
		printOutput(amount, distribution);
		
	}
	
	public static void printOutput(int amount, Map<Integer, Integer> distribution) {
		System.out.println("Dividindo R$ " + amount + " em notas de R$ 100, "
				+ "R$ 50, R$ 20, R$ 10, R$ 5, R$ 2, R$ 1");
		
		for (Entry<Integer, Integer> e : distribution.entrySet()) {
			int value = e.getKey();
			int bills = e.getValue();
			
			System.out.println("Notas de R$ " +  value + ": " + bills);
		}
	}
	
	public static Map<Integer, Integer> getBillDistribution(int amount, List<Integer> billValues) {
		HashMap<Integer, Integer> distribution = new HashMap<>();
		
		for (int value : billValues) {
			//distribution.add(amount / value);
			int bills = amount / value;
			if (bills > 0)
				distribution.put(value, bills);
			amount %= value;
		}
		
		return distribution;
	}
	
}
