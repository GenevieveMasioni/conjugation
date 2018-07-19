package conjugaison;

public interface Verbe {
	
	public String getRadical();
	
	public String getTerminaison();
	
	public String getPronominal();
	
	public String conjuguer(Temps tps, int personne, String nombre);
	
	public String conjuguerAu(Temps tps);
	
}
