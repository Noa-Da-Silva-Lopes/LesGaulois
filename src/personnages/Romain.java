package personnages;

public class Romain {
	private String nom;
	private int force;
	private int nbEquipement;
	private Equipement[] equipements;
	
	public Romain(String nom,int force) {
		assert(force>0):"la force est n�gative";
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
		assert(force>0):"la force est n�gative";
		int force_av=force;
		force-= forceCoup;
		if (force>0) {
			parler("A�e");
		}
		else {
			parler("J'abandonne...");
		}
		assert(force_av>force):"la force n'a pas diminu�";
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:{
			System.out.println("le soldat "+getNom()+" est d�j� bien prot�g�");
			break;
		}
			
		case 1:{
			if(equipements[0]==equipement) {
				System.out.println("le soldat "+getNom()+" poss�de d�j� un "+equipement+".");
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
		System.out.println("Le romain "+minus.getNom()+" vient d'�tre cr�e.");
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
