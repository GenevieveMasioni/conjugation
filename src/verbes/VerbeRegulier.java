package verbes;

import java.util.HashMap;

import conjugaison.Multiplicit�;
import conjugaison.Pronoms;
import conjugaison.Temps;

public class VerbeRegulier implements Verbe {
	private String radical;
	private String terminaison;
	private boolean estPronominal;
	private String prefixePronominal;
	private HashMap<String, String> affixes;

	public VerbeRegulier(String vb, boolean vp, String[] af) {
		this.estPronominal = vp;
		if (vp) {
			String[] segments = vb.split(" |'");
			this.prefixePronominal = segments[0] + " ";
			this.radical = segments[1].substring(0, segments[1].length() - 2);
		} else {
			this.prefixePronominal = "";
			this.radical = vb.substring(0, vb.length() - 2);
		}

		this.terminaison = vb.substring(vb.length() - 2);

		Temps[] tps = Temps.values();
		this.affixes = new HashMap<String, String>();
		for (int i = 0; i < af.length; ++i) {
			affixes.put(tps[i].toString(), af[i]);
		}
	}

	public String conjuguer(Temps tps, int num, Multiplicit� mult) throws IllegalArgumentException {
		if (tps == Temps.Participe_pr�sent || tps == Temps.Participe_pass� || tps == Temps.Infinitif_pr�sent
				|| tps == Temps.G�rondif) {
			throw new IllegalArgumentException("Personne et nombre non-conformes avec le temps.");
		}
		String[] pronoms = Pronoms.choisirPronoms(this, this.estPronominal);

		String[] af = affixes.get(tps.toString()).split(",");

		num--;
		if (mult == Multiplicit�.pluriel)
			num += 3;
		return pronoms[num] + " " + this.radical + af[num];
	}

	public String conjuguerAu(Temps tps) {
		String[] af, pronoms;
		String s = "";

		switch (tps) {
		case Imp�ratif_pr�sent:
			af = affixes.get(tps.toString()).split(",");
			for (String a : af)
				s += this.radical + a;
			return s;
		case Participe_pr�sent:
		case Participe_pass�:
			return this.radical + affixes.get(tps.toString());
		case Infinitif_pr�sent:
			return this.radical + this.terminaison;
		case G�rondif:
			return "en " + this.getParticipePr�sent();
		default:
			pronoms = Pronoms.choisirPronoms(this, this.estPronominal);
			af = affixes.get(tps.toString()).split(",");
			for (int i = 0; i < af.length; ++i)
				s += pronoms[i] + " " + this.radical + af[i] + "\n";
			return s;
		}
	}

	private String getParticipePr�sent() {
		return this.radical + affixes.get(Temps.Participe_pr�sent.toString());
	}
	
	public String getPrefixePronominal() {
		return this.prefixePronominal;
	}
	
	public String getRadical() {
		return this.radical;
	}
}