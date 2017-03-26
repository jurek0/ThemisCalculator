public class AdvancedCalculator {

	double nResult;
	String sResult;
	public void calculate(String extInput1, String extInput2){
		
		nResult = Double.parseDouble(extInput1)*Double.parseDouble(extInput2);
		sResult = Double.toString(nResult);
		System.out.println(sResult);
		
		
		
		
	}
	
}
