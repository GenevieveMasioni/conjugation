package conjugaison;

import java.util.HashMap;

public class VerbeSpecial implements Verbe {
	private String[] pronoms = { "je", "tu", "il/elle", "nous", "vous", "ils/elles" };
	private HashMap<String, String> aller = HashMapBuilder.build("Indicatif_pr�sent", "vais,vas,va,allons,allez,vont",
			"Indicatif_imparfait", "allais,allais,allit,allions,alliez,allaient", "Indicatif_pass�_simple",
			"allai,allas,alla,all�mes,all�tes,all�rent", "Indicatif_futur_simple", "irai,iras,ira,irons,irez,iront",
			"Conditionnel_pr�sent", "irais,irais,irait,irions,iriez,iraient", "Subjonctif_pr�sent",
			"aille,ailles,aille,allions,alliez,aillent", "Subjonctif_imparfait",
			"allasse,allasses,all�t,allassions,allassiez,allassent", "Imp�ratif_pr�sent", "va,allons,allez",
			"Participe_pr�sent", "allant", "Participe_pass�", "all�", "Infinitif_pr�sent", "aller");
	private HashMap<String, String> tenir = HashMapBuilder.build("Indicatif_pr�sent",
			"tiens,tiens,tient,tenons,tenez,tiennent", "Indicatif_imparfait",
			"tenais,tenais,tenait,tenions,teniez,tenaient", "Indicatif_pass�_simple",
			"tins,tins,tint,t�nmes,t�ntes,tinrentt", "Indicatif_futur_simple",
			"tiendrai,tiendras,tiendra,tiendrons,tiendrez,tiendront", "Conditionnel_pr�sent",
			"tiendrais,tiendrais,tiendrait,tiendrions,tiendriez,tiendraient", "Subjonctif_pr�sent",
			"tienne,tiennes,tienne,tenions,teniez,tiennent", "Subjonctif_imparfait",
			"tinsse,tinsses,t�nt,tinssions,tinssiez,tinssent", "Imp�ratif_pr�sent", "tiens,tenons,tenez",
			"Participe_pr�sent", "tenant", "Participe_pass�", "tenu", "Infinitif_pr�sent", "tenir");
	private HashMap<String, String> acquerir = HashMapBuilder.build("Indicatif_pr�sent",
			"acquiers,acquiers,acquiert,acqu�rons,acqu�rez,acqui�rent", "Indicatif_imparfait",
			"acqu�rais,acqu�rais,acqu�rait,acqu�rions,acqu�riez,acqu�raient", "Indicatif_pass�_simple",
			"acquis,acquis,acquit,acqu�mes,acqu�tes,acquirent", "Indicatif_futur_simple",
			"acquerrai,acquerras,acquerra,acquerrons,acquerrez,acquerront", "Conditionnel_pr�sent",
			"acquerrais,acquerrais,acquerrait,acquerrions,acquerriez,acquerraient", "Subjonctif_pr�sent",
			"acqui�re,acqui�res,acqui�re,acqu�rions,acqu�riez,acqui�rent", "Subjonctif_imparfait",
			"acquisse,acquisses,acqu�t,acquissions,acquissiez,acquissent", "Imp�ratif_pr�sent",
			"acquiers,acqu�rons,acqu�rez", "Participe_pr�sent", "acqu�rant", "Participe_pass�", "acquis",
			"Infinitif_pr�sent", "acqu�rir");
	private HashMap<String, String> sentir = HashMapBuilder.build("Indicatif_pr�sent",
			"sens,sens,sent,sentons,sentez,sentent", "Indicatif_imparfait",
			"sentais,sentais,sentait,sentions,sentiez,sentaient", "Indicatif_pass�_simple",
			"sentis,sentis,sentit,sent�mes,sent�tes,sentirent", "Indicatif_futur_simple",
			"sentirai,sentiras,sentira,sentirons,sentirez,sentiront", "Conditionnel_pr�sent",
			"sentirais,sentirais,sentirait,sentirions,sentirire,sentiraient", "Subjonctif_pr�sent",
			"sente,sentes,sente,sentions,sentiez,sentent", "Subjonctif_imparfait",
			"sentisse,sentisses,sent�t,sentissions,sentissiez,sentissent", "Imp�ratif_pr�sent", "sens,sentons,sentez",
			"Participe_pr�sent", "sentant", "Participe_pass�", "senti", "Infinitif_pr�sent", "sentir");
	private HashMap<String, String> vetir = HashMapBuilder.build("Indicatif_pr�sent",
			"v�ts,v�ts,v�t,v�tons,v�tez,v�tent", "Indicatif_imparfait", "v�tais,v�tais,v�tait,v�tions,v�tiez,v�taient",
			"Indicatif_pass�_simple", "v�tis,v�tis,v�tit,v�t�mes,v�t�tes,v�tirent", "Indicatif_futur_simple",
			"v�tirai,v�tiras,v�tira,v�tirons,v�tirez,v�tiront", "Conditionnel_pr�sent",
			"v�tirais,v�tirais,v�tirait,v�tirions,v�tiriez,v�tiraient", "Subjonctif_pr�sent",
			"v�te,v�tes,v�te,v�tions,v�tiez,v�tent", "Subjonctif_imparfait",
			"v�tisse,v�tisses,v�t�t,v�tissions,v�tissiez,v�tissent", "Imp�ratif_pr�sent", "v�ts,v�tons,v�tez",
			"Participe_pr�sent", "v�tant", "Participe_pass�", "v�tu", "Infinitif_pr�sent", "v�tir");
	private HashMap<String, String> couvrir = HashMapBuilder.build("Indicatif_pr�sent",
			"couvre,couvrez,couvre,couvrons,couvrez,couvrent", "Indicatif_imparfait",
			"couvrais,couvrais,couvrait,couvrions,couvriez,couvraient", "Indicatif_pass�_simple",
			"couvris,couvris,couvrit,couvr�mes,couvr�tes,couvrirent", "Indicatif_futur_simple",
			"couvrirai,couvriras,couvrira,couvrirons,couvrirez,couvrirons", "Conditionnel_pr�sent",
			"couvrirais,couvrirais,couvrirait,couvririons,couvririez,couvriraient", "Subjonctif_pr�sent",
			"couvre,couvrez,couvre,couvrions,couvriez,couvrent", "Subjonctif_imparfait",
			"couvrisse,couvrisses,couvr�t,couvrissions,couvrissiez,couvrissent", "Imp�ratif_pr�sent",
			"couvre,couvrons,couvrez", "Participe_pr�sent", "couvrant", "Participe_pass�", "couvert",
			"Infinitif_pr�sent", "couvrir");
	private HashMap<String, String> cueillir = HashMapBuilder.build("Indicatif_pr�sent",
			"cueille,cueilles,cueille,cueillons,cueillez,cueillent", "Indicatif_imparfait",
			"cueillais,cueillais,cueillait,cueillions,cueilliez,cueillaient", "Indicatif_pass�_simple",
			"cueillis,cueillis,cueillit,cueill�mes,cueill�tes,cueillirent", "Indicatif_futur_simple",
			"cueillerai,cueilleras,cueillera,cueillerons,cueillerez,cueilleront", "Conditionnel_pr�sent",
			"cueillerais,cueillerais,cueillerait,cueillerions,cueilleriez,cueilleraient", "Subjonctif_pr�sent",
			"cueille,cueilles,cueille,cueillions,cueilliez,cueillent", "Subjonctif_imparfait",
			"cueillisse,cueillisses,cueill�t,cueillissions,cueillissiez,cueillissent", "Imp�ratif_pr�sent",
			"cueille,cueillons,cueillez", "Participe_pr�sent", "cueillant", "Participe_pass�", "cueilli",
			"Infinitif_pr�sent", "cueillir");
	private HashMap<String, String> assaillir = HashMapBuilder.build("Indicatif_pr�sent",
			"assaille,assailles,assaille,assaillons,assaillez,assaillent", "Indicatif_imparfait",
			"assaillais,assaillais,assaillait,assaillions,assailliez,assaillaient", "Indicatif_pass�_simple",
			"assaillis,assaillis,assaillit,assaill�mes,assaill�tes,assaillirent", "Indicatif_futur_simple",
			"assaillirai,assailliras,assaillira,assaillirons,assaillirez,assailliront", "Conditionnel_pr�sent",
			"assaillirais,assaillirais,assaillirait,assaillirions,assailliriez,assailliraient", "Subjonctif_pr�sent",
			"assaille,assailles,assaille,assaillions,assailliez,assaillent", "Subjonctif_imparfait",
			"assaillisse,assaillisses,assaill�t,assaillissions,assaillissiez,assaillissent", "Imp�ratif_pr�sent",
			"assaille,assaillons,assaillez", "Participe_pr�sent", "assaillant", "Participe_pass�", "assailli",
			"Infinitif_pr�sent", "assaillir");
	

