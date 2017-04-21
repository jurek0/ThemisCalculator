import java.util.LinkedList;

import de.Tunfisch.Themis2.ThemisCalculator;

public class testfile {

	public static void main(String[] args) {
		testfile tf = new testfile();
		tf.run();
		
	}
	ThemisCalculator themis = new ThemisCalculator();
	TestCalculator tc = new TestCalculator();
	
	
	LinkedList<String> test = new LinkedList<>();
	LinkedList<String> result = new LinkedList<>();
	String sResult;
	public void run(){
		
		
		test.add("1");
		test.add("div");
		test.add("1");
		test.add("mul");
		test.add("2");
		
		System.out.println("Testfile: Liste: " + test.toString());
		
		//Loop
		
		for (int i = 0; i < 2; i++) {
			
			//Möglichkeit 1: Liste enthält noch operatoren
			if(test.contains("mul") || test.contains("div") || test.contains("sub") || test.contains("add") || test.contains("pow")
					|| test.contains("prc") || test.contains("sqrt") || test.contains("cbrt") 
					|| test.contains("ln") || test.contains("log")){
				//Loop 2, calls getCalc method to reduce the given List to the result
				for (int j = 0; i < test.size(); j++) {
					System.out.println("Aktuelles Objekt: "+test.get(j));
					test = getCalc(test, j, false);
				}
				i--;
				//Andere Möglichkeit: Liste enthält keine Operatoren mehr
			} else {
				i = 2;
				System.out.println("Finales Ergebnis: " + test.toString());
			}
				
				
				
			
		}
		
		
	}
	
