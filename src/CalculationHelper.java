
public class CalculationHelper {
	boolean check = false;
	boolean priority = false;
	boolean isDot(String toBeControlled){

		if(toBeControlled.equals("*")){check = true;}
		if(toBeControlled.equals("/")){check = true;}
		if(toBeControlled.equals("+")){check = false;}
		if(toBeControlled.equals("-")){check = false;}
		return check;
	}
	boolean isLine(String toBeControlled){

		if(toBeControlled.equals("*")){check = false;}
		if(toBeControlled.equals("/")){check = false;}
		if(toBeControlled.equals("+")){check = true;}
		if(toBeControlled.equals("-")){check = true;}
		return check;
	}
	
	boolean hasPriorityOver(String extPrior){
		
		
		return priority;
	}
	
}
