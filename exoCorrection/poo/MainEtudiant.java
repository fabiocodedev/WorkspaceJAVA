package poo;

import java.util.Scanner;

public class MainEtudiant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre email ");

		Etudiant etudiant = new Etudiant(sc.next());
		
		//etudiant.prenom = "Marc";
		//etudiant.setPrenom("Marc");
		
		
		System.out.println("Entrez votre prénom ");
		String prenom = sc.next();
		System.out.println("VOus avez saisi " +prenom);

		etudiant.setPrenom(prenom);
	}

}
