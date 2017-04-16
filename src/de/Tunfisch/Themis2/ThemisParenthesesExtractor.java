package de.Tunfisch.Themis2;

import java.util.LinkedList;

public class ThemisParenthesesExtractor {
	
	ThemisCalculator themiscalc = new ThemisCalculator();
	
	String result = "";
	LinkedList<String> parInput = new LinkedList<>();
	LinkedList<String> insidePars = new LinkedList<>();
	int openingPar = 0;
	int closingPar = 0;
	boolean paranthesisIsOpen = false;
	
	//Fuck consoles
	public void ParanthesesExtractor(LinkedList<String> extParInput){
		parInput = extParInput;
		for (int i = 0; i <= parInput.size(); i++) {
			
			if (parInput.get(i).equals("(")) {
				paranthesisIsOpen = true;
			}
			if (parInput.get(i).equals(")")) {
				paranthesisIsOpen = false;
			}
			if (paranthesisIsOpen == true) {
				insidePars.add(parInput.get(i));
			}
			
		}
		
		//Testing both Lists
		System.out.println("Ganze List: " + parInput);
		System.out.println("Innere List: " + insidePars);
		
		//Calculating the inner List
		result = themiscalc.getCalc(insidePars, 0, false).toString();
		
	}
	
	public String getResult(){
		return result;
	}
}
