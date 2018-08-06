package verbes;

import java.util.HashMap;

import conjugaison.HashMapBuilder;

public final class VerbeType {
	private static HashMap<String, String> aller = HashMapBuilder.build("Indicatif_pr�sent", "vais,vas,va,allons,allez,vont",
			"Indicatif_imparfait", "allais,allais,allit,allions,alliez,allaient", "Indicatif_pass�_simple",
			"allai,allas,alla,all�mes,all�tes,all�rent", "Indicatif_futur_simple", "irai,iras,ira,irons,irez,iront",
			"Conditionnel_pr�sent", "irais,irais,irait,irions,iriez,iraient", "Subjonctif_pr�sent",
			"aille,ailles,aille,allions,alliez,aillent", "Subjonctif_imparfait",
			"allasse,allasses,all�t,allassions,allassiez,allassent", "Imp�ratif_pr�sent", "va,allons,allez",
			"Participe_pr�sent", "allant", "Participe_pass�", "all�", "Infinitif_pr�sent", "aller");
	private static HashMap<String, String> vetir = HashMapBuilder.build("Indicatif_pr�sent",
			"v�ts,v�ts,v�t,v�tons,v�tez,v�tent", "Indicatif_imparfait", "v�tais,v�tais,v�tait,v�tions,v�tiez,v�taient",
			"Indicatif_pass�_simple", "v�tis,v�tis,v�tit,v�t�mes,v�t�tes,v�tirent", "Indicatif_futur_simple",
			"v�tirai,v�tiras,v�tira,v�tirons,v�tirez,v�tiront", "Conditionnel_pr�sent",
			"v�tirais,v�tirais,v�tirait,v�tirions,v�tiriez,v�tiraient", "Subjonctif_pr�sent",
			"v�te,v�tes,v�te,v�tions,v�tiez,v�tent", "Subjonctif_imparfait",
			"v�tisse,v�tisses,v�t�t,v�tissions,v�tissiez,v�tissent", "Imp�ratif_pr�sent", "v�ts,v�tons,v�tez",
			"Participe_pr�sent", "v�tant", "Participe_pass�", "v�tu", "Infinitif_pr�sent", "v�tir");
	private static HashMap<String, String> cueillir = HashMapBuilder.build("Indicatif_pr�sent",
			"cueille,cueilles,cueille,cueillons,cueillez,cueillent", "Indicatif_imparfait",
			"cueillais,cueillais,cueillait,cueillions,cueilliez,cueillaient", "Indicatif_pass�_simple",
			"cueillis,cueillis,cueillit,cueill�mes,cueill�tes,cueillirent", "Indicatif_futur_simple",
			"cueillerai,cueilleras,cueillera,cueillerons,cueillerez,cueilleront", "Conditionnel_pr�sent",
			"cueillerais,cueillerais,cueillerait,cueillerions,cueilleriez,cueilleraient", "Subjonctif_pr�sent",
			"cueille,cueilles,cueille,cueillions,cueilliez,cueillent", "Subjonctif_imparfait",
			"cueillisse,cueillisses,cueill�t,cueillissions,cueillissiez,cueillissent", "Imp�ratif_pr�sent",
			"cueille,cueillons,cueillez", "Participe_pr�sent", "cueillant", "Participe_pass�", "cueilli",
			"Infinitif_pr�sent", "cueillir");
	private static HashMap<String, String> faillir = HashMapBuilder.build("Indicatif_pr�sent",
			"faux,faux,faut,faillons,faillez,faillent", "Indicatif_imparfait",
			"faillais,fallais,faillait,faillions,falliez,falillaient", "Indicatif_pass�_simple",
			"faillis,faillis,faillit,faill�mes,faill�tes,faillirent", "Indicatif_futur_simple",
			"faillirai,failliras,faillira,faillirons,faillirez,failliront", "Conditionnel_pr�sent",
			"faillirais,faillirais,faillirait,faillirions,failliriez,failliraient", "Subjonctif_pr�sent",
			"faillisse,faillisses,faillisse,faillissions,faillissiez,faillissent", "Subjonctif_imparfait",
			"faillisse,faillisses,faill�t,faillissions,faillissiez,faillissent", "Imp�ratif_pr�sent", "-,-,-",
			"Participe_pr�sent", "faillant", "Participe_pass�", "failli", "Infinitif_pr�sent", "faillir");
	private static HashMap<String,String> exemple = HashMapBuilder.build(
			"Indicatif_pr�sent",
			"",
			"Indicatif_imparfait",
			"",
			"Indicatif_pass�_simple",
			"",
			"Indicatif_futur_simple",
			"",
			"Conditionnel_pr�sent",
			"",
			"Subjonctif_pr�sent",
			"",
			"Subjonctif_imparfait",
			"",
			"Imp�ratif_pr�sent",
			"",
			"Participe_pr�sent",
			"",
			"Participe_pass�",
			"",
			"Infinitif_pr�sent",
			""
			);

	private static HashMap[] exceptions = { aller, vetir, cueillir, faillir };

	private VerbeType(String v) {}

	public static HashMap<String,String> getAffixes(String v) {
		for (HashMap<String, String> hm : exceptions) {
			if (hm.get("Infinitif_pr�sent").equals(v))
				return hm;
		}
		return null;
	}
}
