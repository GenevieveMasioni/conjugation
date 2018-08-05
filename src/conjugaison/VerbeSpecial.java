package conjugaison;

import java.util.HashMap;

public class VerbeSpecial implements Verbe {
	private String[] pronoms = { "je", "tu", "il/elle", "nous", "vous", "ils/elles" };
	private HashMap<String, String> aller = HashMapBuilder.build("Indicatif_présent", "vais,vas,va,allons,allez,vont",
			"Indicatif_imparfait", "allais,allais,allit,allions,alliez,allaient", "Indicatif_passé_simple",
			"allai,allas,alla,allâmes,allâtes,allèrent", "Indicatif_futur_simple", "irai,iras,ira,irons,irez,iront",
			"Conditionnel_présent", "irais,irais,irait,irions,iriez,iraient", "Subjonctif_présent",
			"aille,ailles,aille,allions,alliez,aillent", "Subjonctif_imparfait",
			"allasse,allasses,allât,allassions,allassiez,allassent", "Impératif_présent", "va,allons,allez",
			"Participe_présent", "allant", "Participe_passé", "allé", "Infinitif_présent", "aller");
	private HashMap<String, String> tenir = HashMapBuilder.build("Indicatif_présent",
			"tiens,tiens,tient,tenons,tenez,tiennent", "Indicatif_imparfait",
			"tenais,tenais,tenait,tenions,teniez,tenaient", "Indicatif_passé_simple",
			"tins,tins,tint,tînmes,tîntes,tinrentt", "Indicatif_futur_simple",
			"tiendrai,tiendras,tiendra,tiendrons,tiendrez,tiendront", "Conditionnel_présent",
			"tiendrais,tiendrais,tiendrait,tiendrions,tiendriez,tiendraient", "Subjonctif_présent",
			"tienne,tiennes,tienne,tenions,teniez,tiennent", "Subjonctif_imparfait",
			"tinsse,tinsses,tînt,tinssions,tinssiez,tinssent", "Impératif_présent", "tiens,tenons,tenez",
			"Participe_présent", "tenant", "Participe_passé", "tenu", "Infinitif_présent", "tenir");
	private HashMap<String, String> acquerir = HashMapBuilder.build("Indicatif_présent",
			"acquiers,acquiers,acquiert,acquérons,acquérez,acquièrent", "Indicatif_imparfait",
			"acquérais,acquérais,acquérait,acquérions,acquériez,acquéraient", "Indicatif_passé_simple",
			"acquis,acquis,acquit,acquîmes,acquîtes,acquirent", "Indicatif_futur_simple",
			"acquerrai,acquerras,acquerra,acquerrons,acquerrez,acquerront", "Conditionnel_présent",
			"acquerrais,acquerrais,acquerrait,acquerrions,acquerriez,acquerraient", "Subjonctif_présent",
			"acquière,acquières,acquière,acquérions,acquériez,acquièrent", "Subjonctif_imparfait",
			"acquisse,acquisses,acquît,acquissions,acquissiez,acquissent", "Impératif_présent",
			"acquiers,acquérons,acquérez", "Participe_présent", "acquérant", "Participe_passé", "acquis",
			"Infinitif_présent", "acquérir");
	private HashMap<String, String> sentir = HashMapBuilder.build("Indicatif_présent",
			"sens,sens,sent,sentons,sentez,sentent", "Indicatif_imparfait",
			"sentais,sentais,sentait,sentions,sentiez,sentaient", "Indicatif_passé_simple",
			"sentis,sentis,sentit,sentîmes,sentîtes,sentirent", "Indicatif_futur_simple",
			"sentirai,sentiras,sentira,sentirons,sentirez,sentiront", "Conditionnel_présent",
			"sentirais,sentirais,sentirait,sentirions,sentirire,sentiraient", "Subjonctif_présent",
			"sente,sentes,sente,sentions,sentiez,sentent", "Subjonctif_imparfait",
			"sentisse,sentisses,sentît,sentissions,sentissiez,sentissent", "Impératif_présent", "sens,sentons,sentez",
			"Participe_présent", "sentant", "Participe_passé", "senti", "Infinitif_présent", "sentir");
	private HashMap<String, String> vetir = HashMapBuilder.build("Indicatif_présent",
			"vêts,vêts,vêt,vêtons,vêtez,vêtent", "Indicatif_imparfait", "vêtais,vêtais,vêtait,vêtions,vêtiez,vêtaient",
			"Indicatif_passé_simple", "vêtis,vêtis,vêtit,vêtîmes,vêtîtes,vêtirent", "Indicatif_futur_simple",
			"vêtirai,vêtiras,vêtira,vêtirons,vêtirez,vêtiront", "Conditionnel_présent",
			"vêtirais,vêtirais,vêtirait,vêtirions,vêtiriez,vêtiraient", "Subjonctif_présent",
			"vête,vêtes,vête,vêtions,vêtiez,vêtent", "Subjonctif_imparfait",
			"vêtisse,vêtisses,vêtît,vêtissions,vêtissiez,vêtissent", "Impératif_présent", "vêts,vêtons,vêtez",
			"Participe_présent", "vêtant", "Participe_passé", "vêtu", "Infinitif_présent", "vêtir");
	private HashMap<String, String> couvrir = HashMapBuilder.build("Indicatif_présent",
			"couvre,couvrez,couvre,couvrons,couvrez,couvrent", "Indicatif_imparfait",
			"couvrais,couvrais,couvrait,couvrions,couvriez,couvraient", "Indicatif_passé_simple",
			"couvris,couvris,couvrit,couvrîmes,couvrîtes,couvrirent", "Indicatif_futur_simple",
			"couvrirai,couvriras,couvrira,couvrirons,couvrirez,couvrirons", "Conditionnel_présent",
			"couvrirais,couvrirais,couvrirait,couvririons,couvririez,couvriraient", "Subjonctif_présent",
			"couvre,couvrez,couvre,couvrions,couvriez,couvrent", "Subjonctif_imparfait",
			"couvrisse,couvrisses,couvrît,couvrissions,couvrissiez,couvrissent", "Impératif_présent",
			"couvre,couvrons,couvrez", "Participe_présent", "couvrant", "Participe_passé", "couvert",
			"Infinitif_présent", "couvrir");
	private HashMap<String, String> cueillir = HashMapBuilder.build("Indicatif_présent",
			"cueille,cueilles,cueille,cueillons,cueillez,cueillent", "Indicatif_imparfait",
			"cueillais,cueillais,cueillait,cueillions,cueilliez,cueillaient", "Indicatif_passé_simple",
			"cueillis,cueillis,cueillit,cueillîmes,cueillîtes,cueillirent", "Indicatif_futur_simple",
			"cueillerai,cueilleras,cueillera,cueillerons,cueillerez,cueilleront", "Conditionnel_présent",
			"cueillerais,cueillerais,cueillerait,cueillerions,cueilleriez,cueilleraient", "Subjonctif_présent",
			"cueille,cueilles,cueille,cueillions,cueilliez,cueillent", "Subjonctif_imparfait",
			"cueillisse,cueillisses,cueillît,cueillissions,cueillissiez,cueillissent", "Impératif_présent",
			"cueille,cueillons,cueillez", "Participe_présent", "cueillant", "Participe_passé", "cueilli",
			"Infinitif_présent", "cueillir");
	private HashMap<String, String> assaillir = HashMapBuilder.build("Indicatif_présent",
			"assaille,assailles,assaille,assaillons,assaillez,assaillent", "Indicatif_imparfait",
			"assaillais,assaillais,assaillait,assaillions,assailliez,assaillaient", "Indicatif_passé_simple",
			"assaillis,assaillis,assaillit,assaillîmes,assaillîtes,assaillirent", "Indicatif_futur_simple",
			"assaillirai,assailliras,assaillira,assaillirons,assaillirez,assailliront", "Conditionnel_présent",
			"assaillirais,assaillirais,assaillirait,assaillirions,assailliriez,assailliraient", "Subjonctif_présent",
			"assaille,assailles,assaille,assaillions,assailliez,assaillent", "Subjonctif_imparfait",
			"assaillisse,assaillisses,assaillît,assaillissions,assaillissiez,assaillissent", "Impératif_présent",
			"assaille,assaillons,assaillez", "Participe_présent", "assaillant", "Participe_passé", "assailli",
			"Infinitif_présent", "assaillir");
	

