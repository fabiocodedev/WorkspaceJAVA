/**
 * 
 */
package recap1;

/**
 * @author bourg
 *
 */
//public abstract class  Employe {
public abstract class  Employe {
	//ATTRIBUTS
	private String nom ;
	private String prenom ;
	private int age ;
	private String date ;
	protected String type;
	//private EType type;
	private int ca = 600000;
	//GETTEURS/SETTEURS
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCa() {
		return ca;
	}
	public void setCa(int ca) {
		this.ca = ca;
	}
//	public EType getType() {
//		return type;
//	}
//	public void setType(EType type) {
//		this.type = type;
//	}
	//METHODES calculeSalaire
	abstract double calculeSalaire();
	//METHODES calculeSalaire V2
//	double calculeSalaireV2(){
//		if (this.nom == "Vente") {
//			double salaireV =  ((getCa()*0.2) + 400) ;
//			return salaireV ;
//		}
//		else if (this.nom == "Representation") {
//			double salaireV =  ((getCa()*0.2) + 800) ;
//			return salaireV ;
//		}
//		else if (this.nom == "Production") {
//			int nbProduit = Production.getNbProduit();
//			double salaireV =  (nbProduit * 5) ;
//			return salaireV ;
//		}
//		else if (this.nom == "Manutention") {
//			double salaireV =  (heure * 65) ;
//			return salaireV ;
//		}
//	}
	
	//METHODES getNom
	public String getNom() {
		return ("L'employe " + this.nom + " " + this.prenom);
	}
	//CONSTRUCTEUR
	public Employe(String nom, String prenom, int age, String date) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
		//this.type = type;
	}

}
