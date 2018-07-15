package appli;

import java.util.Scanner;

import verbes.*;

public class AppliConj {
	public void init() {
		
	}
	
	public static void main(String[] args) {
		// get verb
		System.out.println("Verbe : ");
		Scanner sc = new Scanner(System.in);
		String verbe = "";

		verbe = sc.nextLine();
		Verbe vb = new Verbe(verbe);

		// conjugate
		 System.out.println(vb.conjuguer());
		 System.out.println(vb);
		
		String[] modes1 = {"Indicatif", "Conditionnel",
				"Subjonctif", "Impératif", "Infinitif", "Participe",
				"Gérondif"};
		
		// display conjugation table
		
		sc.close();
	}
}
