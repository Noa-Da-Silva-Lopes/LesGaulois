package personnages;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement;
	private Equipement[] equipements;
	
	public Romain(String nom,int force) {
		assert(force>0):"la force est négative";
		this.nom=nom;
		this.force=force;
		this.equipements=new Equipement[2];
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+texte+">>");
	}
	
	public String prendreParole() {
		return "Le romain "+nom+" : ";
		
	}
	
	public void recevoirCoup(int forceCoup) {
		assert(force>0):"la force est négative";
		int force_av=force;
		force-= forceCoup;
		if (force>0) {
			parler("Aïe");
		}
		else {
			parler("J'abandonne...");
		}
		assert(force_av>force):"la force n'a pas diminué";
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:{
			System.out.println("le soldat "+getNom()+" est déjà bien protégé");
			break;
		}
			
		case 1:{
			if(equipements[0]==equipement) {
				System.out.println("le soldat "+getNom()+" possède déjà un "+equipement+".");
				break;
			}
			else {
				equiper(equipement);
				break;
			}
		}
		default:
			equiper(equipement);
			break;
		}
	}
	
	private void equiper(Equipement equipement) {
		equipements[nbEquipement]=equipement;
		nbEquipement++;
		System.out.println("le soldat "+getNom()+" s'equipe d'un "+ equipement +".");
	}
	
	public static void main (String[] args) {
		Romain minus = new Romain ("minus",6);
		System.out.println("Le romain "+minus.getNom()+" vient d'être crée.");
		minus.parler("Bonjour !");
		minus.recevoirCoup(3);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		
	}
}
