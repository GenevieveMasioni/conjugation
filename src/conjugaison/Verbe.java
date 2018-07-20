package conjugaison;

public interface Verbe {
	
	public String conjuguer(Temps tps, int personne, Multiplicité mult);
	
	public String conjuguerAu(Temps tps);
	
}
