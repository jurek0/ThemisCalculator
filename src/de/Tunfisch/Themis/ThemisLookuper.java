package de.Tunfisch.Themis;

public class ThemisLookuper {

	boolean fallActivates = false;
	
	boolean containsDots(String[] extInput){
		fallActivates =  false;
		for (int i = 0; i < extInput.length; i++) {
			if (extInput[i].contains("mul") || extInput[i].contains("div") || extInput[i].contains("prc")) {
				fallActivates = true;
			}
		}
		return fallActivates;
	}
	
	
	boolean containsQ(String[] extInput){
		fallActivates =  false;
		for (int i = 0; i < extInput.length; i++) {
			if (extInput[i].contains("q")) {
				fallActivates = true;
			}
		}
		return fallActivates;
	}
	
	boolean containsDash(String[] extInput){
		fallActivates =  false;
		for (int i = 0; i < extInput.length; i++) {
			if (extInput[i].contains("add") || extInput[i].contains("sub")) {
				fallActivates = true;
			}
		}
		return fallActivates;
	}
	
	
}
