package de.Tunfisch.Themis;

public class ThemisCalculator {
	
	ThemisLookuper lookup = new ThemisLookuper();

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
		
		
		for (int i = 0; i < input.length; i++) {
			double input1, input2, result = 0;
			
			//LOOKING FOR MULTIPLIKATION
			if (input[i].equals("mul") || input[i].equals("div") || input[i].equals("prc")){
				System.out.println("Subrechnung ist Punktrechnung");
				
				//Parsing
				input1 = Double.parseDouble(input[i-1]);
				input2 = Double.parseDouble(input[i+1]);
				
				
				//Calculating
				if(input[i].equals("mul")) {result = input1 * input2;}
				if(input[i].equals("div")) {result = input1 / input2;}
				if(input[i].equals("prc")) {result = (input2/100)*input1;}
				
				//Parsing back and inserting
				input[i-1] = "q";
				input[i]   = "q";
				input[i+1] = Double.toString(result);
				System.out.println(Double.toString(result));
				
				System.out.println("Verbleibende rechnung ----");
				for (String string : input) {
					System.out.println(string);
				}
				System.out.println("---------------------------");
				
				//LOOKING FOR Qs
				if (lookup.containsQ(input) == true) {
					String s = "";
					int QCount = 0;
					for (int j = 0; j < input.length; j++) {
						s = s + input[j] + ":";	
						if(input[j].contains("q"))	{QCount++;}			
						}
					System.out.println(s);
					s = s.replace("q:", "");
					s = s.substring(0, s.length()-1);
					System.out.println(s);
					
					input = new String[input.length-QCount];
					
					input = s.split(":");
					
					System.out.println("_____nextInput_____");
					for (String string : input) {
						System.out.println(string);
					}
					System.out.println("FINISED CYCLE");
				}
			}
			
			
				
			//LOOKING FOR ADDITION
			if ((input[i].contains("add") || input[i].equals("sub")) && lookup.containsDots(input) == false && lookup.containsQ(input) == false) {
				System.out.println("Subrechnung ist Strichrechnung");
				String string = "";
				
				for (int j = 0; j < input.length; j++) {
					string = input[j];
					System.out.println(string + " <--Input  Counter--> " + j);
					
					if (input[j].contains("add")){
						//PARSING
						input1 = Double.parseDouble(input[j-1]);
						input2 = Double.parseDouble(input[j+1]);
						
						//CALCULATING
						result = input1 + input2;
						
						//BACKPARSING
						input[j-1] = "q";
						input[j]   = "q";
						input[j+1] = Double.toString(result);
					}
					if (input[j].contains("sub")){
						//PARSING
						input1 = Double.parseDouble(input[j-1]);
						input2 = Double.parseDouble(input[j+1]);
						
						//CALCULATING
						result = input1 - input2;
						
						//BACKPARSING
						input[j-1] = "q";
						input[j]   = "q";
						input[j+1] = Double.toString(result);
					}
				}
				for (String s2 : input) {
					System.out.println(s2);
				}
			}
			
			
			/**
			if ((input[i].equals("mul") || input[i].equals("div") && lookup.containsDash(input) == true && lookup.containsDots(input) == false)){
				System.out.println("Subrechnung ist Punktrechnung");
				
				//Parsing
				input1 = Double.parseDouble(input[i-1]);
				input2 = Double.parseDouble(input[i+1]);
				
				
				//Calculating
				if(input[i].equals("add")) {result = input1 + input2;}
				if(input[i].equals("sub")) {result = input1 - input2;}
				
				//Parsing back and inserting
				input[i-1] = "q";
				input[i]   = "q";
				input[i+1] = Double.toString(result);
				System.out.println(Double.toString(result));
				
				System.out.println("Verbleibende rechnung ----");
				for (String string : input) {
					System.out.println(string);
				}
				System.out.println("---------------------------");
			}
			*/
			
			//sResult = input[0];
			//System.out.println("Sresult: "+sResult);
		}
	}
}
