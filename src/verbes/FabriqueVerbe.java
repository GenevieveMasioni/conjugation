package verbes;

public class FabriqueVerbe implements InterFabriqueVerbe {
	private static String suffixe_1erG = "er";

	private static String[] affixes_1erG = { "e,es,e,ons,ez,ent", "ais,ais,ait,ions,iez,aient",
			"ai,as,a,�mes,�tes,�rent", "erai,eras,era,erons,erez,eront", "erais,erais,erait,erions,eriez,eraient",
			"e,es,e,ions,iez", "asse,asses,�t,assions,assiez,assent", "e,ons,ez", "ant", "�" };

	private static String[] affixes_2eG = { "s,s,t,ssons,ssez,ssent", "ssais,ssais,ssait,ssions,ssiez,ssaient",
			"is,is,it,�mes,�tes,irent", "rai,ras,ra,rons,rez,ront", "rais,rais,rait,rions,riez,raient",
			"sse,sses,sse,ssions,ssiez,ssent", "sse,sses,t,ssions,ssiez,ssent", "s,ssons,ssez", "ssant", "i" };

	private static String[] affixes_enir = { "iens,iens,ient,enons,enez,iennent",
			"enais,enais,enait,enions,eniez,enaient", "ins,ins,int,�nmes,�ntes,inrent",
			"iendrai,iendras,iendra,iendrons,iendrez,iendront",
			"iendrais,iendrais,iendrait,iendrions,iendriez,iendraient", "ienne,iennes,ienne,enions,eniez,iennent",
			"insse,insses,�nt,inssions,inssiez,inssent", "iens,enons,enez", "enant", "enu", "enir" };

	private static String[] affixes_erir = { "iers,iers,iert,�rons,�rez,i�rent",
			"�rais,�rais,�rait,�rions,�riez,�raient", "is,is,it,�mes,�tes,irent",
			"errai,erras,erra,errons,errez,erront", "errais,errais,errait,errions,erriez,erraient",
			"i�re,i�res,i�re,�rions,�riez,i�rent", "isse,isses,�t,issions,issiez,issent", "iers,�rons,�rez", "�rant",
			"is", "�rir" };

	private static String[] affixes_tir = { "s,s,t,tons,tez,tent", "tais,tais,tait,tions,tiez,taient",
			"tis,tis,tit,t�mes,t�tes,tirent", "tirai,tiras,tira,tirons,tirez,tiront",
			"tirais,tirais,tirait,tirions,tirirez,tiraient", "te,tes,te,tions,tiez,tent",
			"tisse,tisses,t�t,tissions,tissiez,tissent", "s,tons,tez", "tant", "ti", "tir" };

	private static String[] affixes_vrir = { "re,rez,re,rons,rez,rent", "rais,rais,rait,rions,riez,raient",
			"ris,ris,rit,r�mes,r�tes,rirent", "rirai,riras,rira,rirons,rirez,rirons",
			"rirais,rirais,rirait,ririons,ririez,riraient", "re,rez,re,rions,riez,rent",
			"risse,risses,r�t,rissions,rissiez,rissent", "re,rons,rez", "rant", "ert", "rir" };
	
	private static String[] affixes_aillir = { "aille,ailles,aille,aillons,aillez,aillent",
			"aillais,aillais,aillait,aillions,ailliez,aillaient", "aillis,aillis,aillit,aill�mes,aill�tes,aillirent",
			"aillirai,ailliras,aillira,aillirons,aillirez,ailliront",
			"aillirais,aillirais,aillirait,aillirions,ailliriez,ailliraient",
			"aille,ailles,aille,aillions,ailliez,aillent",
			"aillisse,aillisses,aill�t,aillissions,aillissiez,aillissent", "aille,aillons,aillez", "aillant", "ailli",
			"aillir" };

	private static String[] affixes_cevoir = { "�ois,�ois,�oit,cevons,cevez,�oivent",
			"cevais,cevais,cevait,cevions,ceviez,cevaient", "�us,�us,�ut,��mes,��tes,�urent",
			"cevrai,cevras,cevra,cevrons,cevrez,cevront", "cevrais,cevrais,cevrait,cevrions,cevriez,cevraient",
			"�oive,�oives,�oive,cevions,ceviez,�oivent", "�usse,�usses,��t,�ussions,�ussiez,�ussent",
			"�ois,cevons,cevez", "cevant", "�u", "cevoir" };
	
	private static String[] affixes_andre = { "nds,nds,nd,ndons,ndez,ndent", "ndais,ndais,ndait,ndions,ndiez,ndaient",
			"ndis,ndis,ndit,nd�mes,nd�tes,ndirent", "ndrai,ndras,ndra,ndrons,ndrez,ndront",
			"ndrais,ndrais,ndrait,ndrions,ndriez,ndraient", "nde,ndes,nde,ndions,ndiez,ndent",
			"ndisse,ndisses,nd�t,ndissions,ndissiez,ndissent", "nds,ndons,ndez", "ndant", "ndu", "ndre" };

