package de.Tunfisch.Themis2;

class Knoten{
	
	private Knoten successor = null;	//Nachfolger
	private Knoten predessor = null;	//Vorgänger
	private Object data = null;
	
				 // was ist danach, was ist davor,   was kommt rein
	public Knoten(Knoten successor, Knoten predessor, Object data){
	this.successor = successor;
	this.predessor = predessor;
	this.data = data;
	}
	
public Knoten getSuccessor(){ return this.successor; }
	public Knoten getPredessor(){ return this.predessor; }
	public Object getData(){return this.data; }
	public void setData(Object data){ this.data = data; }
	public void setSuccessor(Knoten knoten){this.successor = knoten;}
	public void setPredessor(Knoten knoten){this.predessor = knoten;}
	
}
