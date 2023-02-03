/**
 * 
 */
package S1exoBonus;

/**
 * @author Moussa CAMARA
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formation form1 = new Formation("CDA");
		Formation form2 = new Formation("DWWM");
		Formation form3 = new Formation("AdV");
		
		form1.ajouterMat("POO", 4);
		form1.ajouterMat("HTML/CSS", 2);
		form1.ajouterMat("JAVA SE", 5);
		form1.ajouterMat("AJAX", 3);

		
		Etudiant e1 = new Etudiant(00001,"Camara","Moussa", form1);
		e1.setMoy();
		Etudiant e2 = new Etudiant(00002, "Simpson", "Bart", form1);
		e2.setMoy();
		Etudiant e3 = new Etudiant(00003, "Bidule", "Machin", form1);
		e3.setMoy();
		
		Groupe g1 = new Groupe("SPEAR", form1);
		
		//Ajout des etudiants dans un groupe
		g1.ajouterEtudiant(e1);
		g1.ajouterEtudiant(e2);
		
		g1.ajouterEtudiant(e3);
		
		//Affichage du groupe
		
		g1.afficheGroupe();
		//System.out.println("La moyenne du groupe est:  " + g1.moyGroup());
		System.out.printf("La moyenne du groupe est:  %.2f", g1.moyGroup());
		
	}

}
