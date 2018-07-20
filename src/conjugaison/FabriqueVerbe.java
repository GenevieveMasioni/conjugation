package conjugaison;

public class FabriqueVerbe implements InterFabriqueVerbe {
	private static String suffixe_1erG = "er";
	private static String suffixe_2eG = "ir";
	private static String[] affixes_1erG = { "e,es,e,ons,ez,ent", "ais,ais,ait,ions,iez,aient",
			"ai,as,a,�mes,�tes,�rent", "erai,eras,era,erons,erez,eront", "erais,erais,erait,erions,eriez,eraient",
			"e,es,e,ions,iez", "asse,asses,�t,assions,assiez,assent", "e,ons,ez", "ant", "�" };
	private static String[] affixes_2eG = { "s,s,t,ssons,ssez,ssent", "ssais,ssais,ssait,ssions,ssiez,ssaient",
			"is,is,it,�mes,�tes,irent", "rai,ras,ra,rons,rez,ront", "rais,rais,rait,rions,riez,raient",
			"sse,sses,sse,ssions,ssiez,ssent", "sse,sses,t,ssions,ssiez,ssent", "s,ssons,ssez", "ssant", "i" };
	private static String[] affixes_3eG_ir = { "e,es,e,ons,ez,ont", "ais,ais,ait,ions,iez,aient",
			"is,is,it,�mes,�tes,irent", "rai,ras,ra,rons,rez,ront", "rais,rais,rait,rions,riez,raient",
			"e,es,e,ions,iez,ent", "isse,isses,�t,issions,issiez,issent", "e,ons,ez", "ant", "i" };
	private static String[] affixes_3eG_oir = { "x,x,t,ons,ez,ent", "ais,ais,ait,ions,iez,aient",
			"us,us,ut,�mes,�tes,urent", "rai,ras,ra,rons,rez,ront", "rais,rais,rait,rions,riez,raient",
			"e,es,e,ions,iez,ent", "usse,usses,�t,ussions,ussiez,ussent", "e,ons,ez", "ant", "u" };
	private static String[] affixes_3eG_re = { "s,s, ,ons,ez,ont", "ais,ais,ait,ions,iez,aient",
			"is,is,it,�mes,�tes,irent", "rai,ras,ra,rons,rez,ront", "rais,rais,rait,rions,riez,raient",
			"e,es,e,ions,iez,ent", "isse,isses,�t,issions,issiez,issent", "e,ons,ez", "ant", "i" };
	private static String[] affixes_3eG = {};

	@Override
	public Verbe getVerbe(String v) {
		boolean vp = false;
		String[] segments = v.split(" |'");
		if (segments.length == 2)
			vp = true;
		if (v.substring(v.length() - 2, v.length()).equals(suffixe_1erG))
			return new VerbeR�gulier(v, vp, affixes_1erG);
		else if (v.substring(v.length() - 2, v.length()).equals(suffixe_2eG)) {
			if (v.charAt(v.length() - 3) == 'n' || v.charAt(v.length() - 3) == 'm' || v.charAt(v.length() - 3) == 'l')
				return new VerbeR�gulier(v, vp, affixes_2eG);
			else
				return new VerbeIrr�gulier(v, vp, affixes_3eG);
		} else
			return new VerbeIrr�gulier(v, vp, affixes_3eG);
	}
}
