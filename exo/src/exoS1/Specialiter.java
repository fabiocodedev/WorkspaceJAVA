package exoS1;
	// CLASS
public class Specialiter {
	// ATTRIBUT
	private String nomSpe;
	// CONSTRUCTEUR
	public Specialiter(String specialiter) {
		this.nomSpe = specialiter;
	}
	// GETTER
	public String getNomSpe() {
		return nomSpe;
	}
	// METHODE TOSTRING
	@Override
	public String toString() {
		return nomSpe;
	}
}
