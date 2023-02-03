package exo3;

// import java.util.ArrayList;

public class TestExo3 {

	public static void main(String[] args) {


		// ROLES ET UTILISATEURS
		Roles mn = new Roles ("Manager (MN)");
		Roles cp = new Roles ("Chef de Projet (CP)");
		Roles dp = new Roles ("Developpeur (DP)");
		
		Utilisateur user1 = new Utilisateur("Dupond","Jean", mn) ;
		Utilisateur user2 = new Utilisateur("Simpson","Bart", cp) ;
		Utilisateur user3 = new Utilisateur("Camara","Moussa", dp) ;
		
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		
		// VILLES
		Ville city1 = new Ville();
		Ville city2 = new Ville("Marseille");
		Ville city3 = new Ville("Nice");
		Ville city4 = new Ville("Marseille", 13000);
		Ville city5 = new Ville("Nice", 06000);
		
		// CHANGER NOM PAR DEF
		city1.nom = "lyon";
		
		
		System.out.println(city1);
		System.out.println(city2);
		System.out.println(city3);
		System.out.println(city4);
		System.out.println(city5);
		
		
		
		
		/*
	    // TABLEAU
		ArrayList<String,String> personnel = new ArrayList<>();
		personnel.add("Jean","Dupond","Manager (MN)");
		personnel.add("Ben","Fores","Manager (MN)");
		personnel.add("Bob","Lim","Developpeur (DP)");
		System.out.println(personnel);


		
		// USERS
		Utilisateur user1 = new Utilisateur("Jean","Dupond") ;
		Utilisateur user2 = new Utilisateur("Ben","Fores") ;
		Utilisateur user3 = new Utilisateur("Bob","Lim") ;
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		
		
		Rôles user1 = new Rôles("Manager (MN)");
		Rôles user2 = new Rôles("Manager (MN)");
		Rôles user3 = new Rôles("Developpeur (DP)");
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		*/
	

	}

}
