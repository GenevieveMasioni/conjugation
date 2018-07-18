package conjugaison;

import java.util.ArrayList;

public class Conjugaison {
	private InterVerbe verbe;
	
	public Conjugaison(String v, InterFabriqueVerbe fv) {
		this.verbe = fv.getVerbe(v);
	}
	
	public String getVerbe() {
		return this.verbe.getPronominal() + 
				this.verbe.getRadical() + 
				this.verbe.getTerminaison();
	}
	
	public ArrayList<String> conjuguer() {
		return this.verbe.conjuguer();
	}
	
	public String toString() {
		return this.verbe.toString();
	}

}
