package personnages;

import personnages.Gaulois;

import java.util.Iterator;

import personnages.Chef;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois=0;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom=nom;
		villageois=new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef=chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois<villageois.length) {
			villageois[nbVillageois]=gaulois;
			nbVillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int numeroVillageois) {
		return villageois[numeroVillageois];
	}
	
	public void afficherVillageois(Village village) {
		Gaulois gaulois=village.trouverHabitant(0);
		System.out.println("Dans le village du chef "+gaulois.getNom()+" vivent les légendaires gaulois");
		for (int i = 1; i < nbVillageois; i++) {
			Gaulois gaulois2=village.trouverHabitant(i);
			System.out.println("- "+gaulois2.getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village=new Village("Village des Irréductibles",30);
		//Gaulois gaulois=village.trouverHabitant(30);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
//		at personnages.Village.trouverHabitant(Village.java:32)
//		at personnages.Village.main(Village.java:37)
		Gaulois chef=new Gaulois("Abraracourcix",6);
		village.ajouterHabitant(chef);
		Gaulois asterix=new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois=village.trouverHabitant(1);
//		System.out.println(gaulois);
//		reponse obtenu:Gaulois [nom=Asterix, force=8, effetPotion=1]
		Gaulois obelix=new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois(village);
	}
}
