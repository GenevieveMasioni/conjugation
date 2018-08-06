package verbes;

public class FabriqueVerbe implements InterFabriqueVerbe {
	private static String suffixe_1erG = "er";

	private static String[] affixes_1erG = { "e,es,e,ons,ez,ent", "ais,ais,ait,ions,iez,aient",
			"ai,as,a,âmes,âtes,èrent", "erai,eras,era,erons,erez,eront", "erais,erais,erait,erions,eriez,eraient",
			"e,es,e,ions,iez", "asse,asses,ât,assions,assiez,assent", "e,ons,ez", "ant", "é" };

	private static String[] affixes_2eG = { "s,s,t,ssons,ssez,ssent", "ssais,ssais,ssait,ssions,ssiez,ssaient",
			"is,is,it,îmes,îtes,irent", "rai,ras,ra,rons,rez,ront", "rais,rais,rait,rions,riez,raient",
			"sse,sses,sse,ssions,ssiez,ssent", "sse,sses,t,ssions,ssiez,ssent", "s,ssons,ssez", "ssant", "i" };

	private static String[] affixes_enir = { "iens,iens,ient,enons,enez,iennent",
			"enais,enais,enait,enions,eniez,enaient", "ins,ins,int,înmes,întes,inrent",
			"iendrai,iendras,iendra,iendrons,iendrez,iendront",
			"iendrais,iendrais,iendrait,iendrions,iendriez,iendraient", "ienne,iennes,ienne,enions,eniez,iennent",
			"insse,insses,înt,inssions,inssiez,inssent", "iens,enons,enez", "enant", "enu", "enir" };

	private static String[] affixes_erir = { "iers,iers,iert,érons,érez,ièrent",
			"érais,érais,érait,érions,ériez,éraient", "is,is,it,îmes,îtes,irent",
			"errai,erras,erra,errons,errez,erront", "errais,errais,errait,errions,erriez,erraient",
			"ière,ières,ière,érions,ériez,ièrent", "isse,isses,ît,issions,issiez,issent", "iers,érons,érez", "érant",
			"is", "érir" };

	private static String[] affixes_tir = { "s,s,t,tons,tez,tent", "tais,tais,tait,tions,tiez,taient",
			"tis,tis,tit,tîmes,tîtes,tirent", "tirai,tiras,tira,tirons,tirez,tiront",
			"tirais,tirais,tirait,tirions,tirirez,tiraient", "te,tes,te,tions,tiez,tent",
			"tisse,tisses,tît,tissions,tissiez,tissent", "s,tons,tez", "tant", "ti", "tir" };

	private static String[] affixes_vrir = { "re,rez,re,rons,rez,rent", "rais,rais,rait,rions,riez,raient",
			"ris,ris,rit,rîmes,rîtes,rirent", "rirai,riras,rira,rirons,rirez,rirons",
			"rirais,rirais,rirait,ririons,ririez,riraient", "re,rez,re,rions,riez,rent",
			"risse,risses,rît,rissions,rissiez,rissent", "re,rons,rez", "rant", "ert", "rir" };
	
	private static String[] affixes_aillir = { "aille,ailles,aille,aillons,aillez,aillent",
			"aillais,aillais,aillait,aillions,ailliez,aillaient", "aillis,aillis,aillit,aillîmes,aillîtes,aillirent",
			"aillirai,ailliras,aillira,aillirons,aillirez,ailliront",
			"aillirais,aillirais,aillirait,aillirions,ailliriez,ailliraient",
			"aille,ailles,aille,aillions,ailliez,aillent",
			"aillisse,aillisses,aillît,aillissions,aillissiez,aillissent", "aille,aillons,aillez", "aillant", "ailli",
			"aillir" };

