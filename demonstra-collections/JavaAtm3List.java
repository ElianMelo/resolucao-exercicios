/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 29/01/2019
Objetivo sucinto do programa: Demonstrar List com um programa de notas
Referência ao enunciado/origem do exercício:https://docs.google.com/document/d/16F6QhldM5D8wA6RISbLAvKviZ6amAqLVrmMzm5lDMLM/edit 
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaAtm3List {
	
	public static void main(String[] args) {
		
		int amount = 142;
		
		List<Integer> billValues = Arrays.asList(100, 50, 20, 10, 5, 2, 1);
		
		List<Integer> numberOfBills = getBillDistribution(amount, billValues);
		printOutput(amount, billValues, numberOfBills);
		
	}
	
	public static void printOutput(int amount, List<Integer> billValues, List<Integer> numberOfBills) {
		System.out.println("Dividindo R$ " + amount + " em notas de R$ 100, "
				+ "R$ 50, R$ 20, R$ 10, R$ 5, R$ 2, R$ 1");
		
		for (int i = 0; i < numberOfBills.size(); i++) {
			System.out.println("Notas de R$ " +  billValues.get(i) + ": "
					+ numberOfBills.get(i));
		}
	}
	
	public static List<Integer> getBillDistribution(int amount, List<Integer> billValues) {
		ArrayList<Integer> numberOfBills = new ArrayList<>();
		
		for (int value : billValues) {
			numberOfBills.add(amount / value);
			amount %= value;
		}
		
		return numberOfBills;
	}
	
}
