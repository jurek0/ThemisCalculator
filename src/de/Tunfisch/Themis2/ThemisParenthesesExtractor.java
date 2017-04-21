package de.Tunfisch.Themis2;

import java.util.LinkedList;

public class ThemisParenthesesExtractor {
	
	ThemisCalculator themiscalc = new ThemisCalculator();
	
	String result = "";
	String tempResult = "";
	LinkedList<String> processable; //Gets processed
	LinkedList<String> insidePars = new LinkedList<>();
	boolean paranthesisIsOpen = false;

	public void ParanthesesExtractor(LinkedList<String> extInput){
		//DEBUG
		System.out.println("ParX: Entering Paranthesesextractor...");
		processable = extInput;
		
		//Goes trough List backwards
		System.out.println("ParX: Going backwards");
		//parInput.size()-1 because otherwise an outofbounds-error would occur
		for (int i = processable.size()-1; i >= 0; i--) {
			System.out.println("ParX: Element at position " + i + " is " + processable.get(i));
			
			//Wenn das Element ein ( ist, wird die schleife umgekehrt abgespielt ab dieser Posotion
			//und abgespeichert
			if (processable.get(i).equals("(")) {
				
				System.out.println("ParX: Found '(', going forward");
				
				for (int j = i; j < processable.size(); j++) {
					System.out.println("ParX: Current element in forward-loop: " + processable.get(j) + ", adding this element");
					insidePars.add(processable.get(j));
					
					//there is an ) then stop the loop
					if (processable.get(j).equals(")")) {
						processable.set(j,"@");
						break;
					} else {
						processable.set(j, "#");
					}
				}
				//Breaking the forward-loop
				break;
			}
		}
		
		
		
		//Testing both Lists
		System.out.println("ParX: Raw Insidepars: " + insidePars.toString());
		System.out.println("ParX: Whole List: " + processable);
		
		//Shortening InsidePars
		insidePars.removeFirst();
		insidePars.removeLast();
		System.out.println("ParX: Cut Insidepars: " + insidePars.toString());
		
		//Whole calculation has to be made free from "#"
		for (int i = 0; i < 1; i++) {
			if (processable.contains("#")) {
				for (int j = 0; j < processable.size(); j++) {
					
					//The element is a #
					if (processable.get(j).contains("#")) {
						processable.remove(j);
					}
					
					//The element is an @
					if (processable.get(j).contains("@")) {
						
						for (int ctr = 0; ctr < insidePars.size(); ctr++) {
						if ((	insidePars.contains("mul") || insidePars.contains("div") || insidePars.contains("add") 
						     || insidePars.contains("sub") || insidePars.contains("pow") || insidePars.contains("prc") 
						     || insidePars.contains("sqrt") || insidePars.contains("cbrt") || insidePars.contains("sin") 
						     || insidePars.contains("cos") || insidePars.contains("tan") || insidePars.contains("log") || insidePars.contains("ln"))){ 
							System.out.println("Solver: insidePars do contain operators");
								insidePars = themiscalc.getCalc(insidePars);
								ctr--;
							} else {
								processable.set(j, insidePars.toString().substring(1, insidePars.toString().length()-1));
							}
						}
					}
				}
			} else {
				break;
			}
			i--;
		}
		
		System.out.println("ParX: Finished task with result: " + processable.toString());
		System.out.println();
		
		
		
		insidePars.clear();
		
	}
	
	public LinkedList<String> getResult(){
		return processable;
	}
	
	public void clearObj(){
		processable.clear();
		insidePars.clear();
		result = "";
		tempResult = "";
	}
}
