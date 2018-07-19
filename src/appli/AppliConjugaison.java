package appli;

import java.util.Scanner;

import conjugaison.FabriqueVerbe;
import conjugaison.InterFabriqueVerbe;
import conjugaison.Temps;
import conjugaison.Verbe;

public class AppliConjugaison {

	public static void main(String[] args) {
		System.out.println("verbe Mode_temps personne nombre : ");
		Scanner sc = new Scanner(System.in);
		String cmd = "";

		cmd = sc.nextLine();
		String[] options = cmd.split(" ");
		
		String verbe = options[0];
		Temps tps = Temps.valueOf(options[1]);
		
		InterFabriqueVerbe fv = new FabriqueVerbe();
		Verbe vb = fv.getVerbe(verbe);
		
		if(options.length > 2 ) {
			int personne = Integer.parseInt(options[2]);
			String nombre = options[3];
			System.out.println(vb.conjuguer(tps, personne, nombre));
		} else {
			System.out.println(vb.conjuguerAu(tps));
		}

		sc.close();
	}
}
