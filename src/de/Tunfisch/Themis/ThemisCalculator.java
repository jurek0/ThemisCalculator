package de.Tunfisch.Themis;

public class ThemisCalculator {
	
	ThemisLookuper lookup = new ThemisLookuper();
	ThemisTasks task = new ThemisTasks();

	//Strings
	String savedParts;
	String sInput;
	String sResult;
	String[] input;
	String temp = "";
	
	//Doubles
	double nResult;
	
	public void calculate(String extSInput){
		sInput = extSInput;
		for (int i = 0; i < input.length; i++) {
			if (sInput.contains("add") || sInput.contains("sub") || sInput.contains("div") || sInput.contains("mul") || sInput.contains("prc")) {
				calculateSubOP(sInput);
			}
		}
	}
	
	public void calculateSubOP(String sInput){
		sInput = sInput.substring(2, sInput.length()-2);
		input = sInput.split(":");
		System.out.println("======Outputting subop from method========");

		for (int i = 0; i < input.length/2; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.println(input[j]);
				//============================================================================================
				//LOOKING FOR MULTIPLIKATION
				if (input[j].equals("mul") || input[i].equals("div") || input[i].equals("prc")){
					System.out.println("Subrechnung ist Punktrechnung");
					input =  task.CalculateDot(input);
				}
			}
			for (int j = 0; j < input.length/2; j++) {
				//=============================================================================================
				//LOOKING FOR ADDITION
				if ((input[i].contains("add") || input[i].equals("sub")) && lookup.containsDots(input) == false && lookup.containsQ(input) == false) {
					System.out.println("Subrechnung ist Strichrechnung");
					input = task.CalculateDash(input);
				}
			}

			for (int j = 0; j < input.length; j++) {
				
			}
			
			
		}
	}
}
