package conjugaison;

import java.util.HashMap;

public class VerbeRégulier implements Verbe {
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
	private HashMap<String, String> affixes;

	public VerbeRégulier(String vb, boolean vp, String[] af) {
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
		
		Temps[] tps = Temps.values();
		this.affixes = new HashMap<String,String>();
		for(int i = 0; i < af.length; ++i) {
			affixes.put(tps[i].toString(), af[i]);
		}
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
	
	public String conjuguer(Temps tps, int personne, String nombre) {
		String[] p = this.choisirPronoms();
		
		String[] af = affixes.get(tps.toString()).split(",");
		
		if(nombre.equals("singulier")) personne--;
		else if(nombre.equals("pluriel")) personne += 2;
		else {
			System.out.println("Erreur. Je ne sais pas conjuguer.");
			return "";
		}
		
		return p[personne] + " " + this.radical + af[personne];
	}
	
	public String conjuguerAu(Temps tps) {
		String s = "";
		
		if(tps == Temps.Impératif_présent) {
			String[] af = affixes.get(tps.toString()).split(",");
			for(String a : af) s += this.radical + a;
			return s;
		} else if(tps == Temps.Participe_présent ||
				tps == Temps.Participe_passé)
			return this.radical + affixes.get(tps.toString());
		else if(tps == Temps.Infinitif_présent)
			return this.radical + this.terminaison;
		else if(tps == Temps.Gérondif)
			return "en " + this.getParticipePrésent();
		else {
			String[] p = this.choisirPronoms();
			String[] af = affixes.get(tps.toString()).split(",");
			for(int i = 0; i < af.length; ++i) 
				s += p[i] + " " + this.radical + af[i] + "\n";
			return s;
		}
	}
	
	private String getParticipePrésent() {
		return this.radical + affixes.get(Temps.Participe_présent.toString());
	}

	public String[] choisirPronoms() {
		if (this.estPronominal()) {
			if (this.pronominal.equals("se"))
				return this.pronomsPronominaux_SE;
			else
				return this.pronomsPronominaux_S;
		} else {
			if(this.radical.charAt(0) == 'a' || this.radical.charAt(0) == 'e') 
				return this.pronoms_voyelle;
			else 
				return this.pronoms;
		}
	}
}