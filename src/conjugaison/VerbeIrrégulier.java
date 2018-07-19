package conjugaison;

public class VerbeIrrégulier extends VerbeRégulier implements Verbe {
	
	public VerbeIrrégulier(String vb, boolean vp, String[] af) {
		super(vb, vp, af);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String conjuguer(Temps tps, int personne, String nombre) {
		return "";
	}

}
