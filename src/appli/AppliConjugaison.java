package appli;

import java.util.Scanner;

import conjugaison.Conjugaison;
import conjugaison.InterFabriqueVerbe;
import verbes.FabriqueVerbe;

public class AppliConjugaison {

	public static void main(String[] args) {
		System.out.println("Verbe : ");
		Scanner sc = new Scanner(System.in);
		String verbe = "";

		verbe = sc.nextLine();

		InterFabriqueVerbe fv = new FabriqueVerbe();
		Conjugaison conj = new Conjugaison(verbe, fv);

		System.out.println(conj);

		sc.close();
	}
}
