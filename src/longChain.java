import java.util.ArrayList;

public class longChain {
	
	int maxDigits = 10;
	int i = 0;
	int sCC = 0; //ShortChainCounter

	
	ArrayList <String> operation = new ArrayList<String>();
	String[] temp = new String[maxDigits];
	String[] shortChain = new String[maxDigits];
	
	
	//ADDING STUFF TO CHAIN
	public void addToChain(String toAdd){
		temp[i] = toAdd;
		i++;
	}
	
	public void calculate(){
		
		
		//STAGE 0
		for (int i = 0; i < temp.length; i++) {
			
			//STAGE 1
			if (i == 0) {
				shortChain[sCC] = temp[0];
				sCC++;
			}
			//STAGE 1 END
			
			//STAGE 2
			 else {
				//THE REAL SHIT
				
				//Adding number by number
				if (temp[i].equals("0") || temp[i].equals("1") || temp[i].equals("2") || temp[i].equals("3") 
				 || temp[i].equals("4") || temp[i].equals("4") || temp[i].equals("5") || temp[i].equals("6")
				 || temp[i].equals("7") || temp[i].equals("8") || temp[i].equals("9") || temp[i].equals(".")) 
					{shortChain[sCC] = shortChain[sCC] + temp[i];}
				
				//If temp[i] is an operator, put it into a new shortChain
				if (temp[i].equals("+") || temp[i].equals("-") || temp[i].equals("*") || temp[i].equals("/") || temp[i].equals("1")
				 || temp[i].equals("1") || temp[i].equals("log(") || temp[i].equals("ln(") || temp[i].equals("1") || temp[i].equals("pow(")
				 || temp[i].equals("rad(") || temp[i].equals("sin(") || temp[i].equals("cos(") || temp[i].equals("tan(") || temp[i].equals("(")
				 || temp[i].equals(")") || temp[i].equals("PI") || temp[i].equals("E")) 
				{
					sCC++;
					shortChain[sCC] = temp[i];
					sCC++;				
				}	
				
				if (temp[i].equals("") && temp[i+1].equals("")) {break;}
			}
			//STAGE 2 END
	
		}
		//STAGE 0 END
		
		for (int i = 0; i < shortChain.length; i++) {
			System.out.println(shortChain[i]);
		}
		clearChain();
	}
	//METHOD END
	
	//CHAIN CLEARING
	public void clearChain(){
		//operation.clear();
		for (int i = 0; i < temp.length; i++) {
			temp[i] = "";
		}
	}
}
