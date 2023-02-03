/**
 * 
 */
package exoPersoArme;

/**
 * @author bourg
 *
 */
public class Arme {
	//ATTRIBUTS
	private String nomA;
	private TypeArme type;
	private int puissance;
	//CONSTRUCTEUR
	public Arme(String nomA, TypeArme type, int puissance) {
		this.nomA = nomA;
		this.type = type;
		this.puissance = puissance;
	}
	//GETTEURS
	public String getNomA() {
		return nomA;
	}
	public TypeArme getType() {
		return type;
	}
	public int getPuissance() {
		return puissance;
	}
	@Override
	public String toString() {
		return "Arme [nomA=" + nomA + ", type=" + type + ", puissance=" + puissance + "]";
	}
}
