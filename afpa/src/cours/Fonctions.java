package cours;

public class Fonctions {

	public static void main(String[] args) {
		
		nb();
		System.out.println(text());
		System.out.println(nbAge(21));
		System.out.println(nbPoid(65,70,80));
		System.out.println(nbPoid(45,55));

	}
	
	// METHODES SANS PARAMETRES
	public static void nb() {
		System.err.println(16);
	}
	
	public static String text() {
		return "Bonjour";
	}
	
	// METHODES AVEC PARAMETRES
	public static String nbAge(int age) {
		return ("Votre ages est : "+age);
	}
	
	// METHODES AVEC PARAMETRES INDEFINIS
		public static String nbPoid(int... poid) {
			for (int i : poid) {
				System.out.println(i);
			}
		return ("Votre poid est : "+poid);
		}
}
