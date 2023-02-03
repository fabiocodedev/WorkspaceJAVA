/**
 * 
 */
package recap1;

/**
 * @author bourg
 *
 */
public class Manutention extends Employe {
	//ATTRIBUTS
	protected String type = "Manutention";
	private int heure;
		//CONSTRUCTEUR
	public Manutention(String nom, String prenom, int age, String date, int heure) {
		super(nom, prenom, age, date);
		this.heure = heure;
	}
	public void setHeure(int heure) {
		this.heure = heure;
	}
		@Override
		double calculeSalaire() {
			double salaireV =  (heure * 65) ;
			return salaireV ;
		}
		//TOSTRING
		@Override
		public String toString() {
			return getNom() + " touche un salaire de : " + this.calculeSalaire() ;
		}

}
