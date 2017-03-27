package de.Tunfisch.Themis2;

import java.util.LinkedList;
import java.util.Queue;

public class ThemisSolver {

	Queue<String> inputQueue = new LinkedList<String>();
	String[] tempInput;
	
	public void calculate(String toSolve){
		
		//ADDING BRACKETS TO PROVE BETTER FUNCTION	
				//toSolve = "(" + toSolve;
				//toSolve = toSolve + ")";
				
				 //REPLACE
				toSolve = toSolve.replace("+", " add ");
				toSolve = toSolve.replace("-", " sub ");
				toSolve = toSolve.replace("*", " mul ");
				toSolve = toSolve.replace("/", " div ");
				toSolve = toSolve.replace("%", " prc ");
				toSolve = toSolve.replace("rad(", " rad( ");
				toSolve = toSolve.replace("^(", " pow( ");
				toSolve = toSolve.replace("sin(", " sin ");
				toSolve = toSolve.replace("cos(", " cos( ");
				toSolve = toSolve.replace("tan(", " tan( ");
				toSolve = toSolve.replace("e", " E ");
				toSolve = toSolve.replace("PI", " PI ");
				toSolve = toSolve.replace("log(", " log( ");
				toSolve = toSolve.replace("ln(", " ln( ");
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
				for (String string : tempInput) {
					inputQueue.add(string);
				}
				
		
				
				
				//Some debugging stuff
				//inputQueue.add(toSolve);
				System.out.println(inputQueue.toString());
				System.out.println("Head: "+inputQueue.peek());
				//Ende der Operation
				inputQueue.clear();
		

	}
	
}
