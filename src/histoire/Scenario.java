package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("asterix",8);
		asterix.parler("Bonjour à tous");
		Romain minus= new Romain("minus",6);
		minus.parler("UN GAU... UN GAUGAU");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		

	}

}
