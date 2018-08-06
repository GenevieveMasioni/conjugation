package verbes;

import conjugaison.Multiplicité;
import conjugaison.Temps;

public interface Verbe {
	
	public String conjuguer(Temps tps, int personne, Multiplicité mult);
	
	public String conjuguerAu(Temps tps);

	public String getPrefixePronominal();

	public String getRadical();
	
}
