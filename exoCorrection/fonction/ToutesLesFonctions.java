package fonction;

import exo1et2.Personne;

public class ToutesLesFonctions {
	
	
	// METHODES SANS PARAMETRES
	public static int test() {
		System.out.println(18);
		return 18;
	}
	
	public static String afficher() {
		return "Bonjour";
	}
	
	// METHODES AVEC PARAMETRES
	public static String test2(int age) {
		
		return "Votre age est: " +age + " ans";
	}
	
	public static Personne afficherPersonne() {
		//Personne toto = new Personne("CDA","AFPA");
		//return toto;
		return new Personne("CDA","AFPA");
	}
	
	// RETURN RIEN
	public static void test1() {
		System.out.println(18);
	}
	
	// METHODES AVEC PARAMETRES INDEFINI
	public static String test3(int ...age) {
		int resultat = 0;
		for (int i : age) {
			System.out.println(i);
			resultat += i;
		}
		
		return " Le resultat est de " +resultat;
	}
	
	// METHODES AVEC PARAMETRES INDEFINI
	public static void user(Personne ...personne) {
		
		for (Personne i : personne) {
			System.out.println(i);
		}
		
	}
}




















