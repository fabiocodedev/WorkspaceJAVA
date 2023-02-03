/**
 * 
 */
package recap1;

/**
 * @author bourg
 *
 */
public class Representation extends Employe {
	//ATTRIBUTS
	protected String type = "Representation";
		//CONSTRUCTEUR
	public Representation(String nom, String prenom, int age, String date) {
		super(nom, prenom, age, date);
	}
		@Override
		double calculeSalaire() {
			double salaireV =  ((getCa()*0.2) + 800) ;
			return salaireV ;
		}
		//TOSTRING
		@Override
		public String toString() {
			return getNom() + " touche un salaire de : " + this.calculeSalaire() ;
		}

}
