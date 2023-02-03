package exoS1;
// IMPORTS
import java.util.ArrayList;
// CLASS
public class exoS1Main {
	// MAIN
	public static void main(String[] args) {
		// INSTATATION OBJETS SPECIALITER
		Specialiter jee = new Specialiter("JAVA");
		Specialiter ht = new Specialiter("HTML/CSS");
		Specialiter gp = new Specialiter("Gestion de Projet");
		Specialiter js = new Specialiter("JavaScript");
		Specialiter php = new Specialiter("PHP");
		// HYDRATATION ARRAYLIST
		ArrayList<Specialiter> speList = new ArrayList<>();
			speList.add(jee);
			speList.add(ht);
			speList.add(gp);
			speList.add(js);
			speList.add(php);
		// INSTATATION + HYDRATATION
		ArrayList<Enseignant> ensList = new ArrayList<>();
			ensList.add(new Enseignant("Camara","Moussa",jee));
			ensList.add(new Enseignant("Simpson","Homer",jee));
			ensList.add(new Enseignant("Caso","Fab",php));
			ensList.add(new Enseignant("Del","Bob",js));
		//CHECK ARRAYLIST
		/*for (Specialiter valueS : speList) {
			System.out.println(valueS);
		}
		for (Enseignant valueE : ensList) {
			System.out.println(valueE);
		}*/
		// BOUCLE SUR ARRAYLIST POUR FILTRER
		for (Specialiter valueSpe : speList) {
			System.out.println("------------------------- " + valueSpe + " -------------------------" + "\n");
			boolean isEmpty = false; 
			for (Enseignant valueEns : ensList) {
				if (valueEns.getSpe().getNomSpe().equalsIgnoreCase(valueSpe.getNomSpe())) {
					System.out.println("\t" + valueEns + "\n");
					isEmpty = true;
				}
			}
			if (!isEmpty) {
			System.out.println("\t" + "Personne n'enseigne la specialiter : "+ valueSpe.getNomSpe()+ "\n");
			}
		}
	}	
}
