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
		System.out.println("Dans le village du chef "+chef.getNom()+" vivent les lÃ©gendaires gaulois");
		for (int i = 0; i < nbVillageois; i++) {
			Gaulois gaulois2=village.trouverHabitant(i);
			System.out.println("- "+gaulois2.getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village=new Village("Village des Irré©ductibles",30);
		//Gaulois gaulois=village.trouverHabitant(30);
		//si il y a 30 villageois les indices vont de 0 a 29
		Chef chef=new Chef("Abraracourcix",6,village);
		village.setChef(chef);
		Gaulois asterix=new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois=village.trouverHabitant(1);
//		System.out.println(gaulois);
// 		null car asterix est a l indice 0;
		Gaulois obelix=new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois(village);
	}
}
