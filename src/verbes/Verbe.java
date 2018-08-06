package verbes;

import conjugaison.Multiplicit�;
import conjugaison.Temps;

public interface Verbe {
	
	public String conjuguer(Temps tps, int personne, Multiplicit� mult);
	
	public String conjuguerAu(Temps tps);

	public String getPrefixePronominal();

	public String getRadical();
	
}
