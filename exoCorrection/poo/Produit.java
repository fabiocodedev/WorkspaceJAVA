package poo;

public class Produit{
	
	private String titre;
	private String description;
	private double prix;
	
	
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}
	public Produit(String titre, String description, double prix) {
		this.titre = titre;
		this.description = description;
		this.prix = prix;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}
