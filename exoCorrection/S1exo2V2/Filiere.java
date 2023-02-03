/**
 * 
 */
package S1exo2V2;

/**
 * @author Moussa CAMARA
 *
 */
public class Filiere {

	private int code;
	private String libelle;
	/**
	 * @param code
	 * @param libelle
	 */
	public Filiere(int code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}
	public int getCode() {
		return code;
	}
	public String getLibelle() {
		return libelle;
	}
	@Override
	public String toString() {
		return libelle;
	}
	
	
}
