package personnages;

public class Chef {
	private String nom;
	private int force;
	private int effetPotion=1;
	private Village village;
	
	public Chef(String nom, int force, Village village) {
		super();
		this.nom = nom;
		this.force = force;
		this.village = village;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler() {
		System.out.println(prendreParole()+"<< "+texte+">>");
	}
	
	public String prendreParole() {
		return "Le chef " +nom+ " du village " + village.getNom()+" :";
	}

}