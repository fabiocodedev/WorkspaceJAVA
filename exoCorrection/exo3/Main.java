package exo3;

public class Main {

	public static void main(String[] args) {
		/* EXO 1 *
		Roles mn = new Roles("MN","MANGER");
		Roles cp = new Roles("CP","MANGER");
		Roles dp = new Roles("DP","Directeur P");
		
		User user1 = new User("Sultan","Vanessa",mn);
		User user2 = new User("Fouquet","Charles",dp);
		User user3 = new User("Simp","Homer",cp);
		
		System.out.println(user1);
		System.out.println(user2+" "+user3);
		
		/* EXO1*/
		
		/*CORRECTION EXO2 */
		Ville defaut = new Ville();
		Ville mar = new Ville("Marseille","13");
		Ville nice = new Ville("Nice","06");
		
		System.out.println(defaut);
		System.out.println(mar);
		System.out.println(nice);
		
		
		defaut.nom = "Lyon";
		defaut.departement = "69000";
		System.out.println(defaut);
		
	}

}





















