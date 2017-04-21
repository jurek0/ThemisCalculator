
import java.util.LinkedList;

public class TestCalculator {
	
	boolean isDegree = false;
	public LinkedList<String> inputll;
	public int lenght;
	
	//Setting isDegree central
	public void setIsDegree(boolean extIsDegree){
		isDegree = extIsDegree;
	}


	//Method which calculates and respects point for line
		 LinkedList<String> getCalc(LinkedList<String> inputll, boolean isDegree){
			
			 for (int i = 0; i < inputll.size(); i++) {
					
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
			}
			

			return inputll;	
			
		}
}