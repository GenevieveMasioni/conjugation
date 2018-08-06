package appli;

import java.util.Scanner;

import conjugaison.Multiplicité;
import conjugaison.Temps;
import verbes.FabriqueVerbe;
import verbes.InterFabriqueVerbe;
import verbes.Verbe;

public class AppliConjugaison {

	public static void main(String[] args) {
		System.out.println("verbe Mode_temps [personne nombre] : ");
		Scanner sc = new Scanner(System.in);
		String cmd = "";

		cmd = sc.nextLine();
		String[] options = cmd.split(" ");
		
		String verbe = "";
		int indexVerbe = 0;
		if (options[0].equals("se")) {
			verbe = options[0] + " " + options[1];
			indexVerbe = 1;
		} else
			verbe = options[0];
		Temps tps = Temps.valueOf(options[indexVerbe + 1]);
		
		InterFabriqueVerbe fv = new FabriqueVerbe();
		Verbe vb = fv.getVerbe(verbe);
		
		if(options.length > indexVerbe + 2) {
			int personne = Integer.parseInt(options[indexVerbe + 2]);
			Multiplicité mult = Multiplicité.valueOf(options[indexVerbe + 3]);
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
