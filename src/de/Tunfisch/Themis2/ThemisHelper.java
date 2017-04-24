package de.Tunfisch.Themis2;

import java.util.LinkedList;

import de.Tunfisch.GUI.buttons.OtherButtons;

public class ThemisHelper {

	OtherButtons otherbtns = new OtherButtons();
	boolean containsOPS = false;
	double degreeResult = 0;
	
	public boolean LLContainsAnyOperators(LinkedList<String> toCheck){
		
		if (toCheck.contains("mul") || toCheck.contains("div") || toCheck.contains("add") || toCheck.contains("sub") || toCheck.contains("pow")
		 || toCheck.contains("prc") || toCheck.contains("sqrt") || toCheck.contains("cbrt") || toCheck.contains("sin") || toCheck.contains("cos")
		 || toCheck.contains("tan") || toCheck.contains("log") || toCheck.contains("ln") || toCheck.contains("fac")) {
			containsOPS = true;
		}
		return containsOPS;
	}
	
	public boolean LLContainsParantheses(LinkedList<String> toCheck){
		if (toCheck.contains(")") || toCheck.contains("(")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean isOperator(String toCheck){
		
		if (toCheck.equals("mul") || toCheck.equals("div") || toCheck.equals("add") || toCheck.equals("sub") || toCheck.equals("pow")
		 || toCheck.equals("prc") || toCheck.equals("sqrt") || toCheck.equals("cbrt") || toCheck.equals("sin") || toCheck.equals("cos")
		 || toCheck.equals("tan") || toCheck.equals("log") || toCheck.equals("ln") || toCheck.contains("fac")) {
			containsOPS = true;
		}
		return containsOPS;
	}
	
	public double getDegreeFromRadial(double input){
		
		degreeResult = ((2*Math.PI/360)*input)*2;
		
		return degreeResult;
	}
	
	public boolean askHelperIfDegreeIsSelected(){
		
		System.out.println("Helper: Degree is set: " + otherbtns.btnDeg.isVisible());
		
		return otherbtns.btnDeg.isVisible();
	}
	public int countBracketClose(LinkedList<String> toCheck){
		int closedBrackets = 0;
		
		for (String string : toCheck) {
			if (string.contains(")")) {
				closedBrackets++;
			}
		}
		return closedBrackets;
	}
	
	public int countBracketOpen(LinkedList<String> toCheck){
		int openingBrackets = 0;
		
		for (String string : toCheck) {
			if (string.contains("(")) {
				openingBrackets++;
			}
		}
		return openingBrackets;
	}
	
}