package de.Tunfisch.Themis2;

import java.util.LinkedList;

public class ThemisCalculator {
	
	boolean isDegree = false;
	
	//Setting isDegree central
	public void setIsDegree(boolean extIsDegree){
		isDegree = extIsDegree;
	}


	//Method which calculates and respects point for line
	 public LinkedList<String> getCalc(LinkedList<String> inputll){
			
		 System.out.println("CalcX: Entering Calculator...");
		 
		 for (int i = 0; i < inputll.size(); i++) {
			 
			//DOT-TRI-PART-SUBCALCULATION (NUMBER OPERATOR NUMBER)
			if (inputll.get(i).equals("mul") || inputll.get(i).equals("div")  || inputll.get(i).equals("pow") || inputll.get(i).equals("prc") ) {
				double tempIN1 = 0;
				double tempIN2 = 0;
				double tempOUT = 0;
				System.out.println("------------------------");
				System.out.println("CalcX: eins drunter: " + inputll.get(i-1));
				System.out.println("CalcX: Aktuelles Objekt: " + inputll.get(i));
				System.out.println("CalcX: eins drüber: " + inputll.get(i+1));
				System.out.println("------------------------");
				
				//Checking for irrational numbers on input 1 and parsing
				if (inputll.get(i-1).equals("PI")) {
					tempIN1 = Math.PI;
				} else if (inputll.get(i-1).equals("E")) {
					tempIN1 = Math.E;
				} else {
					tempIN1 = Double.parseDouble(inputll.get(i-1));
				}
				
				//Checking for irrational numbers on input 2 and parsing
				if (inputll.get(i+1).equals("PI")) {
					tempIN2 = Math.PI;
				} else if (inputll.get(i+1).equals("E")) {
					tempIN2 = Math.E;
				} else {
					tempIN2 = Double.parseDouble(inputll.get(i+1));
				}

				//MULTIPLICATION
				if (inputll.get(i).equals("mul")) {
					tempOUT = tempIN1 * tempIN2;
				}
				
				//DIVISION
				if (inputll.get(i).equals("div")) {
					tempOUT = tempIN1 / tempIN2;
				}
				
				//POWER
				if (inputll.get(i).equals("pow")) {
					tempOUT = Math.pow(tempIN1, tempIN2);
				}
				
				//N PERCENT OF X
				if (inputll.get(i).equals("prc")) {
					tempOUT = (tempIN2/100)*tempIN1;
				}
				
				
				System.out.println("CalcX: Ergebnis: " + tempOUT);
				
				System.out.println("CalcX: I: "+i);
				System.out.println(inputll.toString());
				inputll.set(i, Double.toString(tempOUT));
				System.out.println(inputll.toString());
				inputll.remove(i+1);
				System.out.println(inputll.toString());
				inputll.remove(i-1);
				System.out.println(inputll.toString());
				return inputll;
				} 
			
			//DOT-DUAL-PART-SUBCALCULATION (OPERATOR NUMBER)
			if (inputll.get(i).equals("ln") || inputll.get(i).equals("log") || inputll.get(i).equals("sqrt") || inputll.get(i).equals("cbrt")) {
				double tempIN2 = 0;
				double tempOUT = 0;
				System.out.println("------------------------");
				System.out.println("CalcX: Aktuelles Objekt: " + inputll.get(i));
				System.out.println("CalcX: eins drüber: " + inputll.get(i+1));
				System.out.println("------------------------");
				
				//Checking for irrational numbers on input 2 and parsing
				if (inputll.get(i+1).equals("PI")) {
					tempIN2 = Math.PI;
				} else if (inputll.get(i+1).equals("E")) {
					tempIN2 = Math.E;
				} else {
					tempIN2 = Double.parseDouble(inputll.get(i+1));
				}
				
				//NATURAL LOGARITHM
				if (inputll.get(i).equals("ln")) {
					tempOUT = Math.log(tempIN2);
				}
				
				//10 LOGARITHM
				if (inputll.get(i).equals("log")) {
					tempOUT = Math.log10(tempIN2);
				}
				
				//SQUAREROOT
				if (inputll.get(i).equals("sqrt")) {
					tempOUT = Math.sqrt(tempIN2);
				}
				
				//CUBICROOT
				if (inputll.get(i).equals("cbrt")) {
					tempOUT = Math.cbrt(tempIN2);
				}
				
				System.out.println("CalcX: Ergebnis: " + tempOUT);
				
				System.out.println("CalcX: I: "+i);
				System.out.println(inputll.toString());
				inputll.set(i, Double.toString(tempOUT));
				System.out.println(inputll.toString());
				inputll.remove(i+1);
				System.out.println(inputll.toString());
				return inputll;
				}
			
			//LINE-TRI-PART-SUBCALCULATION (NUMBER OPERATOR NUMBER)
			if ((inputll.get(i).equals("add") || inputll.get(i).equals("sub")) && !((inputll.contains("mul") ||inputll.contains("div") || inputll.contains("pow")
					|| inputll.contains("prc") || inputll.contains("sqrt") || inputll.contains("cbrt") || inputll.contains("ln") 
					|| inputll.contains("log")))) {
				double tempIN1 = 0;
				double tempIN2 = 0;
				double tempOUT = 0;
				System.out.println("------------------------");
				System.out.println("CalcX: eins drunter: " + inputll.get(i-1));
				System.out.println("CalcX: Aktuelles Objekt: " + inputll.get(i));
				System.out.println("CalcX: eins drüber: " + inputll.get(i+1));
				System.out.println("------------------------");
				
				//Checking for irrational numbers on input 1 and parsing
				if (inputll.get(i-1).equals("PI")) {
					tempIN1 = Math.PI;
				} else if (inputll.get(i-1).equals("E")) {
					tempIN1 = Math.E;
				} else {
					tempIN1 = Double.parseDouble(inputll.get(i-1));
				}
				
				//Checking for irrational numbers on input 2 and parsing
				if (inputll.get(i+1).equals("PI")) {
					tempIN2 = Math.PI;
				} else if (inputll.get(i+1).equals("E")) {
					tempIN2 = Math.E;
				} else {
					tempIN2 = Double.parseDouble(inputll.get(i+1));
				}
				
				//ADDITION
				if (inputll.get(i).equals("add")){
				tempOUT = tempIN1 + tempIN2;
				}
				
				//SUBSTRACTION
				if (inputll.get(i).equals("sub")){
					tempOUT = tempIN1 - tempIN2;
				}
				
				System.out.println("Ergebnis: " + tempOUT);
				
				System.out.println("CalcX: I: "+i);
				System.out.println(inputll.toString());
				inputll.set(i, Double.toString(tempOUT));
				System.out.println(inputll.toString());
				inputll.remove(i+1);
				System.out.println(inputll.toString());
				inputll.remove(i-1);
				System.out.println(inputll.toString());
				return inputll;
				} 
			 }
			System.out.println("CalcX: Finished task with result: " + inputll.toString());
			
		return inputll;	
		
	}
}
