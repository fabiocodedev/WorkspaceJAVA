package fonction;

import exo3.Roles;
import exo3.User;

public class Main {

	public static void main(String[] args) {
		User user = new User("tetsq", "ee", new Roles("CP", "Chef"));
		System.err.println(user.manger());
		//user.nom = "Nation";
		System.out.println(user.getNom());
		user.setNom("Maintenant on va manger!");
		System.out.println(user.getNom());
		
		user.prenom= "moussa";
		//ToutesLesFonctions.test();
		//System.out.println(ToutesLesFonctions.test2(16));
		//System.out.println(ToutesLesFonctions.afficher());
		
		//System.out.println(ToutesLesFonctions.afficherPersonne());
		
		System.out.println(ToutesLesFonctions.test3(5));
		System.out.println(ToutesLesFonctions.test3(5,15,25,777));
		System.out.println(ToutesLesFonctions.test3(5,15));
/*/
		
		ToutesLesFonctions.user(new Personne("test1","prenomTest1"));
		
		ToutesLesFonctions.user(new Personne("test1","prenomTest1"),
				new Personne("test2","prenomTest2"));
		*/
	}

}
