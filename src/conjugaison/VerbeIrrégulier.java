package conjugaison;

public class VerbeIrr�gulier extends VerbeR�gulier implements Verbe {
	
	public VerbeIrr�gulier(String vb, boolean vp, String[] af) {
		super(vb, vp, af);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String conjuguer(Temps tps, int personne, String nombre) {
		return "";
	}

}
