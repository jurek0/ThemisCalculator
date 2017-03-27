package de.Tunfisch.Themis;

public class ThemisIRR {
	

	String E = "2.718281828459045";
	String PI = "3.14159265359";
	String returner = "";
	
	String checkIrrational(String extInput1){
		
		if (extInput1.equals("E")) {
			returner = E;
		}
		if (extInput1.equals("PI")) {
			returner = PI;
		}
		if (!(extInput1.equals("E")&&extInput1.equals("PI"))) {
			returner = extInput1;
		}
		
		return returner;
	}
}
