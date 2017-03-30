package de.Tunfisch.Themis2;

import java.util.Iterator;

public class ThemisLinkedList implements Iterable<Object>, Iterator<Object>{

	private Knoten aktuellerKnoten = null;
	private Knoten letzterKnoten = null;
	private Knoten ersterKnoten = null;
	
	@Override
	public Iterator<Object> iterator() {
		return this;
	}
	
	public void ersterKnoten(){
		aktuellerKnoten = ersterKnoten;
	}
	
	public Object getAktuelleDatei(){
		return aktuellerKnoten.getData();
	}
	
	public void insert(Object data) {
		//M�glichkeit 1: Knoten ist leer
		if (aktuellerKnoten == null) {
			aktuellerKnoten = new Knoten(null, null, data);
			ersterKnoten = aktuellerKnoten;
		} else {
			//Knoten wird hinten angeh�ngt
			if (aktuellerKnoten.getSuccessor() == null) {
				aktuellerKnoten.setSuccessor(new Knoten(null, aktuellerKnoten, data));
				letzterKnoten = aktuellerKnoten.getSuccessor();
				aktuellerKnoten = letzterKnoten;
			} else {
				//Neuer Knoten zwischen zwei existierenden
				Knoten tempSuccessor = aktuellerKnoten.getSuccessor();
				aktuellerKnoten.setSuccessor(new Knoten(tempSuccessor, aktuellerKnoten, data));
				tempSuccessor.setPredessor(aktuellerKnoten.getSuccessor());
				aktuellerKnoten = aktuellerKnoten.getSuccessor();
			}
		}
	}

	public Knoten next(){
		if(aktuellerKnoten.getSuccessor() != null){
			aktuellerKnoten = aktuellerKnoten.getSuccessor();
		} else {
			System.out.println("Letzter Knoten erreicht!");
		}
		
		return aktuellerKnoten;
	}

	public boolean hasNext() {
		if (aktuellerKnoten.getSuccessor() == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void remove(){
		//Erstes Element l�schen
		if (aktuellerKnoten == ersterKnoten) {
			ersterKnoten = aktuellerKnoten.getSuccessor();
			ersterKnoten.setPredessor(null);
			aktuellerKnoten = ersterKnoten;
		} else {
			//letztes Element l�schen
			if (aktuellerKnoten.getSuccessor() == null) {
				aktuellerKnoten = aktuellerKnoten.getPredessor();
				aktuellerKnoten.setSuccessor(null);
				letzterKnoten = aktuellerKnoten;
			} else {
				//Element irgendwo in der Mitte l�schen
				Knoten tempSuccessor = aktuellerKnoten.getSuccessor();
				Knoten tempPredessor = aktuellerKnoten.getPredessor();
				aktuellerKnoten = tempPredessor;
				aktuellerKnoten.setSuccessor(tempSuccessor);
				tempSuccessor.setPredessor(aktuellerKnoten);
			}
		}
	
	}

}
