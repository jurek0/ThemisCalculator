package de.Tunfisch.Themis;

public class ThemisTasks {
	
	ThemisLookuper lookup = new ThemisLookuper();
	
	String[] CalculateDot(String[] input){
		System.out.println("Entering dotcalculator...");
		double input1, input2, result = 0;
		
		for (int i = 0; i < input.length; i++) {
			
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
		return input;
		
	}
	
	String[] CalculateDash(String[] input){
		double input1, input2, result = 0;
		System.out.println("Entering dashcalculator...");
		
		for (int i = 0; i < input.length; i++) {
			
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
		return input;
		
	}
	
}
