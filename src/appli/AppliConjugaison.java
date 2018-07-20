package appli;

import java.util.Scanner;

import conjugaison.FabriqueVerbe;
import conjugaison.InterFabriqueVerbe;
import conjugaison.Multiplicité;
import conjugaison.Temps;
import conjugaison.Verbe;

public class AppliConjugaison {

	public static void main(String[] args) {
		System.out.println("verbe Mode_temps [personne nombre] : ");
		Scanner sc = new Scanner(System.in);
		String cmd = "";

		cmd = sc.nextLine();
		String[] options = cmd.split(" ");
		
		String verbe = options[0];
		Temps tps = Temps.valueOf(options[1]);
		
		InterFabriqueVerbe fv = new FabriqueVerbe();
		Verbe vb = fv.getVerbe(verbe);
		
		if(options.length > 2) {
			int personne = Integer.parseInt(options[2]);
			Multiplicité mult = Multiplicité.valueOf(options[3]);
			try {
				System.out.println(vb.conjuguer(tps, personne, mult));
			} catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println(vb.conjuguerAu(tps));
		}

		sc.close();
	}
}
