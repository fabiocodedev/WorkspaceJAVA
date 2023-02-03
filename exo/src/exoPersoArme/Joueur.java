/**
 * 
 */
package exoPersoArme;

//import java.util.Random;

/**
 * @author bourg
 *
 */
public class Joueur {
	//ATTRIBUTS
	private String nomJ;
	private int sante;
	private int force;
	private int xp;
	private Arme myArme;
	//CONSTRUCTEUR
	public Joueur(String nomJ, Arme myArme) {
		//super();
		this.nomJ = nomJ;
		this.sante = 10;
		//Random nbForce = new Random();
		//this.force = nbForce.nextInt(6)+5 ;
		this.force = 5 + (int)(Math.random() * ((10 - 5) + 1)) ;
		this.xp = 1;
		this.myArme = myArme ;
	}
//	public Joueur(String nomJ,Arme type) {
//				//super();
//				
//				this.type = type;	
//	}
	//GETTEURS SETTEURS
	public String getNomJ() {
		return nomJ;
	}
	public void setNomJ(String nomJ) {
		this.nomJ = nomJ;
	}
	public int getSante() {
		return sante;
	}
	public void setSante(int sante) {
		this.sante = sante;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public Arme getMyArme() {
		return myArme;
	}
//	public void setMyArme(Arme myArme) {
//		this.myArme = myArme;
//	}
	//METHODE : un joueur peut etre desarmer
	public void desarmer() {
		this.myArme = null;
	}
	//METHODE : un joueur peut changer d'arme
	public void changeArmer(Arme nouvelleArme) {
		this.myArme = nouvelleArme;
	}
	//METHODE : un joueur attaquer un autre joueur
	// a. Lors q'une attaque, le joueur dont la force * santé * expérience * puissance de l’arme est la plus grande
	//gagne 1 point de force. L’autre joueur perd un point de santé.
	public void attaquer(Joueur j2) {
		while (this.sante > 0 || j2.sante > 0) {
			int statJ1 = this.force*this.sante*this.xp*this.myArme.getPuissance();
			int statJ2 = j2.force*j2.sante*j2.xp*j2.myArme.getPuissance();
			
			if (statJ1 > statJ2) {
				this.force++;
				j2.sante --;
				// c. On affiche le nom du vainqueur et le nom du perdant.
				//System.out.println(this.nomJ + " a gagner et " + j2.nomJ + " a perdu !");
			} else if (statJ1 < statJ2) {
				j2.force++;
				this.sante --;
				// c. On affiche le nom du vainqueur et le nom du perdant.
				//System.out.println(j2.nomJ + " a gagner et " + this.nomJ + " a perdu !");
			} else {System.out.println("Match nul");}
			// b. Les deux joueurs gagent un point d’expérience.
			this.xp ++;
			j2.xp ++;
		}
		if (this.sante == 0) {
			System.err.println(this.nomJ + " a gagner !");
		}
		else {System.err.println(j2.nomJ + " a gagner !");}
	}
	@Override
	public String toString() {
		return "Joueur [nomJ=" + nomJ + ", sante=" + sante + ", force=" + force + ", xp=" + xp + ", myArme=" + myArme
				+ "]";
	}
}







