package de.Tunfisch.Themis2;

import java.util.LinkedList;

public class ThemisSolver {

	
	//Accessing the Calculator
	ThemisCalculator themisCalc = new ThemisCalculator();
	
	//Accessing the Parentheses Extractor
	ThemisParenthesesExtractor themisParEx = new ThemisParenthesesExtractor();
	
	//Accessing the Helper
	ThemisHelper helper = new ThemisHelper();
	
	//The funny LinkedList which is used to solve the Calculation
	LinkedList<String> inputll = new LinkedList<>(); 
	
	
	//Temporary intput as the name says
	String[] tempInput;
	
	//Result as string
	String finalResult = "";
	
	//Is the type of angle Calculation degree?
	boolean isDegree;
	
	//The Calculate-method, use this in your program. Needs a String to solve and a boolean isDegree
	public void calculate(String toSolve, String angleMode){
				
				//REPLACE operators with others, adding spaces. Needed for later Splitting up
				toSolve = toSolve.replace(",", ".");
				toSolve = toSolve.replace("+", " add ");
				toSolve = toSolve.replace("-", " sub ");
				toSolve = toSolve.replace("*", " mul ");
				toSolve = toSolve.replace("/", " div ");
				toSolve = toSolve.replace("%", " prc ");
				toSolve = toSolve.replace("sqrt", " sqrt ");
				toSolve = toSolve.replace("cbrt", " cbrt ");
				toSolve = toSolve.replace("^", " pow ");
				toSolve = toSolve.replace("sin", " sin ");
				toSolve = toSolve.replace("cos", " cos ");
				toSolve = toSolve.replace("tan", " tan ");
				toSolve = toSolve.replace("neg", " -");
				toSolve = toSolve.replace("e", " E ");
				toSolve = toSolve.replace("PI", " PI ");
				toSolve = toSolve.replace("log", " log ");
				toSolve = toSolve.replace("ln", " ln ");
				toSolve = toSolve.replace("(", " ( ");
				toSolve = toSolve.replace(")", " ) ");
				
				//If there are two spaces, remove one
				toSolve = toSolve.replace("  ", " ");
				
				//If String starts or ends with a space, remove it
				if (toSolve.startsWith(" ")) {
					toSolve = toSolve.substring(1, toSolve.length());
				}
				if (toSolve.endsWith(" ")) {
					toSolve = toSolve.substring(0, toSolve.length()-1);
				}
				
				//Split the String at the spaces and paste it into the Array tempinput
				tempInput = toSolve.split(" ");
				
				//Takes the elements in the array and put them into the Linked List to edit later
				for (int i = 0; i < tempInput.length; i++) {
					inputll.add(tempInput[i]);
					}
				
				System.out.println("Solver: Whole list as String: "+inputll.toString());
				
				
				//Maybe there are some muls missing. Adding them here
				for (int i = 0; i < inputll.size(); i++) {
					//Two brackets like this )(
					
				}

				
				//Loop checking for parantheses and operators and sending to calculator
				
				//I AM GOING THROUGH THIS LOOP TWO TIMES AS MUCH AS THE LIST IS LONG BECAUSE IT FIXES THE PROBLEM OF NOT 
				//CALCULATING THE WHOLE TERM IF I ONLY GOING THROUGH THE LOOP AS OFTEN AS THE TERM IS LONG
				for (int j = 0; j < inputll.size(); j++) {
					
					System.out.println("Solver: Entering check-loop for " + (j+1) + " time ===========================================");
					
					//Option 1: List contains parantheses
					if (inputll.contains(")") || inputll.contains("(")) {
						
						//Return String after solving one Parantheses
						System.out.println("Solver: Contains Parantheses");
						System.out.println("Solver: Sending command to Xtractor...");
						themisParEx.ParanthesesExtractor(inputll, angleMode);
						System.out.println("Solver: Pulling processed list...");
						inputll = themisParEx.getResult();
						System.out.println("Solver: Insertet to inputll: " + inputll.toString());
						
						
					} 
					//Option 2: List doesnt contains parantheses (anymore)
					if (!(inputll.contains("(") || inputll.contains(")")) && 
							   (inputll.contains("mul") || inputll.contains("div") || inputll.contains("add") 
						     || inputll.contains("sub") || inputll.contains("pow") || inputll.contains("prc") 
						     || inputll.contains("sqrt") || inputll.contains("cbrt") || inputll.contains("sin") 
						     || inputll.contains("cos") || inputll.contains("tan") || inputll.contains("log") || inputll.contains("ln"))){ 
						System.out.println("Solver: inputll does not contain any parantheses and contains operators");
							inputll = themisCalc.getCalc(inputll, angleMode);
							j--;
					}
					
				}
				
				System.out.println("Liste als String am Ende: "+inputll.toString());
				finalResult = inputll.toString();
				finalResult = finalResult.substring(1, finalResult.length()-1);
				
				//End of operation, clear the List that it is ready for next use
				inputll.clear();
				
				
		

	}
	
	 
	 //Returns the result as a string
	 public String getResult(){
		 return finalResult;
	 }
	 
	 public void clearObj(){
		 inputll.clear();
	 }
	
}
