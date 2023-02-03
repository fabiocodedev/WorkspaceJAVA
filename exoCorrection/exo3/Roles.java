package exo3;

public class Roles {
	public String code;
	public String nom;
	
	public Roles(String code, String nom) {
	
		this.code = code;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Roles [code=" + code + ", nom=" + nom + "]";
	}
	
	
}
