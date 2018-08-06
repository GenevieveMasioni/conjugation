package conjugaison;

import verbes.Verbe;

public final class Pronoms {
	private static String[] pronoms = { "je", "tu", "il/elle", "nous", "vous", "ils/elles" };
	private static String[] pronoms_voyelle = { "j'", "tu", "il/elle", "nous", "vous", "ils/elles" };
	private static String[] pronomsPronominaux_SE = { "je me", "tu te", "il/elle se", "nous nous", "vous vous",
			"ils/elles se" };
	private static String[] pronomsPronominaux_S = { "je m'", "tu t'", "il/elle s'", "nous nous", "vous vous",
			"ils/elles s'" };
	
	private Pronoms(){}
	
	public static String[] choisirPronoms(Verbe v, boolean vp) {
		if (vp) {
			if (v.getPrefixePronominal().equals("se "))
				return pronomsPronominaux_SE;
			else
				return pronomsPronominaux_S;
		} else {
			if (v.getRadical().charAt(0) == 'a' || v.getRadical().charAt(0) == 'e')
				return pronoms_voyelle;
			else
				return pronoms;
		}
	}
}
