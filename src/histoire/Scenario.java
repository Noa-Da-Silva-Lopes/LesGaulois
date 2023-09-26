package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("asterix",8);
		Gaulois obelix= new Gaulois("Obelix",25);
		Druide druide=new Druide("panoramix",5,10);
		druide.parler("Je vais aller préparé une potion");
		druide.preparerPotion();
		druide.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus= new Romain("minus",6);
		minus.parler("UN GAU... UN GAUGAU");
		do {
			asterix.frapper(minus);
		} while (minus.getForce()>0);
		

	}

}