	//Method which calculates and respects point for line
	 LinkedList<String> getCalc(LinkedList<String> inputll, int i, boolean isDegree){
		
				
				//MULTIPLICATION
				if (inputll.get(i).equals("mul")) {
					double tempIN1 = 0;
					double tempIN2 = 0;
					double tempOUT = 0;
					System.out.println("------------------------");
					System.out.println("eins drunter: " + inputll.get(i-1));
					System.out.println("Aktuelles Objekt: " + inputll.get(i));
					System.out.println("eins drüber: " + inputll.get(i+1));
					System.out.println("------------------------");
					
					tempIN1 = Double.parseDouble(inputll.get(i-1));
					tempIN2 = Double.parseDouble(inputll.get(i+1));
					
					tempOUT = tempIN1 * tempIN2;
					
					System.out.println("Ergebnis: " + tempOUT);
					
					System.out.println("I: "+i);
					System.out.println(inputll.toString());
					inputll.set(i, Double.toString(tempOUT));
					System.out.println(inputll.toString());
					inputll.remove(i+1);
					System.out.println(inputll.toString());
					inputll.remove(i-1);
					System.out.println(inputll.toString());
					return inputll;
					} else {}
				
				//DIVISION
				if (inputll.get(i).equals("div")) {
					double tempIN1 = 0;
					double tempIN2 = 0;
					double tempOUT = 0;
					System.out.println("------------------------");
					System.out.println("eins drunter: " + inputll.get(i-1));
					System.out.println("Aktuelles Objekt: " + inputll.get(i));
					System.out.println("eins drüber: " + inputll.get(i+1));
					System.out.println("------------------------");
					
					tempIN1 = Double.parseDouble(inputll.get(i-1));
					tempIN2 = Double.parseDouble(inputll.get(i+1));
					
					tempOUT = tempIN1 / tempIN2;
					
					System.out.println("Ergebnis: " + tempOUT);
					
					System.out.println("I: "+i);
					System.out.println(inputll.toString());
					inputll.set(i, Double.toString(tempOUT));
					System.out.println(inputll.toString());
					inputll.remove(i+1);
					System.out.println(inputll.toString());
					inputll.remove(i-1);
					System.out.println(inputll.toString());
					return inputll;
					} else {}
				//POWER
				if (inputll.get(i).equals("pow")) {
					double tempIN1 = 0;
					double tempIN2 = 0;
					double tempOUT = 0;
					System.out.println("------------------------");
					System.out.println("eins drunter: " + inputll.get(i-1));
					System.out.println("Aktuelles Objekt: " + inputll.get(i));
					System.out.println("eins drüber: " + inputll.get(i+1));
					System.out.println("------------------------");
					
					tempIN1 = Double.parseDouble(inputll.get(i-1));
					tempIN2 = Double.parseDouble(inputll.get(i+1));
					
					tempOUT = Math.pow(tempIN1, tempIN2);
					
					System.out.println("Ergebnis: " + tempOUT);
					
					System.out.println("I: "+i);
					System.out.println(inputll.toString());
					inputll.set(i, Double.toString(tempOUT));
					System.out.println(inputll.toString());
					inputll.remove(i+1);
					System.out.println(inputll.toString());
					inputll.remove(i-1);
					System.out.println(inputll.toString());
					return inputll;
					} else {}
				//PERCENTAGE
				if (inputll.get(i).equals("prc")) {
					double tempIN1 = 0;
					double tempIN2 = 0;
					double tempOUT = 0;
					System.out.println("------------------------");
					System.out.println("eins drunter: " + inputll.get(i-1));
					System.out.println("Aktuelles Objekt: " + inputll.get(i));
					System.out.println("eins drüber: " + inputll.get(i+1));
					System.out.println("------------------------");
					
					tempIN1 = Double.parseDouble(inputll.get(i-1));
					tempIN2 = Double.parseDouble(inputll.get(i+1));
					
					tempOUT = (tempIN2/100)*tempIN1;
					
					System.out.println("Ergebnis: " + tempOUT);
					
					System.out.println("I: "+i);
					System.out.println(inputll.toString());
					inputll.set(i, Double.toString(tempOUT));
					System.out.println(inputll.toString());
					inputll.remove(i+1);
					System.out.println(inputll.toString());
					inputll.remove(i-1);
					System.out.println(inputll.toString());
					return inputll;
					} else {}
				
				//NATURAL LOGARITHM
				if (inputll.get(i).equals("ln")) {
					double tempIN2 = 0;
					double tempOUT = 0;
					System.out.println("------------------------");
					System.out.println("Aktuelles Objekt: " + inputll.get(i));
					System.out.println("eins drüber: " + inputll.get(i+1));
					System.out.println("------------------------");
					
					tempIN2 = Double.parseDouble(inputll.get(i+1));
					
					tempOUT = Math.log(tempIN2);
					
					System.out.println("Ergebnis: " + tempOUT);
					
					System.out.println("I: "+i);
					System.out.println(inputll.toString());
					inputll.set(i, Double.toString(tempOUT));
					System.out.println(inputll.toString());
					inputll.remove(i+1);
					System.out.println(inputll.toString());
					return inputll;
					} else {}
				
				//10 LOGARITHM
				if (inputll.get(i).equals("log")) {
					double tempIN2 = 0;
					double tempOUT = 0;
					System.out.println("------------------------");
					System.out.println("Aktuelles Objekt: " + inputll.get(i));
					System.out.println("eins drüber: " + inputll.get(i+1));
					System.out.println("------------------------");
					
					tempIN2 = Double.parseDouble(inputll.get(i+1));
					
					tempOUT = Math.log10(tempIN2);
					
					System.out.println("Ergebnis: " + tempOUT);
					
					System.out.println("I: "+i);
					System.out.println(inputll.toString());
					inputll.set(i, Double.toString(tempOUT));
					System.out.println(inputll.toString());
					inputll.remove(i+1);
					System.out.println(inputll.toString());
					return inputll;
					} else {}
				
				//SQUAREROOT
				if (inputll.get(i).equals("sqrt")) {
					double tempIN2 = 0;
					double tempOUT = 0;
					System.out.println("------------------------");
					System.out.println("Aktuelles Objekt: " + inputll.get(i));
					System.out.println("eins drüber: " + inputll.get(i+1));
					System.out.println("------------------------");
					
					tempIN2 = Double.parseDouble(inputll.get(i+1));
					
					tempOUT = Math.sqrt(tempIN2);
					
					System.out.println("Ergebnis: " + tempOUT);
					
					System.out.println("I: "+i);
					System.out.println(inputll.toString());
					inputll.set(i, Double.toString(tempOUT));
					System.out.println(inputll.toString());
					inputll.remove(i+1);
					System.out.println(inputll.toString());
					return inputll;
					} else {}
				
				//SQUAREROOT
				if (inputll.get(i).equals("cbrt")) {
					double tempIN2 = 0;
					double tempOUT = 0;
					System.out.println("------------------------");
					System.out.println("Aktuelles Objekt: " + inputll.get(i));
					System.out.println("eins drüber: " + inputll.get(i+1));
					System.out.println("------------------------");
					
					tempIN2 = Double.parseDouble(inputll.get(i+1));
					
					tempOUT = Math.cbrt(tempIN2);
					
					System.out.println("Ergebnis: " + tempOUT);
					
					System.out.println("I: "+i);
					System.out.println(inputll.toString());
					inputll.set(i, Double.toString(tempOUT));
					System.out.println(inputll.toString());
					inputll.remove(i+1);
					System.out.println(inputll.toString());
					return inputll;
					} else {}
				
				//ADDITION
				if (inputll.get(i).equals("add") && !(inputll.contains("mul") ||inputll.contains("div") || inputll.contains("pow")
						|| inputll.contains("prc") || inputll.contains("sqrt") || inputll.contains("cbrt") || inputll.contains("ln") 
						|| inputll.contains("log"))) {
					double tempIN1 = 0;
					double tempIN2 = 0;
					double tempOUT = 0;
					System.out.println("------------------------");
					System.out.println("eins drunter: " + inputll.get(i-1));
					System.out.println("Aktuelles Objekt: " + inputll.get(i));
					System.out.println("eins drüber: " + inputll.get(i+1));
					System.out.println("------------------------");
					
					tempIN1 = Double.parseDouble(inputll.get(i-1));
					tempIN2 = Double.parseDouble(inputll.get(i+1));
					
					tempOUT = tempIN1 + tempIN2;
					
					System.out.println("Ergebnis: " + tempOUT);
					
					System.out.println("I: "+i);
					System.out.println(inputll.toString());
					inputll.set(i, Double.toString(tempOUT));
					System.out.println(inputll.toString());
					inputll.remove(i+1);
					System.out.println(inputll.toString());
					inputll.remove(i-1);
					System.out.println(inputll.toString());
					return inputll;
					} else {}
				
				//SUBTRACTION
				if (inputll.get(i).equals("sub") && !(inputll.contains("mul") ||inputll.contains("div") || inputll.contains("pow")
						|| inputll.contains("prc") || inputll.contains("sqrt") || inputll.contains("cbrt") || inputll.contains("ln") 
						|| inputll.contains("log"))) {
					double tempIN1 = 0;
					double tempIN2 = 0;
					double tempOUT = 0;
					System.out.println("------------------------");
					System.out.println("eins drunter: " + inputll.get(i-1));
					System.out.println("Aktuelles Objekt: " + inputll.get(i));
					System.out.println("eins drüber: " + inputll.get(i+1));
					System.out.println("------------------------");
					
					tempIN1 = Double.parseDouble(inputll.get(i-1));
					tempIN2 = Double.parseDouble(inputll.get(i+1));
					
					tempOUT = tempIN1 - tempIN2;
					
					System.out.println("Ergebnis: " + tempOUT);
					
					System.out.println("I: "+i);
					System.out.println(inputll.toString());
					inputll.set(i, Double.toString(tempOUT));
					System.out.println(inputll.toString());
					inputll.remove(i+1);
					System.out.println(inputll.toString());
					inputll.remove(i-1);
					System.out.println(inputll.toString());
					return inputll;
					} else {}
		
		

		return inputll;	
		
	}

}
