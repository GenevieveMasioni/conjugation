package verbes;

import java.util.ArrayList;

import conjugaison.InterVerbe;

public class Verbe implements InterVerbe {
	private String radical;
	private String terminaison;
	private boolean VerbePronominal;
	private String pronominal;
	private String[] pronoms = { "je", "tu", "il/elle", "nous", "vous", "ils/elles" };
	private String[] pronoms_voyelle = { "j'", "tu", "il/elle", "nous", "vous", "ils/elles" };
	private String[] pronomsPronominaux_SE = { "je me", "tu te", "il/elle se ", "nous nous", "vous vous",
			"ils/elles se" };
	private String[] pronomsPronominaux_S = { "je m'", "tu t'", "il/elle s'", "nous nous", "vous vous",
			"ils/elles s'" };
	private static String[] modes = { "Indicatif présent", "Indicatif imparfait", "Indicatif passé simple",
			"Indicatif futur simple", "Conditionnel présent", "Subjonctif présent", "Subjonctif imparfait",
			"Impératif présent", "Participe présent", "Participe passé", "Infinitif présent", "Gérondif" };
	private String[] affixes;

	public Verbe(String vb, boolean vp, String[] af) {
		this.VerbePronominal = vp;
		if (vp) {
			String[] segments = vb.split(" |'");
			this.pronominal = segments[0] + " ";
			this.radical = segments[1].substring(0, segments[1].length() - 2);
		} else {
			this.pronominal = "";
			this.radical = vb.substring(0, vb.length() - 2);
		}

		this.terminaison = vb.substring(vb.length() - 2);
		this.affixes = af;
	}

	public String getRadical() {
		return this.radical;
	}

	public String getTerminaison() {
		return this.terminaison;
	}

	public boolean estPronominal() {
		return this.VerbePronominal;
	}

	public String getPronominal() {
		return this.pronominal;
	}

	public ArrayList<String> conjuguer() {
		ArrayList<String> conjugaison = new ArrayList<String>();
		String[] p;
		if (this.estPronominal()) {
			if (this.pronominal.equals("se"))
				p = this.pronomsPronominaux_SE;
			else
				p = this.pronomsPronominaux_S;
		} else {
			if(this.radical.charAt(0) == 'a' || this.radical.charAt(0) == 'e') 
				p = this.pronoms_voyelle;
			else 
				p = this.pronoms;
		}

		for (int i = 0; i < 7; ++i) {
			conjugaison.add(modes[i]);
			String[] af = affixes[i].split(",");

			for (int j = 0; j < af.length; ++j) {
				conjugaison.add(p[j] + " " + this.radical + af[j]);
			}
		}
		// Impératif présent
		conjugaison.add(modes[7]);
		String[] af = affixes[7].split(",");
		for(String s : af) 
			conjugaison.add(this.radical + s);
		
		// Participe présent
		conjugaison.add(modes[8]);
		conjugaison.add(this.radical + affixes[8]);
		
		// Participe passé
		conjugaison.add(modes[9]);
		conjugaison.add(this.radical + affixes[9]);
		
		// Infinitif
		conjugaison.add(modes[10]);
		conjugaison.add(this.radical + this.terminaison);
		return conjugaison;
	}

	public String toString() {
		String s = "";
		ArrayList<String> conjugaison = new ArrayList<String>();
		conjugaison = this.conjuguer();
		for (String c : conjugaison)
			s += c + "\n";
		return s;
	}
}
