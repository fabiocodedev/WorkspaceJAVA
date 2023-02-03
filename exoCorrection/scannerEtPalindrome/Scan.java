package scannerEtPalindrome;



import java.util.Scanner;

import exo1et2.Personne;

public class Scan {

	public static void main(String[] args) {
		
		Personne personne = new Personne("Camara", "Moussa");
		
		// TODO Auto-generated method stub

		System.out.println("Choisissez un nombre.");
		Scanner scanner = new Scanner(System.in);
		String choix = scanner.next();

		// PALINDROME
		
		
		System.out.println("Voici ton choix: " +choix);
		if (choix.equalsIgnoreCase(Palindrome.inverse(choix))) {
			//if (choix.equals(Palindrome.inverse(choix))) {
			System.out.println(choix +" est un palindrome");
		}else {
			System.out.println(choix +" n'est pas un palindrome");
			
		}
		
		// AUTRE VERSION
		String saisi_user = scanner.next();
		System.out.println("Saisi utilisateur ===>" + saisi_user);

		String inverse = new StringBuilder(saisi_user).reverse().toString();
		System.out.println("inverser la saisi utilisateur ===>"+ inverse);

		//TERNAIRE
		System.out.println(saisi_user.equals(inverse) ? saisi_user + " est un palindrome" : saisi_user + " n'est pas un palindrome");

		
		
		
		
		
	}

}
