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
		this.affixes = new HashMap<String, String>();
		for (int i = 0; i < af.length; ++i) {
			affixes.put(tps[i].toString(), af[i]);
		}
	}

	public String conjuguer(Temps tps, int num, Multiplicité mult) throws IllegalArgumentException {
		if (tps == Temps.Participe_présent || tps == Temps.Participe_passé || tps == Temps.Infinitif_présent
				|| tps == Temps.Gérondif) {
			throw new IllegalArgumentException("Personne et nombre non-conformes avec le temps.");
		}
		String[] p = this.choisirPronoms();

		String[] af = affixes.get(tps.toString()).split(",");

		num--;
		if (mult == Multiplicité.pluriel)
			num += 3;
		return p[num] + " " + this.radical + af[num];
	}

	public String conjuguerAu(Temps tps) {
		String[] af, p;
		String s = "";

		switch (tps) {
		case Impératif_présent:
			af = affixes.get(tps.toString()).split(",");
			for (String a : af)
				s += this.radical + a;
			return s;
		case Participe_présent:
		case Participe_passé:
			return this.radical + affixes.get(tps.toString());
		case Infinitif_présent:
			return this.radical + this.terminaison;
		case Gérondif:
			return "en " + this.getParticipePrésent();
		default:
			p = this.choisirPronoms();
			af = affixes.get(tps.toString()).split(",");
			for (int i = 0; i < af.length; ++i)
				s += p[i] + " " + this.radical + af[i] + "\n";
			return s;
		}
	}

	private String getParticipePrésent() {
		return this.radical + affixes.get(Temps.Participe_présent.toString());
	}
	
	private boolean estPronominal() {
		return this.VerbePronominal;
	}

	public String[] choisirPronoms() {
		if (this.estPronominal()) {
			if (this.pronominal.equals("se"))
				return this.pronomsPronominaux_SE;
			else
				return this.pronomsPronominaux_S;
		} else {
			if (this.radical.charAt(0) == 'a' || this.radical.charAt(0) == 'e')
				return this.pronoms_voyelle;
			else
				return this.pronoms;
		}
	}
}