package conjugaison;

import java.util.ArrayList;

public class Temps {
	private String nom;
	private ArrayList<String> affixes;

	public Temps(String n, ArrayList<String> a) {
		this.nom = n;
		this.affixes = new ArrayList<String>();
		this.affixes = a;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public ArrayList<String> getAffixes() {
		return this.affixes;
	}
}