	// "faillir", "bouillir", "dormir", "courir", "mourir", "servir", "fuir",
	// "ouïr", "gésir", "recevoir", "voir",
	// "pourvoir", "savoir", "devoir", "pouvoir", "mouvoir", "pleuvoir", "falloir",
	// "valoir", "vouloir", "asseoir",
	// "seoir", "messeoir", "surseoir", "choir", "échoir", "déchoir", "rendre",
	// "prendre", "battre", "mettre",
	// "peindre", "joindre", "craindre", "vaincre", "traire", "faire", "plaire",
	// "connaitre", "naître", "paître",
	// "repaître", "croître", "croire", "boire", "clore", "conclure", "absoudre",
	// "coudre", "moudre", "suivre",
	// "vivre", "lire", "dire", "rire", "écrire", "confire", "cuir"

	private HashMap[] exceptions = { aller, tenir, acquerir, sentir, vetir, couvrir, cueillir, assaillir };
	private HashMap<String, String> affixes;

	public VerbeSpecial(String v) {
		for (HashMap<String, String> hm : exceptions) {
			if (hm.get("Infinitif_présent").equals(v)) {
				this.affixes = hm;
			}
		}
	}

	@Override
	public String conjuguer(Temps tps, int num, Multiplicité mult) {
		if (tps == Temps.Participe_présent || tps == Temps.Participe_passé || tps == Temps.Infinitif_présent
				|| tps == Temps.Gérondif) {
			throw new IllegalArgumentException("Personne et nombre non-conformes avec le temps.");
		}
		String[] p = this.choisirPronoms();

		String[] af = affixes.get(tps.toString()).split(",");

		num--;
		if (mult == Multiplicité.pluriel)
			num += 3;
		return p[num] + " " + af[num];
	}

	@Override
	public String conjuguerAu(Temps tps) {
		String[] af, p;
		String s = "";
		
			switch (tps) {
			case Impératif_présent:
				af = affixes.get(tps.toString()).split(",");
				for (String a : af)
					s += a;
				return s;
			case Participe_présent:
			case Participe_passé:
				return affixes.get(tps.toString());
			case Infinitif_présent:
				return affixes.get(tps.toString());
			case Gérondif:
				return "en " + this.getParticipePrésent();
			default:
				p = this.choisirPronoms();
				af = affixes.get(tps.toString()).split(",");
				for (int i = 0; i < af.length; ++i)
					s += p[i] + " " + af[i] + "\n";
				return s;
			}
	}

	private String getParticipePrésent() {
		return affixes.get(Temps.Participe_présent.toString());
	}

	public String[] choisirPronoms() {
		return this.pronoms;
	}
}