	// "faillir", "bouillir", "dormir", "courir", "mourir", "servir", "fuir",
	// "ou�r", "g�sir", "recevoir", "voir",
	// "pourvoir", "savoir", "devoir", "pouvoir", "mouvoir", "pleuvoir", "falloir",
	// "valoir", "vouloir", "asseoir",
	// "seoir", "messeoir", "surseoir", "choir", "�choir", "d�choir", "rendre",
	// "prendre", "battre", "mettre",
	// "peindre", "joindre", "craindre", "vaincre", "traire", "faire", "plaire",
	// "connaitre", "na�tre", "pa�tre",
	// "repa�tre", "cro�tre", "croire", "boire", "clore", "conclure", "absoudre",
	// "coudre", "moudre", "suivre",
	// "vivre", "lire", "dire", "rire", "�crire", "confire", "cuir"

	private HashMap[] exceptions = { aller, tenir, acquerir, sentir, vetir, couvrir, cueillir, assaillir };
	private HashMap<String, String> affixes;

	public VerbeSpecial(String v) {
		for (HashMap<String, String> hm : exceptions) {
			if (hm.get("Infinitif_pr�sent").equals(v)) {
				this.affixes = hm;
			}
		}
	}

	@Override
	public String conjuguer(Temps tps, int num, Multiplicit� mult) {
		if (tps == Temps.Participe_pr�sent || tps == Temps.Participe_pass� || tps == Temps.Infinitif_pr�sent
				|| tps == Temps.G�rondif) {
			throw new IllegalArgumentException("Personne et nombre non-conformes avec le temps.");
		}
		String[] p = this.choisirPronoms();

		String[] af = affixes.get(tps.toString()).split(",");

		num--;
		if (mult == Multiplicit�.pluriel)
			num += 3;
		return p[num] + " " + af[num];
	}

	@Override
	public String conjuguerAu(Temps tps) {
		String[] af, p;
		String s = "";
		
			switch (tps) {
			case Imp�ratif_pr�sent:
				af = affixes.get(tps.toString()).split(",");
				for (String a : af)
					s += a;
				return s;
			case Participe_pr�sent:
			case Participe_pass�:
				return affixes.get(tps.toString());
			case Infinitif_pr�sent:
				return affixes.get(tps.toString());
			case G�rondif:
				return "en " + this.getParticipePr�sent();
			default:
				p = this.choisirPronoms();
				af = affixes.get(tps.toString()).split(",");
				for (int i = 0; i < af.length; ++i)
					s += p[i] + " " + af[i] + "\n";
				return s;
			}
	}

	private String getParticipePr�sent() {
		return affixes.get(Temps.Participe_pr�sent.toString());
	}

	public String[] choisirPronoms() {
		return this.pronoms;
	}
}