	private static String[] affixes_cevoir = { "çois,çois,çoit,cevons,cevez,çoivent",
			"cevais,cevais,cevait,cevions,ceviez,cevaient", "çus,çus,çut,çûmes,çûtes,çurent",
			"cevrai,cevras,cevra,cevrons,cevrez,cevront", "cevrais,cevrais,cevrait,cevrions,cevriez,cevraient",
			"çoive,çoives,çoive,cevions,ceviez,çoivent", "çusse,çusses,çût,çussions,çussiez,çussent",
			"çois,cevons,cevez", "cevant", "çu", "cevoir" };
	
	private static String[] affixes_andre = { "nds,nds,nd,ndons,ndez,ndent", "ndais,ndais,ndait,ndions,ndiez,ndaient",
			"ndis,ndis,ndit,ndîmes,ndîtes,ndirent", "ndrai,ndras,ndra,ndrons,ndrez,ndront",
			"ndrais,ndrais,ndrait,ndrions,ndriez,ndraient", "nde,ndes,nde,ndions,ndiez,ndent",
			"ndisse,ndisses,ndît,ndissions,ndissiez,ndissent", "nds,ndons,ndez", "ndant", "ndu", "ndre" };

	private static String[] affixes_erdre = { "rds,rds,rd,rdons,rdez,rdent", "rdais,rdais,rdait,rdions,rdiez,rdaient",
			"rdis,rdis,rdit,rdîmes,rdîtes,rdirent", "rdrai,rdras,rdra,rdrons,rdrez,rdront",
			"rdrais,rdrais,rdrait,rdrions,rdriez,rdraient", "rde,rdes,rde,rdions,rdiez,rdent",
			"rdisse,rdisses,rdît,rdissions,rdissiez,rdissent", "rds,rdons,rdez", "rdant", "rdu", "rdre" };

	private static String[] affixes_eindre = { "ins,ins,int,ignons,ignez,ignent",
			"ignais,ignais,ignait,ignions,igniez,ignaient", "ignis,ignis,ignit,ignîmes,ignîtes,ignirent",
			"indrai,indras,indra,indrons,indrez,indront", "indrais,indrais,indrait,indrions,indriez,indraient",
			"igne,ignes,igne,ignions,igniez,ignent", "ignisse,ignisses,ignît,ignissions,ignissiez,ignissent",
			"ins,ignons,ignez", "ignant", "int", "indre" };

	private static String[] affixes_aire = { "ais,ais,ait,ayons,ayez,aient", "ayais,ayais,ayait,ayions,ayiez,ayaient",
			"-,-,-,-,-,-", "airai,airas,aira,airons,airez,airont", "airais,airais,airait,airions,airiez,airaient",
			"aie,aies,aie,yayions,ayiez,aient", "-,-,-,-,-,-", "ais,ayons,ayez", "ayant", "ait", "aire" };
	
	private static String[] affixes_oitre = { "ois,ois,oît,oissons,oissez,oissent",
			"oissais,oissais,oissait,oissions,oissiez,oissaient", "ûs,ûs,ût,ûmes,ûtes,ûrent",
			"oîtrai,oîtras,oîtra,oîtrons,oîtrez,oîtront", "oîtrais,oîtrais,oîtrait,oîtrions,oîtriez,oîtraient",
			"oisse,oisses,oisse,oissions,oissiez,oissent", "usse,ûsses,ût,ûssions,ûssiez,ûssent", "oîs,oissons,oissez",
			"oissant", "û", "oitre" };
	
	private static String[] affixes_aitre = {
			"ais,ais,aît,aissons,aissez,aissent",
			"aissais,aissais,aissait,aissions,aissiez,aissaient",
			"us,us,ut,ûmes,ûtes,urent",
			"aîtrai,aîtras,aîtra,aîtrons,aîtrez,aîtront",
			"aîtrais,aîtrais,aîtrait,aîtrions,aîtriez,aîtraient",
			"aisse,aisses,aisse,aissions,aissiez,aissent",
			"usse,usses,ût,ussions,ussiez,ussent",
			"ais,aissons,aissez",
			"aissant",
			"u",
			"aître"
};
	
	private static String[] affixes_clure = {
			"us,us,ut,uons,uez,uent",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
};
	
