package de.Tunfisch.EvalTable;

import java.util.LinkedList;

import de.Tunfisch.Themis2.ThemisSolver;

public class EvalTable {
	
	String input, result, formattedResult = "";
	int min;
	int max;
	double res;
	LinkedList<String> yaxis = new LinkedList<>();
	LinkedList<String> xaxis = new LinkedList<>();
	
	
	//Themis
	ThemisSolver themis = new ThemisSolver();
	
	public void setEvalTableInput(String extInput, int extMin, int extMax, double extResolution){
		input = extInput;
		min = extMin;
		max = extMax;
		res = extResolution;
	}
	
	public void loopTBL(String angleMode){
		LinkedList<String> table = new LinkedList<>();
		
		table.clear();
		xaxis.clear();
		yaxis.clear();
		
		for (double d = 0; d <= (max-min); d+=(1*res)) {
			String tempInput = input;
			System.out.println("EVTBL: loopTBL: " + (d + min));
			tempInput = tempInput.replace("-", " sub ");
			tempInput = tempInput.replace("x", Double.toString(d + min));
			tempInput = tempInput.replace("X", "" + Double.toString(d + min) + "");
			tempInput = tempInput.replaceAll("-", " neg");
			tempInput = tempInput.replace(" ", "");
			tempInput = tempInput.replace("sub", " sub ");
			System.out.println("EVTBL: tempinput: " + tempInput);
			themis.calculate(tempInput, angleMode);
			result = themis.getResult();
			table.add(result);
			xaxis.add(Double.toString(d+min));
			System.out.println("EVTBL: X = " + (d + min) + ", Y = " + themis.getResult());
			System.out.println("=================================");
			}
		yaxis = table;
	}
	
	public LinkedList<String> getEvalTableY(){
		return yaxis;
	}
	public LinkedList<String> getEvalTableX(){
		return xaxis;
	}	
	public String getFormattedResult(){
		formattedResult = "";
		for (int i = 0; i < xaxis.size(); i++) {
			formattedResult = formattedResult + "   X = " + xaxis.get(i) + "	|   Y = " + yaxis.get(i) + "\n";
		}
		return formattedResult;
	}
}