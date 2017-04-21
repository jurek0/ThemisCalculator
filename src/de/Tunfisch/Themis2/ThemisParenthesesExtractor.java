package de.Tunfisch.Themis2;

import java.util.LinkedList;

public class ThemisParenthesesExtractor {
	
	ThemisCalculator themiscalc = new ThemisCalculator();
	
	String result = "";
	String tempResult = "";
	LinkedList<String> input; //Gets processed
	LinkedList<String> insidePars = new LinkedList<>();
	boolean paranthesisIsOpen = false;

	public void ParanthesesExtractor(LinkedList<String> extInput){
		//DEBUG
		System.out.println("ParX: Entering Paranthesesextractor...");
		input = extInput;
		
		//Goes trough List backwards
		System.out.println("ParX: Going backwards");
		//parInput.size()-1 because otherwise an outofbounds-error would occur
		for (int i = input.size()-1; i >= 0; i--) {
			System.out.println("ParX: Element at position " + i + " is " + input.get(i));
			
			//Wenn das Element ein ( ist, wird die schleife umgekehrt abgespielt ab dieser Posotion
			//und abgespeichert
			if (input.get(i).equals("(")) {
				
				System.out.println("ParX: Found '(', going forward");
				
				for (int j = i; j < input.size(); j++) {
					System.out.println("ParX: Current element in forward-loop: " + input.get(j) + ", adding this element");
					insidePars.add(input.get(j));
					
					//there is an ) then stop the loop
					if (input.get(j).equals(")")) {
						input.set(j,"@");
						break;
					} else {
						input.set(j, "#");
					}
				}
				//Breaking the forward-loop
				break;
			}
		}
		
		
		
		//Testing both Lists
		System.out.println("ParX: Raw Insidepars: " + insidePars.toString());
		System.out.println("ParX: Whole List: " + input);
		
		//Shortening InsidePars
		insidePars.removeFirst();
		insidePars.removeLast();
		System.out.println("ParX: Cut Insidepars: " + insidePars.toString());
		
		//Whole calculation has to be made free from "#"
		for (int i = 0; i < 1; i++) {
			if (input.contains("#")) {
				for (int j = 0; j < input.size(); j++) {
					
					//The element is a #
					if (input.get(j).contains("#")) {
						input.remove(j);
					}
					
					//The element is an @
					if (input.get(j).contains("@")) {
						System.out.println("ParX: Sending term '" + insidePars + "' to Calculator");
						input.set(j, themiscalc.getCalc(insidePars).toString());
						System.out.println("ParX: Received answer from Calculator");
					}
				}
			} else {
				break;
			}
			i--;
		}
		
		System.out.println("ParX: Finished task with result: " + input.toString());
		System.out.println();
		
		
		
		insidePars.clear();
		
	}
	
	public LinkedList<String> getResult(){
		return input;
	}
	
	public void clearObj(){
		input.clear();
		insidePars.clear();
		result = "";
		tempResult = "";
	}
}
