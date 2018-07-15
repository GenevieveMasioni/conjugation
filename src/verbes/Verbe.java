package verbes;

import java.util.ArrayList;

import conjugaison.Mode;

public class Verbe {
	private String radical;
	private String terminaison;
	private String[] pronoms = {"je", "tu", "il/elle", 
			"nous", "vous", "ils/elles"};
	private Mode[] modes;
	
	public Verbe(String vb) {
		this.radical = vb.substring(0, vb.length() - 2);
		this.terminaison = vb.substring(vb.length() - 2);
	}
	
	public String getRadical() {
		return this.radical;
	}
	
	public String getTerminaison() {
		return this.terminaison;
	}
	
	public Mode[] getModes() {
		return modes;
	}
	
	public ArrayList<String> conjuguer() {
		ArrayList<String> conjugaison = new ArrayList<String>();
		for(String s : pronoms) {
			conjugaison.add(s + " " + this.radical);
		}
		return conjugaison;
	}
	
	public String toString() {
		String s = "";
		ArrayList<String> conjugaison = new ArrayList<String>();
		conjugaison = this.conjuguer();
		for(String c : conjugaison) s += c + "\n";
		return s;
	}
} 
