/**
 * 
 */
package recap1;

/**
 * @author bourg
 *
 */
public class Vente extends Employe {
	//ATTRIBUTS
		protected String type = "Vente";
		//CONSTRUCTEUR
	public Vente(String nom, String prenom, int age, String date) {
		super(nom, prenom, age, date);
	}
	//METHODE
	@Override
	double calculeSalaire() {
		double salaireV =  ((getCa()*0.2) + 400) ;
		return salaireV ;
	}
//	//TOSTRING
//	@Override
//	public String toString() {
//		return "nom=" + getNom() + ", prenom=" + getPrenom() + ", age=" + getAge() + ", date=" + getDate() +", type=" 				+ type ;
//	}
	//TOSTRING
	@Override
	public String toString() {
		return getNom() + " touche un salaire de : " + this.calculeSalaire() ;
	}

}
