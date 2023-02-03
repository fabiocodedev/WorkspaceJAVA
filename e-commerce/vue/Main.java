package vue;

import java.util.ArrayList;

import controller.UserController;
import model.User;

public class Main {

	public static void main(String[] args) {
		UserController userC = new UserController();
		
		//INSTANCIATION
		User user = new User("Moris","Ambroise","bbbb@email.de","123");
		//User user = new User("Charles","Fouquet","email@email.de","123");

		// Ajout user
		//userC.create(user);
		
		// AFFICHAGE DE LA LISTE
		//ArrayList<User> list = userC.read();
		
		for (User user2 : userC.read()) {
			System.out.println(user2.getNom()+ " -- " +user2.getPrenom());
			
			if (user2.getEmail().equals("moris@email.de")) {
				userC.delete(user2);
			}

			System.out.println("\t *******************"+ user2.getNom()+ " -- " +user2.getPrenom());
		}
		
		//UPDATE
		//user.setNom("TEST");
		
		//userC.update(user, 3);
		
		
		//DELETE
		//userC.delete(user);
	}

}
