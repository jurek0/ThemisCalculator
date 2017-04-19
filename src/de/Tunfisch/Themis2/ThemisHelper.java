package de.Tunfisch.Themis2;

import java.util.LinkedList;

public class ThemisHelper {

	boolean containsOPS = false;
	
	public boolean LLContainsAnyOperators(LinkedList<String> toCheck){
		
		if (toCheck.contains("mul") || toCheck.contains("div") || toCheck.contains("add") || toCheck.contains("sub") || toCheck.contains("pow")
		 || toCheck.contains("prc") || toCheck.contains("sqrt") || toCheck.contains("cbrt") || toCheck.contains("sin") || toCheck.contains("cos")
		 || toCheck.contains("tan") || toCheck.contains("log") || toCheck.contains("ln")) {
			containsOPS = true;
		}
		return containsOPS;
	}
	
}
