public class Calculator {

	String input = null;
	String result = null;
	String operator = null;
	String prefix = null;
	String[] inputRTU = new String[2];
	boolean[] isNegative = new boolean[2];
	double NumInput1, NumInput2, NumResult;
	

	
	// BASIC CALCULATION
	public void basicCalculation(String extInput){
		input = extInput;
		
	//Comma to Point + trimming + deleting last Result
		input.trim();
		result = null;
		NumResult = 0;
	
	//Searching for Operators
	
		if(input.startsWith("W"))	{prefix = "W"; input = input.substring(1);} 
		if(input.startsWith("sin"))	{prefix = "sin"; input = input.substring(3);}
		if(input.startsWith("cos"))	{prefix = "cos"; input = input.substring(3);}
		if(input.startsWith("tan"))	{prefix = "tan"; input = input.substring(3);}
		if(input.startsWith("!")) 	{prefix = "!"; input = input.substring(1);}
		
	
	
	try {
		if(input.contains("+")){operator = "+"; inputRTU = input.split("\\+");}
		if(input.contains("-")){operator = "-"; inputRTU = input.split("\\-");}
		if(input.contains("*")){operator = "*"; inputRTU = input.split("\\*");}
		if(input.contains("/")){operator = "/"; inputRTU = input.split("\\/");}
		if(input.contains("%")){operator = "%"; inputRTU = input.split("\\%");}
		if(input.contains("^")){operator = "^"; inputRTU = input.split("\\^");}	
		if(operator.equals("!")){inputRTU[0] = input; inputRTU[1] = "1";}
		
	} catch (Exception e) {
		inputRTU[0] = input;
		inputRTU[1] = "0";
		operator = "SE";
	}
	
	if(inputRTU[0].contains("n")) {isNegative[0] = true; inputRTU[0].replaceAll("n", "");}
	if(inputRTU[1].contains("n")) {isNegative[1] = true; inputRTU[1].replaceAll("n", "");}
	
	//Parsing
	
	NumInput1 = Double.parseDouble(inputRTU[0]);
		if (isNegative[0] == true){NumInput1=0-NumInput1;}
	NumInput2 = Double.parseDouble(inputRTU[1]);
	if (isNegative[1] == true){NumInput2=0-NumInput2;}
	
	//Mega-loop
	if (operator.equals("+")) {					//ADDITION
		NumResult = NumInput1 + NumInput2;
	} else if (operator.equals("-")) {			//SUBTRACTION
		NumResult = NumInput1 - NumInput2;
	} else if (operator.equals("*")) {			//MULTIPLICATION
		NumResult = NumInput1 * NumInput2;
	} else if (operator.equals("/")) {			//DIVISION
		NumResult = NumInput1 / NumInput2;
	} else if (operator == "^2") {				//NOT USED
		NumResult = Math.pow(NumInput1, 2);
	} else if (operator.equals("^")) {			//POW
		NumResult = Math.pow(NumInput1, NumInput2);
	} else if (operator.equals("%")){			//N PERCENT OF X
		NumResult = (NumInput2/100)*NumInput1;
	} else if (operator.equals("SE")) { 		//NOTHNG, ONLY ONE NUMBER
		NumResult = NumInput1;
	} else {
		System.out.println("Fehler");
	}
		
	//Second loop for prefixes
	try{
	if (prefix.equals("W"))	{NumResult = Math.sqrt(NumResult);}
	if (prefix.equals("!")) {NumResult = faculty(NumResult);}
	if (prefix.equalsIgnoreCase("sin")) {NumResult = Math.sin(NumResult);}
	if (prefix.equalsIgnoreCase("cos")) {NumResult = Math.cos(NumResult);}
	if (prefix.equalsIgnoreCase("tan")) {NumResult = Math.tan(NumResult);}
	
	} catch (Exception e) {}

	//Parsing back to String
		result = Double.toString(NumResult);
		NumResult = 0;
		
	//Setting prefix back to null
		prefix = null;
		
	}
	//Basic Calculation over.
	public double faculty(double extInput){
		double result = 1;
		for (int i = 1; i <=extInput ; i++) {
			result = result * i;
			}
		return result;
		
	}
	
	//And now, you're going to - well, not die, but writing some text to the Result-field
	public String getTextResult(){
		return result;
	}
	
}
