
public class AngleCalculation {
	double nResultRad, nResultDeg ;
	public String sResult;

	
	
	public void angleCalculation(double nInput, String angleType, String toCalculate){
		

		
		//
		if (toCalculate.equalsIgnoreCase("sin")) {
			nResultRad = Math.sin(nInput);
		}
		if (toCalculate.equalsIgnoreCase("cos")) {
			nResultRad = Math.cos(nInput);
		}
		if (toCalculate.equalsIgnoreCase("tan")) {
			nResultRad = Math.tan(nInput);
		}
		
		//Radian result to degree if needed
		if (angleType.equalsIgnoreCase("degree")) {
			//nResultDeg = (360/(2*Math.PI))*nResultRad;
			nResultDeg = ((2*Math.PI)/360)*nResultRad;
			sResult = Double.toString(nResultDeg);
		} else {
			sResult = Double.toString(nResultRad);
		}
			
		
		
	
	}
	
	public String toString(){
		return sResult;
	}
	
}
