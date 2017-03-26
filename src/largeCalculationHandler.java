
public class largeCalculationHandler {

	String sOnlyOpsInput, sOnlyNumbersInput, sResult;
	CalculationHelper CHelper = new CalculationHelper();
	AdvancedCalculator aCalculator = new AdvancedCalculator();
	
	public void advancedCalculation(String extInput){
		
		sOnlyOpsInput = extInput;
		sOnlyNumbersInput = extInput;
				
		sOnlyNumbersInput=sOnlyNumbersInput.replace("+", "X");
		sOnlyNumbersInput=sOnlyNumbersInput.replace("-", "X");
		sOnlyNumbersInput=sOnlyNumbersInput.replace("*", "X");
		sOnlyNumbersInput=sOnlyNumbersInput.replace("/", "X");
		
		sOnlyOpsInput=sOnlyOpsInput.replace("0", "X");
		sOnlyOpsInput=sOnlyOpsInput.replace("1", "X");
		sOnlyOpsInput=sOnlyOpsInput.replace("2", "X");
		sOnlyOpsInput=sOnlyOpsInput.replace("3", "X");
		sOnlyOpsInput=sOnlyOpsInput.replace("4", "X");
		sOnlyOpsInput=sOnlyOpsInput.replace("5", "X");
		sOnlyOpsInput=sOnlyOpsInput.replace("6", "X");
		sOnlyOpsInput=sOnlyOpsInput.replace("7", "X");
		sOnlyOpsInput=sOnlyOpsInput.replace("8", "X");
		sOnlyOpsInput=sOnlyOpsInput.replace("9", "X");
		
		String[] parts = extractNumbers();
		String[] operators = extractOPs();
		
		
		for(String s : parts){
			System.out.println(s);
		}
		
		
		
		for(int i = 1; i < operators.length; i++){
			if (operators[i].equals("*")) {
				
				if (CHelper.isLine(operators[i-1])&&(CHelper.isLine(operators[i+1]))) {
					aCalculator.calculate(parts[i], parts[i+1]);
				}

				//System.out.println("Punktrechnung");	
			}
			else if (operators[i].equals("/")) {
				//System.out.println("Punktrechnung");	
				}
			else {
				// System.out.println("Strichrechnung");
			}
		}

		
		
		
	}
	
	String[] extractNumbers(){
		String parts[] = sOnlyNumbersInput.split("X");
		
		return parts;
	}
	String[] extractOPs(){
		String OPS[] = sOnlyOpsInput.split("X");
		
		return OPS;
	}
}
