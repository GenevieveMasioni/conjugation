package verbes;

import java.util.HashMap;

import conjugaison.Multiplicit�;
import conjugaison.Pronoms;
import conjugaison.Temps;

public class VerbeIrregulier implements Verbe {
	private HashMap<String,String> VerbeDeReference;
	private String radical;
	private boolean estPronominal;
	private String prefixePronominal;
	
	public VerbeIrregulier(String vb, boolean vp, HashMap<String,String> ref) {
		this.estPronominal = vp;
		if (vp) {
			String[] segments = vb.split(" |'");
			this.prefixePronominal = segments[0] + " ";
			this.radical = segments[1];
			this.radical = this.radical.replace(ref.get("Infinitif_pr�sent"), "");
		} else {
			this.prefixePronominal = "";
			this.radical = vb.replace(ref.get("Infinitif_pr�sent"), "");
		}
		this.VerbeDeReference = ref;
	}
	
	public VerbeIrregulier(String vb, boolean vp, String[] af, String terminaison) {
		this.estPronominal = vp;
		if (vp) {
			String[] segments = vb.split(" |'");
			this.prefixePronominal = segments[0] + " ";
			this.radical = segments[1].replace(terminaison, "");
		} else {
			this.prefixePronominal = "";
			this.radical = vb.replace(terminaison, "");
		}

		Temps[] tps = Temps.values();
		this.VerbeDeReference = new HashMap<String, String>();
		for (int i = 0; i < af.length; ++i) {
			VerbeDeReference.put(tps[i].toString(), af[i]);
		}
	}

	@Override
	public String conjuguer(Temps tps, int num, Multiplicit� mult) {
		if (tps == Temps.Participe_pr�sent || tps == Temps.Participe_pass� || tps == Temps.Infinitif_pr�sent
				|| tps == Temps.G�rondif) {
			throw new IllegalArgumentException("Personne et nombre non-conformes avec le temps.");
		}
		String[] pronoms = Pronoms.choisirPronoms(this, this.estPronominal);

		String[] affixes = VerbeDeReference.get(tps.toString()).split(",");

		num--;
		if (mult == Multiplicit�.pluriel)
			num += 3;
		return pronoms[num] + " " + this.radical + affixes[num];
	}

	@Override
	public String conjuguerAu(Temps tps) {
		String[] affixes, pronoms;
		String s = "";
		
		switch (tps) {
		case Imp�ratif_pr�sent:
			affixes = VerbeDeReference.get(tps.toString()).split(",");
			for (String affixe : affixes)
				s += this.radical + affixe;
			return s;
		case Participe_pr�sent:
		case Participe_pass�:
			return this.radical + VerbeDeReference.get(tps.toString());
		case Infinitif_pr�sent:
			return this.radical + VerbeDeReference.get("Infinitif_pr�sent");
		case G�rondif:
			return "en " + this.radical + VerbeDeReference.get("Participe_pr�sent");
		default:
			pronoms = Pronoms.choisirPronoms(this, this.estPronominal);
			affixes = VerbeDeReference.get(tps.toString()).split(",");
			for (int i = 0; i < affixes.length; ++i)
				s += pronoms[i] + " " + this.radical + affixes[i] + "\n";
			return s;
		}
	}
	
	public String getPrefixePronominal() {
		return this.prefixePronominal;
	}
	
	public String getRadical() {
		return this.radical;
	}
}
