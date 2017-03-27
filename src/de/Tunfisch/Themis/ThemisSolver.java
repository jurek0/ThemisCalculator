package de.Tunfisch.Themis;

public class ThemisSolver {

	/**
	 * POSSIBILITY TO EXTRACT CALCULATIONS FROM
	 * WHEREEVER YOU WANT AND CALCULATE THEM.
	 * Handles most common operators
	 * Please read info.txt
	 * 
	 * Created by Igor das Tunfisch/Marco Rohn
	 *  
	 */
	
	//VARIOUS VARIABLES
	private String s1;
	
	//thcalalculator
	ThemisCalculator thcal = new ThemisCalculator();
	
	//Calculation-method (visible by other classes)
	public void calculate(String toSolve){
		int ctr = 0;
		String[] parts = new String[toSolve.length()+2];
		
		//ADDING BRACKETS TO PROVE BETTER FUNCTION	
		toSolve = "(" + toSolve;
		toSolve = toSolve + ")";
		
		//REPLACE
		toSolve = toSolve.replace("+", " add ");
		toSolve = toSolve.replace("-", " sub ");
		toSolve = toSolve.replace("*", " mul ");
		toSolve = toSolve.replace("/", " div ");
		toSolve = toSolve.replace("%", " prc ");
		toSolve = toSolve.replace("rad(", " rad( ");
		toSolve = toSolve.replace("^(", " pow( ");
		toSolve = toSolve.replace("sin(", " sin ");
		toSolve = toSolve.replace("cos(", " cos( ");
		toSolve = toSolve.replace("tan(", " tan( ");
		toSolve = toSolve.replace("e", " E ");
		toSolve = toSolve.replace("PI", " PI ");
		toSolve = toSolve.replace("log(", " log( ");
		toSolve = toSolve.replace("ln(", " ln( ");
		toSolve = toSolve.replace("(", " ( ");
		toSolve = toSolve.replace(")", " ) ");
		toSolve = toSolve.replace("  ", " ");
		if (toSolve.startsWith(" ")) {
			toSolve = toSolve.substring(1, toSolve.length());
		}
		
		System.out.println("==========START==========");
		
		
		//SPLIT
		for (String retval : toSolve.split(" ")) {
			System.out.println(retval);
			parts[ctr] = retval;
			ctr++;
		}
		
		System.out.println("Splitted");
		System.out.println("L�nge: "+(parts.length)/2);
		System.out.println("-------Doppelschleife------------");
		
		search(parts);
	}
	
	
		//SEARCH
		private void search(String[] parts){
		
			int openingBracket, closingBracket;
			String tempSubOperation = "";
			
		for (int i = 0; i < parts.length; i++) {
			//STAGE 1, Searching closing bracket
			try {
				if (parts[i].equals(")")) {
				closingBracket = i;
				System.out.println("Found ), closing Bracketis at  "+closingBracket);
					//If found one, search the related opening bracket
						for (int j = i; j <= i; j--) {
							
							if (parts[j].equals("(")) {  
								//If found one, extract the brackets with content
								openingBracket = j;
								System.out.println("Found (, opening Bracket is at " + openingBracket);
								String[] tempOperation = new String[i-j];
								System.out.println("L�nge der tempor�ren Operation: "+ (tempOperation.length - 1));
								
								for (int k = j; k <= i; k++) {
									int ctr2 = 0;
									tempOperation[ctr2] = parts[k];
									//System.out.println("K = "+k);
									tempSubOperation = tempSubOperation + tempOperation[ctr2] + ":";
									System.out.println("Test ob die tempsubop l�d: "+tempSubOperation);
									ctr2++;
								}
								
								System.out.println("TSO: " + tempSubOperation);
								thcal.calculateSubOP(tempSubOperation);
								
								break;
								
							}
							
							if (j == 0){break;}
						}
					//} catch (Exception e) {System.out.println("Fehler");}
					break;
				}
			} catch (Exception e) {} 
		}
				
				
		
			} //END OF SEARCH
		
		//Calculate MEthod
		
		
		
			
		
	
	
	
	/**
	 * Hier methode die nach geschlossenen und der dazugeh�rigen ge�ffneten klammer sucht?
	 * 
	 * Schleife erst vorw�rts durch array, wenn etwas gefunden, schleife r�ckw�rts zur ersten ge�ffneten klammer fahren
	 * 
	 * Dann methode aufrufen, die in dem klammerpaar nach mals und geteilts sucht und diese in reihenfolge rechnet, dann wird das ergebnis in
	 * verbliebenden teil eingebaut?
	 * 
	 */
	
}