	private static String[] affixes_soudre = {
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
};

	private static String[] affixes_scrire = {
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
};
	
	private static String[] affixes_uire = {
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
};
	
	
	public String[] exceptions = { "aller", "vêtir", "cueillir",
			"faillir", "bouillir", "dormir", "courir", "mourir", "servir", "fuir", "ouïr", "gésir", "recevoir", "voir",
			"pourvoir", "savoir", "devoir", "pouvoir", "mouvoir", "pleuvoir", "falloir", "valoir", "vouloir", "asseoir",
			"seoir", "messeoir", "surseoir", "choir", "échoir", "déchoir", "rendre", "prendre", "battre", "mettre",
			"peindre", "joindre", "craindre", "vaincre", "traire", "faire", "plaire", "connaitre", "naître", "paître",
			"repaître", "croître", "croire", "boire", "clore", "conclure", "absoudre", "coudre", "moudre", "suivre",
			"vivre", "lire", "dire", "rire", "écrire", "confire", "cuire", "finir"};

	@Override
	public Verbe getVerbe(String v) {
		boolean vp = this.estPronominal(v);
		
		if (v.substring(v.length() - 2, v.length()).equals(suffixe_1erG))
			return new VerbeRegulier(v, vp, affixes_1erG);
		
		for (String s : this.exceptions) {
			if (v.equals(s))
				return new VerbeIrregulier("", vp, VerbeType.getAffixes(s));
			else if (v.contains(s))
				return new VerbeIrregulier(v, vp, VerbeType.getAffixes(s));
		}
		
		if(v.contains("enir")) return new VerbeIrregulier(v, vp, affixes_enir, "enir");
		else if(v.contains("érir")) return new VerbeIrregulier(v, vp, affixes_erir, "érir");
		else if(v.contains("tir")) return new VerbeIrregulier(v, vp, affixes_tir, "tir");
		else if(v.contains("vrir")) return new VerbeIrregulier(v, vp, affixes_vrir, "rir");
		else if(v.contains("frir")) return new VerbeIrregulier(v, vp, affixes_vrir, "rir");
		else if(v.contains("aillir")) return new VerbeIrregulier(v, vp, affixes_aillir, "aillir");
		else if(v.contains("cevoir")) return new VerbeIrregulier(v, vp, affixes_cevoir, "cevoir");
		else if(v.contains("andre")) return new VerbeIrregulier(v, vp, affixes_andre, "ndre");
		else if(v.contains("endre")) return new VerbeIrregulier(v, vp, affixes_andre, "ndre");
		else if(v.contains("ondre")) return new VerbeIrregulier(v, vp, affixes_andre, "ndre");
		else if(v.contains("erdre")) return new VerbeIrregulier(v, vp, affixes_erdre, "rdre");
		else if(v.contains("ordre")) return new VerbeIrregulier(v, vp, affixes_erdre, "rdre");
		else if(v.contains("eindre")) return new VerbeIrregulier(v, vp, affixes_eindre, "indre");
		else if(v.contains("oindre")) return new VerbeIrregulier(v, vp, affixes_eindre, "indre");
		else if(v.contains("aindre")) return new VerbeIrregulier(v, vp, affixes_eindre, "indre");
		else if(v.contains("aire")) return new VerbeIrregulier(v, vp, affixes_aire, "aire");
		else if(v.contains("aître")) return new VerbeIrregulier(v, vp, affixes_aitre, "aître");
		else if(v.contains("oître")) return new VerbeIrregulier(v, vp, affixes_oitre, "oître");
		else if(v.contains("clure")) return new VerbeIrregulier(v, vp, affixes_clure, "re");
		else if(v.contains("soudre")) return new VerbeIrregulier(v, vp, affixes_soudre, "soudre");
		else if(v.contains("scrire")) return new VerbeIrregulier(v, vp, affixes_scrire, "scrire");
		else if(v.contains("uire")) return new VerbeIrregulier(v, vp, affixes_uire, "uire");
		
		
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