	private static String[] affixes_erdre = { "rds,rds,rd,rdons,rdez,rdent", "rdais,rdais,rdait,rdions,rdiez,rdaient",
			"rdis,rdis,rdit,rd�mes,rd�tes,rdirent", "rdrai,rdras,rdra,rdrons,rdrez,rdront",
			"rdrais,rdrais,rdrait,rdrions,rdriez,rdraient", "rde,rdes,rde,rdions,rdiez,rdent",
			"rdisse,rdisses,rd�t,rdissions,rdissiez,rdissent", "rds,rdons,rdez", "rdant", "rdu", "rdre" };

	private static String[] affixes_eindre = { "ins,ins,int,ignons,ignez,ignent",
			"ignais,ignais,ignait,ignions,igniez,ignaient", "ignis,ignis,ignit,ign�mes,ign�tes,ignirent",
			"indrai,indras,indra,indrons,indrez,indront", "indrais,indrais,indrait,indrions,indriez,indraient",
			"igne,ignes,igne,ignions,igniez,ignent", "ignisse,ignisses,ign�t,ignissions,ignissiez,ignissent",
			"ins,ignons,ignez", "ignant", "int", "indre" };

	private static String[] affixes_aire = { "ais,ais,ait,ayons,ayez,aient", "ayais,ayais,ayait,ayions,ayiez,ayaient",
			"-,-,-,-,-,-", "airai,airas,aira,airons,airez,airont", "airais,airais,airait,airions,airiez,airaient",
			"aie,aies,aie,yayions,ayiez,aient", "-,-,-,-,-,-", "ais,ayons,ayez", "ayant", "ait", "aire" };
	
	private static String[] affixes_oitre = { "ois,ois,o�t,oissons,oissez,oissent",
			"oissais,oissais,oissait,oissions,oissiez,oissaient", "�s,�s,�t,�mes,�tes,�rent",
			"o�trai,o�tras,o�tra,o�trons,o�trez,o�tront", "o�trais,o�trais,o�trait,o�trions,o�triez,o�traient",
			"oisse,oisses,oisse,oissions,oissiez,oissent", "usse,�sses,�t,�ssions,�ssiez,�ssent", "o�s,oissons,oissez",
			"oissant", "�", "oitre" };
	
	private static String[] affixes_aitre = { "ais,ais,a�t,aissons,aissez,aissent",
			"aissais,aissais,aissait,aissions,aissiez,aissaient", "us,us,ut,�mes,�tes,urent",
			"a�trai,a�tras,a�tra,a�trons,a�trez,a�tront", "a�trais,a�trais,a�trait,a�trions,a�triez,a�traient",
			"aisse,aisses,aisse,aissions,aissiez,aissent", "usse,usses,�t,ussions,ussiez,ussent", "ais,aissons,aissez",
			"aissant", "u", "a�tre" };

	private static String[] affixes_clure = { "us,us,ut,uons,uez,uent", "uais,uais,uait,uions,uiez,uaient",
			"us,us,ut,�mes,�tes,urent", "urai,uras,ura,urons,urez,uront", "urais,urais,urait,urions,uriez,uraient",
			"ue,ues,ue,uions,uiez,uent", "usse,usses,�t,ussions,ussiez,ussent", "us,uons,uez", "uant", "u", "ure" };
	
	private static String[] affixes_soudre = { "sous,sous,sout,solvons,solvez,solvent",
			"solvais,solvais,solavit,solvions,solviez,solvaient", "-,-,-,-,-,-",
			"soudrai,soudras,soudra,soudrons,soudrez,soudront",
			"soudrai,soudrais,soudrait,soudrions,soudriez,soudraient", "solve,solves,solve,solvions,solviez,solvent",
			"-,-,-,-,-,-", "sous,solvons,solvez", "solvant", "sous", "soudre" };

	private static String[] affixes_crire = { "cris,cris,crit,crivons,crivez,crivent",
			"crivais,crivais,crivait,crivions,criviez,crivaient", "crivis,crivis,crivit,criv�mes,criv�tes,crivirent",
			"crirai,criras,crira,crirons,crirez,criront", "crirais,crirais,crirais,cririons,cririez,criraient",
			"crive,crives,crive,crivions,criviez,crivent",
			"crivisse,crivisses,criv�t,crivissions,crivissiez,crivissent", "cris,crivons,crivez", "crivant", "crit",
			"crire" };
	
