package verbes;

import java.util.HashMap;

import conjugaison.HashMapBuilder;

public final class VerbeType {
	private static HashMap<String, String> aller = HashMapBuilder.build("Indicatif_présent", "vais,vas,va,allons,allez,vont",
			"Indicatif_imparfait", "allais,allais,allit,allions,alliez,allaient", "Indicatif_passé_simple",
			"allai,allas,alla,allâmes,allâtes,allèrent", "Indicatif_futur_simple", "irai,iras,ira,irons,irez,iront",
			"Conditionnel_présent", "irais,irais,irait,irions,iriez,iraient", "Subjonctif_présent",
			"aille,ailles,aille,allions,alliez,aillent", "Subjonctif_imparfait",
			"allasse,allasses,allât,allassions,allassiez,allassent", "Impératif_présent", "va,allons,allez",
			"Participe_présent", "allant", "Participe_passé", "allé", "Infinitif_présent", "aller");
	private static HashMap<String, String> vetir = HashMapBuilder.build("Indicatif_présent",
			"vêts,vêts,vêt,vêtons,vêtez,vêtent", "Indicatif_imparfait", "vêtais,vêtais,vêtait,vêtions,vêtiez,vêtaient",
			"Indicatif_passé_simple", "vêtis,vêtis,vêtit,vêtîmes,vêtîtes,vêtirent", "Indicatif_futur_simple",
			"vêtirai,vêtiras,vêtira,vêtirons,vêtirez,vêtiront", "Conditionnel_présent",
			"vêtirais,vêtirais,vêtirait,vêtirions,vêtiriez,vêtiraient", "Subjonctif_présent",
			"vête,vêtes,vête,vêtions,vêtiez,vêtent", "Subjonctif_imparfait",
			"vêtisse,vêtisses,vêtît,vêtissions,vêtissiez,vêtissent", "Impératif_présent", "vêts,vêtons,vêtez",
			"Participe_présent", "vêtant", "Participe_passé", "vêtu", "Infinitif_présent", "vêtir");
	private static HashMap<String, String> cueillir = HashMapBuilder.build("Indicatif_présent",
			"cueille,cueilles,cueille,cueillons,cueillez,cueillent", "Indicatif_imparfait",
			"cueillais,cueillais,cueillait,cueillions,cueilliez,cueillaient", "Indicatif_passé_simple",
			"cueillis,cueillis,cueillit,cueillîmes,cueillîtes,cueillirent", "Indicatif_futur_simple",
			"cueillerai,cueilleras,cueillera,cueillerons,cueillerez,cueilleront", "Conditionnel_présent",
			"cueillerais,cueillerais,cueillerait,cueillerions,cueilleriez,cueilleraient", "Subjonctif_présent",
			"cueille,cueilles,cueille,cueillions,cueilliez,cueillent", "Subjonctif_imparfait",
			"cueillisse,cueillisses,cueillît,cueillissions,cueillissiez,cueillissent", "Impératif_présent",
			"cueille,cueillons,cueillez", "Participe_présent", "cueillant", "Participe_passé", "cueilli",
			"Infinitif_présent", "cueillir");
	private static HashMap<String, String> faillir = HashMapBuilder.build("Indicatif_présent",
			"faux,faux,faut,faillons,faillez,faillent", "Indicatif_imparfait",
			"faillais,fallais,faillait,faillions,falliez,falillaient", "Indicatif_passé_simple",
			"faillis,faillis,faillit,faillîmes,faillîtes,faillirent", "Indicatif_futur_simple",
			"faillirai,failliras,faillira,faillirons,faillirez,failliront", "Conditionnel_présent",
			"faillirais,faillirais,faillirait,faillirions,failliriez,failliraient", "Subjonctif_présent",
			"faillisse,faillisses,faillisse,faillissions,faillissiez,faillissent", "Subjonctif_imparfait",
			"faillisse,faillisses,faillît,faillissions,faillissiez,faillissent", "Impératif_présent", "-,-,-",
			"Participe_présent", "faillant", "Participe_passé", "failli", "Infinitif_présent", "faillir");
	private static HashMap<String,String> exemple = HashMapBuilder.build(
			"Indicatif_présent",
			"",
			"Indicatif_imparfait",
			"",
			"Indicatif_passé_simple",
			"",
			"Indicatif_futur_simple",
			"",
			"Conditionnel_présent",
			"",
			"Subjonctif_présent",
			"",
			"Subjonctif_imparfait",
			"",
			"Impératif_présent",
			"",
			"Participe_présent",
			"",
			"Participe_passé",
			"",
			"Infinitif_présent",
			""
			);

	private static HashMap[] exceptions = { aller, vetir, cueillir, faillir };

	private VerbeType(String v) {}

	public static HashMap<String,String> getAffixes(String v) {
		for (HashMap<String, String> hm : exceptions) {
			if (hm.get("Infinitif_présent").equals(v))
				return hm;
		}
		return null;
	}
}
