package de.Tunfisch.Themis2;

import java.util.LinkedList;

public class ThemisSolver {

	LinkedList<String> inputll= new LinkedList<>(); 
	String[] tempInput;
	boolean isDegree;
	String finalResult;
	
	public void calculate(String toSolve, boolean isDegree){
				
				 //REPLACE
				toSolve = toSolve.replace(",", ".");
				toSolve = toSolve.replace("+", " add ");
				toSolve = toSolve.replace("-", " sub ");
				toSolve = toSolve.replace("*", " mul ");
				toSolve = toSolve.replace("/", " div ");
				toSolve = toSolve.replace("%", " prc ");
				toSolve = toSolve.replace("sqrt(", " sqrt ");
				toSolve = toSolve.replace("cbrt(", " cbrt ");
				toSolve = toSolve.replace("^(", " pow ");
				toSolve = toSolve.replace("!(", " fac ");
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
				
				toSolve = toSolve.replace("  ", " ");
				if (toSolve.startsWith(" ")) {
					toSolve = toSolve.substring(1, toSolve.length());
				}
				if (toSolve.endsWith(" ")) {
					toSolve = toSolve.substring(0, toSolve.length()-1);
				}
				tempInput = toSolve.split(" ");
				
				for (int i = 0; i < tempInput.length; i++) {
					inputll.add(tempInput[i]);
					}
				
				System.out.println("Ganze List als String: "+inputll.toString());
				
				for (int j = 0; j < 2; j++) {
					
					//Möglichkeit 1: Liste Enthält noch Operatoren
					if(inputll.contains("mul") || inputll.contains("div") || inputll.contains("sub") || inputll.contains("add") || inputll.contains("pow")
							|| inputll.contains("prc") || inputll.contains("sqrt") || inputll.contains("cbrt") 
							|| inputll.contains("ln") || inputll.contains("log") || inputll.contains("sin")
							|| inputll.contains("cos") || inputll.contains("tan") || inputll.contains("fac")){
						for (int i = 0; i < inputll.size(); i++) {
							System.out.println("Aktuelles Objekt: "+inputll.get(i));
							inputll = getCalc(inputll, i, isDegree);
						}
						j--;
						//Andere Möglichkeit: Liste enthält keine Operatoren mehr
					} else {
						j = 2;
						System.out.println("Finales Ergebnis: " + inputll.toString());
					}
				}
				
				System.out.println("Liste als String am Ende: "+inputll.toString());
				finalResult = inputll.toString();
				finalResult = finalResult.substring(1, finalResult.length()-1);
				
				//Ende der Operation
				inputll.clear();
	}
	
	 LinkedList<String> getCalc(LinkedList<String> inputll, int i, boolean isDegree){
			
		//MULTIPLICATION
		if (inputll.get(i).equals("mul")) {
			double tempIN1 = 0;
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("eins drunter: " + inputll.get(i-1));
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN1 = Double.parseDouble(inputll.get(i-1));
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = tempIN1 * tempIN2;
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			inputll.remove(i-1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		
		//DIVISION
		if (inputll.get(i).equals("div")) {
			double tempIN1 = 0;
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("eins drunter: " + inputll.get(i-1));
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN1 = Double.parseDouble(inputll.get(i-1));
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = tempIN1 / tempIN2;
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			inputll.remove(i-1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		//POWER
		if (inputll.get(i).equals("pow")) {
			double tempIN1 = 0;
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("eins drunter: " + inputll.get(i-1));
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN1 = Double.parseDouble(inputll.get(i-1));
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = Math.pow(tempIN1, tempIN2);
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			inputll.remove(i-1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		//PERCENTAGE
		if (inputll.get(i).equals("prc")) {
			double tempIN1 = 0;
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("eins drunter: " + inputll.get(i-1));
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN1 = Double.parseDouble(inputll.get(i-1));
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = (tempIN2/100)*tempIN1;
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			inputll.remove(i-1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		
		//NATURAL LOGARITHM
		if (inputll.get(i).equals("ln")) {
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = Math.log(tempIN2);
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		
		//10 LOGARITHM
		if (inputll.get(i).equals("log")) {
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = Math.log10(tempIN2);
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		
		//SQUAREROOT
		if (inputll.get(i).equals("sqrt")) {
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = Math.sqrt(tempIN2);
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		
		//CUBICROOT
		if (inputll.get(i).equals("cbrt")) {
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = Math.cbrt(tempIN2);
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		
		//SINUS
		if (inputll.get(i).equals("sin")) {
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = Math.sin(tempIN2);
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		
		//COSINUS
		if (inputll.get(i).equals("cos")) {
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = Math.cos(tempIN2);
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		
		//TANGENS
		if (inputll.get(i).equals("tan")) {
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = Math.tan(tempIN2);
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		
		//FACULTY
		if (inputll.get(i).equals("fac")) {
			double tempIN2 = 0;
			double tempOUT = 1;
			System.out.println("------------------------");
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			for (int j = 1; j < tempIN2; j++) {
				tempOUT = tempOUT*j;
			}
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		
		//ADDITION
		if (inputll.get(i).equals("add") && !(inputll.contains("mul") ||inputll.contains("div") || inputll.contains("pow")
				|| inputll.contains("prc") || inputll.contains("sqrt") || inputll.contains("cbrt") || inputll.contains("ln") 
				|| inputll.contains("log")  || inputll.contains("sin") || inputll.contains("cos") || inputll.contains("tan")
				|| inputll.contains("fac"))) {
			double tempIN1 = 0;
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("eins drunter: " + inputll.get(i-1));
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN1 = Double.parseDouble(inputll.get(i-1));
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = tempIN1 + tempIN2;
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			inputll.remove(i-1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
		
		//SUBTRACTION
		if (inputll.get(i).equals("sub") && !(inputll.contains("mul") ||inputll.contains("div") || inputll.contains("pow")
				|| inputll.contains("prc") || inputll.contains("sqrt") || inputll.contains("cbrt") || inputll.contains("ln") 
				|| inputll.contains("log")  || inputll.contains("sin") || inputll.contains("cos") || inputll.contains("tan")
				|| inputll.contains("fac"))) {
			double tempIN1 = 0;
			double tempIN2 = 0;
			double tempOUT = 0;
			System.out.println("------------------------");
			System.out.println("eins drunter: " + inputll.get(i-1));
			System.out.println("Aktuelles Objekt: " + inputll.get(i));
			System.out.println("eins drüber: " + inputll.get(i+1));
			System.out.println("------------------------");
			
			tempIN1 = Double.parseDouble(inputll.get(i-1));
			tempIN2 = Double.parseDouble(inputll.get(i+1));
			
			tempOUT = tempIN1 - tempIN2;
			
			System.out.println("Ergebnis: " + tempOUT);
			
			System.out.println("I: "+i);
			System.out.println(inputll.toString());
			inputll.set(i, Double.toString(tempOUT));
			System.out.println(inputll.toString());
			inputll.remove(i+1);
			System.out.println(inputll.toString());
			inputll.remove(i-1);
			System.out.println(inputll.toString());
			return inputll;
			} else {}
	
		

		return inputll;	
		
	}
	 
	 public String getResult(){
		 return finalResult;
	 }
	
}
