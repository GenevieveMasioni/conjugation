package conjugaison;

import java.util.ArrayList;

public class Mode {
	private String nom;
	private ArrayList<Temps> temps;
	
	public Mode(String n, ArrayList<Temps> tps) {
		this.nom = n;
		this.temps = new ArrayList<Temps>();
		this.temps = tps;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public ArrayList<Temps> getTemps() {
		return this.temps;
	}
}
