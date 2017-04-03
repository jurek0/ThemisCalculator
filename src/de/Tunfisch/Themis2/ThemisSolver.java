package de.Tunfisch.Themis2;

import java.util.LinkedList;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class ThemisSolver {

	
	//Accessing the Calculator
	ThemisCalculator themisCalc = new ThemisCalculator();
	
	//The funny LinkedList which is used to solve the Calculation
	LinkedList<String> inputll = new LinkedList<>(); 
	
	
	//Temporary intput as the name says
	String[] tempInput;
	
	//Result as string
	String finalResult = "";
	
	//Is the type of angle Calculation degree?
	boolean isDegree;
	
	//The Calculate-method, use this in your program. Needs a String to solve and a boolean isDegree
	public void calculate(String toSolve, boolean isDegree){
				
				//REPLACE operators with others, adding spaces. Needed for later Splitting up
				toSolve = toSolve.replace(",", ".");
				toSolve = toSolve.replace("+", " add ");
				toSolve = toSolve.replace("-", " sub ");
				toSolve = toSolve.replace("*", " mul ");
				toSolve = toSolve.replace("/", " div ");
				toSolve = toSolve.replace("%", " prc ");
				toSolve = toSolve.replace("sqrt(", " sqrt ");
				toSolve = toSolve.replace("cbrt(", " cbrt ");
				toSolve = toSolve.replace("^(", " pow ");
				toSolve = toSolve.replace("sin(", " sin ");
				toSolve = toSolve.replace("cos(", " cos ");
				toSolve = toSolve.replace("tan(", " tan ");
				toSolve = toSolve.replace("neg", " -");
				toSolve = toSolve.replace("e", " E ");
				toSolve = toSolve.replace("PI", " PI ");
				toSolve = toSolve.replace("log(", " log ");
				toSolve = toSolve.replace("ln(", " ln ");
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
				
				System.out.println("Ganze List als String: "+inputll.toString());

				
				//Loop
				for (int j = 0; j < 2; j++) {
					
					//Option 1: List contains parantheses
					if (inputll.contains(")") || inputll.contains("(")) {
						
						//Some vars and so
						String betweenPars;
						String[] betweenParsTemp;
						LinkedList<String> ParInputll = new LinkedList<>();
						int closingPar = 0;
						int openingPar = 0;
						
						betweenPars = inputll.toString();
						System.out.println("Zwischen Klammern: "+betweenPars);
						
						//String in Array verwandeln, dann innerste klammer seperieren und in List umwandeln, List ausrechnen, ergebnis einsetzen
						betweenPars = betweenPars.replace(",", "");
						betweenPars = betweenPars.replace("[", "");
						betweenPars = betweenPars.replace("]", "");
						System.out.println(betweenPars);
						betweenParsTemp = betweenPars.split(" ");
						
						//No put this in the class called ThemisParenthesesExtractor
						
					} else { //Option 2: List doesnt contains parantheses (anymore)

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
	
}