	private static String[] affixes_uire = { "uis,uis,uit,uisons,uisez,uisent",
			"uisais,uisais,uissait,uisions,uisiez,uisaient", "uisis,uisis,uisit,uis�mes,uis�tes,uisirent",
			"uirai,uiras,uira,uirons,uirez,uiront", "uirais,uirais,uirait,uirions,uiriez,uiraient",
			"uise,uises,uise,uisions,uisiez,uisent", "uisisse,uisisses,uis�t,uisissions,uisissiez,uisissent",
			"uis,uisons,uisez", "uisant", "uit", "uire" };
	
	public String[] exceptions = { "aller", "v�tir", "cueillir", "faillir", "bouillir", "dormir", "courir", "mourir",
			"servir", "fuir", "ou�r", "g�sir", "pourvoir", "savoir", "devoir", "pouvoir", "mouvoir", "pleuvoir", "voir",
			"falloir", "valoir", "vouloir", "asseoir", "messeoir", "surseoir", "seoir", "�choir", "d�choir", "choir",
			"rompre", "prendre", "battre", "mettre", "vaincre", "faire", "plaire", "taire", "na�tre", "repa�tre",
			"pa�tre", "cro�tre", "croire", "boire", "clore", "r�soudre", "coudre", "moudre", "suivre", "vivre", "lire",
			"dire", "�crire", "rire", "confire" };

	@Override
	public Verbe getVerbe(String v) {
		boolean vp = this.estPronominal(v);
		
		// Verbes du 1er groupe
		if (v.substring(v.length() - 2, v.length()).equals(suffixe_1erG))
			return new VerbeRegulier(v, vp, affixes_1erG);
		
		// Verbes type du 3e groupe
		for (String s : this.exceptions) {
			if (v.equals(s))
				return new VerbeIrregulier("", vp, VerbeType.getAffixes(s));
			else if (v.endsWith(s))
				return new VerbeIrregulier(v, vp, VerbeType.getAffixes(s));
		}
		
		// Sous-ensembles des verbes du 3e groupe, r�guliers entre eux
		if (v.endsWith("enir"))
			return new VerbeIrregulier(v, vp, affixes_enir, "enir");
		else if (v.endsWith("�rir"))
			return new VerbeIrregulier(v, vp, affixes_erir, "�rir");
		else if (v.endsWith("tir"))
			return new VerbeIrregulier(v, vp, affixes_tir, "tir");
		else if (v.endsWith("vrir"))
			return new VerbeIrregulier(v, vp, affixes_vrir, "rir");
		else if (v.endsWith("frir"))
			return new VerbeIrregulier(v, vp, affixes_vrir, "rir");
		else if (v.endsWith("aillir"))
			return new VerbeIrregulier(v, vp, affixes_aillir, "aillir");
		else if (v.endsWith("cevoir"))
			return new VerbeIrregulier(v, vp, affixes_cevoir, "cevoir");
		else if (v.endsWith("andre"))
			return new VerbeIrregulier(v, vp, affixes_andre, "ndre");
		else if (v.endsWith("endre"))
			return new VerbeIrregulier(v, vp, affixes_andre, "ndre");
		else if (v.endsWith("ondre"))
			return new VerbeIrregulier(v, vp, affixes_andre, "ndre");
		else if (v.endsWith("erdre"))
			return new VerbeIrregulier(v, vp, affixes_erdre, "rdre");
		else if (v.endsWith("ordre"))
			return new VerbeIrregulier(v, vp, affixes_erdre, "rdre");
		else if (v.endsWith("eindre"))
			return new VerbeIrregulier(v, vp, affixes_eindre, "indre");
		else if (v.endsWith("oindre"))
			return new VerbeIrregulier(v, vp, affixes_eindre, "indre");
		else if (v.endsWith("aindre"))
			return new VerbeIrregulier(v, vp, affixes_eindre, "indre");
		else if (v.endsWith("aire"))
			return new VerbeIrregulier(v, vp, affixes_aire, "aire");
		else if (v.endsWith("a�tre"))
			return new VerbeIrregulier(v, vp, affixes_aitre, "a�tre");
		else if (v.endsWith("o�tre"))
			return new VerbeIrregulier(v, vp, affixes_oitre, "o�tre");
		else if (v.endsWith("clure"))
			return new VerbeIrregulier(v, vp, affixes_clure, "ure");
		else if (v.endsWith("soudre"))
			return new VerbeIrregulier(v, vp, affixes_soudre, "soudre");
		else if (v.endsWith("scrire"))
			return new VerbeIrregulier(v, vp, affixes_crire, "crire");
		else if (v.endsWith("uire"))
			return new VerbeIrregulier(v, vp, affixes_uire, "uire");
		
		// Verbes du 2e groupe
		return new VerbeRegulier(v, vp, affixes_2eG);
	}
	
	public boolean estPronominal(String v) {
		boolean vp = false;
		String[] segments = v.split(" |'");
		if (segments.length == 2)
			vp = true;
		return vp;
	}
}
