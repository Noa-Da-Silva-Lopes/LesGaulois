package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain() {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+texte+">>");
	}
	
	public String prendreParole() {
		return "Le romain "+nom+" : ";
		
	}
	
	public void recevoirCoup(int forceCoup) {
		force-= forceCoup;
		if (force>0) {
			parler("A�e");
		}
		else {
			parler("J'abandonne...");
		}
	}
}
