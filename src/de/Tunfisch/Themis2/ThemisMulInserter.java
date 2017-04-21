package de.Tunfisch.Themis2;

import java.util.LinkedList;

public class ThemisMulInserter {
	
	LinkedList<String> processed;

	public LinkedList<String> insertMul(LinkedList<String> inputll){
		System.out.println("Inserter: Entering Inserter...");
		for (int i = 0; i < inputll.size(); i++) {
			
			if (inputll.get(i).equals(")") &&
				inputll.get(i+1).contains("0") ||
				inputll.get(i+1).contains("1") ||
				inputll.get(i+1).contains("2") ||
				inputll.get(i+1).contains("3") ||
				inputll.get(i+1).contains("4") ||
				inputll.get(i+1).contains("5") ||
				inputll.get(i+1).contains("6") ||
				inputll.get(i+1).contains("7") ||
				inputll.get(i+1).contains("8") ||
				inputll.get(i+1).contains("9") ||
				inputll.get(i+1).equals("PI")  ||
				inputll.get(i+1).equals("E")   ||
				inputll.get(i+1).equals("pow") ||
				inputll.get(i+1).equals("prc") ||
				inputll.get(i+1).equals("(")   ||
				inputll.get(i+1).equals("log") ||
				inputll.get(i+1).equals("ln")  ||
				inputll.get(i+1).equals("sin") ||
				inputll.get(i+1).equals("cos") ||
				inputll.get(i+1).equals("tan")) {
				
				System.out.println("");
				
				inputll.add(i, "mul");
			}
			processed = inputll;
		}
	
		
		return processed;
	}
	
}
