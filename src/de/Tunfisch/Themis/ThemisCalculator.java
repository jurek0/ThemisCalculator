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
	
	public void calculateSubOP(String sInput){
		sInput = sInput.substring(2, sInput.length()-2);
		input = sInput.split(":");
		System.out.println("======Outputting subop from method========");
		
		for (String string : input) {
			System.out.println(string);
		}
		
		System.out.println("===========================================");

		System.out.println("Input-Länge: " + (input.length/2));
		//for (int i = 0; i < input.length; i++) {
		int i = 0;
		do {
			double input1 = 0, input2 = 0, result = 0;
			temp = "";
			//MULTIPLIKATION
			if(input[i].equals("mul")){
				input1 = Double.parseDouble(input[i-1]);
				input2 = Double.parseDouble(input[i+1]);
				
				result = input1 * input2;
				
				System.out.println(result);
				
				input[i-1] = ":";
				input[i] = ":";
				input[i+1] = Double.toString(result);
				
			}
			
			//DIVISION
			if(input[i].equals("div")){
				input1 = Double.parseDouble(input[i-1]);
				input2 = Double.parseDouble(input[i+1]);
				
				result = input1 / input2;
				
				System.out.println(result);
				
				input[i-1] = ":";
				input[i] = ":";
				input[i+1] = Double.toString(result);
			}
			
			//PERCENTAGE
			if(input[i].equals("prc")){
				input1 = Double.parseDouble(input[i-1]);
				input2 = Double.parseDouble(input[i+1]);
				
				result = (input2/100)*input1;
				
				System.out.println(result);
				
				input[i-1] = ":";
				input[i] = ":";
				input[i+1] = Double.toString(result);
			}
			
			//POWER
			if(input[i].equals("pow")){
				input1 = Double.parseDouble(input[i-1]);
				input2 = Double.parseDouble(input[i+1]);
				
				result = Math.pow(input1, input2);
				
				System.out.println(result);
				
				input[i-1] = ":";
				input[i] = ":";
				input[i+1] = Double.toString(result);
			}
			
			//LOG
			if(input[i].equals("log")){
				input1 = Double.parseDouble(input[i+1]);
				
				result = Math.log10(input1);
				
				System.out.println(result);
			}
			
			//LN
			if(input[i].equals("ln")){
				input1 = Double.parseDouble(input[i+1]);
				
				result = Math.log(input1);
				
				System.out.println(result);
			}
			
			//SIN in radians
			if(input[i].equals("sin")){
				input1 = Double.parseDouble(input[i+1]);
				
				result = Math.sin(input1);
				
				System.out.println(result);
			}
			
			//COS in radians
			if(input[i].equals("cos")){
				input1 = Double.parseDouble(input[i+1]);
				
				result = Math.cos(input1);
				
				System.out.println(result);
			}
			
			//TAN in radians
			if(input[i].equals("tan")){
				input1 = Double.parseDouble(input[i+1]);
				
				result = Math.tan(input1);
				
				System.out.println(result);
			}
			
			//ADDITION
			if(input[i].equals("add") && lookup.containsDots(input) == false){
				input1 = Double.parseDouble(input[i-1]);
				input2 = Double.parseDouble(input[i+1]);
				
				result = input1 + input2;
				
				System.out.println(result);
				
				input[i-1] = ":";
				input[i] = ":";
				input[i+1] = Double.toString(result);
			}
			
			//SUBTRACTION
			if(input[i].equals("sub") && lookup.containsDots(input) == false){
				input1 = Double.parseDouble(input[i-1]);
				input2 = Double.parseDouble(input[i+1]);
				
				result = input1 - input2;
				
				System.out.println(result);
				
				input[i-1] = ":";
				input[i] = ":";
				input[i+1] = Double.toString(result);
			}
			
			if (input[i].equals(":")) {
				try {
					input[i] = input[i+1];
					input[i+1] = ":";
				} catch (Exception e) {}
			}	
			
			for (String string : input) {
				temp = temp + string;
			}
			i++;
		} while (temp.contains("add") || temp.contains("sub") || temp.contains("mul") || temp.contains("div") || temp.contains("prc") || 
				temp.contains("cos") || temp.contains("tan") || temp.contains("sin") || temp.contains("log") || temp.contains("ln") || 
				temp.contains("pow") ||  temp.contains(":")); //ENDE
	}
}
